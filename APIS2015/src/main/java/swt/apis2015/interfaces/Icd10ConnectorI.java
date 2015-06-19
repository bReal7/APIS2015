/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt.apis2015.interfaces;

import java.util.Map;

/**
 *
 * @author B-Real
 */
public interface Icd10ConnectorI {
    
    public Map<String,String> findIcdByName(String name);
    
}
