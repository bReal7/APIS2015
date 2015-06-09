/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt.apis2015.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import swt.apis2015.interfaces.Observer;
import swt.apis2015.interfaces.Subject;
import swt.apis2015.interfaces.WaitListHandlerI;
import swt2.apis2015.dto.PatientDto;

/**
 *
 * @author B-Real
 */
public class WaitListHandler extends Observable implements WaitListHandlerI {

    private List<PatientDto> waitlist = new ArrayList<PatientDto>();

    private static final WaitListHandler instance = new WaitListHandler();

    private WaitListHandler() {
        super();
    }

    public static WaitListHandler getInstance() {
        return instance;
    }

    @Override
    public boolean waitListPatient(PatientDto pat) {
        System.out.println("####waitingListEntered");
        boolean result;
            System.out.println("####Waitlist NOT NULL");
            result = waitlist.add(pat);
            System.out.println("pat added to waitlist " + result);
            System.out.println(waitlist.get(0).getFirstname());
            
            
        setChanged();
        notifyObservers(pat);
        return result;
    }


    
    @Override
    public List<PatientDto> getWaitList() {
            return waitlist;
    }

    @Override
    public PatientDto getCurrentPatient() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PatientDto setCurrentPatient() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
