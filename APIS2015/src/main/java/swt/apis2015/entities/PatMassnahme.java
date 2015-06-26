package swt.apis2015.entities;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *  text ist ein Maßnahme Text wie zum beispiel 3*Ohysiotherapie 45 Minuten
 */
@Entity
public class PatMassnahme extends PatPhenomen implements Serializable {

    private static final long serialVersionUID = 1L;

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
