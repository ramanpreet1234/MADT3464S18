/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramanpreet
 */
public class HelloWorld {
    public static void main(String args[]){
        // TODO code application logic here
        employee emp1 = new employee("rutvi", "toronto", 23, 
                "E101" , "12 May 2017", 10);
        
//        emp1.name = "rutvi";
//        emp1.address = " toronto";
//        emp1.age = 23;
        System.out.println("name : " + emp1.name + "\naddress : " +
                emp1.address + "\nage : " + emp1.age);
        System.out.println(emp1.toString());
        
        temporaryemployee tE1 = new temporaryemployee("sukhwinder",
                "brampton", 22, "T123", "01 May 2018", 20,
                "iOS Developer", 80.50f);
        System.out.println(tE1.toString());
        
    }
    
}
