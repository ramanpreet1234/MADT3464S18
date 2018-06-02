/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramanpreet
 */
public class activity {
    public static void main(String[]args){
        bankaccount acc1 = new bankaccount("scotia", "I1232", "AC23456", "ritu", "1000" );
        System.out.println(acc1.toString());
        {
        overdraftaccount err1 = new overdraftaccount( "scotia", "I1232" , "AC23456", "ritu",  1000);
    }
    }
    
}
