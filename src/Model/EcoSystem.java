/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import Model.Network.Network;
import Model.Organization.Organization;
import Model.Role.Role;
import Model.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Donald Mucharla
 */
public class EcoSystem  extends Organization{
    private static EcoSystem ecoSystem;
    private ArrayList<Network> networkList;
    
    public static EcoSystem getInstance(){
        if(ecoSystem == null){
            ecoSystem = new EcoSystem();
        }
          return ecoSystem;
    }
    private EcoSystem(){
        super(null);
        networkList  = new ArrayList<>();
    }

    public static EcoSystem getBusiness() {    
        return ecoSystem;
    }


    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

  
    public Network createandAddNetwork(){
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {       
        ArrayList <Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

   
    
}


