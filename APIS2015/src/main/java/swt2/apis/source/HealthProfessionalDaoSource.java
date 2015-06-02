/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt2.apis.source;

import apis2015.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
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

    protected HealthProfessionalDaoSource() {
    }

    public static HealthProfessionalDaoSource getInstance() {
        if (instance == null) {
            instance = new HealthProfessionalDaoSource();
        }
        return instance;
    }

    @Override
    public List<HealthProfessional> getAllHealthProfessionals() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<HealthProfessional> getHealthProfessionalByName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateHP() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteHP() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
    private HealthProfessional hpDtoToEntity (HealthProfessionalDto hp){
        HealthProfessional nUser = new HealthProfessional();
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
    
}
