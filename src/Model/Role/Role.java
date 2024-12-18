/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Role;

import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;
import javax.swing.JPanel;

public abstract class Role {
    public enum RoleType{
        Admin("Admin"),
        Doctor("Doctor"),
        Patient("Patient"),
        CustomerService("Customer Service"),
        DrugSalesAdmin("Drug Sales Admin"),
        HHSAdmin("HHS Admin"),
        LabAssistant("Lab Assistant");
   
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}
