/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt.apis2015.interfaces;

import swt.apis2015.entities.HealthProfessional;

/**
 *
 * @author Administrator
 */
public interface UserHandlerI {
    
    public boolean login(String user, String password);
    public void logout();
    public HealthProfessional createHP(HealthProfessional hp);
    public boolean deleteHP();
}
