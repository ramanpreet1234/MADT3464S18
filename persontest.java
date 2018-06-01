/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramanpreet
 */
public class persontest {
    public static void main (String args[]){
        
        
     person sumanth = new person();
     sumanth.name = "sumanth";
     sumanth.address = "toronto";
     sumanth.age = 20;
     System.out.println("name : " + sumanth.name +
             "\n address : " + sumanth.address +
              "\n age : " + sumanth.age);
     
     person foram = new person();
     foram.setname("foram");
     String nm = foram.getname();
     System.out.println("name : " +nm);
     foram.setaddress();
     String add = foram.getaddress();
     foram.setage();
     int age = foram.getage();
     System.out.println("name : " +nm + "\naddress : " +
             add + "\nage : ");
     
     person anu = new person();
     anu.setdata();
     System.out.println(anu.toString());
     //
     person aman = new person();
     System.out.println(aman.toString());
     
     person rimpal = new person();
     System.out.println(rimpal.toString());
     

     
     
     
     
    }
    }

