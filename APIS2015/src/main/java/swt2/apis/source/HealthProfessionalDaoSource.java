/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt2.apis.source;

import apis2015.util.HibernateUtil;
import java.util.List;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import swt.apis2015.entities.HealthProfessional;
import swt.apis2015.interfaces.HealthProfessionalDao;
import swt2.apis2015.dto.HealthProfessionalDto;

/**
 * Diese Klasse implementiert den DB zugriff auf HP
 *
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

    /*
     Hier wird der User mit Hilfe des usernamen und password identifieziert
     und zu this.user gesetzt 
     */
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

    /*
     Hier wird die Session geschlossen und das Programm beendet
     */
    @Override
    public void logout() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.close();
    }
    
    @Override
    public HealthProfessionalDto getLoggedUser() {
        return user;
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
    public void updateHP() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteHP() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private HealthProfessional hpDtoToEntity(HealthProfessionalDto hp) {
        Mapper mapper = new DozerBeanMapper();
        HealthProfessional nUser = mapper.map(hp, HealthProfessional.class);
        return nUser;
    }

    private HealthProfessionalDto hpEntityToDto(HealthProfessional hp) {
        Mapper mapper = new DozerBeanMapper();
        HealthProfessionalDto nUser = mapper.map(hp, HealthProfessionalDto.class);
        return nUser;
    }
}
