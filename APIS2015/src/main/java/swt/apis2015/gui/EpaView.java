/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt.apis2015.gui;

import swt2.apis2015.dto.PatientDto;

/**
 *
 * @author B-Real
 */
public class EpaView extends javax.swing.JFrame {
    
    private static PatientDto currentPat;

    /**
     * Creates new form Epa
     */
    public EpaView(PatientDto pat) {
        initComponents();
        this.currentPat = pat;
        pId.setText(currentPat.getId());
        nname.setText(currentPat.getSurname());
        vname.setText(currentPat.getFirstname());
        vs.setText(currentPat.getInsuranceContract().name());
        oid.setText(String.valueOf(currentPat.getPatientOID()));
        geb.setText(currentPat.getBirthday().toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Stammdaten = new javax.swing.JPanel();
        Nachname = new javax.swing.JLabel();
        Geburtstag = new javax.swing.JLabel();
        Vorname = new javax.swing.JLabel();
        PatId = new javax.swing.JLabel();
        VersichertenStatu = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        OID = new javax.swing.JLabel();
        pId = new javax.swing.JLabel();
        oid = new javax.swing.JLabel();
        nname = new javax.swing.JLabel();
        vname = new javax.swing.JLabel();
        geb = new javax.swing.JLabel();
        vs = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Verlaufe = new javax.swing.JList();
        Falldaten = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Symptome = new javax.swing.JTabbedPane();
        Diagnose = new javax.swing.JTabbedPane();
        Probleme = new javax.swing.JTabbedPane();
        Labor = new javax.swing.JTabbedPane();
        Medikation = new javax.swing.JTabbedPane();
        Assessments = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Stammdaten.setBackground(new java.awt.Color(255, 255, 255));

        Nachname.setText("Nachname:");

        Geburtstag.setText("Geburtstag:");

        Vorname.setText("Vorname:");

        PatId.setText("Patienten Id:");

        VersichertenStatu.setText("Versicherungsstatus:");

        jButton2.setText("Weiter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        OID.setText("OID:");

        pId.setText("jLabel1");

        oid.setText("jLabel2");

        nname.setText("jLabel3");

        vname.setText("jLabel4");

        geb.setText("jLabel5");

        vs.setText("jLabel6");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Patient");

        javax.swing.GroupLayout StammdatenLayout = new javax.swing.GroupLayout(Stammdaten);
        Stammdaten.setLayout(StammdatenLayout);
        StammdatenLayout.setHorizontalGroup(
            StammdatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StammdatenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(StammdatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StammdatenLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(10, 10, 10))
                    .addGroup(StammdatenLayout.createSequentialGroup()
                        .addGroup(StammdatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(StammdatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(StammdatenLayout.createSequentialGroup()
                                    .addGroup(StammdatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Nachname)
                                        .addComponent(Vorname)
                                        .addComponent(Geburtstag))
                                    .addGap(5, 5, 5))
                                .addComponent(PatId, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(OID)
                            .addComponent(VersichertenStatu))
                        .addGap(27, 27, 27)
                        .addGroup(StammdatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vs)
                            .addComponent(oid)
                            .addComponent(pId, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nname)
                            .addComponent(vname)
                            .addComponent(geb))
                        .addContainerGap(592, Short.MAX_VALUE))
                    .addGroup(StammdatenLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        StammdatenLayout.setVerticalGroup(
            StammdatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StammdatenLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(StammdatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PatId)
                    .addComponent(pId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(StammdatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OID)
                    .addComponent(oid))
                .addGap(5, 5, 5)
                .addGroup(StammdatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nachname)
                    .addComponent(nname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(StammdatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Vorname)
                    .addComponent(vname))
                .addGap(4, 4, 4)
                .addGroup(StammdatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Geburtstag)
                    .addComponent(geb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(StammdatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VersichertenStatu)
                    .addComponent(vs))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Stammdaten", Stammdaten);

        Verlaufe.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jTabbedPane1.addTab("Verlauf", Verlaufe);

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout FalldatenLayout = new javax.swing.GroupLayout(Falldaten);
        Falldaten.setLayout(FalldatenLayout);
        FalldatenLayout.setHorizontalGroup(
            FalldatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FalldatenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                .addContainerGap())
        );
        FalldatenLayout.setVerticalGroup(
            FalldatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FalldatenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FalldatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Falldaten", Falldaten);
        jTabbedPane1.addTab("Syptome", Symptome);
        jTabbedPane1.addTab("Diagnosen", Diagnose);
        jTabbedPane1.addTab("Probleme", Probleme);
        jTabbedPane1.addTab("Labor", Labor);
        jTabbedPane1.addTab("Medikation", Medikation);
        jTabbedPane1.addTab("Assessments", Assessments);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//        this.setVisible(false);
//        this.dispose();
//        EpaView ew = new EpaView();
//        ew.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        

//GENERIERTER FEHLER !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        
        
        
//        try Verlauf  for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(EpaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(EpaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(EpaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(EpaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        
        
        
//GENERIERTER FEHLER ENDE !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EpaView(currentPat).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Assessments;
    private javax.swing.JTabbedPane Diagnose;
    private javax.swing.JPanel Falldaten;
    private javax.swing.JLabel Geburtstag;
    private javax.swing.JTabbedPane Labor;
    private javax.swing.JTabbedPane Medikation;
    private javax.swing.JLabel Nachname;
    private javax.swing.JLabel OID;
    private javax.swing.JLabel PatId;
    private javax.swing.JTabbedPane Probleme;
    private javax.swing.JPanel Stammdaten;
    private javax.swing.JTabbedPane Symptome;
    private javax.swing.JList Verlaufe;
    private javax.swing.JLabel VersichertenStatu;
    private javax.swing.JLabel Vorname;
    private javax.swing.JLabel geb;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel nname;
    private javax.swing.JLabel oid;
    private javax.swing.JLabel pId;
    private javax.swing.JLabel vname;
    private javax.swing.JLabel vs;
    // End of variables declaration//GEN-END:variables
}
