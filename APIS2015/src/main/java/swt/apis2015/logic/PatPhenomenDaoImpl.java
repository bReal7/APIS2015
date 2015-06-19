/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt.apis2015.logic;

import swt.apis2015.interfaces.PatPhenomenDao;
import swt2.apis.source.PatPhenomenDaoSource;
import swt2.apis2015.dto.PatPhenomenDto;

/**
 *
 * @author B-Real
 */
public class PatPhenomenDaoImpl implements PatPhenomenDao{

    private static PatPhenomenDaoImpl instance = null;

    private PatPhenomenDaoImpl() {
    }

    public static PatPhenomenDaoImpl getInstance() {
        if (instance == null) {
            instance = new PatPhenomenDaoImpl();
        }
        return instance;
    }

    @Override
    public void addPenomen(PatPhenomenDto nPhenomen) {

        PatPhenomenDaoSource.getInstance().addPenomen(nPhenomen);
        
    }

}
