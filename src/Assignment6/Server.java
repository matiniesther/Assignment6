/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import Assignment6.model.Employee;
import Assignment6.model.Schedule;
import Assignment6.model.Timeslot;

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
        for(Employee e : schedule.getEmployee()){
            if(e.hasSkill(skill) && e.isAvailable(day, hour)){
                sRet += ""+e.name;
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
          String str= getSchedule(args[2], args[3], Integer.parseInt(args[4]));
          System.out.println(str);
        }
    }
}
