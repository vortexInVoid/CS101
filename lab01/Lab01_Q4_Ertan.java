import java.lang.Math;
/**
 * Lab01_Q4_Ertan
 */
public class Lab01_Q4_Ertan {

    public static void main(String[] args) {

     //Declaring constants

     //Golden ratio

    final double fibonacciConstant = (1+Math.sqrt(5))/2;

     //nth number

     int sequenceNumber = 100;

     //Function that estimates the nth number

     double fibonacciSeries = (Math.pow(fibonacciConstant,sequenceNumber) - Math.pow(fibonacciConstant,-sequenceNumber))/Math.sqrt(5);

     //Long value is not big enough but a double seems to be enough

     //fibonacciSeries = (long) fibonacciSeries;

     //Output

     System.out.println("Fibonacci (" + sequenceNumber + ") is " + fibonacciSeries);

    }
}