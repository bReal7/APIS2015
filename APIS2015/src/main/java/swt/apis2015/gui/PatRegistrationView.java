/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt.apis2015.gui;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.parser.ParseException;
import swt.apis2015.input.VkSimulator;
import swt.apis2015.logic.PatientDaoImpl;
import swt.apis2015.logic.WaitListHandler;
import swt2.apis2015.dto.PatientDto;

/**
 * Dieses Fenster dient der Patientenaufnahme
 */
public class PatRegistrationView extends javax.swing.JFrame {

    private PatientDto tmp;

    /**
     * Creates new form PatRegistration
     */
    public PatRegistrationView() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        datenLadenButton = new javax.swing.JButton();
        Nachname = new javax.swing.JLabel();
        Geburtstag = new javax.swing.JLabel();
        Vorname = new javax.swing.JLabel();
        PatId = new javax.swing.JLabel();
        VersichertenStatu = new javax.swing.JLabel();
        fertigButton = new javax.swing.JButton();
        OID = new javax.swing.JLabel();
        pId = new javax.swing.JLabel();
        oid = new javax.swing.JLabel();
        nname = new javax.swing.JLabel();
        vname = new javax.swing.JLabel();
        geb = new javax.swing.JLabel();
        vs = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ort = new javax.swing.JLabel();
        plz = new javax.swing.JLabel();
        strasse = new javax.swing.JLabel();
        land = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                onCloseHandler(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        datenLadenButton.setBackground(new java.awt.Color(102, 102, 255));
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("swt/apis2015/internationalisation/PatRegistrationView"); // NOI18N
        datenLadenButton.setText(bundle.getString("PatRegistrationView.datenLadenButton.text")); // NOI18N
        datenLadenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datenLadenButtonActionPerformed(evt);
            }
        });

        Nachname.setText(bundle.getString("PatRegistrationView.Nachname.text")); // NOI18N

        Geburtstag.setText(bundle.getString("PatRegistrationView.Geburtstag.text")); // NOI18N

        Vorname.setText(bundle.getString("PatRegistrationView.Vorname.text")); // NOI18N

        PatId.setText(bundle.getString("PatRegistrationView.PatId.text")); // NOI18N

        VersichertenStatu.setText(bundle.getString("PatRegistrationView.VersichertenStatu.text")); // NOI18N

        fertigButton.setBackground(new java.awt.Color(102, 102, 255));
        fertigButton.setText(bundle.getString("PatRegistrationView.fertigButton.text")); // NOI18N
        fertigButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fertigButtonActionPerformed(evt);
            }
        });

        OID.setText(bundle.getString("PatRegistrationView.OID.text")); // NOI18N

        pId.setText(bundle.getString("PatRegistrationView.pId.text")); // NOI18N

        oid.setText(bundle.getString("PatRegistrationView.oid.text")); // NOI18N

        nname.setText(bundle.getString("PatRegistrationView.nname.text")); // NOI18N

        vname.setText(bundle.getString("PatRegistrationView.vname.text")); // NOI18N

        geb.setText(bundle.getString("PatRegistrationView.geb.text")); // NOI18N

        vs.setText(bundle.getString("PatRegistrationView.vs.text")); // NOI18N

        jLabel1.setText(bundle.getString("PatRegistrationView.jLabel1.text")); // NOI18N

        jLabel2.setText(bundle.getString("PatRegistrationView.jLabel2.text")); // NOI18N

        jLabel3.setText(bundle.getString("PatRegistrationView.jLabel3.text")); // NOI18N

        jLabel4.setText(bundle.getString("PatRegistrationView.jLabel4.text")); // NOI18N

        jLabel5.setText(bundle.getString("PatRegistrationView.jLabel5.text")); // NOI18N

        ort.setText(bundle.getString("PatRegistrationView.ort.text")); // NOI18N

        plz.setText(bundle.getString("PatRegistrationView.plz.text")); // NOI18N

        strasse.setText(bundle.getString("PatRegistrationView.strasse.text")); // NOI18N

        land.setText(bundle.getString("PatRegistrationView.land.text")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Nachname)
                                        .addComponent(Vorname)
                                        .addComponent(Geburtstag))
                                    .addGap(5, 5, 5))
                                .addComponent(PatId, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(OID)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VersichertenStatu)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(oid)
                                    .addComponent(pId, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nname)
                                    .addComponent(vname)
                                    .addComponent(geb))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                .addComponent(fertigButton)
                                .addGap(10, 10, 10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(strasse)
                                    .addComponent(land)
                                    .addComponent(vs)
                                    .addComponent(ort)
                                    .addComponent(plz))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(datenLadenButton)
                    .addContainerGap(125, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PatId)
                    .addComponent(pId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OID)
                    .addComponent(oid))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nachname)
                    .addComponent(nname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Vorname)
                    .addComponent(vname))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Geburtstag)
                    .addComponent(geb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VersichertenStatu)
                    .addComponent(vs))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ort)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plz)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(strasse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(land))
                .addGap(21, 21, 21)
                .addComponent(fertigButton)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(datenLadenButton)
                    .addContainerGap(301, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * daten werden vom Kartenlesegeät geladen (Hier: Simulator)
     *
     * @param evt
     */
    private void datenLadenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datenLadenButtonActionPerformed
        try {
            tmp = VkSimulator.getInstance().ladeKarte();
            oid.setText(String.valueOf(tmp.getPatientOID()));
            nname.setText(tmp.getSurname());
            vname.setText(tmp.getFirstname());
            DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
            geb.setText(format.format(tmp.getBirthday()));
            vs.setText(String.valueOf(tmp.getInsuranceContract()));
            ort.setText(tmp.getCity());
            plz.setText(tmp.getPostalCode());
            strasse.setText(tmp.getStreet());
            land.setText(tmp.getCountry());
        } catch (ParseException ex) {
            Logger.getLogger(PatRegistrationView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (java.text.ParseException ex) {
            Logger.getLogger(PatRegistrationView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PatRegistrationView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_datenLadenButtonActionPerformed

    /**
     * Hier wird der Patient auf die Warteliste gesetzt
     * Falls es der Patient zum ersten mal die Praxis besucht wird er in die DB eingetragen 
     * @param evt 
     */
    private void fertigButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fertigButtonActionPerformed
        if (!PatientDaoImpl.getInstance().isAlreadyRegistered(tmp.getPatientOID())) {
            PatientDaoImpl.getInstance().addPatient(tmp);
        }
        this.setVisible(false);
        this.dispose();
        WaitListHandler.getInstance().waitListPatient(PatientDaoImpl.getInstance().findPatientByOid(tmp.getPatientOID()));
    }//GEN-LAST:event_fertigButtonActionPerformed

    private void onCloseHandler(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_onCloseHandler
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_onCloseHandler

//    private PatientDto initPat() throws java.text.ParseException {
//        PatientDto pat = new PatientDto();
//        DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
//        pat.setBirthday(format.parse(geb.getText()));
//        pat.setCity(ort.getText());
//        pat.setCountry(land.getText());
//        pat.setFirstname(vname.getText());
//        pat.setPatientOID(Integer.parseInt(oid.getText()));
//        pat.setPostalCode(plz.getText());
//        pat.setStreet(strasse.getText());
//        pat.setSurname(nname.getText());
//        pat.setInsuranceContract(InsurenceContract.AOK);
//        return pat;
//    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PatRegistrationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatRegistrationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatRegistrationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatRegistrationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatRegistrationView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Geburtstag;
    private javax.swing.JLabel Nachname;
    private javax.swing.JLabel OID;
    private javax.swing.JLabel PatId;
    private javax.swing.JLabel VersichertenStatu;
    private javax.swing.JLabel Vorname;
    private javax.swing.JButton datenLadenButton;
    private javax.swing.JButton fertigButton;
    private javax.swing.JLabel geb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel land;
    private javax.swing.JLabel nname;
    private javax.swing.JLabel oid;
    private javax.swing.JLabel ort;
    private javax.swing.JLabel pId;
    private javax.swing.JLabel plz;
    private javax.swing.JLabel strasse;
    private javax.swing.JLabel vname;
    private javax.swing.JLabel vs;
    // End of variables declaration//GEN-END:variables
}
