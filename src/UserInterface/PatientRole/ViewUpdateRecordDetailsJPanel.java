/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PatientRole;

import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Organization.DoctorOrganization;
import Model.Organization.PatientOrganization;
import Model.Patient.Patient;
import Model.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import Model.Patient.Record;
import Model.Patient.RecordHistory;
import javax.swing.JOptionPane;

public class ViewUpdateRecordDetailsJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;    
    private EcoSystem ecoSystem;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private PatientOrganization patientOrganization;
    private Patient patient;
    private Record record;
  
    /**
     * Creates new form ViewVitalSignsJPanel
     */
    public ViewUpdateRecordDetailsJPanel(JPanel userProcessContainer, UserAccount userAccount, PatientOrganization patientOrganization, Enterprise enterprise, EcoSystem ecoSystem, Record vs) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.userAccount = userAccount;
        this.patientOrganization = (PatientOrganization)patientOrganization;
        this.enterprise = enterprise;
        this.patient= userAccount.getPatient();
        this.record=record;
        populateDetails();
        
    }

    
        
      private void populateDetails() {
        respiratoryRateJTextField.setText(String.valueOf(record.getRespiratoryRate()));
        heartRateJTextField.setText(String.valueOf(record.getHeartRate()));
        systolicBloodPressureJTextField.setText(String.valueOf(record.getSystolicBloodPressure()));
        weightInPoundsJTextField.setText(String.valueOf(record.getWeightInPounds()));
        standTimeJTextField.setText(String.valueOf(record.getStandTime()));
        moveTimeJTextField.setText(String.valueOf(record.getMoveTime()));
        excerciseTimeJTextField.setText(String.valueOf(record.getExcerciseTime()));
        totalTimeJTextField.setText(String.valueOf(record.getTotalTime()));
    }
   
        
        
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        respiratoryRateJTextField = new javax.swing.JTextField();
        heartRateJTextField = new javax.swing.JTextField();
        systolicBloodPressureJTextField = new javax.swing.JTextField();
        weightInPoundsJTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        saveJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        updateJButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        standTimeJTextField = new javax.swing.JTextField();
        moveTimeJTextField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        excerciseTimeJTextField = new javax.swing.JTextField();
        totalTimeJTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setText("Weight in pounds");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 193, -1, -1));

        respiratoryRateJTextField.setEnabled(false);
        add(respiratoryRateJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 86, 159, -1));

        heartRateJTextField.setEnabled(false);
        add(heartRateJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 118, 159, -1));

        systolicBloodPressureJTextField.setEnabled(false);
        add(systolicBloodPressureJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 159, -1));

        weightInPoundsJTextField.setEnabled(false);
        add(weightInPoundsJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 188, 159, -1));

        jLabel13.setText("Respiratory rate");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 96, -1, -1));

        jLabel14.setText("Heart rate");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 123, -1, -1));

        jLabel15.setText("Systolic blood pressure");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        saveJButton.setText("Save");
        saveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJButtonActionPerformed(evt);
            }
        });
        add(saveJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 277, -1, -1));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 321, -1, -1));

        updateJButton.setText("Update");
        updateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateJButtonActionPerformed(evt);
            }
        });
        add(updateJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 277, -1, -1));

        jLabel9.setText("Move Time (mins)");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 129, -1, -1));

        jLabel10.setText("Excercise Time (mins)");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 168, -1, 26));

        jLabel11.setText("Total Time (mins)");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 211, -1, -1));

        standTimeJTextField.setEnabled(false);
        standTimeJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standTimeJTextFieldActionPerformed(evt);
            }
        });
        add(standTimeJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 80, 162, -1));

        moveTimeJTextField.setEnabled(false);
        add(moveTimeJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 124, 159, -1));

        jLabel17.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 51, 204));
        jLabel17.setText("View Record Details");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 28, 269, -1));

        excerciseTimeJTextField.setEnabled(false);
        add(excerciseTimeJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 168, 159, -1));

        totalTimeJTextField.setEditable(false);
        totalTimeJTextField.setEnabled(false);
        add(totalTimeJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 206, 159, -1));

        jLabel8.setText("Stand Time (mins)");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 90, 122, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void standTimeJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standTimeJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_standTimeJTextFieldActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void saveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJButtonActionPerformed
        // TODO add your handling code here:
         if((respiratoryRateJTextField.getText().length()==0)||
                (heartRateJTextField.getText().length()==0)||
                (systolicBloodPressureJTextField.getText().length()==0)||
                (weightInPoundsJTextField.getText().length()==0)||
                (standTimeJTextField.getText().length()==0)||
                (moveTimeJTextField.getText().length()==0)||
                (excerciseTimeJTextField.getText().length()==0)||
                (totalTimeJTextField.getText() .length()==0))
                        
                        
        {
            JOptionPane.showMessageDialog(null, "Alert! Inputs can not be empty! ", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if((respiratoryRateJTextField.getText().length() != 0) ||
             (heartRateJTextField.getText().length()!=0) ||
            (systolicBloodPressureJTextField.getText().length() != 0)||
                (weightInPoundsJTextField.getText().length() !=0)||
                (standTimeJTextField.getText().length() !=0)||
                (moveTimeJTextField.getText().length() !=0)||
                (excerciseTimeJTextField.getText().length() !=0)||
                (totalTimeJTextField.getText() .length() !=0)) 
                        {
                         try{
                          float respiratoryRate = Float.parseFloat(respiratoryRateJTextField.getText());
                          float heartRate = Float.parseFloat(heartRateJTextField.getText());
                          float systolicBloodPressure = Float.parseFloat(systolicBloodPressureJTextField.getText());
                          float weightInPounds = Float.parseFloat(weightInPoundsJTextField.getText());

        // Parse integer values
                          int standTime = Integer.parseInt(standTimeJTextField.getText());
                           int moveTime = Integer.parseInt(moveTimeJTextField.getText());
                            int excerciseTime = Integer.parseInt(excerciseTimeJTextField.getText());
                              int totalTime = Integer.parseInt(totalTimeJTextField.getText());
                              
                            Patient patient = patientOrganization.getPatientDirectory().createPtient(userAccount.getName());
                userAccount.setPatient(patient);
                patient.setRespiratoryRate(respiratoryRate);
                patient.setHeartrate(heartRate);
                patient.setSystolicbloodpressure(systolicBloodPressure);
                patient.setWeightinpounds(weightInPounds);
                patient.setStandTime(standTime);
                patient.setMoveTime(moveTime);
                patient.setExcerciseTime(excerciseTime);
                patient.setTotalTime(totalTime);
                              saveJButton.setEnabled(false);
                updateJButton.setEnabled(true);
                           JOptionPane.showMessageDialog(null, "Create Patient Information Successfully!", "Warning", JOptionPane.WARNING_MESSAGE);
                resetFields();
            }catch(Exception e){

                JOptionPane.showMessageDialog(null, "Alert! Please enter appropriate values! ", "Warning", JOptionPane.WARNING_MESSAGE);
                saveJButton.setEnabled(false);
                updateJButton.setEnabled(true);
            
        
                         }   
                            
                            
                            
                            
                            
                        }
    }//GEN-LAST:event_saveJButtonActionPerformed
  
    private void updateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJButtonActionPerformed
        // TODO add your handling code here:
        respiratoryRateJTextField.setText(String.valueOf(patient.getRespiratoryRate()));
        heartRateJTextField.setText(String.valueOf(patient.getHeartrate()));
        systolicBloodPressureJTextField.setText(String.valueOf(patient.getSystolicbloodpressure()));
        weightInPoundsJTextField.setText(String.valueOf(patient.getWeightinpounds()));
        standTimeJTextField.setText(String.valueOf(patient.getStandTime()));
        moveTimeJTextField.setText(String.valueOf(patient.getMoveTime()));
        excerciseTimeJTextField.setText(String.valueOf(patient.getExcerciseTime()));
        totalTimeJTextField.setText(String.valueOf(totalTimeJTextField));
        
        
        
        respiratoryRateJTextField.setEnabled(false);
       heartRateJTextField.setEnabled(false);
        systolicBloodPressureJTextField.setEnabled(true);
        weightInPoundsJTextField.setEnabled(true);      
        standTimeJTextField.setEnabled(true);
        moveTimeJTextField.setEnabled(true);
        excerciseTimeJTextField.setEnabled(true);
        totalTimeJTextField.setEnabled(false);
        
        saveJButton.setEnabled(true);
        updateJButton.setEnabled(false);
        
       
    }//GEN-LAST:event_updateJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField excerciseTimeJTextField;
    private javax.swing.JTextField heartRateJTextField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField moveTimeJTextField;
    private javax.swing.JTextField respiratoryRateJTextField;
    private javax.swing.JButton saveJButton;
    private javax.swing.JTextField standTimeJTextField;
    private javax.swing.JTextField systolicBloodPressureJTextField;
    private javax.swing.JTextField totalTimeJTextField;
    private javax.swing.JButton updateJButton;
    private javax.swing.JTextField weightInPoundsJTextField;
    // End of variables declaration//GEN-END:variables

    private void resetFields() {
       respiratoryRateJTextField.setText("");
       heartRateJTextField.setText("");
       systolicBloodPressureJTextField.setText("");
       weightInPoundsJTextField.setText("");
       standTimeJTextField.setText("");
       moveTimeJTextField.setText("");
       excerciseTimeJTextField.setText("");
       totalTimeJTextField.setText("");
    }

}
