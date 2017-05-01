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
    protected String name;
    protected ArrayList<String> arrSkills = new ArrayList<>();
    protected Timeslot [] arrTimeslot;
    
    public Employee(int inpID, String inpName,ArrayList inpArrSkills, Timeslot [] inpArrTimeslot){
        this.id = inpID;
        this.name = inpName;
        this.arrSkills = inpArrSkills;
        this.arrTimeslot = inpArrTimeslot;
    }
    public Timeslot[] getAvailability(){
        return this.arrTimeslot;
    }
    public boolean getAvailability(Timeslot inpTimeslot){
        for (Timeslot arrTimeslot1 : arrTimeslot) {
            return arrTimeslot1 == inpTimeslot;
        }
        return false;   
    }
    public Timeslot[] getTimeslot(){
        return this.arrTimeslot;
    }
    
}
    

