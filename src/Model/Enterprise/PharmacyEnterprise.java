/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Enterprise;

import Model.Role.Role;
import java.util.ArrayList;

public class PharmacyEnterprise extends Enterprise {

    
    public PharmacyEnterprise(String name) {
        super(name, EnterpriseType.Pharmacy);
    }
 
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
