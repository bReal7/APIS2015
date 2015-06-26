/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt.apis2015.interfaces;

import java.util.List;
import swt2.apis2015.dto.HealthProfessionalDto;

/**
 * Hier sind mögliche funktionen für den Data Acces bezüglich der Klasse
 * Healthprfessional aufgelisted implimentiert sind bisher : public void
 * addHP(HealthProfessionalDto hp); public boolean login(String user, String
 * password); public void logout();
 */
public interface HealthProfessionalDao {

    public List<HealthProfessionalDto> getAllHealthProfessionals();

    public List<HealthProfessionalDto> getHealthProfessionalByName();

    public void updateHP();

    public void deleteHP();

    public void addHP(HealthProfessionalDto hp);

    public boolean login(String user, String password);

    public HealthProfessionalDto getLoggedUser();

    public void logout();
}
