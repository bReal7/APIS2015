/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt.apis2015.entities;

/**
 *
 * @author B-Real
 */
public class HealthProfessional extends Person {
    
    private int personalId;
    private double gehalt;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
