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
public class Multithreading {
public static void main(String[] args) {
    // TODO code application logic here
    
   Thread t1 =  Thread.currentThread();
    System.out.println(" current Thread : " + t1);
    
    t1.setName("test Thread");
    t1.setPriority(10);
    System.out.println("Thread info after modification : " + t1);
    System.out.println("State of Thread t1 : " + t1.getState());
    System.out.println("alive or dead : " + t1.isAlive());
    t1.getPriority();
    System.out.println("Daemon or non-daemon : " + t1.isDaemon());
    
    try{
    for(int i=1; i<=3; i++){
        System.out.println("Main Thread : " +i);
        new FirstThread();
        new SecondThread("Second cup");
        new SecondThread("Second Inning");
        
        Thread.sleep(6000);
        System.out.println("State after sleep : " + t1.getState());
    }
    }catch(InterruptedException e){ 
        e.printStackTrace();
    }finally{
        System.out.println("Exiting from Main Thread");
    }
}
    
}
