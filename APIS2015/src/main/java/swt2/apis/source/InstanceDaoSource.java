/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt2.apis.source;

import apis2015.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.hibernate.Session;
import swt.apis2015.entities.Instance;
import swt.apis2015.entities.PatDiagnose;
import swt.apis2015.entities.PatMassnahme;
import swt.apis2015.entities.PatSymptom;
import swt.apis2015.interfaces.InstanceDao;
import swt2.apis2015.dto.InstanceDto;

/**
 *
 * @author B-Real
 */
public class InstanceDaoSource implements InstanceDao {

    private static final Logger LOGGER = Logger.getLogger(PatientDaoSource.class.getName());

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
//        PatientDaoSource.getInstance().updatePatient(nInsDto.getPat());
        Instance nIns = insDtoToEntity(nInsDto);
        try {
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            session.save(nIns);
            session.getTransaction().commit();
        } catch (Exception e) {
            LOGGER.warning("Logger Name: " + LOGGER.getName() + " createInstance failes, catched Exception: " + e.getMessage());
//            LOGGER.warning("Logger Name: " + LOGGER.getName() + " PatientId =  " + nIns.getPat().getId());
//            LOGGER.warning("Logger Name: " + LOGGER.getName() + " Anzahl der Ehr Entries =  " + nIns.getPat().getEhrEntry().size());
            LOGGER.warning("Logger Name: " + LOGGER.getName() + " inst date =  " + nIns.getDate());
//            LOGGER.warning("Logger Name: " + LOGGER.getName() + " Anzahl der Ehr Entries =  " + nIns.getPat().getEhrEntry().size());
            
        }
    }

    public Instance insDtoToEntity(InstanceDto ins) {
        long patId = ins.getPat().getId();

        Instance nIns = new Instance();
//        nIns.setPat(PatientDaoSource.getInstance().getPatienById(patId));
        nIns.setDate(ins.getDate());
        List<PatSymptom> symList = new ArrayList<>();
        for (int i = 0; i < ins.getSym().size(); i++) {
            symList.add(PatPhenomenDaoSource.getInstance().patSymDtoToEntity(ins.getSym().get(i), patId));
        }
        List<PatDiagnose> diaList = new ArrayList<>();
        for (int i = 0; i < ins.getDia().size(); i++) {
            diaList.add(PatPhenomenDaoSource.getInstance().patDiaDtoToEntity(ins.getDia().get(i), patId));
        }
        List<PatMassnahme> masList = new ArrayList<>();
        for (int i = 0; i < ins.getMas().size(); i++) {
            masList.add(PatPhenomenDaoSource.getInstance().patMasDtoToEntity(ins.getMas().get(i), patId));
        }
        nIns.setSym(symList);
        nIns.setDia(diaList);
        nIns.setMas(masList);

        return nIns;
    }

}
