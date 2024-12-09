/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.DoctorRole;

import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Organization.DoctorOrganization;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.DonorDoctorWorkRequest;
import Model.WorkQueue.PatientDoctorWorkRequest;
import Model.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author divya
 */
public class DonorDetailJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private DoctorOrganization organization;
    private EcoSystem ecoSystem;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private DonorDoctorWorkRequest donorDoctorWorkRequest;
    private Record record;

    /**
     * Creates new form DonorDetailJPanel
     */
    public DonorDetailJPanel(JPanel userProcessContainer, UserAccount account, DoctorOrganization organization, Enterprise enterprise, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.ecoSystem = ecoSystem;
//        this.donorDoctorWorkRequest = donorDoctorWorkRequest;
        
       populateDonorTable();
    }

    public void populateDonorTable() {

        DefaultTableModel model = (DefaultTableModel) viewVitalSignsJTable.getModel();

        model.setRowCount(0);

        if (userAccount.getWorkQueue().getWorkRequestList() != null) {
            for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
                if (request != null && request instanceof DonorDoctorWorkRequest ) {
                    DonorDoctorWorkRequest donorDoctorWorkRequest = (DonorDoctorWorkRequest) request;
                    if (donorDoctorWorkRequest.getDoctor()== userAccount) {
                    Object[] row = new Object[6];
                    row[0] = donorDoctorWorkRequest.getRecord().getBloodGroup();
                    row[1] = donorDoctorWorkRequest.getRecord().getOrganDonor();
                    row[2] = donorDoctorWorkRequest.getRecord().getMedicalHistory();
                    row[3] = donorDoctorWorkRequest.getRecord().getLastDonationDate();
                    row[4] = donorDoctorWorkRequest.getRespondStatus() == null ? "Waiting" : donorDoctorWorkRequest.getRespondStatus();
                    row[5] = donorDoctorWorkRequest;
                    model.addRow(row);
                    }
                }
            }
        }
    
    }
    
//    public void populateRequestTable(){
//        DefaultTableModel model = (DefaultTableModel) viewVitalSignsJTable.getModel();
//        
//        model.setRowCount(0);
//        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
////            DonorDoctorWorkRequest donorDoctorWorkRequest = (DonorDoctorWorkRequest) request;
//            Object[] row = new Object[5];
//            donorDoctorWorkRequest.setDate();
//            row[0] = donorDoctorWorkRequest;
//            row[1] = record.getBloodGroup();
//            row[2] = donorDoctorWorkRequest.getReceiver();
//            row[3] = donorDoctorWorkRequest.getLabStatus();
//            String result = ((PatientDoctorWorkRequest) request).getTestResult();
//            row[4] = result == null ? "Waiting" : result;
//            
//            model.addRow(row);
//        }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        viewVitalSignsJTable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        respondJButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        viewVitalSignsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Blood Group", "Organ Donor", "Medical History", "Last Donation Date", "Respond", "RequestObject"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(viewVitalSignsJTable);
        if (viewVitalSignsJTable.getColumnModel().getColumnCount() > 0) {
            viewVitalSignsJTable.getColumnModel().getColumn(5).setMinWidth(0);
            viewVitalSignsJTable.getColumnModel().getColumn(5).setPreferredWidth(0);
            viewVitalSignsJTable.getColumnModel().getColumn(5).setMaxWidth(0);
        }

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 204));
        jLabel12.setText("Donor Details");

        respondJButton.setText("Respond To Donor");
        respondJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respondJButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(respondJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(234, 234, 234)))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel12)
                .addGap(8, 8, 8)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(respondJButton)
                .addContainerGap(48, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void respondJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respondJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = viewVitalSignsJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);

        }

//        DonorDoctorWorkRequest donorDoctorWorkRequest = (DonorDoctorWorkRequest) viewVitalSignsJTable.getValueAt(selectedRow, 0);
//        donorDoctorWorkRequest.setRespondStatus("Processing");

        // Retrieve the DonorDoctorWorkRequest from the hidden column (column 5)
    Object selectedObject = viewVitalSignsJTable.getValueAt(selectedRow, 5);

    if (selectedObject instanceof DonorDoctorWorkRequest) {
        DonorDoctorWorkRequest donorDoctorWorkRequest = (DonorDoctorWorkRequest) selectedObject;
        donorDoctorWorkRequest.setRespondStatus("Processing");

        // Navigate to the DoctorResponseToDonorJPanel

        DoctorResponseToDonorJPanel panel = new DoctorResponseToDonorJPanel(userProcessContainer,enterprise,donorDoctorWorkRequest);
        userProcessContainer.add("DoctorResponseToDonorJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }
    else {
        JOptionPane.showMessageDialog(null, "Invalid selection. Please select a valid row.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_respondJButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        populateDonorTable();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton respondJButton;
    private javax.swing.JTable viewVitalSignsJTable;
    // End of variables declaration//GEN-END:variables
}
