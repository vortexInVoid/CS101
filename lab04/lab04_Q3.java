/**
 * 
 * 
 * 
 */

import java.util.Scanner;
import java.math.*;
import java.rmi.server.RMIClassLoader;

public class lab04_Q3 {
    public static void main(String[] args) {
        
        Scanner input;
        int decimal;
        int k;
        int remainder;
        char ch;
        String hex;
        String take;
        String dummy;
        String hexConvert;

        input = new Scanner(System.in);
        take = input.nextLine();

        while(!take.equals("exit")){
            hex = "#";
            decimal =0;
            k =0;
            hexConvert = "#";
            while(take.length() > k){
                decimal += Math.pow(2,k) * (Integer.valueOf(take.charAt((take.length()-k-1)))-48);
                k++;
            }
            System.out.println("Decimal:" + decimal);
            k = 0;
            while(decimal!=0){
                remainder = decimal % 16;

                if (remainder<= 15 && remainder >= 10){
                    ch = (char) (remainder + 55) ;
                    dummy = String.valueOf(ch);                    
                }
                else{
                    dummy = Integer.toString(remainder);
                }
                hex = hex.concat(dummy);
                decimal = decimal /16;

            }
            while (hex.length() -k >= 2){
                hexConvert = hexConvert + (hex.charAt(hex.length()-k-1));
                k++;
            }
            System.out.println("Hex:" + hexConvert);
            
            take = input.nextLine();


        }
        
        
    }
    
}
