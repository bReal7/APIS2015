/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt.apis2015.gui;

import swt.apis2015.enums.HPRole;
import swt.apis2015.logic.HealthProfessionalDaoLogic;
import swt2.apis2015.dto.HealthProfessionalDto;

/**
 *
 * @author B-Real
 */
public class SigningView extends javax.swing.JFrame {

    /**
     * Creates new form SigningView
     */
    public SigningView() {
        initComponents();
        wrongPasswortLabel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        healthProfessional1 = new swt.apis2015.entities.HealthProfessional();
        Stammdaten = new javax.swing.JPanel();
        Nachname = new javax.swing.JLabel();
        Vorname = new javax.swing.JLabel();
        weiterBtn = new javax.swing.JButton();
        OID = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        ortJL = new javax.swing.JLabel();
        plzJL = new javax.swing.JLabel();
        strasseJL = new javax.swing.JLabel();
        landJL = new javax.swing.JLabel();
        nachnameTF = new javax.swing.JTextField();
        vornameTF = new javax.swing.JTextField();
        plzTF = new javax.swing.JTextField();
        strasseTF = new javax.swing.JTextField();
        landTF = new javax.swing.JTextField();
        ortTF = new javax.swing.JTextField();
        passwortJL = new javax.swing.JLabel();
        repeatPasswortJL = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        wrongPasswortLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        gahaltTf = new javax.swing.JTextField();
        roleComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Stammdaten.setBackground(new java.awt.Color(102, 153, 255));

        Nachname.setText("Vorname:");

        Vorname.setText("Geburtstag:");

        weiterBtn.setText("Weiter");
        weiterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weiterBtnActionPerformed(evt);
            }
        });

        OID.setText("Nachname:");

        title.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        title.setText("Health Professional");

        ortJL.setText("Ort:");

        plzJL.setText("PLZ:");

        strasseJL.setText("Strasse:");

        landJL.setText("Land:");

        nachnameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nachnameTFActionPerformed(evt);
            }
        });

        passwortJL.setText("Passwort");

        repeatPasswortJL.setText("Repeat passwort");

        jPasswordField1.setToolTipText("");
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jPasswordField2.setToolTipText("wrong passwort");
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });

        jXDatePicker1.setLinkPanel(null);
        jXDatePicker1.setName(""); // NOI18N
        jXDatePicker1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXDatePicker1ActionPerformed(evt);
            }
        });

        wrongPasswortLabel.setForeground(new java.awt.Color(204, 0, 0));
        wrongPasswortLabel.setText("wrong passwort");

        jLabel1.setText("Gehalt:");

        gahaltTf.setToolTipText("");
        gahaltTf.setName("gehaltTv"); // NOI18N
        gahaltTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gahaltTfActionPerformed(evt);
            }
        });

        roleComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Doctor", "Nurse", " " }));
        roleComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Rolle:");

        javax.swing.GroupLayout StammdatenLayout = new javax.swing.GroupLayout(Stammdaten);
        Stammdaten.setLayout(StammdatenLayout);
        StammdatenLayout.setHorizontalGroup(
            StammdatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StammdatenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(StammdatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title)
                    .addGroup(StammdatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, StammdatenLayout.createSequentialGroup()
                            .addComponent(OID)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(nachnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Nachname)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(vornameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Vorname)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(StammdatenLayout.createSequentialGroup()
                            .addGroup(StammdatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(StammdatenLayout.createSequentialGroup()
                                    .addComponent(passwortJL)
                                    .addGap(51, 51, 51))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StammdatenLayout.createSequentialGroup()
                                    .addComponent(repeatPasswortJL)
                                    .addGap(18, 18, 18)))
                            .addGroup(StammdatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                .addComponent(jPasswordField2))
                            .addGap(18, 18, 18)
                            .addComponent(wrongPasswortLabel)
                            .addGap(174, 174, 174)
                            .addComponent(weiterBtn))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, StammdatenLayout.createSequentialGroup()
                            .addGroup(StammdatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, StammdatenLayout.createSequentialGroup()
                                    .addComponent(landJL)
                                    .addGap(18, 18, 18)
                                    .addComponent(landTF, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(39, 39, 39)
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(gahaltTf))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, StammdatenLayout.createSequentialGroup()
                                    .addComponent(plzJL, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(plzTF, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(ortJL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ortTF, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(strasseJL, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(StammdatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(StammdatenLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(strasseTF, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(StammdatenLayout.createSequentialGroup()
                                    .addGap(58, 58, 58)
                                    .addComponent(jLabel2)
                                    .addGap(31, 31, 31)
                                    .addComponent(roleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 41, Short.MAX_VALUE))
        );
        StammdatenLayout.setVerticalGroup(
            StammdatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StammdatenLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(title)
                .addGap(18, 18, 18)
                .addGroup(StammdatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OID)
                    .addComponent(nachnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nachname)
                    .addComponent(vornameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Vorname)
                    .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(StammdatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ortJL)
                    .addComponent(ortTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plzJL)
                    .addComponent(plzTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(strasseJL)
                    .addComponent(strasseTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(StammdatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(landJL)
                    .addComponent(landTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(gahaltTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(46, 46, 46)
                .addGroup(StammdatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwortJL)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(StammdatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(repeatPasswortJL)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weiterBtn)
                    .addComponent(wrongPasswortLabel))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stammdaten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stammdaten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private HealthProfessionalDto initialHp() {
        HealthProfessionalDto hp = new HealthProfessionalDto();
        hp.setSurname(nachnameTF.getText());
        hp.setFirstName(vornameTF.getText());
        hp.setBirthday(jXDatePicker1.getDate());
        hp.setPostalCode(plzTF.getText());
        hp.setCity(ortTF.getText());
        hp.setStreet(strasseTF.getText());
        hp.setCountry(landTF.getText());
        hp.setPassword(jPasswordField1.getText());
        hp.setGehalt(Integer.parseInt(gahaltTf.getText()));
        if (roleComboBox.getSelectedItem() == "Doctor") {
            hp.setRole(HPRole.DOCTOR);
                    
        } else {
            hp.setRole(HPRole.NURSE);
        }
        return hp;
    }

    private void weiterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weiterBtnActionPerformed
        if (jPasswordField1.getText().equals(jPasswordField2.getText())) {
            HealthProfessionalDaoLogic.getInstance().addHP(initialHp());
            this.setVisible(false);
            this.dispose();
//            EpaView ew = new EpaView();
//            ew.setVisible(true);
        } else {
            wrongPasswortLabel.setVisible(true);
        }


    }//GEN-LAST:event_weiterBtnActionPerformed

    private void nachnameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nachnameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nachnameTFActionPerformed

    private void jXDatePicker1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDatePicker1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jXDatePicker1ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void gahaltTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gahaltTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gahaltTfActionPerformed

    private void roleComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(SigningView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SigningView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SigningView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SigningView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SigningView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nachname;
    private javax.swing.JLabel OID;
    private javax.swing.JPanel Stammdaten;
    private javax.swing.JLabel Vorname;
    private javax.swing.JTextField gahaltTf;
    private swt.apis2015.entities.HealthProfessional healthProfessional1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private javax.swing.JLabel landJL;
    private javax.swing.JTextField landTF;
    private javax.swing.JTextField nachnameTF;
    private javax.swing.JLabel ortJL;
    private javax.swing.JTextField ortTF;
    private javax.swing.JLabel passwortJL;
    private javax.swing.JLabel plzJL;
    private javax.swing.JTextField plzTF;
    private javax.swing.JLabel repeatPasswortJL;
    private javax.swing.JComboBox roleComboBox;
    private javax.swing.JLabel strasseJL;
    private javax.swing.JTextField strasseTF;
    private javax.swing.JLabel title;
    private javax.swing.JTextField vornameTF;
    private javax.swing.JButton weiterBtn;
    private javax.swing.JLabel wrongPasswortLabel;
    // End of variables declaration//GEN-END:variables
}
