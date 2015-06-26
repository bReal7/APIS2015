/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt.apis2015.interfaces;

import swt2.apis2015.dto.InstanceDto;

/**
 * Data Acces für Fälle
 */
public interface InstanceDao {
    
    public void createInstance(InstanceDto nIns);
    public void updateInstance(); 
    
}
