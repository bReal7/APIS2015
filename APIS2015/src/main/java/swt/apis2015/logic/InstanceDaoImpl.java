/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt.apis2015.logic;

import swt.apis2015.interfaces.InstanceDao;
import swt2.apis.source.InstanceDaoSource;
import swt2.apis2015.dto.InstanceDto;

/**
 *
 * @author B-Real
 */
public class InstanceDaoImpl implements InstanceDao {

    private static InstanceDaoImpl instance = null;

    private InstanceDaoImpl() {
    }

    public static InstanceDaoImpl getInstance() {
        if (instance == null) {
            instance = new InstanceDaoImpl();
        }
        return instance;
    }

    @Override
    public void createInstance(InstanceDto nIns) {
        InstanceDaoSource.getInstance().createInstance(nIns);
    }

    @Override
    public void updateInstance() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
