/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt.apis2015.entities;

import java.util.Date;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author B-Real
 */
@Entity
public class Instance implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @OneToOne(cascade = CascadeType.ALL)
    private Patient pat;
    @OneToOne(cascade = CascadeType.ALL)
    private PatSymptom sym;
    @OneToOne(cascade = CascadeType.ALL)
    private PatDiagnose dia;
    @OneToOne(cascade = CascadeType.ALL)
    private PatMassnahme mas;

    public Instance() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Patient getPat() {
        return pat;
    }

    public void setPat(Patient pat) {
        this.pat = pat;
    }

    public PatSymptom getSym() {
        return sym;
    }

    public void setSym(PatSymptom sym) {
        this.sym = sym;
    }

    public PatDiagnose getDia() {
        return dia;
    }

    public void setDia(PatDiagnose dia) {
        this.dia = dia;
    }

    public PatMassnahme getMas() {
        return mas;
    }

    public void setMas(PatMassnahme mas) {
        this.mas = mas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Person)) {
            return false;
        }
        Instance other = (Instance) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "swt.apis2015.entities.PersonE[ id=" + id + " ]";
    }
}
