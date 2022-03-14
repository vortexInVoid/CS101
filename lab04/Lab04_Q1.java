
/**
 * Lab04_Q1
 */
import java.util.Scanner;

public class Lab04_Q1 {

    public static void main(String[] args) {
        
        String first;
        String second;
        String flag;
        
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter strings (exit to stop): ");
        
        flag = input.next();
        first = input.next();
        second = first;

        while (!flag.equalsIgnoreCase("exit")){
            if (flag.compareToIgnoreCase(first) < 0) {
                second = first;
                first = flag;
            }
            else if (flag.compareToIgnoreCase(second) < 0) {
                second = flag;
            }
            else if (first.equalsIgnoreCase("exit")){
                System.out.println("Not enough data!");
                break;
            }
            flag = input.next();
        }
        input.close();

        if (second.equals(first)){
            System.out.println("Not enough data!");
        }
        else{
            System.out.printf("String that comes second alphabetically: %s",second);
        }
    }
}