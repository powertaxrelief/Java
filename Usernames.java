
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
    System.out.print("Type your username:  ");
    String user = reader.nextLine();
    
    System.out.print("Type your password:  ");
    String password = reader.nextLine();
    
    if (user.equals("alex") && password.equals("mightyducks")) {
        System.out.print("You are now logged into the system!");
    } else if (user.equals("emily") && password.equals("cat")) {
        System.out.print("You are now logged into the system!"); 
    } else { System.out.print("You rusername or passwrd was invalid!");
    }
    }
}
