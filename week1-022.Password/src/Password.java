
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "bondi"; // Use carrot as password when running tests.

    while (true) {
        System.out.print("Type the password:  ");
        String guess = reader.nextLine();
        if (guess.equals(password)) {
            System.out.println("Right!");
            break;
        } else {
            System.out.print("Wrong!");
            
        }
        }
    System.out.println("The secret message is Maddie");
     
    }
}
