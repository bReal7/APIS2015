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
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.hibernate.Session;
import swt.apis2015.entities.Instance;
import swt.apis2015.entities.PatDiagnose;
import swt.apis2015.entities.PatMassnahme;
import swt.apis2015.entities.PatPhenomen;
import swt.apis2015.entities.PatSymptom;
import swt.apis2015.interfaces.PatPhenomenDao;
import swt2.apis2015.dto.InstanceDto;
import swt2.apis2015.dto.PatMassnahmeDto;
import swt2.apis2015.dto.PatPhenomenDto;
import swt2.apis2015.dto.PatDiagnoseDto;
import swt2.apis2015.dto.PatSymptomDto;
import swt2.apis2015.dto.PatientDto;

/**
 * Zugriff auf alle Patphenomene
 */
public class PatPhenomenDaoSource implements PatPhenomenDao {

    private static final Logger LOGGER = Logger.getLogger(PatientDaoSource.class.getName());

    private static PatPhenomenDaoSource instance = null;

    private PatPhenomenDaoSource() {
    }

    public static PatPhenomenDaoSource getInstance() {
        if (instance == null) {
            instance = new PatPhenomenDaoSource();
        }
        return instance;
    }

    @Override
    public void addPenomen(PatPhenomenDto nPhenomen) {
        try {
            PatPhenomen phe = pheDtoToEntity(nPhenomen);
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            session.save(phe);
            session.getTransaction().commit();
            LOGGER.info("Logger Name: " + LOGGER.getName() + " phenomen added, id = " + nPhenomen.getId());
        } catch (Exception e) {
            LOGGER.warning("Logger Name: " + LOGGER.getName() + " phenomen add failed, id = " + nPhenomen.getId() + " " + e.getMessage());
        }

    }

    /**
     * Hier wird überprüft um welches Phenomen es sich handelt
     * Symptom , Diagnose oder Massnahme
     */
    public PatPhenomen pheDtoToEntity(PatPhenomenDto nPhe) {
        if (PatDiagnoseDto.class == nPhe.getClass()) {
            return patDiaDtoToEntity((PatDiagnoseDto) nPhe);
        }
        if (PatMassnahmeDto.class == nPhe.getClass()) {
            return patMasDtoToEntity((PatMassnahmeDto) nPhe);
        }
        if (PatSymptomDto.class == nPhe.getClass()) {
            return patSymDtoToEntity((PatSymptomDto) nPhe);
        }
        return null;
    }

    /*
    Mapping     
    */
    public List<InstanceDto> entityEhrEntryToEhrEntryDto(List<Instance> ehr, PatientDto pat) {
        ArrayList<InstanceDto> res = new ArrayList<>();
        if (ehr == null) {
            return res;
        } else {
            for (int i = 0; i < ehr.size(); i++) {
                res.add(InstanceDaoSource.getInstance().entityToInsDto(ehr.get(i)));
            }
        }
        return res;
    }

    public PatSymptom patSymDtoToEntity(PatSymptomDto patSymDto) {

        Mapper mapper = new DozerBeanMapper();
        PatSymptom dia = mapper.map(patSymDto, PatSymptom.class);
        return dia;
    }

    public PatDiagnose patDiaDtoToEntity(PatDiagnoseDto patDiaDto) {

        Mapper mapper = new DozerBeanMapper();
        PatDiagnose dia = mapper.map(patDiaDto, PatDiagnose.class);
        return dia;
    }

    public PatMassnahme patMasDtoToEntity(PatMassnahmeDto patMasDto) {
        Mapper mapper = new DozerBeanMapper();
        PatMassnahme dia = mapper.map(patMasDto, PatMassnahme.class);
        return dia;
    }

    public PatSymptomDto patSymEntityToDto(PatSymptom patSym) {
        Mapper mapper = new DozerBeanMapper();
        PatSymptomDto dia = mapper.map(patSym, PatSymptomDto.class);
        return dia;
    }

    public PatDiagnoseDto patDiaEntityToDto(PatDiagnose patDia) {
        Mapper mapper = new DozerBeanMapper();
        PatDiagnoseDto dia = mapper.map(patDia, PatDiagnoseDto.class);
        return dia;
    }

    public PatMassnahmeDto patMasEntityToDto(PatMassnahme patMas, PatientDto pat) {
        Mapper mapper = new DozerBeanMapper();
        PatMassnahmeDto dia = mapper.map(patMas, PatMassnahmeDto.class);
        return dia;
    }
}
