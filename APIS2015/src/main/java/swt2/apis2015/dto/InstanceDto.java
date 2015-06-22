/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt2.apis2015.dto;

import java.util.Date;
import java.util.List;

/**
 *
 * @author B-Real
 */
public class InstanceDto {

    private Long id;
    private Date date;
    private PatientDto pat;
    private List <PatSymptomDto> sym;
    private List <PatDiagnoseDto> dia;
    private List <PatMassnahmeDto> mas;

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

    public List<PatSymptomDto> getSym() {
        return sym;
    }

    public void setSym(List<PatSymptomDto> sym) {
        this.sym = sym;
    }

    public List<PatDiagnoseDto> getDia() {
        return dia;
    }

    public void setDia(List<PatDiagnoseDto> dia) {
        this.dia = dia;
    }

    public List<PatMassnahmeDto> getMas() {
        return mas;
    }

    public void setMas(List<PatMassnahmeDto> mas) {
        this.mas = mas;
    }

}
