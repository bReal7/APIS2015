/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt.apis2015.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import swt.apis2015.enums.InsurenceContract;

/**
 *
 * @author B-Real
 */
@Entity
public class Patient extends Person implements Serializable {

    private static final long serialVersionUID = 1L;
    private int patientOID;
    private InsurenceContract insuranceContract;

    public int getPatientOID() {
        return patientOID;
    }

    public void setPatientOID(int patientOID) {
        this.patientOID = patientOID;
    }

    public InsurenceContract getVersicherungsverhaeltnis() {
        return insuranceContract;
    }

    public void setVersicherungsverhaeltnis(String insuranceContract) {
                if (insuranceContract == "AOK" )
        this.insuranceContract = InsurenceContract.AOK;
        else{
            this.insuranceContract = InsurenceContract.Barmer;
        }
    }
}
