
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
public class bank{
    String bankname;
    String bankid;
    bank(){
        this.bankname = "unknown";
        this.bankid = "I#####";
    }
    bank(String bankname,String bankid){
        this.bankname = bankname;
        this.bankid = bankid;
    }
    void setbankname(){
        System.out.println("bank name : " + bankname);
    }
    String getbankname(){
        return bankname;
    }
    void setbankid(){
        System.out.println("bank id : " +bankid);
    }
    String getbankid(){
        return bankid;
    }
    public String toString(){
        String data = "bank name : " +bankname +"\n bankid :" + bankid;
        return data;   
    }
    
}
