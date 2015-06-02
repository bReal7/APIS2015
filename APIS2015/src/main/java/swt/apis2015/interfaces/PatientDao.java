/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt.apis2015.interfaces;

import java.util.Date;
import java.util.List;
import swt.apis2015.entities.HealthProfessional;
import swt.apis2015.entities.Patient;
import swt2.apis2015.dto.PatientDto;

/**
 *
 * @author B-Real
 */
public interface PatientDao {

    public PatientDto getPatientByID(String id);

    public List<PatientDto> getPatientByName(String name);

    public void updatePatient();

    public void deletePatient();

    public void addPatient(PatientDto nPat);
}
