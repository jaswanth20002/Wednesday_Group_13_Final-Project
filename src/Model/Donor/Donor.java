/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Donor;

import Model.UserAccount.UserAccount;
import java.util.Date;
import java.util.List;

/**
 *
 * @author divya
 */
public class Donor {
    
    private int donorID;
    private String donorName;
    private int age;
    private String gender;
    private int contactNumber;
    private String emailAddress;
    private int areaCode;
    private String streetAddress;
    private String town;
    private int zipCode;
    private int phoneNumber;
    private String myDoctor;
    private UserAccount mydoctor;
    private UserAccount mydonor;
    private static int count = 1000;
    private RecordHistory recordHistory;    

//    private String medicalHistory;
//    private Date lastDonationDate;
//    private List<String> donationRecords;
    
       public Donor()
    {
        super();
        count++;
        donorID=count;
        this.recordHistory = new Model.Donor.RecordHistory();
    }
       

    public int getDonorId() {
        return donorID;
    }

    public void setDonorId(int donorId) {
        this.donorID = donorID;
    }

    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }
    
     public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }
    
    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
    
    public int getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }
    
    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
    
     public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    
    public RecordHistory getRecordHistory() {
        return recordHistory;
    }

    public void setRecordHistory(RecordHistory recordHistory) {
        this.recordHistory = recordHistory;
    }
    
    public String getMyDoctor() {
        return myDoctor;
    }

    public void setMyDoctor(String myDoctor) {
        this.myDoctor = myDoctor;
    }
   
    public UserAccount getMydoctor() {
        return mydoctor;
    }

    public void setMydoctor(UserAccount mydoctor) {
        this.mydoctor = mydoctor;
    }
    
    public UserAccount getMydonor() {
        return mydonor;
    }

    public void setMydonor(UserAccount mydonor) {
        this.mydonor = mydonor;
    }


//    public String getMedicalHistory() {
//        return medicalHistory;
//    }
//
//    public void setMedicalHistory(String medicalHistory) {
//        this.medicalHistory = medicalHistory;
//    }
//
//    public Date getLastDonationDate() {
//        return lastDonationDate;
//    }
//
//    public void setLastDonationDate(Date lastDonationDate) {
//        this.lastDonationDate = lastDonationDate;
//    }
//
//    public List<String> getDonationRecords() {
//        return donationRecords;
//    }
//
//    public void setDonationRecords(List<String> donationRecords) {
//        this.donationRecords = donationRecords;
//    }
  
    @Override
    public String toString() {
        return donorName; 
    }
}
