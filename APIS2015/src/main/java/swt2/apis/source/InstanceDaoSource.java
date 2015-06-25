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
import swt.apis2015.interfaces.InstanceDao;
import swt2.apis2015.dto.InstanceDto;
import swt2.apis2015.dto.PatDiagnoseDto;
import swt2.apis2015.dto.PatMassnahmeDto;
import swt2.apis2015.dto.PatSymptomDto;
import swt2.apis2015.dto.PatientDto;

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

        Instance nIns = insDtoToEntity(nInsDto);
        try {
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            session.save(nIns);
            session.getTransaction().commit();
            LOGGER.info("Logger Name: " + LOGGER.getName() + " Instance created id " + nIns.getId() + " dia " + nIns.getDia().get(0).getIcd_Description() );
        } catch (Exception e) {
            LOGGER.warning("Logger Name: " + LOGGER.getName() + " createInstance failes, catched Exception: " + e.getMessage());
            LOGGER.warning("Logger Name: " + LOGGER.getName() + " inst date =  " + nIns.getDate());
        }
    }

    public Instance insDtoToEntity(InstanceDto ins) {
        Mapper mapper = new DozerBeanMapper();
        Instance nIns = mapper.map(ins, Instance.class);
        return nIns;
    }

    public List<Instance> insListDtoToEntity(List<InstanceDto> ins) {
        Mapper mapper = new DozerBeanMapper();
        List<Instance> result = new ArrayList<>();
        for (InstanceDto x : ins) {
            result.add(mapper.map(x, Instance.class));
        }
        return result;
//       ArrayList<Instance>result = new ArrayList<>();
//        for (int i = 0; i < ins.size(); i++) {
//            Instance nIns = new Instance();
//            nIns.setId(ins.get(i).getId());
//            nIns.setDate(ins.get(i).getDate());
//            List<PatSymptom> symList = new ArrayList<>();
//            for (int j = 0; j < ins.get(i).getSym().size(); j++) {
//                symList.add(PatPhenomenDaoSource.getInstance().patSymDtoToEntity(ins.get(i).getSym().get(j)));
//            }
//            List<PatDiagnose> diaList = new ArrayList<>();
////        for (int i = 0; i < ins.getDia().size(); i++) {
////            diaList.add(PatPhenomenDaoSource.getInstance().patDiaDtoToEntity(ins.getDia().get(i), patId));
////        }
//            List<PatMassnahme> masList = new ArrayList<>();
////        for (int i = 0; i < ins.getMas().size(); i++) {
////            masList.add(PatPhenomenDaoSource.getInstance().patMasDtoToEntity(ins.getMas().get(i), patId));
////        }
//            nIns.setSym(symList);
//            nIns.setDia(diaList);
//            nIns.setMas(masList);
//
//        }
//            return result;
    }

    public InstanceDto entityToInsDto(Instance ins, PatientDto pat) {
        InstanceDto nIns = new InstanceDto();
        nIns.setId(ins.getId());
//        nIns.setPat(pat);
        nIns.setDate(ins.getDate());
        List<PatSymptomDto> symList = new ArrayList<>();
        for (int i = 0; i < ins.getSym().size(); i++) {
            symList.add(PatPhenomenDaoSource.getInstance().patSymEntityToDto(ins.getSym().get(i), pat));
        }
        List<PatDiagnoseDto> diaList = new ArrayList<>();
        for (int i = 0; i < ins.getDia().size(); i++) {
            diaList.add(PatPhenomenDaoSource.getInstance().patDiaEntityToDto(ins.getDia().get(i), pat));
        }
        List<PatMassnahmeDto> masList = new ArrayList<>();
        for (int i = 0; i < ins.getMas().size(); i++) {
            masList.add(PatPhenomenDaoSource.getInstance().patMasEntityToDto(ins.getMas().get(i), pat));
        }
        nIns.setSym(symList);
        nIns.setDia(diaList);
        nIns.setMas(masList);

        return nIns;
    }

}
