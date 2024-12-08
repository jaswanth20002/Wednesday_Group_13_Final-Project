/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PatientRole;

import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Organization.PatientOrganization;
import Model.Patient.PatientDirectory;
import Model.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author dongyueli
 */
public class ManageMyProfileJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;    
    private EcoSystem ecoSystem;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private PatientOrganization patientOrganization;
    //private PatientDirectory patientDirectory;
    /**
     * Creates new form ManageMyProfileJPanel
     */
    public ManageMyProfileJPanel(JPanel userProcessContainer,UserAccount userAccount, PatientOrganization patientOrganization, Enterprise enterprise,EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.userAccount = userAccount;
        this.patientOrganization = (PatientOrganization)patientOrganization;
        this.enterprise = enterprise;
        //this.patientDirectory = patientDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        createMyProfileJButton = new javax.swing.JButton();
        viewUpdateMyProfileJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 204));
        jLabel9.setText("Manage My Profile");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 58, 241, -1));

        createMyProfileJButton.setText("Create My Profile");
        createMyProfileJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createMyProfileJButtonActionPerformed(evt);
            }
        });
        add(createMyProfileJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 210, -1));

        viewUpdateMyProfileJButton.setText("View and Update My Profile");
        viewUpdateMyProfileJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewUpdateMyProfileJButtonActionPerformed(evt);
            }
        });
        add(viewUpdateMyProfileJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 205, 212, -1));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 285, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void createMyProfileJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createMyProfileJButtonActionPerformed
        // TODO add your handling code here:
        CreateMyProfileJPanel panel = new CreateMyProfileJPanel(userProcessContainer,userAccount,patientOrganization,enterprise,ecoSystem);
        userProcessContainer.add("CreateMyProfileJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_createMyProfileJButtonActionPerformed

    private void viewUpdateMyProfileJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewUpdateMyProfileJButtonActionPerformed
        // TODO add your handling code here:
        ViewUpdateMyProfileJPanel panel = new ViewUpdateMyProfileJPanel(userProcessContainer,userAccount,patientOrganization,enterprise,ecoSystem);
        userProcessContainer.add("ViewUpdateMyProfileJPane", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewUpdateMyProfileJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton createMyProfileJButton;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton viewUpdateMyProfileJButton;
    // End of variables declaration//GEN-END:variables
}