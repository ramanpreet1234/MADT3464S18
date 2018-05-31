/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramanpreet
 */
public class HelloWorld {
    public static void main(String args[]){
        System.out.println("Hello Java");
    

int n1 = 10;
if(n1 % 2 == 0){
System.out.println("even");
}else{
System.out.println("odd");
}
char pass ='A';
switch(pass){
    case 'A':
        System.out.println("Adult pass : valid pass");
        break;
    case 'S':
         System.out.println("Student pass : valid pass");
         break;
    case 'O':
         System.out.println("Senior Citizen : valid pass");
         break;
    default:
         System.out.println("Invalid pass");
         break;
}
char pass1 = 'A';
switch(pass){
    case 'A':
    case 'S':
    case 'O':
        System.out.println("Valid pass");
        break;
    default:
        System.out.println("Invalid pass");
        break;
}
n1 = 20;
while(n1>10){
    System.out.println("Beyond Limit");
    n1++;
do{
    System.out.println("n1:" +n1);
    n1--;
}while (n1>10);
    }
int i;
for(i=0; i<5; i++){
    System.out.println("i: " +i);
}
 for(i=1; i<5; i++){   
    for(int j=1; j<5; j++){
        System.out.println(" * ");
    }
    int numbers[] = new int[5];
    numbers[0] = 10;
    System.out.println("number[0]: " +numbers[0]);
    for(i=0; i<5; i++){
        numbers[i] = (i+1);
        System.out.println("number[" +i + "]); " +numbers[i]);
    }
    }
            
    }
    
}

        
        
        
}
        
    

