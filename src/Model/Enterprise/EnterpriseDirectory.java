/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Enterprise;

import java.util.ArrayList;

public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if (null != type)switch (type) {
            case Hospital:
                enterprise = new HospitalEnterprise(name);
                enterpriseList.add(enterprise);
                break;
            case Pharmacy:
                enterprise = new PharmacyEnterprise(name);
                enterpriseList.add(enterprise);
                break;
            case Government:
                enterprise = new GovernmentEnterprise(name);
                enterpriseList.add(enterprise);
                break;
            case EquipmentManufacturer:
                enterprise = new EquipmentManufacturerEnterprise(name);
                enterpriseList.add(enterprise);
                break;
                      
            default:
                break;
        }
        return enterprise;
    }

   
    }
    
    

