/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt.apis2015.interfaces;

import java.util.List;
import swt.apis2015.entities.HealthProfessional;
import swt2.apis2015.dto.HealthProfessionalDto;

/**
 *
 * @author B-Real
 */
public interface HealthProfessionalDao {
    public List<HealthProfessional> getAllHealthProfessionals();

    public List<HealthProfessional> getHealthProfessionalByName();

    public void updateHP();

    public void deleteHP();

    public void addHP(HealthProfessionalDto hp);
}
