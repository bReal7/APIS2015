/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt2.apis2015.dto;

/**
 *
 * @author B-Real
 */
public class PatDiagnoseDto extends PatPhenomenDto{

    private Long id;
    private String since;
    private String icd_code;
    private String icd_Description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
