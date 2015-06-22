/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt2.apis.source;

import apis2015.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import swt.apis2015.entities.HealthProfessional;
import swt.apis2015.interfaces.HealthProfessionalDao;
import swt2.apis2015.dto.HealthProfessionalDto;

/**
 *
 * @author B-Real
 */
public class HealthProfessionalDaoSource implements HealthProfessionalDao {

    private static HealthProfessionalDaoSource instance = null;
    private HealthProfessionalDto user;

    protected HealthProfessionalDaoSource() {
    }

    public static HealthProfessionalDaoSource getInstance() {
        if (instance == null) {
            instance = new HealthProfessionalDaoSource();
        }
        return instance;
    }

    @Override
    public void updateHP() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteHP() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void addHP(HealthProfessionalDto hp) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(hpDtoToEntity(hp));
            session.getTransaction().commit();
            session.close();
        } catch (HibernateException he) {
            he.printStackTrace();
        }
    }

    private HealthProfessional hpDtoToEntity(HealthProfessionalDto hp) {
        HealthProfessional nUser = new HealthProfessional();
        nUser.setId(hp.getId());
        nUser.setBirthday(hp.getBirthday());
        nUser.setCity(hp.getCity());
        nUser.setCountry(hp.getCountry());
        nUser.setFirstName(hp.getFirstName());
        nUser.setGehalt(hp.getGehalt());
        nUser.setPassword(hp.getPassword());
        nUser.setPostalCode(hp.getPostalCode());
        nUser.setStreet(hp.getStreet());
        nUser.setSurname(hp.getSurname());
        nUser.setRole(hp.getRole());
        return nUser;
    }

    private HealthProfessionalDto hpEntityToDto(HealthProfessional hp) {
        HealthProfessionalDto nUser = new HealthProfessionalDto();
        nUser.setId(hp.getId());
        nUser.setBirthday(hp.getBirthday());
        nUser.setCity(hp.getCity());
        nUser.setCountry(hp.getCountry());
        nUser.setFirstName(hp.getFirstName());
        nUser.setGehalt(hp.getGehalt());
        nUser.setPassword(hp.getPassword());
        nUser.setPostalCode(hp.getPostalCode());
        nUser.setStreet(hp.getStreet());
        nUser.setSurname(hp.getSurname());
        nUser.setRole(hp.getRole());
        return nUser;
    }

    @Override
    public boolean login(String user, String password) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("FROM HealthProfessional H WHERE H.surname = :user and H.password = :password ");
        query.setParameter("user", user);
        query.setParameter("password", password);
        List<HealthProfessional> result = query.list();
        if (result.size() == 1) {
            this.user = hpEntityToDto(result.get(0));
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void logout() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.close();
        System.exit(0);
    }

    @Override
    public HealthProfessional createHpDto(HealthProfessional hp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<HealthProfessionalDto> getAllHealthProfessionals() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<HealthProfessionalDto> getHealthProfessionalByName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HealthProfessionalDto getLoggedUser() {
        return user;
    }
}
