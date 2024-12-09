package Model.Organization;

import Model.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Divya
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.Patient.getValue())){
            organization = new PatientOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.Donor.getValue())){
            organization = new DonorOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.CustomerService.getValue())){
            organization = new CustomerServiceOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.DrugSales.getValue())){
            organization = new DrugSalesOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.HHS.getValue())){
            organization = new HealthAndHumanServicesOrganization();
            organizationList.add(organization);
        }
        
        else if(type.getValue().equals(Type.Vaccination.getValue())) {
            organization = new VaccinationManagementOrganization();
            organizationList.add(organization);
        }
        
              
        return organization;
    }
}