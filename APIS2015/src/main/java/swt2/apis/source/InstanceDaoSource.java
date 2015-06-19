/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt2.apis.source;

import apis2015.util.HibernateUtil;
import org.hibernate.Session;
import swt.apis2015.entities.Instance;
import swt.apis2015.entities.Patient;
import swt.apis2015.interfaces.InstanceDao;
import swt2.apis2015.dto.InstanceDto;

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
//        nIns.setPat(PatientDaoSource.getInstance().patDtoToEntity(ins.getPat()));
        if (ins.getSym() != null) {
            nIns.setSym(PatPhenomenDaoSource.getInstance().patSymDtoToEntity(ins.getSym(), patId));
        }
        if (ins.getDia() != null) {
            nIns.setDia(PatPhenomenDaoSource.getInstance().patDiaDtoToEntity(ins.getDia(), patId));
        }
        if (ins.getMas() != null) {
            nIns.setMas(PatPhenomenDaoSource.getInstance().patMasDtoToEntity(ins.getMas(), patId));
        }
        return nIns;
    }

}
