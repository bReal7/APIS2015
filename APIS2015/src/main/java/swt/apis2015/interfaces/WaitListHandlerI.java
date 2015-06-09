/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt.apis2015.interfaces;

import java.util.List;
import swt2.apis2015.dto.PatientDto;

/**
 *
 * @author B-Real
 */
public interface WaitListHandlerI {
    
    public boolean waitListPatient(PatientDto pat);

    public List<PatientDto> getWaitList();

    public PatientDto getCurrentPatient();

    public PatientDto setCurrentPatient();
    
    
}
