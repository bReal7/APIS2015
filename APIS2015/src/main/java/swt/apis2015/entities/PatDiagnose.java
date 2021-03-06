package swt.apis2015.entities;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * Die Diagnose wird im gebräuchlichem Standard icd10 dokumentiert Dabei ist
 * jeweils für die entsprechende diagnose der ICD 10 Code und die Beschreibung
 * des Codes interessant Zusätzlich wir dkomunetiert seit wann das
 * diagnostizierte Problem besteht, since Attribut
 *
 */
@Entity
public class PatDiagnose extends PatPhenomen implements Serializable {

    private String since;
    private String icd_code;
    private String icd_Description;

    public String getSince() {
        return since;
    }

    public void setSince(String since) {
        this.since = since;
    }

    public String getIcd_code() {
        return icd_code;
    }

    public void setIcd_code(String icd_code) {
        this.icd_code = icd_code;
    }

    public String getIcd_Description() {
        return icd_Description;
    }

    public void setIcd_Description(String icd_Description) {
        this.icd_Description = icd_Description;
    }

}
