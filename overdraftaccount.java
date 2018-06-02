/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramanpreet
 */
public class overdraftaccount extends bankaccount {
    double overdraftlimits;
    
    overdraftaccount(){
        super();
        this. overdraftlimits= 0;
    }
    overdraftaccount(String bankname, String bankid, String accountno, String ownername, double balanceamount,double overdraftlimits){
        super(bankname, bankid, accountno, ownername, balanceamount);
        this.overdraftlimits = overdraftlimits;
    }

    overdraftaccount(String scotia, String i1232, String aC23456, String ritu, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    void withdraw(int balance){
    String money = "withdraw money";
    if (balance<=balance){
        balanceamount+=balance ;
                money+=("withdraw money"+overdraftlimits);
    }
if(balance<=balanceamount){
    balanceamount=balanceamount-balance;
    System.out.println("withdraw money-"+ balance);
}

    }

    }

    

    
    

