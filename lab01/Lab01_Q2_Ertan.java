/**
 * Lab01_Q2_Ertan
 * This is the second program for the laboratory. It will reduce 12486 seconds to hours,minutes and seconds
 */
public class Lab01_Q2_Ertan {

    public static void main(String[] args) {

     // set the variable

     final int rawSeconds = 12486;

     //Defining 60 as a constant
     final int divConstant = 60;

     //Convert between time units

     //Find minutes to calculate hours

     int minutes = rawSeconds / divConstant;

     //Find hours

     int hours = minutes / divConstant;

     //Find exact minutes

     minutes = minutes % divConstant;

     //Find remaining seconds

     int endSeconds = rawSeconds % divConstant;

     //Declare the findings!!

     System.out.println(rawSeconds + " Seconds represent " + hours + " hours " + minutes + " minutes " + "and " + endSeconds + " seconds.");
     
    }
}