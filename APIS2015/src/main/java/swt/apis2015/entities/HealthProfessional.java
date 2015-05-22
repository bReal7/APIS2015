/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt.apis2015.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import swt.apis2015.enums.HPRole;
/**
 *
 * @author B-Real
 */
@Entity
public class HealthProfessional extends Person implements Serializable {

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
