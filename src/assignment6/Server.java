/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package assignment6;

//import assignment6.model.Employee;
//import assignment6.model.Schedule;
//import assignment6.model.Timeslot;

/**
 *
 * @author csc190
 */
/*public class Server {
    protected static void updateSchedule(String val){
        String qry = "UPDATE objects SET val='" + val +"' WHERE name='schedule'";
        Utils.execNonQuery(qry);
    }
    protected static int getScheduleTime(String id){
        //1. retrieve all schedule
        String qry = "SELECT val FROM objects WHERE name='schedule'";
        String scheduleObjStr = Utils.execQuery(qry);
       
        
        
        if(scheduleObjStr==null) return -2;
        Schedule schedule = (Schedule) Utils.toObj(scheduleObjStr);
        if(schedule==null) return -3;
        Employee employee = schedule.getEmployeeById(id);
        if(employee==null) return -1;
        Timeslot[] timeslot= employee.getAvailability();
        if(timeslot==null) return -1;
        //Timeslot Timeslot;
        //return employee.getAvailability();
    }
    public static void main(String [] args){
        String op = args[0];
        if(op.equals("uploadSchedule")){
            updateSchedule(args[1]);
        }
        //else{
          //  int time = getDishTime(args[1]);
            //System.out.println(time);
        //}
    }
}*/
