/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt2.apis2015.dto;

import swt.apis2015.entities.Person;
import swt.apis2015.enums.HPRole;

/**
 *
 * @author B-Real
 */
public class HealthProfessionalDto extends Person {

    private static final long serialVersionUID = 1L;
    private double gehalt;
    private HPRole role;
    private String password;

    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

    public HPRole getRole() {
        return role;
    }

    public void setRole(HPRole role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
        
}
