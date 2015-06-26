package swt.apis2015.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import swt.apis2015.enums.HPRole;

/**
 * HealthProfessional, gehalt = monatsgehalt, das password muss eigegeben werden um sich ins system einzuloggen
 * die Rolle ist entweder Doctor oder Nurse
 */
@Entity
public class HealthProfessional extends Person implements java.io.Serializable {

    private double gehalt;
    private String password;
    @Enumerated(EnumType.STRING)
    private HPRole role;

    public HealthProfessional() {
    }

    public double getGehalt() {
        return this.gehalt;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public HPRole getRole() {
        return this.role;
    }

    public void setRole(HPRole role) {
        this.role = role;
    }

}
