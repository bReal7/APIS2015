/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt2.apis.source;

import apis2015.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import swt.apis2015.entities.Patient;
import swt.apis2015.entities.Workflow;
import swt.apis2015.interfaces.WorkflowDao;
import swt2.apis2015.dto.PatientDto;
import swt2.apis2015.dto.WorkflowDto;

/**
 *
 * @author B-Real
 */
public class WorkflowDaoSource implements WorkflowDao {

//    private static WorkflowDaoSource instance = null;
//
//    protected WorkflowDaoSource() {
//    }
//
//    public static WorkflowDaoSource getInstance() {
//        if (instance == null) {
//            instance = new WorkflowDaoSource();
//        }
//        return instance;
//    }
//
//    @Override
//    public boolean waitListPatient(PatientDto pat) {
//        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//        session.beginTransaction();
//        Query query = session.createQuery("FROM Workflow w WHERE w.id = 10");
//        List<Workflow> temp = (List<Workflow>) query.list();
//        Workflow wf = null;
//        if (temp.size() == 0) {
//            wf = new Workflow();
//            wf.getWaitList().add(PatientDaoSource.getInstance().patDtoToEntity(pat));
//        } else {
//            wf = temp.get(0);
//            wf.getWaitList().add(PatientDaoSource.getInstance().patDtoToEntity(pat));
//        }
//        session.save(wf);
//        session.getTransaction().commit();
//        return true;
//    }
//
//    @Override
//    public List<PatientDto> getWaitList() {
//        
//        List<Patient> wl = getWorkflowInstance().getWaitList();      
//        List<PatientDto> result = null;
//        for(Patient x : wl){
//        result.add(PatientDaoSource.getInstance().entityToPatDto(x));
//        }
//        return result;
//    }
//
//    @Override
//    public PatientDto getCurrentPatient() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public PatientDto setCurrentPatient() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private Workflow workflowDtoToEntity(WorkflowDto wf) {
//        Workflow result = new Workflow();
//        result.setCurrentPatient(wf.getCurrentPatient());
//        result.setWaitList(wf.getWaitList());
//        return result;
//    }
//
//    private Workflow getWorkflowInstance() {
//        System.out.println("SAdoksnsdkljnvakjnvbksjnvglköjvnfgpokjnbgaswkldvmülknbmafmvxü bfgoikbnmdsflkbm dfölk bm");
//        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//        session.beginTransaction();
//        Query query = session.createQuery("FROM Workflow w WHERE w.id = 10");
//        List<Workflow> temp = (List<Workflow>) query.list();
//        session.getTransaction().commit();
//        if (temp.size() == 0) {
//        System.out.println("IN");
//            return new Workflow();
//        } else {
//        System.out.println("OUT");
//            return temp.get(0);
//        }
//    }
}
