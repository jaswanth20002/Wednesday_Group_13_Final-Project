/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HHSAdminRole;

import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Organization.HealthAndHumanServicesOrganization;
import Model.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author dongyueli
 */
public class HHSAdminWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private HealthAndHumanServicesOrganization organization;
    private EcoSystem ecoSystem;
    /**
     * Creates new form HHSAdminWorkAreaJPanel
     */
    public HHSAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, HealthAndHumanServicesOrganization organization, Enterprise enterprise, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.organization = (HealthAndHumanServicesOrganization)organization;
        this.enterprise = enterprise;
        this.ecoSystem = ecoSystem;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(255, 255, 204));
        jLabel10.setFont(new java.awt.Font("Savoye LET", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Wearable Device Health Management System");
        jLabel10.setOpaque(true);
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 25, -1, 55));

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 204));
        jLabel13.setText("Health and Human Service Admin Work Area");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 108, 563, -1));

        jButton1.setText("View All Reports List");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        jButton2.setText("View Analysis Report");
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 227, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ViewAllReportsListJPanel panel = new ViewAllReportsListJPanel(userProcessContainer,userAccount,organization,enterprise,ecoSystem);
        userProcessContainer.add("ViewAllReportsListJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    // End of variables declaration//GEN-END:variables
}
