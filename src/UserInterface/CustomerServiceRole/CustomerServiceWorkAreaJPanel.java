/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerServiceRole;

import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Organization.CustomerServiceOrganization;
import Model.Organization.PatientOrganization;
import Model.Patient.Patient; 
import Model.UserAccount.UserAccount;
import Model.WorkQueue.FeedbackWorkRequest;
import Model.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dongyueli
 */
public class CustomerServiceWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private CustomerServiceOrganization organization;
    private PatientOrganization patientOrganization;
    private EcoSystem ecoSystem;
    
    /**
     * Creates new form CustomerServiceWorkAreaJPanel
     */
    public CustomerServiceWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, CustomerServiceOrganization organization, Enterprise enterprise, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.organization = (CustomerServiceOrganization)organization;
        this.enterprise = enterprise;
        this.ecoSystem = ecoSystem;
        
        populateTable();
        
    }
    
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) viewFeedbackFromEquipmentManufactureJTable.getModel();

        model.setRowCount(0);
        if (userAccount.getWorkQueue().getWorkRequestList() != null) {
        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
            if (request != null) {
                FeedbackWorkRequest feedbackWorkRequest = (FeedbackWorkRequest) request;
                
                    Object[] row = new Object[4];
                    
                    row[0] = feedbackWorkRequest;
                    row[1] = feedbackWorkRequest.getSender().getPatient().getPatientName();
                    row[2] = feedbackWorkRequest.getReceiver() == null ? null : feedbackWorkRequest.getReceiver().getName();
                    row[3] = feedbackWorkRequest.getStatus();

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

        jScrollPane2 = new javax.swing.JScrollPane();
        viewFeedbackFromEquipmentManufactureJTable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        viewDetailsJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewFeedbackFromEquipmentManufactureJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Timestamp", "Sender", "Receiver", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(viewFeedbackFromEquipmentManufactureJTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 70, 510, 114));

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 204));
        jLabel12.setText("Customer Work Area");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 22, 269, -1));

        viewDetailsJButton.setText("View Detatils");
        viewDetailsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsJButtonActionPerformed(evt);
            }
        });
        add(viewDetailsJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));

        jButton1.setText("Process");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 210, 110, -1));

        jButton2.setText("Assign To Me");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = viewFeedbackFromEquipmentManufactureJTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "please select one row");
        }else{
            FeedbackWorkRequest request = (FeedbackWorkRequest) viewFeedbackFromEquipmentManufactureJTable.getValueAt(selectedRow, 0);
            request.setReceiver(userAccount);   
            request.setStatus("Pending");
            populateTable();
            JOptionPane.showMessageDialog(null, "Success");
            
        }

        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = viewFeedbackFromEquipmentManufactureJTable.getSelectedRow();        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "please select one row");
        }
        WorkRequest request = (WorkRequest) viewFeedbackFromEquipmentManufactureJTable.getValueAt(selectedRow, 0);     
        request.setStatus("Finish");
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void viewDetailsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = viewFeedbackFromEquipmentManufactureJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.");
        }else{
        FeedbackWorkRequest request = (FeedbackWorkRequest) viewFeedbackFromEquipmentManufactureJTable.getValueAt(selectedRow, 0);
        //Patient patient =(Patient) viewFeedbackFromEquipmentManufactureJTable.getValueAt(selectedRow, 0);
        ViewFeedbackDetailsJPanel vfdj = new ViewFeedbackDetailsJPanel(userProcessContainer, userAccount, request, enterprise,ecoSystem);
        userProcessContainer.add("ViewFeedbackDetailsJPanel", vfdj);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
        
        
        
    }//GEN-LAST:event_viewDetailsJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton viewDetailsJButton;
    private javax.swing.JTable viewFeedbackFromEquipmentManufactureJTable;
    // End of variables declaration//GEN-END:variables
}
