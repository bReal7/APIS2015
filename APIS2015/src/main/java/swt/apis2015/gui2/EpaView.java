/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swt.apis2015.gui2;

import swt.apis2015.gui.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import swt.apis2015.logic.InstanceDaoImpl;
import swt.apis2015.logic.PatientDaoImpl;
import swt2.apis2015.dto.PatientDto;

/**
 *
 * @author B-Real
 */
public class EpaView extends javax.swing.JFrame implements Observer {

    private static final Logger LOGGER = Logger.getLogger(EpaView.class.getName());
    DefaultTableModel stm;
    DefaultTableModel dtm;
    DefaultListModel listModell;
    DefaultListModel listMasModell;
    private PatientDto currentPat;

    /**
     * Creates new form Epa
     */
    public EpaView(long id) {
        initComponents();
        InstanceDaoImpl.getInstance().addObserver(this);
        listMasModell = new DefaultListModel();
        
        LOGGER.info("Logger Name: " + LOGGER.getName() + "Elektronische Paienten Akte öffnet" + id);
        currentPat = PatientDaoImpl.getInstance().getPatientByID(id);
        LOGGER.info("Logger Name: " + LOGGER.getName() + "Paienten Fälle size = " + currentPat.getEhrEntry().size());
        pId.setText(String.valueOf(currentPat.getId()));
        oid.setText(String.valueOf(currentPat.getPatientOID()));
        nname.setText(currentPat.getSurname());
        vname.setText(currentPat.getFirstname());
        DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        geb.setText(format.format(currentPat.getBirthday()));
        vs.setText(String.valueOf(currentPat.getInsuranceContract()));
        listModell = new DefaultListModel();
        for (int i = 0; i < currentPat.getEhrEntry().size(); i++) {
            listModell.addElement(currentPat.getEhrEntry().get(i).getDate());
            LOGGER.info("Logger Name: " + LOGGER.getName() + "fallakte gefunden id:" + i);
        }
        fealleJList.setModel(listModell);
//        if (fealleJList.getModel().getSize() > 0) {
//            fealleJList.setSelectedIndex(0);
//            LOGGER.info("Logger Name: " + LOGGER.getName() + "Selected Index setted to " + fealleJList.getSelectedIndex());
//        }
//        int selectedInstance = fealleJList.getSelectedIndex();
//        stm = (DefaultTableModel) symptomJtable.getModel();
//        if (fealleJList.getModel().getSize() > 0) {
//            for (int i = 0; i < currentPat.getEhrEntry().get(selectedInstance).getSym().size(); i++) {
//                stm.addRow(new Object[]{currentPat.getEhrEntry().get(selectedInstance).getSym().get(i).getLocation(), currentPat.getEhrEntry().get(selectedInstance).getSym().get(i).getIntensity()});
//                LOGGER.info("Logger Name: " + LOGGER.getName() + "symptom zur tabelle hinzugefügt id : ");
//            }
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Stammdaten = new javax.swing.JPanel();
        Nachname = new javax.swing.JLabel();
        Geburtstag = new javax.swing.JLabel();
        Vorname = new javax.swing.JLabel();
        PatId = new javax.swing.JLabel();
        VersichertenStatu = new javax.swing.JLabel();
        OID = new javax.swing.JLabel();
        pId = new javax.swing.JLabel();
        oid = new javax.swing.JLabel();
        nname = new javax.swing.JLabel();
        vname = new javax.swing.JLabel();
        geb = new javax.swing.JLabel();
        vs = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Falldaten = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        diagnoseJtable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListMasnahmen = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        symptomJtable = new javax.swing.JTable();
        Faelle = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        fealleJList = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Epa");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                onWindowCloseHandler(evt);
            }
        });

        Stammdaten.setBackground(new java.awt.Color(255, 255, 255));

        Nachname.setText("Nachname:");

        Geburtstag.setText("Geburtstag:");

        Vorname.setText("Vorname:");

        PatId.setText("Patienten Id:");

        VersichertenStatu.setText("Versicherungsstatus:");

        OID.setText("OID:");

        pId.setText("jLabel1");

        oid.setText("jLabel2");

        nname.setText("jLabel3");

        vname.setText("jLabel4");

        geb.setText("jLabel5");

        vs.setText("jLabel6");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Patient");

        jButton1.setText("Fall anlegen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(102, 153, 255));

        jLabel4.setText("Symptome:");

        jPanel5.setBackground(new java.awt.Color(102, 153, 255));

        jLabel5.setText("Diagnosen:");

        jScrollPane3.setBackground(new java.awt.Color(102, 153, 255));

        diagnoseJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Diagnose", "Seit"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(diagnoseJtable);

        jLabel3.setText("Massnahme:");

        jListMasnahmen.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jListMasnahmen);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)))
        );

        jScrollPane2.setBackground(new java.awt.Color(102, 153, 255));

        symptomJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Symptom", "Stärke"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(symptomJtable);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout FalldatenLayout = new javax.swing.GroupLayout(Falldaten);
        Falldaten.setLayout(FalldatenLayout);
        FalldatenLayout.setHorizontalGroup(
            FalldatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(FalldatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(FalldatenLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        FalldatenLayout.setVerticalGroup(
            FalldatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 361, Short.MAX_VALUE)
            .addGroup(FalldatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(FalldatenLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        fealleJList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                fealleJListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(fealleJList);

        javax.swing.GroupLayout FaelleLayout = new javax.swing.GroupLayout(Faelle);
        Faelle.setLayout(FaelleLayout);
        FaelleLayout.setHorizontalGroup(
            FaelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        FaelleLayout.setVerticalGroup(
            FaelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FaelleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout StammdatenLayout = new javax.swing.GroupLayout(Stammdaten);
        Stammdaten.setLayout(StammdatenLayout);
        StammdatenLayout.setHorizontalGroup(
            StammdatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StammdatenLayout.createSequentialGroup()
                .addGroup(StammdatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StammdatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                                .addComponent(geb)))
                        .addComponent(jButton1)
                        .addComponent(Faelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(Falldaten, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        StammdatenLayout.setVerticalGroup(
            StammdatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StammdatenLayout.createSequentialGroup()
                .addGroup(StammdatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                        .addGap(18, 18, 18)
                        .addComponent(Faelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(StammdatenLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Falldaten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Stammdaten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Stammdaten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onWindowCloseHandler(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_onWindowCloseHandler
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_onWindowCloseHandler

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LOGGER.info("Logger Name: " + LOGGER.getName() + "Neuer Fall für Pat id " + currentPat.getId());
        new NewInstanceView(this.currentPat).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fealleJListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_fealleJListValueChanged
        int selIns = fealleJList.getSelectedIndex();
        stm = (DefaultTableModel) symptomJtable.getModel();
        stm.getDataVector().removeAllElements();
        dtm = (DefaultTableModel) diagnoseJtable.getModel();
        dtm.getDataVector().removeAllElements();
        listMasModell.removeAllElements();
        
        if (selIns >= 0) {

            LOGGER.info("Logger Name: " + LOGGER.getName() + "List value changed" + fealleJList.getSelectedIndex());
            int counSym = currentPat.getEhrEntry().get(selIns).getSym().size();
            for (int i = 0; i < counSym; i++) {
                stm.addRow(new Object[]{currentPat.getEhrEntry().get(selIns).getSym().get(i).getLocation(), currentPat.getEhrEntry().get(selIns).getSym().get(i).getIntensity()});
            }
            
            int counDia = currentPat.getEhrEntry().get(selIns).getDia().size();
            for (int i = 0; i < counDia; i++) {
                LOGGER.info("Logger Name: " + LOGGER.getName() + "diagnesen gezählt " + counDia);
                dtm.addRow(new Object[]{currentPat.getEhrEntry().get(selIns).getDia().get(i).getIcd_code(), currentPat.getEhrEntry().get(selIns).getDia().get(i).getIcd_Description()});
            }
            int counMas = currentPat.getEhrEntry().get(selIns).getMas().size();
            for (int i = 0; i < counMas; i++) {
                listMasModell.addElement(currentPat.getEhrEntry().get(selIns).getMas().get(i).getText());
                LOGGER.info("Logger Name: " + LOGGER.getName() + "fallakte gefunden id:" + i);
            }
            jListMasnahmen.setModel(listMasModell);
        }
    }//GEN-LAST:event_fealleJListValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Faelle;
    private javax.swing.JPanel Falldaten;
    private javax.swing.JLabel Geburtstag;
    private javax.swing.JLabel Nachname;
    private javax.swing.JLabel OID;
    private javax.swing.JLabel PatId;
    private javax.swing.JPanel Stammdaten;
    private javax.swing.JLabel VersichertenStatu;
    private javax.swing.JLabel Vorname;
    private javax.swing.JTable diagnoseJtable;
    private javax.swing.JList fealleJList;
    private javax.swing.JLabel geb;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList jListMasnahmen;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel nname;
    private javax.swing.JLabel oid;
    private javax.swing.JLabel pId;
    private javax.swing.JTable symptomJtable;
    private javax.swing.JLabel vname;
    private javax.swing.JLabel vs;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        currentPat = PatientDaoImpl.getInstance().getPatientByID(currentPat.getId());
        listModell.removeAllElements();
        for (int i = 0; i < currentPat.getEhrEntry().size(); i++) {
            listModell.addElement(currentPat.getEhrEntry().get(i).getDate());
            LOGGER.info("Logger Name: " + LOGGER.getName() + "fallakte gefunden id:" + i);
        }
        fealleJList.setModel(listModell);
    }
}