/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt.apis2015.input;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import swt.apis2015.entities.Patient;

/**
 *
 * @author B-Real
 */
public class VkSimulator {

    private Patient loadedPat;
    private static final String filePath = "C:\\development\\vkSim\\patSim.json";
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

    public Patient ladeKarte() throws FileNotFoundException, IOException, ParseException, java.text.ParseException {
        loadedPat = new Patient();
        FileReader reader = new FileReader(filePath);
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
        DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        loadedPat.setBirthday(format.parse((String) jsonObject.get("gebDatum")));
        loadedPat.setSurname((String) jsonObject.get("name"));
        loadedPat.setFirstName((String) jsonObject.get("vorname"));
        loadedPat.setPostalCode((String) jsonObject.get("postalCode"));
        loadedPat.setCity((String) jsonObject.get("city"));
        loadedPat.setStreet((String) jsonObject.get("street"));
        loadedPat.setCountry((String) jsonObject.get("state"));
        loadedPat.setVersicherungsverhaeltnis((String) jsonObject.get("versichertenverhaeltnis"));
        return loadedPat;
    }
}
