/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt.apis2015.input;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author B-Real
 */
public class VkSimulator {

    private int patientOID;
    private String name;
    private String vorname;
    private String gebDatum;
    private int versicherungsverhaeltnis;
    private static final String filePath = "C:\\APIS2015\\vkSim\\patSim.json";
    private static VkSimulator instance = null;

    protected VkSimulator() {
        // Exists only to defeat instantiation.
    }

    public static VkSimulator getInstance() {
        if (instance == null) {
            instance = new VkSimulator();
        }
        return instance;
    }

    public VkSimulator ladeKarte() throws FileNotFoundException, IOException, ParseException {
        FileReader reader = new FileReader(filePath);
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
        this.name = (String) jsonObject.get("name");
        this.vorname = (String) jsonObject.get("vorname");
        this.gebDatum = (String) jsonObject.get("gebDatum");       
        this.versicherungsverhaeltnis = Integer.parseInt ((String)jsonObject.get("versichertenverhaeltnis"));
        return this;
    }

    public int getPatientOID() {
        return patientOID;
    }

    public void setPatientOID(int patientOID) {
        this.patientOID = patientOID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getGebDatum() {
        return gebDatum;
    }

    public void setGebDatum(String gebDatum) {
        this.gebDatum = gebDatum;
    }

    public int getVersicherungsverhaeltnis() {
        return versicherungsverhaeltnis;
    }

    public void setVersicherungsverhaeltnis(int versicherungsverhaeltnis) {
        this.versicherungsverhaeltnis = versicherungsverhaeltnis;
    }
}
