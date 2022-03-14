/**
 */
import java.util.Scanner;

public class lab04_Q3 {
    public static void main(String[] args) {
        
        Scanner input;
        int decimal;
        int decimalOutput;
        int k;
        int remainder = 0;
        char ch;
        String hex;
        String take;
        String dummy;
        String hexConvert;

        System.out.print("Enter binary number (exit to quit): ");
        input = new Scanner(System.in);
        take = input.nextLine();

        while(!take.equals("exit")){

            decimal =0;
            decimalOutput=0;
            k =0;
            hex = "";
            hexConvert ="#";

            while(take.length() > k){
                decimalOutput += Math.pow(2,k) * (Integer.valueOf(take.charAt((take.length()-k-1)))-48);
                k++;
            }
            decimal = decimalOutput;
            k = 0;
            while(decimal>=0){
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
                if (decimal==0){
                    break;
                }
            }
            while (hex.length() -k >= 1){
                hexConvert = hexConvert + (hex.charAt(hex.length()-k-1));
                k++;
            }
            System.out.printf("%-18s %-18s %-18s\n%-18s %-18d %-18s\n","Binary","Decimal","Hexadecimal",take,decimalOutput,hexConvert);
            System.out.print("Enter binary number (exit to quit): ");
            take = input.nextLine();
        }            
        input.close();
        
        
    }
    
}
