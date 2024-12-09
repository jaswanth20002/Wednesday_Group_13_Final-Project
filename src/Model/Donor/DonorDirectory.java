/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Donor;

import Model.Patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author divya
 */
public class DonorDirectory {
    private ArrayList<Donor> donorList;
    
    public DonorDirectory() {
        this.donorList = new ArrayList<>();
    }

    public ArrayList<Donor> getDonorList() {
        return donorList;
    }

    public void setDonorList(ArrayList<Donor> donorList) {
        this.donorList = donorList;
    }
    
     public Donor createDonor(String name) {
        Donor d = new Donor();
        d.setDonorName(name);
        donorList.add(d);
        return d;
    }
  
    public void removeDonor(Donor d){
        donorList.remove(d);
    }
    
    public ArrayList<Donor> searchDonor(String key)
    {
        ArrayList<Donor> searchDonorDirectory = new ArrayList();
        for(Donor donor: donorList)
        {
            if(donor.getDonorName().toLowerCase().startsWith(key.toLowerCase()))
            {
                searchDonorDirectory.add(donor);
            }
        }
        return searchDonorDirectory;
    }
    
    
}
