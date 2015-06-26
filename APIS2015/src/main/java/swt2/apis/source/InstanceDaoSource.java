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

/**
 * Diese Klasse macht den DB zugriff für Fall
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
    public void createInstance(InstanceDto nInsDto) {

        Instance nIns = insDtoToEntity(nInsDto);
        try {
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            session.save(nIns);
            session.getTransaction().commit();
            LOGGER.info("Logger Name: " + LOGGER.getName() + " Instance created id " + nIns.getId() + " dia " + nIns.getDia().get(0).getIcd_Description());
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

//    public List<Instance> insListDtoToEntity(List<InstanceDto> ins) {
//        Mapper mapper = new DozerBeanMapper();
//        List<Instance> result = new ArrayList<>();
//        for (InstanceDto x : ins) {
//            result.add(mapper.map(x, Instance.class));
//        }
//        return result;
//    }

    public InstanceDto entityToInsDto(Instance ins) {
        Mapper mapper = new DozerBeanMapper();
        InstanceDto nIns = mapper.map(ins, InstanceDto.class);
        return nIns;
    }

    @Override
    public void updateInstance() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
