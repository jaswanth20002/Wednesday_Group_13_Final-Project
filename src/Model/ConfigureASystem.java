/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Employee.Employee;
import Model.Enterprise.Enterprise;
import Model.Network.Network;
import Model.Organization.Organization;
import Model.Patient.Patient;
import Model.Role.AdminRole;
import Model.Role.CustomerServiceRole;
import Model.Role.DoctorRole;
import Model.Role.DrugSalesAdminRole;
import Model.Role.HHSAdminRole;
import Model.Role.LabAssistantRole;
import Model.Role.PatientRole;
import Model.Role.SystemAdminRole;
import Model.Role.VaccinationManagementAdminRole;
import Model.UserAccount.UserAccount;

/**
 *
 * @author Donald Mucharla
 */
public class ConfigureASystem {
    
    public static EcoSystem configureABusiness() {
         
        EcoSystem ecoSystem = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
           
        //set system admin
        Employee employee = ecoSystem.getEmployeeDirectory().createEmployee("Donald");
        UserAccount ua = ecoSystem.getUserAccountDirectory().createUserAccount("donald", "donald", employee, new SystemAdminRole());

        //set network1
        Network n1 = ecoSystem.createandAddNetwork();
        n1.setName("Massachusetts");
        
       // Network n3 = ecoSystem.createandAddNetwork();
        //n3.setName("California");
        
        //set enterprise1 of network1
        Enterprise e1 = n1.getEnterpriseDirectory().createAndAddEnterprise("Massachusetts General Hospital", Enterprise.EnterpriseType.Hospital);
        Employee employee1 = e1.getEmployeeDirectory().createEmployee("Donald");
        UserAccount ua1 = e1.getUserAccountDirectory().createUserAccount();
        ua1.setUsername("admin1");
        ua1.setPassword("admin1");
        ua1.setName("Donald");
        ua1.setRole(new AdminRole());
        
        //set organization1 of enterprise1 of network1
        Organization  org1 = e1.getOrganizationDirectory().createOrganization(Organization.Type.Doctor);
        org1.setName("Doctor Department");
        Employee employee11 = org1.getEmployeeDirectory().createEmployee("Doc1");
        UserAccount ua2 = org1.getUserAccountDirectory().createUserAccount();
        ua2.setPassword("doctor1");
        ua2.setUsername("doctor1");
        ua2.setName("doctor1");
        ua2.setEmployee(employee11);
        ua2.setRole(new DoctorRole());
        
        //set organization2 of enterprise1 of network1
        Organization  org2 = e1.getOrganizationDirectory().createOrganization(Organization.Type.Patient);
        org2.setName("Patient Department");
        Patient patient1 = org2.getPatientDirectory().createPtient("Patient1");
        UserAccount ua3 = org2.getUserAccountDirectory().createUserAccount();
        ua3.setPassword("patient1");
        ua3.setUsername("patient1");
        ua3.setName("patient1");
        ua3.setPatient(patient1);
        ua3.setRole(new PatientRole());
        
        Organization  org3 = e1.getOrganizationDirectory().createOrganization(Organization.Type.Lab);
        org3.setName("Lab Department");
        Employee lab1 = org3.getEmployeeDirectory().createEmployee("Lab Assistant1");
        UserAccount ua4 = org3.getUserAccountDirectory().createUserAccount();
        ua4.setPassword("lab1");
        ua4.setUsername("lab1");
        ua4.setName("lab1");
        ua4.setEmployee(lab1);
        ua4.setRole(new LabAssistantRole());
        
        Enterprise e2 = n1.getEnterpriseDirectory().createAndAddEnterprise("MA Equipment manufacturer", Enterprise.EnterpriseType.EquipmentManufacturer);
        Employee employee2 = e2.getEmployeeDirectory().createEmployee("Ram");
        UserAccount ua5 = e2.getUserAccountDirectory().createUserAccount();
        ua5.setUsername("admin2");
        ua5.setPassword("admin2");
        ua5.setName("Ram");
        ua5.setRole(new AdminRole());
        
        Organization  org21 = e2.getOrganizationDirectory().createOrganization(Organization.Type.CustomerService);
        org21.setName("Customer Service Representative");
        Employee cs1 = org21.getEmployeeDirectory().createEmployee("CustomerService1");
        UserAccount ua6 = org21.getUserAccountDirectory().createUserAccount();
        ua6.setPassword("cs1");
        ua6.setUsername("cs1");
        ua6.setName("cs1");
        ua6.setEmployee(cs1);
        ua6.setRole(new CustomerServiceRole());
        
        Enterprise e3 = n1.getEnterpriseDirectory().createAndAddEnterprise("CVS Pharmacy", Enterprise.EnterpriseType.Pharmacy);
        Employee employee3 = e3.getEmployeeDirectory().createEmployee("Vignesh");
        UserAccount ua7 = e3.getUserAccountDirectory().createUserAccount();
        ua7.setUsername("admin3");
        ua7.setPassword("admin3");
        ua7.setName("Vignesh");
        ua7.setRole(new AdminRole());
        
        Organization  org31 = e3.getOrganizationDirectory().createOrganization(Organization.Type.DrugSales);
        org31.setName("Medical sales Organization");
        Employee ds1 = org31.getEmployeeDirectory().createEmployee("D1");
        UserAccount ua8 = org31.getUserAccountDirectory().createUserAccount();
        ua8.setPassword("ds1");
        ua8.setUsername("ds1");
        ua8.setName("ds1");
        ua8.setEmployee(ds1);
        ua8.setRole(new DrugSalesAdminRole());
        
        Organization  org51 = e3.getOrganizationDirectory().createOrganization(Organization.Type.Vaccination);
        org51.setName("Vaccination Management Organization");
        Employee vm1 = org51.getEmployeeDirectory().createEmployee("V1");
        UserAccount ua14 = org51.getUserAccountDirectory().createUserAccount();
        ua14.setPassword("vm1");
        ua14.setUsername("vm1");
        ua14.setName("vm1");
        ua14.setEmployee(vm1);
        ua14.setRole(new VaccinationManagementAdminRole());
        
        
        Enterprise e100 = n1.getEnterpriseDirectory().createAndAddEnterprise("Rite Aid", Enterprise.EnterpriseType.Pharmacy);
        Employee employee300 = e100.getEmployeeDirectory().createEmployee("Trump");
        UserAccount ua100 = e100.getUserAccountDirectory().createUserAccount();
        ua100.setUsername("admin100");
        ua100.setPassword("admin100");
        ua100.setName("Trump");
        ua100.setRole(new AdminRole());
        
        Organization  org100 = e100.getOrganizationDirectory().createOrganization(Organization.Type.DrugSales);
        org100.setName("Novartis");
        Employee ds2 = org100.getEmployeeDirectory().createEmployee("Ds2");
        UserAccount ua101 = org100.getUserAccountDirectory().createUserAccount();
        ua101.setPassword("ds2");
        ua101.setUsername("ds2");
        ua101.setName("ds2");
        ua101.setEmployee(ds2);
        ua101.setRole(new DrugSalesAdminRole());
        
        Organization  org61 = e3.getOrganizationDirectory().createOrganization(Organization.Type.Vaccination);
        org51.setName("Vaccination Management Organization");
        Employee vm2 = org51.getEmployeeDirectory().createEmployee("V2");
        UserAccount ua15 = org51.getUserAccountDirectory().createUserAccount();
        ua15.setPassword("vm2");
        ua15.setUsername("vm2");
        ua15.setName("vm2");  
        ua15.setEmployee(vm2);
        ua15.setRole(new VaccinationManagementAdminRole());
        
        Enterprise e4 = n1.getEnterpriseDirectory().createAndAddEnterprise("MA Government", Enterprise.EnterpriseType.Government);
        Employee employee4 = e4.getEmployeeDirectory().createEmployee("Jackson");
        UserAccount ua9 = e4.getUserAccountDirectory().createUserAccount();
        ua9.setUsername("admin4");
        ua9.setPassword("admin4");
        ua9.setName("Jackson");
        ua9.setRole(new AdminRole());
        
        Organization  org41 = e4.getOrganizationDirectory().createOrganization(Organization.Type.HHS);
        org41.setName("Health Horizons Human Services");
        Employee hhs1 = org41.getEmployeeDirectory().createEmployee("hhs1");
        UserAccount ua10 = org41.getUserAccountDirectory().createUserAccount();
        ua10.setPassword("hhs1");
        ua10.setUsername("hhs1");
        ua10.setName("hhs1");
        ua10.setEmployee(hhs1);
        ua10.setRole(new HHSAdminRole());
       
//        //set network2
//        Network n2 = ecoSystem.createandAddNetwork();
//        n2.setName("New York");
//        Enterprise e21 = n2.getEnterpriseDirectory().createAndAddEnterprise("Calvary Hospital", Enterprise.EnterpriseType.Hospital);
//        Employee employee211 = e21.getEmployeeDirectory().createEmployee("Christopher");
//        UserAccount ua11 = e21.getUserAccountDirectory().createUserAccount();
//        ua11.setUsername("admin5");
//        ua11.setPassword("admin5");
//        ua11.setName("Christopher");
//        ua11.setRole(new AdminRole());
//        
//        
//        
//        Organization  org211 = e21.getOrganizationDirectory().createOrganization(Organization.Type.Patient);
//        org211.setName("Patient Department");
//        Patient patient2 = org211.getPatientDirectory().createPtient("Patient2");
//        UserAccount ua12 = org211.getUserAccountDirectory().createUserAccount();
//        ua12.setPassword("patient2");
//        ua12.setUsername("patient2");
//        ua12.setName("patient2");
//        ua12.setPatient(patient2);
//        ua12.setRole(new PatientRole());
//        
//        Organization  org212 = e21.getOrganizationDirectory().createOrganization(Organization.Type.Doctor);
//        org212.setName("Doctor Department");
//        Employee employee212 = org212.getEmployeeDirectory().createEmployee("Doctor2");
//        UserAccount ua13 = org1.getUserAccountDirectory().createUserAccount();
//        ua13.setPassword("doctor2");
//        ua13.setUsername("doctor2");
//        ua13.setName("doctor2");
//        ua13.setEmployee(employee212);
//        ua13.setRole(new DoctorRole());
//        
//        
        
        
        
        return ecoSystem;
    }       
}
