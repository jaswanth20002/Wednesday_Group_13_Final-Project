/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization;

import Model.Role.HHSAdminRole;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author bhuvana
 */
public class HealthAndHumanServicesOrganization extends Organization{
    public HealthAndHumanServicesOrganization() {
        super(Organization.Type.HHS.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new HHSAdminRole());
        return roles;
    }
}
