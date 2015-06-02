/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt2.apis2015.dto;

import swt.apis2015.enums.InsurenceContract;

/**
 *
 * @author B-Real
 */
public class PatientDto extends PersonDto{
    private int patientOID;
    private InsurenceContract insuranceContract;
    
    public PatientDto() {
    }
    
    public int getPatientOID() {
        return patientOID;
    }

    public void setPatientOID(int patientOID) {
        this.patientOID = patientOID;
    }

    public InsurenceContract getInsuranceContract() {
        return insuranceContract;
    }

    public void setInsuranceContract(String insuranceContract) {
        if (insuranceContract == "AOK" )
        this.insuranceContract = InsurenceContract.AOK;
        else{
            this.insuranceContract = InsurenceContract.Barmer;
        }
    }    
}
