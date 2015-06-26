package swt.apis2015.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import swt.apis2015.enums.InsurenceContract;

/**
 * Patient hat viele Fallakten einträge (bidirektionale OneToMany ) Die OID ist
 * die unique id die jeder Patient von seiner Krankenkasse bekommt und so
 * EU(vielleicht auch mehr) weit identifieziert werden kann
 */
@Entity
public class Patient extends Person implements java.io.Serializable {

    private InsurenceContract insuranceContract;
    private int patientOID;
    @OneToMany(mappedBy = "pat")
    private List<Instance> ehrEntry;

    public Patient() {
    }

    public InsurenceContract getInsuranceContract() {
        return this.insuranceContract;
    }

    public void setInsuranceContract(InsurenceContract insuranceContract) {
        this.insuranceContract = insuranceContract;
    }

    public int getPatientOID() {
        return this.patientOID;
    }

    public void setPatientOID(int patientOID) {
        this.patientOID = patientOID;
    }

    public List<Instance> getEhrEntry() {
        return ehrEntry;
    }

    public void setEhrEntry(List<Instance> ehrEntry) {
        this.ehrEntry = ehrEntry;
    }

}
