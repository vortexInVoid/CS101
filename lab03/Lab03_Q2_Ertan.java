
/**
 * Lab03_Q2_Ertan
 */
import java.util.Scanner;
public class Lab03_Q2_Ertan {

    public static void main(String[] args) {

        final String LIST_OF_PLANETS;
        final double PLANET_1 = 0.78;
        final double PLANET_2 = 0.39;
        final double PLANET_3 = 2.65;
        final double PLANET_4 = 1.17;
        final double PLANET_5 = 1.05;
        final double PLANET_6 = 1.23;

        int choice;

        double weigth;

        boolean invalidWeigth;
        boolean invalidChoice;

        Scanner input;

        LIST_OF_PLANETS = "1-Venus\n2-Mars\n3-Jupiter\n4-Saturn\n5-Uranus\n6-Neptune";

        input = new Scanner(System.in);

        System.out.print("Enter your weight: ");
        weigth = input.nextDouble();

        invalidWeigth = (weigth <= 0);
        
        if (invalidWeigth){
            System.out.println("Invalid weigth! quitting.....");
            input.close();
        }
        else{
            System.out.print(LIST_OF_PLANETS + "\n" + "Choice: ");
            choice = input.nextInt();

             input.close();

            invalidChoice = (0 >= choice) || (choice > 6);

             if (invalidChoice){
                System.out.println("Invalid choice!! quitting.....");
           }
            else if (choice == 1){
                weigth = weigth * PLANET_1;
                System.out.printf("Your weigth on planet %d is %.1f.",choice,weigth);
            }
            else if (choice == 2){
                weigth = weigth * PLANET_2;
                System.out.printf("Your weigth on planet %d is %.1f.",choice,weigth);
            }
            else if (choice == 3){
                weigth = weigth * PLANET_3;
                System.out.printf("Your weigth on planet %d is %.1f.",choice,weigth);
            }
            else if (choice == 4){
                weigth = weigth * PLANET_4;
                System.out.printf("Your weigth on planet %d is %.1f.",choice,weigth);
            }
            else if (choice == 5){
                weigth = weigth * PLANET_5;
                System.out.printf("Your weigth on planet %d is %.1f.",choice,weigth);
            }
            else if (choice == 6){
                weigth = weigth * PLANET_6;
                System.out.printf("Your weigth on planet %d is %.1f.",choice,weigth);
            } 
            else{
                System.out.println("ERROR quitting.....");
            }
        }

    }
}