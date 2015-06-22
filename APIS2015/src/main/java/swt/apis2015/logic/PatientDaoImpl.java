/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt.apis2015.logic;

import java.util.List;
import swt.apis2015.interfaces.PatientDao;
import swt2.apis.source.PatientDaoSource;
import swt2.apis2015.dto.PatientDto;

/**
 *
 * @author Administrator
 */
public class PatientDaoImpl implements PatientDao {

    private static PatientDaoImpl instance = null;

    private PatientDaoImpl() {
    }

    public static PatientDaoImpl getInstance() {
        if (instance == null) {
            instance = new PatientDaoImpl();
        }
        return instance;
    }

    @Override
    public PatientDto getPatientByID(long id) {
        return PatientDaoSource.getInstance().getPatientByID(id);
    }

    @Override
    public List<PatientDto> getPatientByName(String name) {
        return PatientDaoSource.getInstance().getPatientByName(name);
    }

    @Override
    public void updatePatient() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletePatient() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addPatient(PatientDto nPat) {
        PatientDaoSource.getInstance().addPatient(nPat);
    }

    @Override
    public PatientDto findPatientByOid(int oid) {
        return PatientDaoSource.getInstance().findPatientByOid(oid);
    }

    @Override
    public boolean isAlreadyRegistered(int oid) {
        return PatientDaoSource.getInstance().isAlreadyRegistered(oid);
    }
}
