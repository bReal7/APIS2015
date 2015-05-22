/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt.apis2015.entities;

import java.util.Date;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author B-Real
 */
@Entity
public class Patient extends Person implements Serializable {

    private static final long serialVersionUID = 1L;
    private int patientOID;
    private int insuranceContract;

    public int getPatientOID() {
        return patientOID;
    }

    public void setPatientOID(int patientOID) {
        this.patientOID = patientOID;
    }

    public int getVersicherungsverhaeltnis() {
        return insuranceContract;
    }

    public void setVersicherungsverhaeltnis(int versicherungsverhaeltnis) {
        this.insuranceContract = versicherungsverhaeltnis;
    }
}
