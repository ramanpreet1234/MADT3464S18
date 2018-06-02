/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramanpreet
 */
public class bankaccount extends bank{
    String accountno;
    String ownername;
    String balanceamount;
    
    bankaccount(){
        super();
        this.accountno = "AC########";
        this.balanceamount = "b00000";
        this.ownername = "unknown";
    }
    bankaccount(String bankname, String bankid, String accountno, String ownername, String balanceamount){
        super(bankname,bankid);
        this.accountno = accountno;
        this.balanceamount = balanceamount;
        this.ownername = ownername;
    }
    public String toString(){
    String personaldetails = super.toString();
    String data = "\n accountno" + this.accountno + "\n ownername:" +this.ownername + "\n balanceamount :" + this.balanceamount;
    return personaldetails +data;
    }
}
            
             
    

