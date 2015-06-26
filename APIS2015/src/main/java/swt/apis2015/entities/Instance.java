package swt.apis2015.entities;

import java.util.Date;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Eine Instance ist ein Fall, viele Fälle können zu einen Patienten hinzugefügt
 * werden, somit bidirectionale ManyToOne - OneToMany Beziehung für Instance -
 * Patient unidirektionale oneToMany beziehung für Instance - PatSymptom
 * unidirektionale oneToMany beziehung für Instance - PatDiagnose
 * unidirektionale oneToMany beziehung für Instance - PatMassnahme
 *
 */
@Entity
public class Instance implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @ManyToOne
    private Patient pat;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<PatSymptom> sym;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<PatDiagnose> dia;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<PatMassnahme> mas;

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

    public List<PatSymptom> getSym() {
        return sym;
    }

    public void setSym(List<PatSymptom> sym) {
        this.sym = sym;
    }

    public List<PatDiagnose> getDia() {
        return dia;
    }

    public void setDia(List<PatDiagnose> dia) {
        this.dia = dia;
    }

    public List<PatMassnahme> getMas() {
        return mas;
    }

    public void setMas(List<PatMassnahme> mas) {
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
