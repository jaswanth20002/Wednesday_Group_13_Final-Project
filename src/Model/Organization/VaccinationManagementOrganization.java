package Model.Organization;


import Model.Role.VaccinationManagementAdminRole;
import Model.Role.Role;
import java.util.ArrayList;

/**
 * Vaccine Management Organization class
 */
public class VaccinationManagementOrganization extends Organization {

    // Constructor
    public VaccinationManagementOrganization() {
        super(Organization.Type.Vaccination.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        // Add the relevant roles here
        roles.add(new VaccinationManagementAdminRole()); // Adding Vaccination role
       
        return roles;
    }
}