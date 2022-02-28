
/**
 * Takes a surname couple seperated by a dash and then depending on their first letter of surnames, determines the boarding group.
 * 
 */
 import java.util.Scanner;
 public class Lab03_Q1_Ertan {
 
     public static void main(String[] args) {

        // Define our data types
        char firstPassenger;
        char secondPassenger;
        final String X = "BOARDING GROUP ";
        String rawPassengerData;
        Scanner input;

        input = new Scanner(System.in);
        System.out.print("Please enter the surnames of passengers : ");

        rawPassengerData = input.next();
        input.close();
        
        //Time to extract DATA
        firstPassenger = rawPassengerData.charAt(0);
        secondPassenger = rawPassengerData.charAt(rawPassengerData.indexOf("-") +1);
        firstPassenger = (char) firstPassenger;
        secondPassenger = (char) secondPassenger;

        // Check for the given conditions using the ASCII codes. I could also define those statements as bools yet, this one works too

        if ( firstPassenger <= 71 || secondPassenger <= 71) {
            System.out.println(X+"1");   
        }
        else if (firstPassenger <= 80 || secondPassenger <= 80) {
            System.out.println(X+"2"); 
        }
        else if (firstPassenger <= 86 || secondPassenger <= 86) {
            System.out.println(X+"3"); 
        }
        else if (firstPassenger <= 91 || secondPassenger <= 91) {
            System.out.println(X+"4"); 
        }
        else{
            System.out.println("You have entered an invalid value.");
        }


        

















     }
 }