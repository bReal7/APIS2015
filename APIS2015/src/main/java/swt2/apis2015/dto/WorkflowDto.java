/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt2.apis2015.dto;

import java.io.Serializable;
import java.util.List;
import swt.apis2015.entities.Patient;

/**
 *
 * @author B-Real
 */
public class WorkflowDto implements Serializable {

    private Patient currentPatient;
    private List<Patient> waitList;

    public Patient getCurrentPatient() {
        return currentPatient;
    }

    public void setCurrentPatient(Patient currentPatient) {
        this.currentPatient = currentPatient;
    }

    public List<Patient> getWaitList() {
        return waitList;
    }

    public void setWaitList(List<Patient> waitList) {
        this.waitList = waitList;
    }

}
