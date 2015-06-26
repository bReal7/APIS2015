/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt2.apis.source;

import apis2015.util.HibernateUtil;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.hibernate.Query;
import org.hibernate.Session;
import swt.apis2015.entities.Patient;
import swt.apis2015.interfaces.PatientDao;
import swt2.apis2015.dto.PatientDto;

/**
 * Zugriff auf Patient
 */
public class PatientDaoSource implements PatientDao {

    private static PatientDaoSource instance = null;

    private static final Logger LOGGER = Logger.getLogger(PatientDaoSource.class.getName());

    private PatientDaoSource() {
    }

    public static PatientDaoSource getInstance() {
        if (instance == null) {
            instance = new PatientDaoSource();
        }
        return instance;
    }

    /*
     patient an seiner id finden
     */
    @Override
    public PatientDto getPatientByID(long id) {
        System.out.println(id);
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            session.getTransaction().begin();
            Query query = session.createQuery("FROM Patient p WHERE p.id = :id");
            query.setParameter("id", id);
            if (query.list().size() == 1) {
                PatientDto result = entityToPatDto((Patient) query.list().get(0));
                System.out.println(query.list().size());
                session.getTransaction().commit();
                LOGGER.info("Logger Name: " + LOGGER.getName() + "getPatientById(" + id + ") = " + result.getFirstname() + " " + result.getSurname() + "Anzahl der Faelle = " + result.getEhrEntry().size());
                return result;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            LOGGER.warning("Logger Name: " + LOGGER.getName() + " getPatientByID(" + id + ") failed");
            System.out.println("asdkjandpgfkjnfgakjngajndfskjdsafkjnldfnfdskjn");
            session.getTransaction().rollback();
        }
        return null;
    }

    /*
     patienten bei vor oder nachnahmen finden
     */
    @Override
    public List<PatientDto> getPatientByName(String name) {
        System.out.println(name);
        List<PatientDto> result = new LinkedList<PatientDto>();
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            session.getTransaction().begin();
            Query query = session.createQuery("FROM Patient p WHERE p.firstname LIKE :firstname OR p.surname LIKE :surname");
            query.setParameter("firstname", "%" + name + "%");
            query.setParameter("surname", "%" + name + "%");
            for (Patient x : (List<Patient>) query.list()) {
                result.add(entityToPatDto(x));
            }
            session.getTransaction().commit();
            LOGGER.info("Logger Name: " + LOGGER.getName() + "getPatientByName(" + name + ") size = " + result.size());

        } catch (Exception e) {
            LOGGER.warning("Logger Name: " + LOGGER.getName() + "getPatientByName(" + name + ") failed: " + e.getMessage());
            session.getTransaction().rollback();
        } finally {
            return result;
        }
    }

    /*
     patienten in der datenhaltung aktualisieren
     */
    @Override
    public void updatePatient(PatientDto pat) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.merge(patDtoToEntity(pat));
        session.flush();
        session.getTransaction().commit();
        LOGGER.info("Logger Name: " + LOGGER.getName() + "updated: " + pat.getSurname());
    }

    /*
     patienten persistent speichern
     */
    @Override
    public void addPatient(PatientDto nPat) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            session.save(patDtoToNewEntity(nPat));
            session.getTransaction().commit();
            LOGGER.info("Logger Name: " + LOGGER.getName() + "addPatient comitted");

        } catch (Exception e) {
            LOGGER.warning("Logger Name: " + LOGGER.getName() + "add patient failed: " + e.getMessage());
            session.getTransaction().rollback();
        }
    }

    /*
    Mapping
    */
    public Patient patDtoToNewEntity(PatientDto nPat) {

        Mapper mapper = new DozerBeanMapper();
        Patient pat = mapper.map(nPat, Patient.class);
        return pat;
    }

    public Patient patDtoToEntity(PatientDto nPat) {
        Mapper mapper = new DozerBeanMapper();
        Patient pat = mapper.map(nPat, Patient.class);
        return pat;
    }

    public PatientDto entityToPatDto(Patient pat) {
        Mapper mapper = new DozerBeanMapper();
        PatientDto patDto = mapper.map(pat, PatientDto.class);
        return patDto;
    }

    Patient getPatienById(long id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            session.getTransaction().begin();
            Query query = session.createQuery("FROM Patient p WHERE p.id = :id");
            query.setParameter("id", id);
            if (query.list().size() > 0) {
                Patient result = (Patient) query.list().get(0);
                session.getTransaction().commit();
                LOGGER.info("Logger Name: " + LOGGER.getName() + "getPatientById(" + id + ") = " + result.getFirstName() + " " + result.getSurname());
                return result;
            }
        } catch (Exception e) {
            LOGGER.warning("Logger Name: " + LOGGER.getName() + "getPatientById(" + id + ") " + e.getMessage());
            session.getTransaction().rollback();
        }
        return null;
    }

    @Override
    public PatientDto findPatientByOid(int oid) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            session.getTransaction().begin();
            Query query = session.createQuery("FROM Patient p WHERE p.patientOID = :oid");
            query.setParameter("oid", oid);
            if (query.list().size() > 0) {
                PatientDto result = entityToPatDto((Patient) query.list().get(0));
                session.getTransaction().commit();
                LOGGER.info("Logger Name: " + LOGGER.getName() + "findPatientByOid(" + oid + ") = " + result.getFirstname() + " " + result.getSurname());
                return result;
            }
        } catch (Exception e) {
            LOGGER.warning("Logger Name: " + LOGGER.getName() + " findPatientByOID(" + oid + ") failed");
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        }
        session.getTransaction().commit();
        LOGGER.warning("Logger Name: " + LOGGER.getName() + " findPatientByOID(" + oid + ") = NULL");
        return null;
    }

    @Override
    public boolean isAlreadyRegistered(int oid) {
        if (findPatientByOid(oid) == null) {
            return false;
        } else {
            return true;
        }
    }
}
