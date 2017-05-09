/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

/**
 *
 * @author csc190
 */


import Assignment6.model.Employee;
import Assignment6.model.Schedule;
import Assignment6.model.Timeslot;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Base64;

/**
 *
 * @author csc190
 */
public class Client {

    protected static Schedule buildSchedule() {
        Timeslot[] arrEmployee1 = new Timeslot[]{
            new Timeslot( "M", 10),
            new Timeslot("T", 12),
            new Timeslot("F", 1),
            new Timeslot("R", 5)
        };
        Timeslot[] arrEmployee2 = new Timeslot[]{
            new Timeslot("M", 10),
            new Timeslot("W", 3),
            new Timeslot("F", 4)
        };
        Timeslot[] arrEmployee3 = new Timeslot[]{
            new Timeslot("M", 12),
            new Timeslot("F", 13),
            new Timeslot("W", 14)
        };
        //this is the arraylist of skills for Employee 1
        ArrayList<String> arrSkillsEm1 = new ArrayList<>();
        arrSkillsEm1.add("Butcher");
        arrSkillsEm1.add("Baker");
        //arrayList for employee 2
        ArrayList<String> arrSkillsEm2 = new ArrayList<>();
        arrSkillsEm2.add("Chef");
        arrSkillsEm2.add("Gardener");
        
        ArrayList<String> arrSkillsEm3 = new ArrayList<>();
        arrSkillsEm2.add("Butcher");
        arrSkillsEm2.add("Dishwasher");
        
        Employee [] arrEmployees = new Employee[]{
            new Employee(1, "Dr.Evil", arrSkillsEm1, arrEmployee1),
            new Employee(2, "Mini Me", arrSkillsEm2, arrEmployee2),
            new Employee(3, "Number Two", arrSkillsEm3, arrEmployee3)
        };
        //making a new schedule for both of the employees
        Schedule schedule = new Schedule(arrEmployees);
        
        return schedule;
    }

    /**
     * Serialization. Convert Menu to byte array, and then encode using base64
     *

     * @param schedule

     * @param 

     * @return
     */
    protected static String scheduleToStr(Schedule schedule) {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(schedule);
            byte[] barrOut = bos.toByteArray();
            byte[] b64Out = Base64.getEncoder().encode(barrOut);
            int len1 = barrOut.length;
            int len2 = b64Out.length;
            String sRet = new String(b64Out);
            sRet = URLEncoder.encode(sRet, "UTF-8");
            return sRet;
        } catch (IOException exc) {
            System.out.println(exc);
            return null;
        }
    }

   
    
    //1. CREATE ANOTHER STNDARD JAVA PROJECT (NOT JAVA FAX)
    //2. copy over the files in your source folder to the src/ of that folder
    
    

    public static void main(String[] args) {
        String op = args[0];
        Schedule schedule = buildSchedule();
        String url = "http://localhost/assignment6.php";
        String scheduleContent = Utils.toStr(schedule);
        String datastr = op.equals("1")
                ? "op=uploadSchedule&val=" + scheduleContent 
                : "op=getSchedule" + "&day=" + args[1] + "&skill=" + args[2] + "&hour=" + args[3];
        try {
            String response = Utils.httpsPost(url, datastr);
            System.out.println(response);
        } catch (Exception exc) {
            System.out.println(exc);
        }
        int k = 0;




    }

}  

