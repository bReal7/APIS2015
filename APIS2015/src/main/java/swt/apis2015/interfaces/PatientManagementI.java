/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt.apis2015.interfaces;

import java.util.List;
import swt.apis2015.entities.Patient;

/**
 *
 * @author B-Real
 */
public interface PatientManagementI {
    public List<Patient> getPatientBySurname (String surname);
    public List<Patient> getPatientByFirstname (String firstname);
    public Patient getPatientByOID (String oid);
    public List<Patient> getPatientByBirthday (String bth);
    public List<Patient> getAllPatients ();
    public boolean addPatient(Patient nPat);
}
