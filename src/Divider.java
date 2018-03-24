
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
            
        // Implement your program here. Remember to ask the input from user.
        System.out.print("Type a number:  ");
        int a = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type a number:  ");
        int b = Integer.parseInt(reader.nextLine());
        
        double result = 1.0 * a / b;
        
        System.out.print("Division:  " + a + " / " + b + " = " + result);
                
    }
}
