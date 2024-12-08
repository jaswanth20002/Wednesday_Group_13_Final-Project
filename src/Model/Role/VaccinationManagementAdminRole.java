package Model.Role;
import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Organization.VaccinationManagementOrganization;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;

import UserInterface.VaccineManagementAdminRole.VaccinationWorkAreaJPanel;
import javax.swing.JPanel;
/**
 *
 * @author k.bhuvaneshwari
 */
public class VaccinationManagementAdminRole extends Role {
@Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new VaccinationWorkAreaJPanel(userProcessContainer, account, (VaccinationManagementOrganization)organization, enterprise,business);
    
} }