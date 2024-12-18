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
import Model.Patient.Record;
import Model.UserAccount.UserAccount;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;

public class VitalSignsChartJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;    
    private EcoSystem ecoSystem;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private PatientOrganization patientOrganization;
    private Patient patient;
    /**
     * Creates new form VitalSignsChartJPanel
     */
    public VitalSignsChartJPanel(JPanel userProcessContainer,UserAccount userAccount, PatientOrganization patientOrganization, Enterprise enterprise,EcoSystem ecoSyste) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.userAccount = userAccount;
        this.patientOrganization = (PatientOrganization)patientOrganization;
        this.enterprise = enterprise;
        this.patient = userAccount.getPatient();
        
        XYDataset data = createXYDataset();
        JFreeChart chart = ChartFactory.createTimeSeriesChart(patient.getPatientName(), "Time", "Data", data);
        
        ChartPanel chartPanel = new ChartPanel(chart);
        this.add(chartPanel, BorderLayout.CENTER);
        this.validate();
    }
    
    private XYDataset createXYDataset( )
    {
       TimeSeriesCollection data = new TimeSeriesCollection();
       
       TimeSeries s1 = new TimeSeries("Respiratory Rate");
       
       for(Record vitalSign: patient.getRecordHistory().getRecordList())
       {
           s1.add(new Second(vitalSign.getDate()), vitalSign.getRespiratoryRate());
       }
       data.addSeries(s1);
       
       TimeSeries s2 = new TimeSeries("Heart Rate");
       
       for(Record vitalSign: patient.getRecordHistory().getRecordList())
       {
           s2.add(new Second(vitalSign.getDate()), vitalSign.getHeartRate());
       }
       data.addSeries(s2);

       
       TimeSeries s3 = new TimeSeries("Blood Pressure");
       
       for(Record vitalSign: patient.getRecordHistory().getRecordList())
       {
           s3.add(new Second(vitalSign.getDate()), vitalSign.getSystolicBloodPressure());
       }
       data.addSeries(s3);
       
       
       TimeSeries s4 = new TimeSeries("Weight");
       
       for(Record vitalSign: patient.getRecordHistory().getRecordList())
       {
           s4.add(new Second(vitalSign.getDate()), vitalSign.getWeightInPounds());
       }
       data.addSeries(s4);
       
       
       
       
       return data;
   }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        backJButton.setBackground(new java.awt.Color(204, 255, 255));
        backJButton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        backJButton.setForeground(new java.awt.Color(0, 102, 255));
        backJButton.setText("<<Back");
        backJButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        backJButton.setOpaque(true);
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    // End of variables declaration//GEN-END:variables
}
