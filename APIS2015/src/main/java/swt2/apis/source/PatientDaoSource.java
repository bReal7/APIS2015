/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt2.apis.source;

import apis2015.util.HibernateUtil;
import java.util.LinkedList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import swt.apis2015.entities.Patient;
import swt.apis2015.interfaces.PatientDao;
import swt2.apis2015.dto.PatientDto;

/**
 *
 * @author B-Real
 */
public class PatientDaoSource implements PatientDao {

    private static PatientDaoSource instance = null;

    private PatientDaoSource() {
    }

    public static PatientDaoSource getInstance() {
        if (instance == null) {
            instance = new PatientDaoSource();
        }
        return instance;
    }

//    @Override
//    public List<PatientDto> getAllPatients() {
//        List<PatientDto> result = new LinkedList<PatientDto>();
//        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//        session.beginTransaction();
//        Query query = session.createQuery("FROM Patient");
//        for (Patient x : (List<Patient>) query.list()) {
//            result.add(entityToPatDto(x));
//        }
//        return result;
//    }
    @Override
    public PatientDto getPatientByID(String id) {
        System.out.println(id);
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            System.out.println(id);
            session.getTransaction().begin();
            Query query = session.createQuery("FROM Patient p WHERE p.id = :id");
            query.setParameter("id", id);
            if (query.list().size() == 1) {
                PatientDto result = entityToPatDto((Patient) query.list().get(0));
                System.out.println(query.list().size());
                return result;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("asdkjandpgfkjnfgakjngajndfskjdsafkjnldfnfdskjn");
            session.getTransaction().rollback();
        }
        return null;
    }

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
        } catch (Exception e) {
            System.out.println("FAILED");
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        } finally {
            return result;
        }
    }

    @Override
    public void updatePatient() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletePatient() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addPatient(PatientDto nPat) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(patDtoToEntity(nPat));
        session.getTransaction().commit();
    }

    public Patient patDtoToEntity(PatientDto nPat) {
        Patient pat = new Patient();
        pat.setEhrEntry(PatPhenomenDaoSource.getInstance().ehrEntryDtoToEntity(nPat.getEhrEntry()));
        pat.setBirthday(nPat.getBirthday());
        pat.setCity(nPat.getCity());
        pat.setCountry(nPat.getCountry());
        pat.setFirstName(nPat.getFirstname());
        pat.setInsuranceContract(nPat.getInsuranceContract());
        pat.setPostalCode(nPat.getPostalCode());
        pat.setStreet(nPat.getStreet());
        pat.setSurname(nPat.getSurname());
        return pat;
    }

    public PatientDto entityToPatDto(Patient pat) {
        PatientDto patDto = new PatientDto();
        patDto.setEhrEntry(PatPhenomenDaoSource.getInstance().entityEhrEntryToEhrEntryDto(pat.getEhrEntry()));
        patDto.setId(pat.getId());
        patDto.setBirthday(pat.getBirthday());
        patDto.setCity(pat.getCity());
        patDto.setCountry(pat.getCountry());
        patDto.setFirstname(pat.getFirstName());
        patDto.setInsuranceContract(pat.getInsuranceContract());
        patDto.setPostalCode(pat.getPostalCode());
        patDto.setStreet(pat.getStreet());
        patDto.setSurname(pat.getSurname());
        return patDto;
    }

    Patient getPatienById(long id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            session.getTransaction().begin();
            Query query = session.createQuery("FROM Patient p WHERE p.id = :id");
            query.setParameter("id", id);
            if (query.list().size() == 1) {
                Patient result = (Patient) query.list().get(0);
                return result;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("asdkjandpgfkjnfgakjngajndfskjdsafkjnldfnfdskjn");
            session.getTransaction().rollback();
        }
        return null;
    }
}
