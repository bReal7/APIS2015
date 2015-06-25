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
import swt.apis2015.entities.PatPhenomen;
import swt.apis2015.entities.PatSymptom;
import swt.apis2015.entities.Patient;
import swt.apis2015.interfaces.PatPhenomenDao;
import swt2.apis2015.dto.InstanceDto;
import swt2.apis2015.dto.PatMassnahmeDto;
import swt2.apis2015.dto.PatPhenomenDto;
import swt2.apis2015.dto.PatDiagnoseDto;
import swt2.apis2015.dto.PatSymptomDto;
import swt2.apis2015.dto.PatientDto;

/**
 *
 * @author B-Real
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
            Patient pat = PatientDaoSource.getInstance().patDtoToEntity(nPhenomen.getPatient());
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

//    @Override
//    public void deleteInstance() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
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

    public PatPhenomenDto entityToPheDto(PatPhenomen phe) {
//        InstanceDto insDto = new InstanceDto();
//        insDto.setId(phe.getId());
//        insDto.setDate(phe.getDate());
//        insDto.setAllEvents(phe.getAllEvents());
//        return insDto;
        return new PatMassnahmeDto();
    }

    public List<InstanceDto> entityEhrEntryToEhrEntryDto(List<Instance> ehr, PatientDto pat) {
        ArrayList<InstanceDto> res = new ArrayList<>();
        if (ehr == null) {
            return res;
        } else {
            for (int i = 0; i < ehr.size(); i++) {
                res.add(InstanceDaoSource.getInstance().entityToInsDto(ehr.get(i), pat));
            }
        }
        return res;
    }

//    public List<Instance> ehrEntryDtoToEntity(List<InstanceDto> ehrDto) {
//        ArrayList<Instance> res = new ArrayList<>();
//        if (ehrDto == null) {
//            return res;
//        } else {
//            for (int i = 0; i < ehrDto.size(); i++) {
//                res.add(InstanceDaoSource.getInstance().insDtoToEntity(ehrDto.get(i)));
//            }
//        }
//        return res;
//    }
//
//    public List<Instance> ehrEntryDtoToentityEhrEntry(List<InstanceDto> ehrDto) {
//        Instance ins = new Instance();
//        ins.setDate(phe.getDate());
//        insDto.setAllEvents(phe.getAllEvents());
//        return insDto;
//        return new ArrayList<Instance>();
//    }

    public PatSymptom patSymDtoToEntity(PatSymptomDto patSymDto) {
        PatSymptom nSym = new PatSymptom();
        nSym.setId(patSymDto.getId());
        nSym.setComment(patSymDto.getComment());
        nSym.setDate(patSymDto.getDate());
        nSym.setIntensity(patSymDto.getIntensity());
        nSym.setLocation(patSymDto.getLocation());
//        nSym.setPatient(pat);
        nSym.setWrittenBy("aqwe");
//        LOGGER.info("Logger Name: " + LOGGER.getName() + " symptom dto->entity, pat_id = " + nSym.getPatient().getId());
        return nSym;
    }

    public PatDiagnose patDiaDtoToEntity(PatDiagnoseDto patDiaDto) {
        PatDiagnose nDia = new PatDiagnose();
        nDia.setId(patDiaDto.getId());
        nDia.setComment(patDiaDto.getComment());
        nDia.setDate(patDiaDto.getDate());
//        nDia.setPatient(pat);
        nDia.setWrittenBy("qwe");
        nDia.setIcd_Description(patDiaDto.getIcd_Description());
        nDia.setIcd_code(patDiaDto.getIcd_code());
        nDia.setSince(patDiaDto.getSince());
        LOGGER.info("Logger Name: " + LOGGER.getName() + " diagnose dto->entity, pat_id = " );
        return nDia;
    }

    public PatMassnahme patMasDtoToEntity(PatMassnahmeDto patDiaDto) {
        PatMassnahme nMas = new PatMassnahme();
        nMas.setId(patDiaDto.getId());
        nMas.setComment(patDiaDto.getComment());
        nMas.setDate(patDiaDto.getDate());
//        nMas.setPatient(pat);
        nMas.setWrittenBy(patDiaDto.getWrittenBy());
        nMas.setText(patDiaDto.getText());
        LOGGER.info("Logger Name: " + LOGGER.getName() + " massnahme dto->entity, pat_id = " );
        return nMas;
    }

    public PatSymptomDto patSymEntityToDto(PatSymptom patSym, PatientDto pat) {
        PatSymptomDto nSym = new PatSymptomDto();
        nSym.setId(patSym.getId());
        nSym.setComment(patSym.getComment());
        nSym.setDate(patSym.getDate());
        nSym.setIntensity(patSym.getIntensity());
        nSym.setLocation(patSym.getLocation());
        nSym.setPatient(pat);
        nSym.setWrittenBy("aqwe");
        LOGGER.info("Logger Name: " + LOGGER.getName() + " symptom entity-> dto, pat_id = " + nSym.getPatient().getId());
        return nSym;
    }

    public PatDiagnoseDto patDiaEntityToDto(PatDiagnose patDia, PatientDto pat) {
        PatDiagnoseDto nDia = new PatDiagnoseDto();
        nDia.setId(patDia.getId());
        nDia.setId(patDia.getId());
        nDia.setComment(patDia.getComment());
        nDia.setDate(patDia.getDate());
        nDia.setPatient(pat);
        nDia.setWrittenBy("qwe");
        nDia.setIcd_Description(patDia.getIcd_Description());
        nDia.setIcd_code(patDia.getIcd_code());
        nDia.setSince(patDia.getSince());
        LOGGER.info("Logger Name: " + LOGGER.getName() + " diagnose entity -> dto, pat_id = " + nDia.getPatient().getId());
        return nDia;
    }

    public PatMassnahmeDto patMasEntityToDto(PatMassnahme patMas, PatientDto pat) {
        PatMassnahmeDto nMas = new PatMassnahmeDto();
        nMas.setId(patMas.getId());
        nMas.setComment(patMas.getComment());
        nMas.setDate(patMas.getDate());
        nMas.setPatient(pat);
        nMas.setWrittenBy(patMas.getWrittenBy());
        nMas.setText(patMas.getText());
        LOGGER.info("Logger Name: " + LOGGER.getName() + " massnahme entity -> dto, pat_id = " + nMas.getPatient().getId());
        return nMas;
    }

}
