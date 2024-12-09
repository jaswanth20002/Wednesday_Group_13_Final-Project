/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerServiceRole;

import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Enterprise.HospitalEnterprise;
import Model.Network.Network;
import Model.Organization.CustomerServiceOrganization;
import Model.Organization.Organization;
import Model.Organization.PatientOrganization;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.FeedbackWorkRequest;
import Model.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;

public class ViewFeedbackDetailsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private CustomerServiceOrganization organization;
    private FeedbackWorkRequest workRequest;
    private EcoSystem ecoSystem;

    /**
     * Creates new form ViewFeedbackDetailsJPanel
     */
    public ViewFeedbackDetailsJPanel(JPanel userProcessContainer, UserAccount userAccount, FeedbackWorkRequest feedbackWorkRequest, Enterprise enterprise, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.workRequest = feedbackWorkRequest;
        this.enterprise = enterprise;
        this.ecoSystem = ecoSystem;
        
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
                    if(o instanceof PatientOrganization){
                        org=o;
                        break;
                    }
                }
            }
        }
       
        
        if (org != null) {
            for (WorkRequest wr: userAccount.getWorkQueue().getWorkRequestList()){
            if(wr instanceof FeedbackWorkRequest){
                workRequest=(FeedbackWorkRequest)wr;
                break;
            }
        }
        }
      
        populateDetails();
    }

    private void populateDetails() {
        feedbackJTextArea.setText(workRequest.getFeedbackMessage());
        

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
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ns1jRadioButton = new javax.swing.JRadioButton();
        s1jRadioButton = new javax.swing.JRadioButton();
        vs1jRadioButton = new javax.swing.JRadioButton();
        ns2jRadioButton = new javax.swing.JRadioButton();
        s2jRadioButton = new javax.swing.JRadioButton();
        vs2jRadioButton = new javax.swing.JRadioButton();
        ns3jRadioButton = new javax.swing.JRadioButton();
        s3jRadioButton = new javax.swing.JRadioButton();
        vs3jRadioButton = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        s4jRadioButton = new javax.swing.JRadioButton();
        vs4jRadioButton = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        ns4jRadioButton = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        feedbackJTextArea = new javax.swing.JTextArea();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 204));
        jLabel12.setText("View Feedback Details");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 31, 296, -1));

        jLabel4.setText("1. What do you think of our service?");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 79, -1, -1));

        jLabel6.setText("2.What do you think of doctor's suggestion?");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 157, -1, -1));

        ns1jRadioButton.setText("Not satisfied");
        ns1jRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ns1jRadioButtonActionPerformed(evt);
            }
        });
        add(ns1jRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 113, -1, -1));

        s1jRadioButton.setSelected(true);
        s1jRadioButton.setText("Satisfied");
        s1jRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1jRadioButtonActionPerformed(evt);
            }
        });
        add(s1jRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 113, -1, -1));

        vs1jRadioButton.setText("Very satisfied");
        add(vs1jRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 113, -1, -1));

        ns2jRadioButton.setText("Not satisfied");
        ns2jRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ns2jRadioButtonActionPerformed(evt);
            }
        });
        add(ns2jRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 185, -1, -1));

        s2jRadioButton.setSelected(true);
        s2jRadioButton.setText("Satisfied");
        s2jRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2jRadioButtonActionPerformed(evt);
            }
        });
        add(s2jRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 185, -1, -1));

        vs2jRadioButton.setText("Very satisfied");
        add(vs2jRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 185, -1, -1));

        ns3jRadioButton.setText("Not satisfied");
        ns3jRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ns3jRadioButtonActionPerformed(evt);
            }
        });
        add(ns3jRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 254, -1, -1));

        s3jRadioButton.setText("Satisfied");
        s3jRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s3jRadioButtonActionPerformed(evt);
            }
        });
        add(s3jRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 254, -1, -1));

        vs3jRadioButton.setSelected(true);
        vs3jRadioButton.setText("Very satisfied");
        add(vs3jRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 254, -1, -1));

        jLabel8.setText("3.What do you think of hospital cleanliness?");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 226, -1, -1));

        s4jRadioButton.setSelected(true);
        s4jRadioButton.setText("Satisfied");
        s4jRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s4jRadioButtonActionPerformed(evt);
            }
        });
        add(s4jRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 323, -1, -1));

        vs4jRadioButton.setText("Very satisfied");
        add(vs4jRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 323, -1, -1));

        jLabel10.setText("4.What do you think of the medicine availability?");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 295, -1, -1));

        ns4jRadioButton.setText("Not satisfied");
        ns4jRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ns4jRadioButtonActionPerformed(evt);
            }
        });
        add(ns4jRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 323, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 102));
        jLabel3.setText("Customer comments:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        feedbackJTextArea.setColumns(20);
        feedbackJTextArea.setRows(5);
        jScrollPane1.setViewportView(feedbackJTextArea);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 422, 67));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void ns1jRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ns1jRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ns1jRadioButtonActionPerformed

    private void s1jRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1jRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s1jRadioButtonActionPerformed

    private void ns2jRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ns2jRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ns2jRadioButtonActionPerformed

    private void s2jRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2jRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s2jRadioButtonActionPerformed

    private void ns3jRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ns3jRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ns3jRadioButtonActionPerformed

    private void s3jRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s3jRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s3jRadioButtonActionPerformed

    private void s4jRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s4jRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s4jRadioButtonActionPerformed

    private void ns4jRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ns4jRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ns4jRadioButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextArea feedbackJTextArea;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton ns1jRadioButton;
    private javax.swing.JRadioButton ns2jRadioButton;
    private javax.swing.JRadioButton ns3jRadioButton;
    private javax.swing.JRadioButton ns4jRadioButton;
    private javax.swing.JRadioButton s1jRadioButton;
    private javax.swing.JRadioButton s2jRadioButton;
    private javax.swing.JRadioButton s3jRadioButton;
    private javax.swing.JRadioButton s4jRadioButton;
    private javax.swing.JRadioButton vs1jRadioButton;
    private javax.swing.JRadioButton vs2jRadioButton;
    private javax.swing.JRadioButton vs3jRadioButton;
    private javax.swing.JRadioButton vs4jRadioButton;
    // End of variables declaration//GEN-END:variables
}