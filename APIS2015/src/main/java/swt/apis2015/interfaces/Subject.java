/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt.apis2015.interfaces;

/**
 *
 * @author B-Real
 */
public interface Subject {

    public void registerObservers(Observer observer);

    public void removeObservers(Observer observer);

    public void notifyObserevers();

}