/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6.model;

/**
 *
 * @author csc190
 */
public class Schedule implements java.io.Serializable {
    Employee [] arrEm;
    public Schedule(Employee [] inpArr){
        this.arrEm = inpArr;
    }
    public Employee[] getEmployee(){
        return this.arrEm;
    }

    
}

