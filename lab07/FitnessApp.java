/**
 * FitnessApp
 */
import java.util.Scanner;

public class FitnessApp {
    public static void main(String[] args) {
    //Declare inputs
    int flag;
    double height;
    double weigth;
    double restingHeartRate;
    double waist;
    double hip;
    char gender;
    String birthdate;

    String menu = "\n--------------MENU--------------\n1 - Calculate Target Heart Rate\n2 - Calculate Waist/Hip Ratio\n3 - Body Mass Index\n4 - Display Fitness Level\n5 - Quit\n";

    Scanner input = new Scanner(System.in);

    System.out.print("Enter birthdate (YYYY-MM-DD): ");
    birthdate = input.next();

    System.out.print("Enter gender (f)emale/(m)ale: ");
    gender = input.next().charAt(0);

    System.out.print("Enter height(m) weight(kg): ");
    height = input.nextDouble();
    weigth = input.nextDouble();

    System.out.print("Enter waist and hip measurments (cm): ");
    waist = input.nextDouble();
    hip = input.nextDouble();

    System.out.print("Enter resting heart rate: ");
    restingHeartRate = input.nextDouble();

    FitnessAssesment persona = new FitnessAssesment(height, weigth, restingHeartRate, waist, hip, gender, birthdate);

    System.out.println(persona.getGender()+ " " + persona.getHeight()+ " " + persona.getHips()+ " " + persona.getRestingHR());
    
    do {
        System.out.print(menu + "Enter choice : ");
        flag = input.nextInt();
        if (flag == 1)
        {
            System.out.printf("Target heart rate : %.1f",persona.calculateTargetHeartRate());
        }
        else if (flag == 2)
        {
            System.out.printf("Waist/hip ratio : %.1f",persona.calculateWaistHipRatio());
        }
        else if (flag == 3)
        {
            System.out.printf("Your BMI is : %.1f Category : %s",persona.calculateBMI(),persona.findBMICategory());
        }
        else if (flag == 4)
        {
            System.out.printf("Your fitness level is: %s",persona.determineFitnessLevel());
        }
    } while (flag != 5);

    input.close();
    }
}