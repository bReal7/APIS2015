/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt2.apis.source;

import apis2015.util.HibernateUtilICD;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.hibernate.Query;
import org.hibernate.Session;
import swt.apis2015.interfaces.Icd10ConnectorI;

/**
 *Diese Klasse greift auf die ICD10 DB zu 
 */
public class Icd10ConnectorSource implements Icd10ConnectorI {

    private static Icd10ConnectorSource instance = null;

    private Icd10ConnectorSource() {
    }

    public static Icd10ConnectorSource getInstance() {
        if (instance == null) {
            instance = new Icd10ConnectorSource();
        }
        return instance;
    }

    /*
    hier wird ein icd code gesucht, der einen 
    bestimmten String in der Beschriebung hat
    */
    @Override
    public Map<String, String> findIcdByName(String name) {
        System.out.println(name);
        Map<String, String> result = new HashMap<>();

        Session session = HibernateUtilICD.getSessionFactory().openSession();
        try {
            session.getTransaction().begin();
            Query query = session.createQuery("Select col6,col9 FROM TbDataIcd i WHERE i.col9 LIKE :name");
            query.setParameter("name", "%" + name + "%");
            for (Object[] x : (List<Object[]>) query.list()) {
                result.put((String) x[0], (String) x[1]);
            }
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            System.out.println("FAILED");
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        } finally {
            return result;
        }
    }

}
