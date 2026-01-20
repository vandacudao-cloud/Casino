import java.util.Scanner;
public class Casino {
    String Player_name;
    int Player_money;
    Scanner scan;

    Casino(String Player_name){
        this.Player_name = Player_name;
        
    }

    void setscan( Scanner scan){
         this.scan = scan;
    }

    

    void casinomenu1(){
    System.out.println("\n\n\n\n\n------------------------------");
    System.out.println("         [CASINOMENU1]        ");
    System.out.println("\n Payername: "+this.Player_name);
    System.out.println(" Player Money: " + this.Player_money+"\n");
    System.out.println("TO WIDRAW = [WIDRAW]");
    System.out.println("TO DEPOSIT = [DEPOSIT]");
    System.out.println("TO BACK = [BACK]");
    System.out.println("------------------------------");
    }
    
}
