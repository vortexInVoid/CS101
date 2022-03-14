/**
 * lab04_Q2
 */
import java.util.Scanner;

public class lab04_Q2 {

    public static void main(String[] args) {
        String comparendFirst;
        String compareSecond;
        String complete;

        int blockSize;
        blockSize = 0;

        Scanner input;
        System.out.print("Input string: ");

        input = new Scanner(System.in);
        complete = input.nextLine();
        complete = complete.replaceAll("[^A-Za-z ]", "");
        input.close();
        
        comparendFirst = complete.substring(0, complete.indexOf(" "));

        while(!complete.equals("")){

            complete = complete.replaceFirst(comparendFirst,"");
            complete = complete.trim();

            compareSecond = comparendFirst;

            if (complete.indexOf(" ") > -1){
                comparendFirst = complete.substring(0, complete.indexOf(" "));
            }
            else {
                comparendFirst = complete.substring(0, complete.length());
            }
            if ( comparendFirst.length() > compareSecond.length() && !comparendFirst.matches(".*\\d.*")){
                blockSize = comparendFirst.length();
            }
        }
        if (blockSize <=0){
            System.out.print("-> longest block is zero");
        }
        else{
            System.out.print("-> longest block is " + blockSize);
        }
    }
}