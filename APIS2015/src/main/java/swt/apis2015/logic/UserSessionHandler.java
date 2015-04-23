/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt.apis2015.logic;

import swt.apis2015.entities.HealthProfessional;
import swt.apis2015.interfaces.UserSessionHandlerI;

/**
 *
 * @author B-Real
 */
public class UserSessionHandler implements UserSessionHandlerI {

    private static UserSessionHandler instance = null;
    private HealthProfessional user;

    protected UserSessionHandler() {
    }

    public static UserSessionHandler getInstance() {
        if (instance == null) {
            instance = new UserSessionHandler();
        }
        return instance;
    }

    @Override
    public HealthProfessional login(String username, String pw) {
        if (findHealthProfessionalUsername(username) != null) {
            HealthProfessional tmp = findHealthProfessionalUsername(username);
            if (tmp.getPassword() == pw) {
            return tmp;
        }}
        return null;
    }

    @Override
    public void logout() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HealthProfessional findHealthProfessionalUsername(String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setUser(HealthProfessional user) {
        this.user = user;
    }

    public HealthProfessional getUser(){
        return user;
    }
}
