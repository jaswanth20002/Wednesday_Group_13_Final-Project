/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Role;

import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Organization.DrugSalesOrganization;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;
import UserInterface.DrugSalesAdminRole.DrugSalesWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Donald Mucharla
 */
public class DrugSalesAdminRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DrugSalesWorkAreaJPanel(userProcessContainer, account, (DrugSalesOrganization)organization, enterprise,business);
    }
}
