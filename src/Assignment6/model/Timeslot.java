/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6.model;

/**
 *
 * @author csc190
 */
public class Timeslot implements java.io.Serializable{
    protected String day;//day of the week
    protected int time; //in hours
    public Timeslot(String inpDayofweek, int inpTime){
        this.day = inpDayofweek;
        this.time = inpTime;
    }
   
}

