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

    public void setUser(HealthProfessional user) {
        this.user = user;
    }

    @Override
    public HealthProfessional getUser() {
        return user;
    }
}
