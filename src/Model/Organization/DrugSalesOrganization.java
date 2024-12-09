/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization;

import Model.Role.DrugSalesAdminRole;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Bhuvana
 * 
 */
public class DrugSalesOrganization extends Organization{
    public DrugSalesOrganization() {
        super(Organization.Type.DrugSales.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DrugSalesAdminRole());
        return roles;
    }
}
