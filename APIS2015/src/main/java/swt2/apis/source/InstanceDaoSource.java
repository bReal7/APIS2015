/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt2.apis.source;

import apis2015.util.HibernateUtil;
import java.util.ArrayList;
import org.hibernate.Session;
import swt.apis2015.entities.Instance;
import swt.apis2015.entities.PatDiagnose;
import swt.apis2015.entities.PatMassnahme;
import swt.apis2015.entities.PatSymptom;
import swt.apis2015.interfaces.InstanceDao;
import swt2.apis2015.dto.InstanceDto;
import swt2.apis2015.dto.PatDiagnoseDto;
import swt2.apis2015.dto.PatMassnahmeDto;
import swt2.apis2015.dto.PatSymptomDto;

/**
 *
 * @author B-Real
 */
public class InstanceDaoSource implements InstanceDao {

    private static InstanceDaoSource instance = null;

    private InstanceDaoSource() {
    }

    public static InstanceDaoSource getInstance() {
        if (instance == null) {
            instance = new InstanceDaoSource();
        }
        return instance;
    }

    @Override
    public void updateInstance() {

    }

    @Override
    public void createInstance(InstanceDto nInsDto) {
        Instance nIns = insDtoToEntity(nInsDto);
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(nIns);
        session.getTransaction().commit();
    }

    public Instance insDtoToEntity(InstanceDto ins) {
        long patId = ins.getPat().getId();
        Instance nIns = new Instance();
        nIns.setPat(PatientDaoSource.getInstance().getPatienById(patId));
        nIns.setDate(ins.getDate());
        ArrayList<PatSymptom> rsSymptom = new ArrayList<>();
        ArrayList<PatDiagnose> rsDiagnose = new ArrayList<>();
        ArrayList<PatMassnahme> rsMassnahme = new ArrayList<>();

//        nIns.setPat(PatientDaoSource.getInstance().patDtoToEntity(ins.getPat()));
        if (ins.getSym() != null) {
            for (PatSymptomDto x : ins.getSym()) {
                rsSymptom.add(PatPhenomenDaoSource.getInstance().patSymDtoToEntity(x, patId));
            }
            nIns.setSym(rsSymptom);
        }
        if (ins.getDia() != null) {
            for (PatDiagnoseDto x : ins.getDia()) {
                rsDiagnose.add(PatPhenomenDaoSource.getInstance().patDiaDtoToEntity(x, patId));
            }
            nIns.setDia(rsDiagnose);
        }
        if (ins.getMas() != null) {
            for (PatMassnahmeDto x : ins.getMas()) {
                rsMassnahme.add(PatPhenomenDaoSource.getInstance().patMasDtoToEntity(x, patId));
            }
            nIns.setMas(rsMassnahme);
        }
        return nIns;
    }

}
