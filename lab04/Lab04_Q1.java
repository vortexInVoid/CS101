
/**
 * Lab04_Q1
 */
import java.util.Scanner;

public class Lab04_Q1 {

    public static void main(String[] args) {
        
        String first = "noInput";
        String second = "noInput";
        String flag;
        boolean checker = false;
        
        Scanner input;
        input = new Scanner(System.in);

        System.out.println("Enter strings (exit to stop): ");

        flag = input.next();
        if (!flag.equalsIgnoreCase("exit"))
            first = input.next();
            if (first.equals("exit")){
                flag = "exit";
                checker = false;
            }
        else{
            checker = false;
        }

        while (!flag.equalsIgnoreCase("exit")){
            if (flag.compareToIgnoreCase(first) < 0) {
                second = first;
                first = flag;
            }
            else if (flag.compareToIgnoreCase(second) < 0) {
                second = flag;
            }
            if (!second.equalsIgnoreCase(first)){
                checker = true;
            }
            flag = input.next();
        }
        input.close();

        if (!checker){
            System.out.println("Not enough data!");
        }
        else{
            System.out.printf("String that comes second alphabetically: %s",second);
        }
    }
}