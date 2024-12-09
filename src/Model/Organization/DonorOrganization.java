/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization;

import Model.Role.DonorRole;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Donald Mucharla
 */
public class DonorOrganization extends Organization{
    public DonorOrganization() {
        super(Organization.Type.Donor.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DonorRole());
        return roles;
    }
}
