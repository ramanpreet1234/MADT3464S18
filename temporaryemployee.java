/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramanpreet
 */
public class temporaryemployee extends employee{
    String designation;
    float hourlyrate;
    
    public temporaryemployee(){
        this.designation = "unknown";
        this.hourlyrate = 0.0f;
        
    }
    
public temporaryemployee(String name, String address, int age,
        String eID, String joiningdate, int deptno, 
        String designation, float hourlyrate){
  super(name, address, age, eID, joiningdate, deptno);
this.designation = designation;
this.hourlyrate = hourlyrate;
}
public String toString(){
    return (super.toString() + "\ndesignation :n " +
            this.designation + "\nhourly rate : " +
            this.hourlyrate);
}
}
        
    
    
    

