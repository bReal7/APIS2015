/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt.apis2015.interfaces;

import swt.apis2015.entities.HealthProfessional;

/**
 *
 * @author B-Real
 */
public interface UserSessionHandlerI {
    public HealthProfessional login (String username,String pw);
    public HealthProfessional findHealthProfessionalUsername (String username);
    public void logout ();
}