package Model.Role;

public class VaccineRequest {
    private String vaccineName;
    private int quantity;
    private String sender;
    private String receiver; // Added receiver field
    private String status; // Added status field
    private String date; // Added date field

    // Constructor
    public VaccineRequest(String vaccineName, int quantity, String sender, String receiver, String status, String date) {
        this.vaccineName = vaccineName;
        this.quantity = quantity;
        this.sender = sender;
        this.receiver = receiver;
        this.status = status;
        this.date = date;
    }

    // Getter and Setter for vaccineName
    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    // Getter and Setter for quantity
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Getter and Setter for sender
    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    // Getter and Setter for receiver
    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    // Getter and Setter for status
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Getter and Setter for date
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
