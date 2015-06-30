/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt.apis2015.gui;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import swt.apis2015.logic.Icd10Connector;
import swt.apis2015.logic.InstanceDaoImpl;
import swt2.apis2015.dto.InstanceDto;
import swt2.apis2015.dto.PatDiagnoseDto;
import swt2.apis2015.dto.PatMassnahmeDto;
import swt2.apis2015.dto.PatSymptomDto;
import swt2.apis2015.dto.PatientDto;

/**
 * Eingabefenster für neue Fälle
 */
public class NewInstanceView extends javax.swing.JFrame {

    private static final Logger LOGGER = Logger.getLogger(NewInstanceView.class.getName());

    DefaultTableModel dtm;
    PatientDto currentPat;
    List<PatSymptomDto> patSym;
    List<PatDiagnoseDto> patDia;
    List<PatMassnahmeDto> patMas;

    NewInstanceView(PatientDto currentPat) {
        initComponents();
        this.currentPat = currentPat;
        LOGGER.info("Logger Name: " + LOGGER.getName() + " Neue instanz für Patien: id=" + currentPat.getId());
        dtm = (DefaultTableModel) icdResultT.getModel();
        patSym = new ArrayList<PatSymptomDto>();
        patDia = new ArrayList<PatDiagnoseDto>();
        patMas = new ArrayList<PatMassnahmeDto>();
        additionsDiagnosesJLabel.setVisible(false);
        additionSymptomeJLabel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        diagnosesJl = new javax.swing.JPanel();
        addDiagnoseButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTfSince = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lokationjTF = new javax.swing.JTextField();
        intensityjTF = new javax.swing.JTextField();
        addSymptomsButton = new javax.swing.JButton();
        additionSymptomeJLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        massnameJtF = new javax.swing.JTextField();
        okButton = new javax.swing.JButton();
        additionsDiagnosesJLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        icdResultT = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                onWindowClose(evt);
            }
        });

        diagnosesJl.setBackground(new java.awt.Color(255, 255, 255));

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("swt/apis2015/internationalisation/NewInstanceBundle"); // NOI18N
        addDiagnoseButton.setText(bundle.getString("NewInstanceView.addDiagnoseButton.text")); // NOI18N
        addDiagnoseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDiagnoseButtonActionPerformed(evt);
            }
        });

        jLabel2.setText(bundle.getString("NewInstanceView.jLabel2.text")); // NOI18N

        jButton1.setText(bundle.getString("NewInstanceView.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText(bundle.getString("NewInstanceView.jLabel1.text")); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText(bundle.getString("NewInstanceView.jLabel3.text")); // NOI18N

        jLabel4.setText(bundle.getString("NewInstanceView.jLabel4.text")); // NOI18N

        jLabel5.setText(bundle.getString("NewInstanceView.jLabel5.text")); // NOI18N

        addSymptomsButton.setText(bundle.getString("NewInstanceView.addSymptomsButton.text")); // NOI18N
        addSymptomsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSymptomsButtonActionPerformed(evt);
            }
        });

        additionSymptomeJLabel.setText(bundle.getString("NewInstanceView.additionSymptomeJLabel.text")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lokationjTF, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(intensityjTF, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(154, 154, 154)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(additionSymptomeJLabel)
                            .addComponent(addSymptomsButton))))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lokationjTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addSymptomsButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(intensityjTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(additionSymptomeJLabel)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText(bundle.getString("NewInstanceView.jLabel6.text")); // NOI18N

        jLabel7.setText(bundle.getString("NewInstanceView.jLabel7.text")); // NOI18N

        okButton.setText(bundle.getString("NewInstanceView.okButton.text")); // NOI18N
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(massnameJtF, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                        .addComponent(okButton)
                        .addGap(101, 101, 101))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(massnameJtF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(okButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        additionsDiagnosesJLabel.setText(bundle.getString("NewInstanceView.additionsDiagnosesJLabel.text")); // NOI18N

        icdResultT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ICD10", "Beschreibung"
            }
        ));
        jScrollPane1.setViewportView(icdResultT);

        javax.swing.GroupLayout diagnosesJlLayout = new javax.swing.GroupLayout(diagnosesJl);
        diagnosesJl.setLayout(diagnosesJlLayout);
        diagnosesJlLayout.setHorizontalGroup(
            diagnosesJlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diagnosesJlLayout.createSequentialGroup()
                .addGroup(diagnosesJlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(diagnosesJlLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(diagnosesJlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(diagnosesJlLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(diagnosesJlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTfSince, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(diagnosesJlLayout.createSequentialGroup()
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1))
                                    .addGroup(diagnosesJlLayout.createSequentialGroup()
                                        .addComponent(addDiagnoseButton)
                                        .addGap(28, 28, 28)
                                        .addComponent(additionsDiagnosesJLabel))))))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(diagnosesJlLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 933, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        diagnosesJlLayout.setVerticalGroup(
            diagnosesJlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diagnosesJlLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(diagnosesJlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTfSince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(diagnosesJlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(diagnosesJlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addDiagnoseButton)
                    .addComponent(additionsDiagnosesJLabel))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(diagnosesJl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 992, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private PatSymptomDto initSymptom() {
        PatSymptomDto nSymptom = new PatSymptomDto();
        nSymptom.setDate(new Date());
        nSymptom.setIntensity(intensityjTF.getText());
        nSymptom.setLocation(lokationjTF.getText());
        nSymptom.setComment("");
        nSymptom.setPatient(currentPat);
        nSymptom.setWrittenBy("qwe");
        LOGGER.info("Logger Name: " + LOGGER.getName() + " symptom erfasst");
        return nSymptom;
    }

    private PatDiagnoseDto initDiagnose() {
        PatDiagnoseDto nDiagnose = new PatDiagnoseDto();
        nDiagnose.setDate(new Date());
        nDiagnose.setPatient(currentPat);
        nDiagnose.setIcd_code(dtm.getValueAt(icdResultT.getSelectedRow(), 0) + "");
        nDiagnose.setIcd_Description(dtm.getValueAt(icdResultT.getSelectedRow(), 1) + "");
        nDiagnose.setSince(jTfSince.getText());
        nDiagnose.setWrittenBy("qwe");
        nDiagnose.setComment("COMMENT");
        LOGGER.info("Logger Name: " + LOGGER.getName() + " diagnose erfasst");
        return nDiagnose;
    }

    private PatMassnahmeDto initMasnahme() {
        PatMassnahmeDto nMassnahme = new PatMassnahmeDto();
        nMassnahme.setComment("");
        nMassnahme.setDate(new Date());
        nMassnahme.setPatient(currentPat);
        nMassnahme.setText(massnameJtF.getText());
        LOGGER.info("Logger Name: " + LOGGER.getName() + " Massnahme erfasst");
        return nMassnahme;
    }


    private void onWindowClose(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_onWindowClose
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_onWindowClose

    /**
     * Wenn eine neuer Fall angelegt wird, muss der Patient gesetzt werden,
     * sowie die jeweiligen, symptome, diagnose und massnahmen  
     * @param evt 
     */
    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        InstanceDto ins = new InstanceDto();
        if (icdResultT.getSelectedRow() == -1) {
        } else {
            ins.setDate(new Date());
            ins.setPat(currentPat);

            PatSymptomDto sym = initSymptom();
            PatMassnahmeDto mas = initMasnahme();

            patSym.add(sym);
            patMas.add(mas);

            ins.setSym(patSym);
            ins.setDia(patDia);
            ins.setMas(patMas);
            LOGGER.info("Logger Name: " + LOGGER.getName() + " alle pehomene gesettet ");
            InstanceDaoImpl.getInstance().createInstance(ins);

            if (currentPat.getEhrEntry() == null) {
                currentPat.setEhrEntry(new ArrayList<InstanceDto>());
                LOGGER.info("Logger Name: " + LOGGER.getName() + " Neue Fallakte für neuen Patienten angelegt");
            }
        }
        dispose();
        setVisible(false);
    }//GEN-LAST:event_okButtonActionPerformed

    private void addSymptomsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSymptomsButtonActionPerformed
        AdditionalSymptomsView aSv = new AdditionalSymptomsView(this);
        aSv.setVisible(true);
        additionSymptomeJLabel.setVisible(true);
    }//GEN-LAST:event_addSymptomsButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Map<String, String> temp = Icd10Connector.getInstance().findIcdByName(jTextField2.getText());
        int i = 0;
        for (Map.Entry<String, String> e : temp.entrySet()) {
            dtm.insertRow(i, new Object[]{e.getKey(), e.getValue()});
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addDiagnoseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDiagnoseButtonActionPerformed
        PatDiagnoseDto dia = initDiagnose();
        patDia.add(dia);
        additionsDiagnosesJLabel.setVisible(true);
        String diaToolTipText = "";
        for (PatDiagnoseDto x : patDia) {
            diaToolTipText = diaToolTipText + "<br>" + x.getIcd_code() + " " + x.getIcd_Description();
        }
        additionsDiagnosesJLabel.setToolTipText("<html>" + diaToolTipText + "</html>");
    }//GEN-LAST:event_addDiagnoseButtonActionPerformed

    public void buildSymToolTip() {
        String symToolTipText = "";
        for (PatSymptomDto x : patSym) {
            symToolTipText = symToolTipText + "<br>" + x.getLocation() + " " + x.getIntensity();
        }
        additionSymptomeJLabel.setToolTipText("<html>" + symToolTipText + "</html>");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDiagnoseButton;
    private javax.swing.JButton addSymptomsButton;
    private javax.swing.JLabel additionSymptomeJLabel;
    private javax.swing.JLabel additionsDiagnosesJLabel;
    private javax.swing.JPanel diagnosesJl;
    private javax.swing.JTable icdResultT;
    private javax.swing.JTextField intensityjTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTfSince;
    private javax.swing.JTextField lokationjTF;
    private javax.swing.JTextField massnameJtF;
    private javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables

}
