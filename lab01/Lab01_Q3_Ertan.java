
/**
 * Lab01_Q3_Ertan
 * İnputs x and outputs y for the given function.
 */
import java.lang.Math;
public class Lab01_Q3_Ertan {

    public static void main(String[] args) {

        int x = -5;

        //Evaluates the expression

        double y = (Math.pow(x,3)+3*Math.abs(x)+9)/Math.pow(x,2);

        //Converting to integer to remove decimal figures

        System.out.println("The result of expression is: " + Math.round(y));
    }
}