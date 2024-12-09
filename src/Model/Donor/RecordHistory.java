/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Donor;

import java.util.ArrayList;

/**
 *
 * @author divya
 */
public class RecordHistory {
    private ArrayList<Model.Donor.Record> recordList;
    
//    public RecordHistory(){
//        this.recordList = new ArrayList<>();
//    }
//    
//    public ArrayList<Model.Donor.Record> getRecordList() {
//        return recordList;
//    }
//
//    public void setRecordList(ArrayList<Model.Donor.Record> recordList) {
//        this.recordList = recordList;
//    }
// 
//    public Model.Donor.Record addRecord(){
//        Model.Donor.Record record = new Model.Donor.Record();
//        recordList.add(record);
//        return record;
//    }
//    
//    public void removeRecord(Model.Donor.Record record){
//        recordList.remove(record);
//    }
    
     public RecordHistory(){
        this.recordList = new ArrayList<>();
    }

    public ArrayList<Record> getRecordList() {
        return recordList;
    }

    public void setRecordList(ArrayList<Record> recordList) {
        this.recordList = recordList;
    }
 
    public Record addRecord(){
        Record record = new Record();
        recordList.add(record);
        return record;
    }
    
    public void removeRecord(Record record){
        recordList.remove(record);
    }
    
}
