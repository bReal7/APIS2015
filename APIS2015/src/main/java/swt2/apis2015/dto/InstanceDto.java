/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt2.apis2015.dto;

import java.util.Date;

/**
 *
 * @author B-Real
 */
public class InstanceDto {

    private Long id;
    private Date date;
    private PatientDto pat;
    private PatSymptomDto sym;
    private PatDiagnoseDto dia;
    private PatMassnahmeDto mas;

    public InstanceDto() {
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

    public PatientDto getPat() {
        return pat;
    }

    public void setPat(PatientDto pat) {
        this.pat = pat;
    }

    public PatSymptomDto getSym() {
        return sym;
    }

    public void setSym(PatSymptomDto sym) {
        this.sym = sym;
    }

    public PatDiagnoseDto getDia() {
        return dia;
    }

    public void setDia(PatDiagnoseDto dia) {
        this.dia = dia;
    }

    public PatMassnahmeDto getMas() {
        return mas;
    }

    public void setMas(PatMassnahmeDto mas) {
        this.mas = mas;
    }
}
