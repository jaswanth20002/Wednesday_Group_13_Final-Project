/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.WorkQueue;

import Model.Enterprise.Enterprise;
import Model.Network.Network;
import Model.Patient.Patient;
import Model.Patient.Record;
import Model.UserAccount.UserAccount;
import java.util.Date;

public abstract class WorkRequest {
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private UserAccount patient;
    private UserAccount doctor;
    private String status;
    private Date date;
    private Enterprise senderEnterprise;
    private Network senderNetwork;
    private Enterprise receiveEnterprise;
    private UserAccount donor;

    public UserAccount getDonor() {
        return donor;
    }

    public void setDonor(UserAccount donor) {
        this.donor = donor;
    }
    
    
    public WorkRequest(){
        date = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public UserAccount getPatient() {
        return patient;
    }

    public void setPatient(UserAccount patient) {
        this.patient = patient;
    }

    public UserAccount getDoctor() {
        return doctor;
    }

    public void setDoctor(UserAccount doctor) {
        this.doctor = doctor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Enterprise getSenderEnterprise() {
        return senderEnterprise;
    }

    public void setSenderEnterprise(Enterprise senderEnterprise) {
        this.senderEnterprise = senderEnterprise;
    }

    public Network getSenderNetwork() {
        return senderNetwork;
    }

    public void setSenderNetwork(Network senderNetwork) {
        this.senderNetwork = senderNetwork;
    }

    public Enterprise getReceiveEnterprise() {
        return receiveEnterprise;
    }

    public void setReceiveEnterprise(Enterprise receiveEnterprise) {
        this.receiveEnterprise = receiveEnterprise;
    }
    
    
    
    
    
    
    
}
