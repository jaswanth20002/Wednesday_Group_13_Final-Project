/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization;

import Model.Role.CustomerServiceRole;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author bhuvana
 */
public class CustomerServiceOrganization extends Organization {
    public CustomerServiceOrganization() {
        super(Organization.Type.CustomerService.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CustomerServiceRole());
        return roles;
    }
}
