/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt.apis2015.logic;

import apis2015.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import swt.apis2015.entities.HealthProfessional;
import swt.apis2015.interfaces.UserHandlerI;

/**
 *
 * @author B-Real
 */
public class UserHandler implements UserHandlerI {

    private static UserHandler instance = null;

    protected UserHandler() {
    }

    public static UserHandler getInstance() {
        if (instance == null) {
            instance = new UserHandler();
        }
        return instance;
    }

    public HealthProfessional createHP(HealthProfessional hp) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(hp);
            session.getTransaction().commit();
            session.close();
        } catch (HibernateException he) {
            he.printStackTrace();
        }
        return hp;
    }

    @Override
    public boolean login(String user, String password) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("FROM HealthProfessional H WHERE H.surname = :user and H.password = :password ");
        query.setParameter("user", user);
        query.setParameter("password", password);
        List<HealthProfessional> result = query.list();
        if (result.size() == 1) {
            UserSessionHandler.getInstance().setUser(result.get(0));
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void logout() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteHP() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
