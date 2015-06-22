package swt.apis2015.entities;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author B-Real
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
