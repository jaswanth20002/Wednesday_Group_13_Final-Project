/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Role;

import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Organization.DonorOrganization;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;
import UserInterface.DonorRole.DonorHomePageJPanel;
import javax.swing.JPanel;

/**
 *
 * @author divya
 */
public class DonorRole extends Role {
    
    
   @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        System.out.println(organization instanceof DonorOrganization);
        System.out.println(organization instanceof Organization);
        
        DonorOrganization donorOrganization = (DonorOrganization)organization;
        return new DonorHomePageJPanel(userProcessContainer, account, donorOrganization, enterprise, business);
    }
}
