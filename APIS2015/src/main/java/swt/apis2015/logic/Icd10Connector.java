/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt.apis2015.logic;

import java.util.Map;
import swt.apis2015.interfaces.Icd10ConnectorI;
import swt2.apis.source.Icd10ConnectorSource;

/**
 *
 * @author B-Real
 */
public class Icd10Connector implements Icd10ConnectorI {

    private static Icd10Connector instance = null;

    private Icd10Connector() {
    }

    public static Icd10Connector getInstance() {
        if (instance == null) {
            instance = new Icd10Connector();
        }
        return instance;
    }

    @Override
    public Map<String,String> findIcdByName(String name) {
        return Icd10ConnectorSource.getInstance().findIcdByName(name);
    }

}
