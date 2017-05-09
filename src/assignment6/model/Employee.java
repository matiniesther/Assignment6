/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6.model;

import java.util.ArrayList;

/**
 *
 * @author csc190
 */
public class Employee implements java.io.Serializable{
    Integer id;
    public String name;
    protected ArrayList<String> arrSkills = new ArrayList<>();
    protected Timeslot [] arrTimeslot;
    
    public Employee(int inpID, String inpName,ArrayList inpArrSkills, Timeslot [] inpArrTimeslot){
        this.id = inpID;
        this.name = inpName;
        this.arrSkills = inpArrSkills;
        this.arrTimeslot = inpArrTimeslot;
    }
    
    
    
    public ArrayList getSkills(){
        return this.arrSkills;
    }

    
    public boolean isAvailable(String day, int hour){
        for (Timeslot ts : this.arrTimeslot) {
            if(ts.day.equals(day) && ts.time==hour){
                return true;
            }
        }
        return false;
    }
    
    public boolean hasSkill(String skill){
        for(int i=0; i<this.arrSkills.size(); i++){ 
            if(this.arrSkills.get(i).equals(skill)){
                return true;
            }
        }
        return false;
    }
    
}
    

