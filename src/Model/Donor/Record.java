/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Donor;

import java.util.Date;
import java.util.List;

/**
 *
 * @author divya
 */
public class Record {
    private String medicalHistory;
    private Date lastDonationDate;
    private String bloodGroup;
    private String organDonor;
    private List<String> donationRecords;
    
    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

     public String getOrganDonor() {
        return organDonor;
    }

    public void setOrganDonor(String organDonor) {
        this.organDonor = organDonor;
    }
 
    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public Date getLastDonationDate() {
        return lastDonationDate;
    }

    public void setLastDonationDate(Date lastDonationDate) {
        this.lastDonationDate = lastDonationDate;
    }
    

    public List<String> getDonationRecords() {
        return donationRecords;
    }

    public void setDonationRecords(List<String> donationRecords) {
        this.donationRecords = donationRecords;
    }
    
}
   