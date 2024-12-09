/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Role;

import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Organization.DoctorOrganization;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;
import UserInterface.DoctorRole.DoctorHomePageJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Divya
 */
public class DoctorRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DoctorHomePageJPanel(userProcessContainer, account, (DoctorOrganization)organization, enterprise, business);
    }
}
