/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt.apis2015.logic;

import apis2015.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import swt.apis2015.entities.HealthProfessional;
import swt.apis2015.entities.Patient;
import swt.apis2015.interfaces.PatientManagementI;

/**
 *
 * @author Administrator
 */
public class PatientManagement implements PatientManagementI {

    private static PatientManagement instance = null;

    protected PatientManagement() {
    }

    public static PatientManagement getInstance() {
        if (instance == null) {
            instance = new PatientManagement();
        }
        return instance;
    }

    @Override
    public List<Patient> getPatientBySurname(String surname) {

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Patient> getPatientByFirstname(String firstname) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Query query = session.createQuery("FROM Patient p WHERE p.firstname = :firstname");
        query.setParameter("firstname", firstname);
        return query.list();
    }

    @Override
    public Patient getPatientByOID(String oid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Patient> getPatientByBirthday(String bth) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Patient> getAllPatients() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Query query = session.createQuery("FROM Patient");
        return query.list();
    }

    @Override
    public boolean addPatient(Patient nPat) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(nPat);
        session.getTransaction().commit();
        return true;
    }

}
