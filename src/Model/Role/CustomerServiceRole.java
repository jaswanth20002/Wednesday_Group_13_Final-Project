/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Role;

import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Organization.CustomerServiceOrganization;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;
import UserInterface.CustomerServiceRole.CustomerServiceWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Jashwanth
 */
public class CustomerServiceRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new CustomerServiceWorkAreaJPanel(userProcessContainer, account, (CustomerServiceOrganization)organization, enterprise,business);
    }
}
