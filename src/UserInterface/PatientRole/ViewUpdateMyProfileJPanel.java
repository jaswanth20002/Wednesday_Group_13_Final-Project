/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PatientRole;

import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Organization.PatientOrganization;
import Model.Patient.Patient;
import Model.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ViewUpdateMyProfileJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;    
    private EcoSystem ecoSystem;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private PatientOrganization patientOrganization;
    private Patient patient;
    /**
     * Creates new form ViewMyProfileJPanel
     */
    public ViewUpdateMyProfileJPanel(JPanel userProcessContainer,UserAccount userAccount, PatientOrganization patientOrganization, Enterprise enterprise,EcoSystem ecoSyste) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.userAccount = userAccount;
        this.patientOrganization = (PatientOrganization)patientOrganization;
        this.enterprise = enterprise;
        this.patient=userAccount.getPatient();
        
        nameJTextField.setText(patient.getPatientName());
        patientIDJTextField.setText(String.valueOf(patient.getPatientID()));
        ageJTextField.setText(String.valueOf(patient.getAge()));
        streetAddressJTextField.setText(patient.getStreetAddress());
        cityJTextField.setText(patient.getTown());
        zipCodeJTextField.setText(String.valueOf(patient.getZipCode()));
        emailJTextField.setText(patient.getEmailAddress());
        areaCodeJTextField.setText(String.valueOf(patient.getAreaCode()));
        numberJTextField.setText(String.valueOf(patient.getPhoneNumber()));
        myDoctorJTextField.setText(patient.getMyDoctor());
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cityJTextField = new javax.swing.JTextField();
        zipCodeJTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ageJTextField = new javax.swing.JTextField();
        numberJTextField = new javax.swing.JTextField();
        emailJTextField = new javax.swing.JTextField();
        areaCodeJTextField = new javax.swing.JTextField();
        primaryDocNameJLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        patientIDJTextField = new javax.swing.JTextField();
        updateJButton = new javax.swing.JButton();
        streetAddressJTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        saveJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        myDoctorJTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cityJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cityJTextFieldFocusLost(evt);
            }
        });
        add(cityJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 236, 183, -1));

        zipCodeJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                zipCodeJTextFieldFocusLost(evt);
            }
        });
        add(zipCodeJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 274, 183, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 204));
        jLabel9.setText("View My Profile");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 26, 229, -1));

        jLabel1.setText("Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 79, -1, -1));

        nameJTextField.setEditable(false);
        nameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameJTextFieldActionPerformed(evt);
            }
        });
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 74, 183, -1));

        jLabel2.setText("Age");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 160, -1, -1));

        ageJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageJTextFieldActionPerformed(evt);
            }
        });
        add(ageJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 155, 183, -1));

        numberJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                numberJTextFieldFocusLost(evt);
            }
        });
        add(numberJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 362, 106, -1));

        emailJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailJTextFieldFocusLost(evt);
            }
        });
        add(emailJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 318, 182, -1));

        areaCodeJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                areaCodeJTextFieldFocusLost(evt);
            }
        });
        add(areaCodeJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 362, 50, -1));

        primaryDocNameJLabel.setText("Primary Doctor Name");
        add(primaryDocNameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 411, -1, -1));

        jLabel4.setText("Patient ID");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 116, -1, -1));

        patientIDJTextField.setEditable(false);
        patientIDJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientIDJTextFieldActionPerformed(evt);
            }
        });
        add(patientIDJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 111, 183, -1));

        updateJButton.setText("Update");
        updateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateJButtonActionPerformed(evt);
            }
        });
        add(updateJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 460, -1, -1));

        streetAddressJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                streetAddressJTextFieldFocusLost(evt);
            }
        });
        add(streetAddressJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 198, 183, -1));

        jLabel6.setText("Phone Number");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 367, -1, -1));

        jLabel5.setText("Email Address");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 323, -1, -1));

        jLabel3.setText("Zip Code");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 279, -1, -1));

        jLabel7.setText("City/Town");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 241, -1, -1));

        jLabel8.setText("Street Address");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 203, -1, -1));

        jLabel10.setText("-");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 367, -1, -1));

        saveJButton.setText("Save");
        saveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJButtonActionPerformed(evt);
            }
        });
        add(saveJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 460, -1, -1));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 510, -1, -1));

        myDoctorJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                myDoctorJTextFieldFocusLost(evt);
            }
        });
        add(myDoctorJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 406, 144, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void cityJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cityJTextFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cityJTextFieldFocusLost

    private void zipCodeJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_zipCodeJTextFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_zipCodeJTextFieldFocusLost

    private void nameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameJTextFieldActionPerformed

    private void ageJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageJTextFieldActionPerformed

    private void numberJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numberJTextFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_numberJTextFieldFocusLost

    private void emailJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailJTextFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_emailJTextFieldFocusLost

    private void areaCodeJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_areaCodeJTextFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_areaCodeJTextFieldFocusLost

    private void patientIDJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientIDJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientIDJTextFieldActionPerformed

    private void streetAddressJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_streetAddressJTextFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_streetAddressJTextFieldFocusLost

    private void myDoctorJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_myDoctorJTextFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_myDoctorJTextFieldFocusLost

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void updateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJButtonActionPerformed
        // TODO add your handling code here:
        
        nameJTextField.setText(patient.getPatientName());
        patientIDJTextField.setText(String.valueOf(patient.getPatientID()));
        ageJTextField.setText(String.valueOf(patient.getAge()));
        streetAddressJTextField.setText(patient.getStreetAddress());
        cityJTextField.setText(patient.getTown());
        zipCodeJTextField.setText(String.valueOf(patient.getZipCode()));
        emailJTextField.setText(patient.getEmailAddress());
        areaCodeJTextField.setText(String.valueOf(patient.getAreaCode()));
        numberJTextField.setText(String.valueOf(patient.getPhoneNumber()));
        myDoctorJTextField.setText(patient.getMyDoctor());
        
        
        nameJTextField.setEnabled(false);
        patientIDJTextField.setEnabled(false);
        ageJTextField.setEnabled(true);
        streetAddressJTextField.setEnabled(true);      
        cityJTextField.setEnabled(true);
        zipCodeJTextField.setEnabled(true);
        emailJTextField.setEnabled(true);
        areaCodeJTextField.setEnabled(true);
        numberJTextField.setEnabled(true);
        myDoctorJTextField.setEnabled(true);
        saveJButton.setEnabled(true);
        updateJButton.setEnabled(false);
    }//GEN-LAST:event_updateJButtonActionPerformed

    private void saveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJButtonActionPerformed
        // TODO add your handling code here:
        if((ageJTextField.getText().length()==0)||
                (streetAddressJTextField.getText().length()==0)||
                (cityJTextField.getText().length()==0)||
                (zipCodeJTextField.getText().length()==0)||
                (emailJTextField.getText().length()==0)||
                (areaCodeJTextField.getText().length()==0)||
                (numberJTextField.getText().length()==0))
        {
            JOptionPane.showMessageDialog(null, "Alert! Inputs can not be empty! ", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if((ageJTextField.getText().length() != 0) ||
             (streetAddressJTextField.getText().length()!=0) ||
            (cityJTextField.getText().length() != 0)||
                (zipCodeJTextField.getText().length() !=0)||
                (emailJTextField.getText().length() !=0)||
                (areaCodeJTextField.getText().length() !=0)||
                (numberJTextField.getText().length() !=0)) {
            try{

//                String patientName = userAccountnameJTextField.getText();
                int age = Integer.parseInt(ageJTextField.getText());
                String streetAddress = streetAddressJTextField.getText();
                String town = cityJTextField.getText();
                int zipCode = Integer.parseInt(zipCodeJTextField.getText());
                String emailAddress = emailJTextField.getText();
                int areaCode = Integer.parseInt(areaCodeJTextField.getText());
                int phoneNumber = Integer.parseInt(numberJTextField.getText());
//                String doc = myDoctorJTextField.getText();
                
                
                Patient patient = patientOrganization.getPatientDirectory().createPtient(userAccount.getName());
                userAccount.setPatient(patient);
                patient.setPatientName(userAccount.getName());
                patient.setAge(age);
                patient.setAreaCode(areaCode);
                patient.setEmailAddress(emailAddress);
                patient.setPhoneNumber(phoneNumber);
                patient.setStreetAddress(streetAddress);
                patient.setTown(town);
                patient.setZipCode(zipCode);
//                patient.setMyDoctor(doc);
                
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

    public void resetFields(){
        
        ageJTextField.setText("");
        nameJTextField.setText("");
        streetAddressJTextField.setText("");
        cityJTextField.setText("");
        zipCodeJTextField.setText("");
        emailJTextField.setText("");
        areaCodeJTextField.setText("");
        numberJTextField.setText("");
       
     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageJTextField;
    private javax.swing.JTextField areaCodeJTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField cityJTextField;
    private javax.swing.JTextField emailJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField myDoctorJTextField;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTextField numberJTextField;
    private javax.swing.JTextField patientIDJTextField;
    private javax.swing.JLabel primaryDocNameJLabel;
    private javax.swing.JButton saveJButton;
    private javax.swing.JTextField streetAddressJTextField;
    private javax.swing.JButton updateJButton;
    private javax.swing.JTextField zipCodeJTextField;
    // End of variables declaration//GEN-END:variables
}
