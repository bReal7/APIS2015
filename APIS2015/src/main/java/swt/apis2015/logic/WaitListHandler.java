/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt.apis2015.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
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
        boolean result;
        result = waitlist.add(pat);
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
        PatientDto result = waitlist.get(0);
        waitlist.remove(0);
        return result;
    }

    @Override
    public PatientDto setCurrentPatient() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PatientDto next() {
        PatientDto result = null;
        if (waitlist.size() > 0) {
            result = waitlist.get(0);
            waitlist.remove(0);
            setChanged();
            notifyObservers(waitlist);
        }
        return result;
    }
}
