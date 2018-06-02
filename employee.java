/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramanpreet
 */
public class employee extends person{
    String eID;
    String joiningdate;
    int deptno;
    private String personalDetails;
    
    employee(){
        super();
        this.eID= "E###";
        this.joiningdate = "DD MON YYYY";
        this.deptno = 0;
    }
    employee(String name, String address, int age, 
            String eID, String joiningdate, int deptno){
        Super(name,address,age);
        this.eID = eID;
        this.joiningdate = joiningdate;
        this.deptno = deptno;
    }
    
@Override
public String toString(){
    String data = "employee ID : " + this.eID +
            "\n joining date : " + this.joiningdate +
            "\n dept no : " + this.deptno;
    return personalDetails + data;
}

    private void Super(String name, String address, int age) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

    
    
    

