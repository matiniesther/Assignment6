/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

import assignment6.model.Employee;
import assignment6.model.Schedule;
import assignment6.model.Timeslot;

/**
 *
 * @author csc190
 */
public class Server {
    protected static void updateSchedule(String val){
        String qry = "UPDATE objects SET val='" + val +"' WHERE name='schedule'";
        Utils.execNonQuery(qry);
    }
    protected static String getSchedule( String day, String skill, int hour){
        //1. retrieve all schedule
        String sRet = "";
        String qry = "SELECT val FROM objects WHERE name='schedule'";
        String scheduleObjStr = Utils.execQuery(qry);
        
        Schedule schedule= (Schedule) Utils.toObj(scheduleObjStr);
        for(Employee ee : schedule.getEmployee()){
            if(ee.hasSkill(skill) && ee.isAvailable(day, hour)){
                sRet += ""+ee.name;
            }
        }
        return sRet;
    }
    public static void main(String [] args){
        String op = args[0];
        if(op.equals("uploadSchedule")){
            updateSchedule(args[1]);
        }
        else{
          String str= getSchedule(args[1], args[2], Integer.parseInt(args[3]));
          System.out.println(str);
        }
    }
}
