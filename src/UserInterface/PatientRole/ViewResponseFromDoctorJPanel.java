/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PatientRole;

import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Enterprise.HospitalEnterprise;
import Model.Network.Network;
import Model.Organization.DoctorOrganization;
import Model.Organization.Organization;
import Model.Organization.PatientOrganization;
import Model.Patient.Patient;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.PatientDoctorWorkRequest;
import Model.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;

public class ViewResponseFromDoctorJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;    
    private EcoSystem ecoSystem;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private PatientOrganization patientOrganization;
    private PatientDoctorWorkRequest patientDoctorWorkRequest;
    /**
     * Creates new form VitalSignsResponseFromDoctorJPanel
     */
    public ViewResponseFromDoctorJPanel(JPanel userProcessContainer, UserAccount userAccount, PatientDoctorWorkRequest patientDoctorWorkRequest, Enterprise enterprise, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.userAccount = userAccount;
        this.patientOrganization = (PatientOrganization)patientOrganization;
        this.enterprise = enterprise;
        this.patientDoctorWorkRequest = patientDoctorWorkRequest;
        
        
        Network targetNetwork = null;
        for (Network network : ecoSystem.getNetworkList()) {
            for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (e == enterprise) {
                    targetNetwork = network;
                    break;
                }
            }
        }
        
        Organization org = null;
        for (Enterprise e : targetNetwork.getEnterpriseDirectory().getEnterpriseList()) {        
            if (e instanceof HospitalEnterprise) {
                HospitalEnterprise emfe =(HospitalEnterprise)e;
                for(Organization o:emfe.getOrganizationDirectory().getOrganizationList()){
                    if(o instanceof DoctorOrganization){
                        org=o;
                        break;
                    }
                }
            }
        }
       
        
        if (org != null) {
            for (WorkRequest wr: userAccount.getWorkQueue().getWorkRequestList()){
            if(wr instanceof PatientDoctorWorkRequest){
                patientDoctorWorkRequest=(PatientDoctorWorkRequest)wr;
                break;
            }
        }
        }
        
        populateDetails();
        
        
        
        

        

    }
    
    private void populateDetails() {
        respondJTextArea.setText(patientDoctorWorkRequest.getDoctorResponseMessage());
        

    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        respondJTextArea = new javax.swing.JTextArea();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 204));
        jLabel12.setText("Respond From Doctor");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 41, 280, -1));

        respondJTextArea.setColumns(20);
        respondJTextArea.setRows(5);
        jScrollPane1.setViewportView(respondJTextArea);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 89, 306, 119));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 236, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea respondJTextArea;
    // End of variables declaration//GEN-END:variables
}
