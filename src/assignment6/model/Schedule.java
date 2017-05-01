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
    public Employee getEmployeeById(String id){
        for (Employee arrEm1 : this.arrEm) {
            if (arrEm1.id.equals(id)) {
                return arrEm1;
            }
        }
        return null;
    }
}

