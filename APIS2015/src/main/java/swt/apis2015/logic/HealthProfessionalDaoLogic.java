/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt.apis2015.logic;

import java.util.List;
import swt.apis2015.interfaces.HealthProfessionalDao;
import swt2.apis.source.HealthProfessionalDaoSource;
import swt2.apis2015.dto.HealthProfessionalDto;

/**
 *
 * @author B-Real
 */
public class HealthProfessionalDaoLogic implements HealthProfessionalDao {

    private static HealthProfessionalDaoLogic instance = null;

    protected HealthProfessionalDaoLogic() {
    }

    public static HealthProfessionalDaoLogic getInstance() {
        if (instance == null) {
            instance = new HealthProfessionalDaoLogic();
        }
        return instance;
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
        HealthProfessionalDaoSource.getInstance().addHP(hp);
    }

    @Override
    public boolean login(String user, String password) {
        return HealthProfessionalDaoSource.getInstance().login(user, password);
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
        return HealthProfessionalDaoSource.getInstance().getLoggedUser();
    }

    @Override
    public void logout() {
        HealthProfessionalDaoSource.getInstance().logout();
    }

}
