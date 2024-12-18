/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.DonorRole;

import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Organization.DonorOrganization;
import Model.Organization.PatientOrganization;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.DonorDoctorWorkRequest;
import Model.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author divya
 */
public class DoctorRespondJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private DonorOrganization donorOrganization;
    private EcoSystem ecoSystem;

    /**
     * Creates new form DoctorRespondJPanel
     */
    public DoctorRespondJPanel(JPanel userProcessContainer, UserAccount userAccount, DonorOrganization donorOrganization, Enterprise enterprise, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.donorOrganization = (DonorOrganization) donorOrganization;
        this.enterprise = enterprise;
        this.ecoSystem = ecoSystem;

        populateTable();
   
    }
    
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.setRowCount(0);
        if (userAccount.getWorkQueue().getWorkRequestList() != null) {
            for (WorkRequest request : donorOrganization.getWorkQueue().getWorkRequestList()) {
                if (request != null) {
                    DonorDoctorWorkRequest donorDoctorWorkRequest = (DonorDoctorWorkRequest) request;

                    Object[] row = new Object[2];

                    row[0] = donorDoctorWorkRequest.getDate();
                    row[1] = donorDoctorWorkRequest.getDoctorResponseMessage();

                    model.addRow(row);

                }
            }
        }
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
        jTable1 = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 204));
        jLabel12.setText("Respond From Doctor");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(backJButton))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel12)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(backJButton)
                .addContainerGap(89, Short.MAX_VALUE))
        );
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
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
