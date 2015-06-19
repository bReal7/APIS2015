/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt2.apis2015.dto;

import java.util.ArrayList;
import java.util.List;
import swt.apis2015.enums.InsurenceContract;

/**
 *
 * @author B-Real
 */
public class PatientDto extends PersonDto {

    private int patientOID;
    private InsurenceContract insuranceContract;
    private List<InstanceDto> ehrEntry;

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

    public void setInsuranceContract(InsurenceContract insuranceContract) {
        this.insuranceContract = insuranceContract;
    }

    public List<InstanceDto> getEhrEntry() {
        return ehrEntry;
    }

    public void setEhrEntry(List<InstanceDto> ehrEntry) {
        this.ehrEntry = ehrEntry;
    }

}
