/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization;

import Model.Donor.DonorDirectory;
import Model.Employee.EmployeeDirectory;
import Model.Patient.PatientDirectory;
import Model.Role.Role;
import Model.UserAccount.UserAccountDirectory;
import Model.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Divya
 */
public abstract class Organization {
    
    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private PatientDirectory patientDirectory; 
    private DonorDirectory donorDirectory; 
    private int organizationID;
    private static int counter;
    
    public enum Type{
        Admin("Admin Organization"), Doctor("Doctor Organization"), Lab("Lab Representatives")
        ,Patient("Patient Representatives"),Donor("Donor Organization"),CustomerService("Customer Service Representatives")
        ,DrugSales("Drug Sales Representatives"),HHS("Health Horizons Human Services")
        ,Vaccination("vaccination Management Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        } }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        patientDirectory = new PatientDirectory();
        donorDirectory = new DonorDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    
    public DonorDirectory getDonorDirectory() {
        return donorDirectory;
    }

    public void setDonorDirectory(DonorDirectory donorDirectory) {
        this.donorDirectory = donorDirectory;
    }
    
    
    
    

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public String getName() {
        return name;
    }
    

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
}
