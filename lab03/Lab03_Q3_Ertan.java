/**
 * 
 * 
 * 
 * 
 */
import java.util.Scanner;

public class Lab03_Q3_Ertan {
    public static void main(String[] args)
{

        final String ANIMAL = "animal";
        final String MINERAL = "mineral";
        final String VEGETABLE = "vegetable";
        final String NO = "no";
        final String YES = "yes";

        Scanner input;
        String first;
        String second;
        

        input = new Scanner(System.in);
        System.out.print("Is the object an Animal/Vegetable/Mineral? \nAnswer: ");

        first = input.next();
        first.toLowerCase();

        if (first.equals(ANIMAL)){
            System.out.println("Is the object bigger than a shoe box? ");
            second = input.next();
            second.toLowerCase();
            input.close();
            if (second.equals(YES)){
                System.out.println("I know, it's a squirrel!");
            }
            else if (second.equals(NO)){
                System.out.println("I know, it's a elephant!");
            }
            else{
                System.out.printf("I don't understand, \"%s\" is not a valid answer.",second);
            }
        }
         else if (first.equals(MINERAL)){
            System.out.print("Is the object bigger than a shoe box? ");
            second = input.next();
            second.toLowerCase();
            input.close();
            if (second.equals(NO)){
                System.out.println("I know, it's a pencil!");
            }
            else if (second.equals(YES)){
                System.out.println("I know, it's a bus!");
            }
            else{
                System.out.printf("I don't understand, \"%s\" is not a valid answer.",second);
            }
        }
         else if (first.equals(VEGETABLE)){
            System.out.print("Is the object bigger than a shoe box? ");
            second = input.next();
            second.toLowerCase();
            input.close();
            if (second.equals(NO)){
                System.out.println("I know, it's a carrot!");
            }
            else if (second.equals(YES)){
                System.out.println("I know, it's a pumpkin!");
            }
            else{
                System.out.printf("I don't understand, \"%s\" is not a valid answer.",second);
            }
        }
         else{
            input.close();
            System.out.printf("I don't understand, \"%s\" is not a valid answer.",first);
            }
        }
}
