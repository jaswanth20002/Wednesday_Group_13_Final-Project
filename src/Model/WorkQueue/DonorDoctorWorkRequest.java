/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.WorkQueue;

import Model.Donor.Donor;
import Model.Donor.Record;
import java.util.Date;

/**
 *
 * @author divya
 */
public class DonorDoctorWorkRequest extends WorkRequest {
    
    private Date date;
    private Donor donor;
    private String donorName;
    private Record Record;
    private String doctorResponseMessage;
    private String requestStatus;
    private String respondStatus;

    
    public Donor getTheDonor() {
        return donor;
    }

    public void setDonor(Donor donor) {
        this.donor = donor;
    }
   
    public Date getDate() {
        return date;
    }

    public void setDate() {
        this.date = new Date();
    }

     public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }
    
    public Record getRecord() {
        return Record;
    }

    public void setRecord(Record Record) {
        this.Record = Record;
    }

    public String getDoctorResponseMessage() {
        return doctorResponseMessage;
    }

    public void setDoctorResponseMessage(String doctorResponseMessage) {
        this.doctorResponseMessage = doctorResponseMessage;
    }
    
    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }
    
     public String getRespondStatus() {
        return respondStatus;
    }

    public void setRespondStatus(String respondStatus) {
        this.respondStatus = respondStatus;
    }
    

    
    
}
