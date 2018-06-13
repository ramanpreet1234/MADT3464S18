/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multithreading;

/**
 *
 * @author macstudent
 */
public class SecondThread implements Runnable{
    Thread t;
    String name;
    
    public SecondThread(String name){
        this.name = name;
        t= new Thread(this, this.name);
        System.out.println("Second Thread Created " + t);
        t.start();
    }

    @Override
    public void run() {
     try{
    for(int i=1; i<=3; i++){
        System.out.println("Main Thread : " +i);
        Thread.sleep(1000);
        
    }
    }catch(InterruptedException e){ 
        e.printStackTrace();
    }finally{
        System.out.println("Exiting from Second Thread");  
    }  
    }    
}
