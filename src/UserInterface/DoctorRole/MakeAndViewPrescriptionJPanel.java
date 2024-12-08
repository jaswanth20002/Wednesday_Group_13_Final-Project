/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DoctorRole;

import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Enterprise.PharmacyEnterprise;
import Model.Network.Network;
import Model.Organization.DoctorOrganization;
import Model.Organization.DrugSalesOrganization;
import Model.Organization.Organization;
import Model.Role.DrugSalesAdminRole;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.PatientDoctorWorkRequest;
import Model.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dongyueli
 */
public class MakeAndViewPrescriptionJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private PatientDoctorWorkRequest patientDoctorWorkRequest;
    private DoctorOrganization organization;
    private EcoSystem ecoSystem;
    
    /**
     * Creates new form MakeAndViewPrescriptionJPanel
     */
    public MakeAndViewPrescriptionJPanel(JPanel userProcessContainer, UserAccount account, DoctorOrganization organization, Enterprise enterprise, EcoSystem ecoSystem,PatientDoctorWorkRequest patientDoctorWorkRequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = (DoctorOrganization)organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.ecoSystem = ecoSystem;
        this.patientDoctorWorkRequest = patientDoctorWorkRequest;
        populatePharmacyJComboBox();
        populateRequestTable();
    }
    
    public void populatePharmacyJComboBox() {
        pharmacyJComboBox.removeAllItems();
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
         
            if (e instanceof PharmacyEnterprise) {
                PharmacyEnterprise emfe =(PharmacyEnterprise)e;
                
                        pharmacyJComboBox.addItem(emfe);

                    }
        }

//        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
//            if (organization instanceof DrugSalesOrganization) {
//                for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
//                    if (ua.getRole() instanceof DrugSalesAdminRole) {
//                        pharmacyJComboBox.addItem(ua);
//                    }
//                }
//            }
//        }
    }
    public void populateRequestTable(){
    DefaultTableModel model = (DefaultTableModel) drugRequestJTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            PatientDoctorWorkRequest patientDoctorWorkRequest = (PatientDoctorWorkRequest) request;
            Object[] row = new Object[4];
            row[0] = patientDoctorWorkRequest.getDrugName();
            row[1] = patientDoctorWorkRequest.getDrugQuantity();
            row[2] = patientDoctorWorkRequest.getReceiveEnterprise();
            row[3] = patientDoctorWorkRequest.getPreStatus();

            
            model.addRow(row);
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
        pharmacyJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        drugRequestJTable = new javax.swing.JTable();
        drugRequestJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 204));
        jLabel12.setText("Make Prescription");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 35, 243, -1));

        pharmacyJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pharmacyJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pharmacyJComboBoxActionPerformed(evt);
            }
        });
        add(pharmacyJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 78, 127, -1));

        jLabel1.setText("Pharmacy");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 82, -1, -1));

        drugRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Drug Name", "Demand Quantity", "Receiver", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(drugRequestJTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 615, 136));

        drugRequestJButton.setText("Request Drug");
        drugRequestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugRequestJButtonActionPerformed(evt);
            }
        });
        add(drugRequestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, -1, -1));

        jLabel2.setText("Drug Catalog:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 124, -1, -1));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void pharmacyJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pharmacyJComboBoxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_pharmacyJComboBoxActionPerformed

    private void drugRequestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugRequestJButtonActionPerformed
        // TODO add your handling code here:    
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestDrugJPanel", new RequestDrugJPanel(userProcessContainer,userAccount,organization,enterprise,ecoSystem,patientDoctorWorkRequest));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_drugRequestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DoctorHomePageJPanel dwjp = (DoctorHomePageJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton drugRequestJButton;
    private javax.swing.JTable drugRequestJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox pharmacyJComboBox;
    // End of variables declaration//GEN-END:variables
}
