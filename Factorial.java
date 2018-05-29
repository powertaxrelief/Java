import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter your number");
        int requested_num = Integer.parseInt(reader.nextLine());
        
        int loop_num = 1;
        int factored_num = 1;
        int total = 1;
        
        while (loop_num <= requested_num) {
            factored_num = (factored_num * loop_num);
            loop_num = loop_num + 1;
            total = total * factored_num;
        }
        System.out.println(factored_num);
    }
}
