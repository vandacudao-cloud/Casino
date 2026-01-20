import java.util.Scanner;
public class Bank {
    Scanner scan; // set no value but after the constructor is called it will now set to a object
    String bankname = "Mark";
    int bankmoney   = 100;
    
    /*
    Bank(Scanner scan){
        this.scan = scan;  // the value of scanner in the main will be passed to this scan

     //--we can use this anytime
    }
    */

    void setscan(Scanner scan){
        this.scan = scan;
    }
    
    void bankshow1(){
        System.out.println("----------------------------");
        System.out.println("[BANK ACCOUNT]");
        System.out.println("[NAME : "+this.bankname+" ]");
        System.out.println("[MONEY: "+this.bankmoney+" ]");
        System.out.println("----------------------------");
        String halo = scan.nextLine();
        System.out.println(halo);
        System.out.println("not work");
        
        //AFTER HERE THERE SHOULD BE SCANNER WHEN USER PRESS ENTER IT PROCED TO NEXT
    }  
}
