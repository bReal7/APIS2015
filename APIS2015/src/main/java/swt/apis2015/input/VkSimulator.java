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
import java.util.logging.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import swt.apis2015.enums.InsurenceContract;
import swt2.apis2015.dto.PatientDto;

/**
 Diese Klasse simuliert ein Kartenlesegerät es, liest eine zufällige json Datei 
 * und mapped einen PatientenDto daraus
 */
public class VkSimulator {

    private PatientDto loadedPat;
    private static final String filePath = "C:\\development\\vkSim\\patSim";
    private static VkSimulator instance = null;
    private static final Logger LOGGER = Logger.getLogger(VkSimulator.class.getName());

    protected VkSimulator() {
        // Exists only to defeat instantiation.
    }

    public static VkSimulator getInstance() {
        if (instance == null) {
            instance = new VkSimulator();
        }
        return instance;
    }

    public PatientDto ladeKarte() throws FileNotFoundException, IOException, ParseException, java.text.ParseException {
        LOGGER.info("start ladeKarte "+LOGGER.getName());
        loadedPat = new PatientDto();
        FileReader reader = new FileReader(filePath + (int) (Math.random() * 10 + 1) + ".json");
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
        DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        loadedPat.setBirthday(format.parse((String) jsonObject.get("gebDatum")));
        loadedPat.setPatientOID(Integer.parseInt((String) jsonObject.get("oid")));
        loadedPat.setSurname((String) jsonObject.get("name"));
        loadedPat.setFirstname((String) jsonObject.get("vorname"));
        loadedPat.setPostalCode((String) jsonObject.get("postalCode"));
        loadedPat.setCity((String) jsonObject.get("city"));
        loadedPat.setStreet((String) jsonObject.get("street"));
        loadedPat.setCountry((String) jsonObject.get("state"));
        loadedPat.setInsuranceContract(InsurenceContract.AOK);
        LOGGER.info(LOGGER.getName() + " loaded Patient OID:" + loadedPat.getPatientOID()+ " Name: " + loadedPat.getFirstname() + " " + loadedPat.getSurname());
        return loadedPat;
    }
}
