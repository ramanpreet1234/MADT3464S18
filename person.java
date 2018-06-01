
import static java.lang.System.in;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramanpreet
 */
public class person {
    String name;
    String address;
    int age;
    
    
    void setname(String nm){
        Scanner in  = new Scanner( System.in);
        System.out.println("enter name : ");
        name = in.nextLine();
        
    }
    
    String getname(){
        return name;
    }
    
    void setaddress(){
        System.out.println("enter address : ");
        address = in.nextLine();
    }
    String getaddress(){
        return address;
    }
    
    void setage(){
        System.out.println("enter age : ");
        age = Integer.parseInt(in.nextLine());
    }
    
    int getage(){
        return age;
    }
    
    void setdata(){
        setname();
        setaddress();
        setage();
    }
    
    @Override
   public String toString(){
       String data = " name : " + name + "\n address : " +
               address + "\n age : " + age;
       
       return data;
        
    }
    
}
