/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Enterprise;

import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jaswanth
 */
public class EquipmentManufacturerEnterprise extends Enterprise{
    
    public EquipmentManufacturerEnterprise(String name) {
        super(name, EnterpriseType.EquipmentManufacturer);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}