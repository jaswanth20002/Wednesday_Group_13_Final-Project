/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Patient;

import Model.UserAccount.UserAccount;

/**
 *
 * @author Divya
 */
public class Patient {
    private String patientName;
    private int patientID;
    private int age;
    private String streetAddress;
    private String town;
    private int zipCode;
    private String emailAddress;
    private int areaCode;
    private int phoneNumber;
    private static int count = 1000;
    private String myDoctor;
    private UserAccount mydoctor;
    private UserAccount mypatient;
    
    private float respiratoryRate;
     private float Heartrate;
      private float Systolicbloodpressure;
      private float Weightinpounds;
      private int StandTime;
      private int MoveTime;
      private int ExcerciseTime;
      private int TotalTime;

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Patient.count = count;
    }

    public float getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(float respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public float getHeartrate() {
        return Heartrate;
    }

    public void setHeartrate(float Heartrate) {
        this.Heartrate = Heartrate;
    }

    public float getSystolicbloodpressure() {
        return Systolicbloodpressure;
    }

    public void setSystolicbloodpressure(float Systolicbloodpressure) {
        this.Systolicbloodpressure = Systolicbloodpressure;
    }

    public float getWeightinpounds() {
        return Weightinpounds;
    }

    public void setWeightinpounds(float Weightinpounds) {
        this.Weightinpounds = Weightinpounds;
    }

    public int getStandTime() {
        return StandTime;
    }

    public void setStandTime(int StandTime) {
        this.StandTime = StandTime;
    }

    public int getMoveTime() {
        return MoveTime;
    }

    public void setMoveTime(int MoveTime) {
        this.MoveTime = MoveTime;
    }

    public int getExcerciseTime() {
        return ExcerciseTime;
    }

    public void setExcerciseTime(int ExcerciseTime) {
        this.ExcerciseTime = ExcerciseTime;
    }

    public int getTotalTime() {
        return TotalTime;
    }

    public void setTotalTime(int TotalTime) {
        this.TotalTime = TotalTime;
    }

    
    
    
    private RecordHistory recordHistory;
    
    
    public Patient()
    {
        super();
        count++;
        patientID=count;
        this.recordHistory = new RecordHistory();
    }

   
    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
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

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public UserAccount getMydoctor() {
        return mydoctor;
    }

    public void setMydoctor(UserAccount mydoctor) {
        this.mydoctor = mydoctor;
    }

    public UserAccount getMypatient() {
        return mypatient;
    }

    public void setMypatient(UserAccount mypatient) {
        this.mypatient = mypatient;
    }
    
    
    
    

    
    @Override
    public String toString() {
        return patientName; 
    }
}
