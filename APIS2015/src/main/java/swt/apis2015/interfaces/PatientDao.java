/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt.apis2015.interfaces;

import java.util.List;
import swt2.apis2015.dto.PatientDto;

/**
 * Data Acces für Patient
 */
public interface PatientDao {

    public PatientDto getPatientByID(long id);

    public List<PatientDto> getPatientByName(String name);
    
    public PatientDto findPatientByOid(int oid);
    
    public void updatePatient(PatientDto pat);

    public void addPatient(PatientDto nPat);
    
    public boolean isAlreadyRegistered(int oid);
}
