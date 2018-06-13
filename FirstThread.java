/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multithreading;

/**
 *
 * @author Ramanpreet
 */
public class FirstThread extends Thread {
    FirstThread(){
     super("First Thread");   
     System.out.println("First Thread created");
     start();
    }
    
    public void run(){
      try{
    for(int i=1; i<=5; i++){
        System.out.println("Main Thread : " +i);
        Thread.sleep(1000);
        
    }
    }catch(InterruptedException e){ 
        e.printStackTrace();
    }finally{
        System.out.println("Exiting from Main Thread");  
    }
}
}