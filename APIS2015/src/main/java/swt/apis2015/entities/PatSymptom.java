package swt.apis2015.entities;

import javax.persistence.Entity;

/**
 *
 * @author B-Real
 */

@Entity
public class PatSymptom extends PatPhenomen{
    private String intensity;
    private String location;

    public PatSymptom() {
    }
    
    public String getIntensity() {
        return intensity;
    }

    public void setIntensity(String intensity) {
        this.intensity = intensity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    
    
}
