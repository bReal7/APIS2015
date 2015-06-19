/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt2.apis.source;

import apis2015.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
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

/**
 *
 * @author B-Real
 */
public class PatPhenomenDaoSource implements PatPhenomenDao {

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
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(pheDtoToEntity(nPhenomen));
        session.getTransaction().commit();
    }

//    @Override
//    public void deleteInstance() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    public PatPhenomen pheDtoToEntity(PatPhenomenDto nPhe) {
        if (PatDiagnoseDto.class == nPhe.getClass()) {
            System.err.println(nPhe.getClass() + "++++++++++++++++++++");
        }
//        PatPhenomen result = new PatSymptom(); 
        return new PatMassnahme();
    }

    public PatPhenomenDto entityToPheDto(PatPhenomen phe) {
//        InstanceDto insDto = new InstanceDto();
//        insDto.setId(phe.getId());
//        insDto.setDate(phe.getDate());
//        insDto.setAllEvents(phe.getAllEvents());
//        return insDto;
        return new PatMassnahmeDto();
    }

    public List<InstanceDto> entityEhrEntryToEhrEntryDto(List<Instance> ehr) {

        return new ArrayList<InstanceDto>();
    }

    public List<Instance> ehrEntryDtoToEntity(List<InstanceDto> ehrDto) {
        ArrayList<Instance> res = new ArrayList<>();
        if (ehrDto == null) {
            return res;
        } else {
            for (int i = 0; i <= ehrDto.size(); i++) {
                res.add(InstanceDaoSource.getInstance().insDtoToEntity(ehrDto.get(i)));
            }
        }
        return res;
    }
//
//    public List<Instance> ehrEntryDtoToentityEhrEntry(List<InstanceDto> ehrDto) {
//        Instance ins = new Instance();
//        ins.setDate(phe.getDate());
//        insDto.setAllEvents(phe.getAllEvents());
//        return insDto;
//        return new ArrayList<Instance>();
//    }

    public PatSymptom patSymDtoToEntity(PatSymptomDto patSymDto, long patId) {
        PatSymptom nSym = new PatSymptom();
        nSym.setComment(patSymDto.getComment());
        nSym.setDate(patSymDto.getDate());
        nSym.setIntensity(patSymDto.getIntensity());
        nSym.setLocation(patSymDto.getLocation());
        nSym.setPatient(PatientDaoSource.getInstance().getPatienById(patId));
        nSym.setWrittenBy("aqwe");
        return nSym;
    }

    public PatDiagnose patDiaDtoToEntity(PatDiagnoseDto patDiaDto, long patId) {
        PatDiagnose nDia = new PatDiagnose();
        nDia.setComment(patDiaDto.getComment());
        nDia.setDate(patDiaDto.getDate());
        nDia.setPatient(PatientDaoSource.getInstance().getPatienById(patId));
        nDia.setWrittenBy("qwe");
        nDia.setIcd_Description(patDiaDto.getIcd_Description());
        nDia.setIcd_code(patDiaDto.getIcd_code());
        nDia.setSince(patDiaDto.getSince());
        return nDia;
    }

    public PatMassnahme patMasDtoToEntity(PatMassnahmeDto patDiaDto, long patId) {
        PatMassnahme nMas = new PatMassnahme();
        nMas.setComment(patDiaDto.getComment());
        nMas.setDate(patDiaDto.getDate());
        nMas.setPatient(PatientDaoSource.getInstance().getPatienById(patId));
        nMas.setWrittenBy(patDiaDto.getWrittenBy());
        nMas.setText(patDiaDto.getText());
        return nMas;
    }

}
