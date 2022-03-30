/**
 * lab06_Q1
 * 
 * Murat Ertan
 */
import java.util.Scanner;
public class lab06_Q1 {

    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        String thing = "";
        do {
            System.out.print("Enter a string : ");
            thing = input.nextLine().toUpperCase();
            if(!isAlphaWord(thing)){
                System.out.println("Characters must be alphabetic...");
            }
            else{
                System.out.println("Soundex : " + getSoundex(thing));
            }
        } while(!thing.equalsIgnoreCase("exit"));
        input.close();
    }

    public static boolean isAlphaWord(String x)
    {
        boolean condition = true;
        for (int i = 0; i < x.length();i++){
            condition = Character.isAlphabetic(x.charAt(i));
            if (condition == false){
                break;
            }
        }
        return condition;
    }
    public static int getCode(char letter)
    {
        String comparand = "BFPVCGJKQSXZDTLMNR";
        for(int i = 0; i < comparand.length();i++)
            if (Character.compare(comparand.charAt(i),letter) == 0 && i<4){
                return 1;
            }
            else if (Character.compare(comparand.charAt(i),letter) == 0 && i<12){
                return 2;
            }
            else if (Character.compare(comparand.charAt(i),letter) == 0 && i<14){
                return 3;
            }
            else if (Character.compare(comparand.charAt(i),letter) == 0 && i<15){
                return 4;
            }
            else if (Character.compare(comparand.charAt(i),letter) == 0 && i<17){
                return 5;
            }
            else if (Character.compare(comparand.charAt(i),letter) == 0 && i<18){
                return 6;
            }
        return -1;
    }
    public static String buildCode(String x)
    {
        char characterOfCode;
        String output = "";
        for(int i = 0;i<x.length();i++){
            characterOfCode = x.charAt(i);
            if(getCode(characterOfCode) == -1){
                output = output + x.charAt(i);
            }
            else{
                output = output + Integer.toString(getCode(characterOfCode));
            }
        }
        return output;
    }
    public static String removeAdjacentDuplicates(String x)
    {
        String output = " ";
        int i = 0;
        int j = 0;
        while (i < x.length()){
            if(x.charAt(i) == output.charAt(j)){
            }
            else if (x.charAt(i) != output.charAt(j)){
                output = output + x.charAt(i);
                j++;
            }
            i++;
        }
        return output.trim();
    }
    public static String removeLetters(String remove,String from)
    {
        String output = "";
        for(int i = 1;i<=from.length();i++){
            if( from.substring(i-1,i).equals(remove)){
            }
            else{
                output = output.concat(from.substring(i-1,i));
            }
        }
        return output;
    }
    public static String padCode(String code)
    {
        while(code.length() != 4){
            if(code.length()<4){
                code = code.concat("0");
            }
            else {
            code = code.substring(0, 4);
            }
        }
        return code;
    }
    public static String getSoundex(String codeToSoundex)
    {
        String soundex = "";
        if(isAlphaWord(codeToSoundex)){
            codeToSoundex = removeAdjacentDuplicates(codeToSoundex);
            soundex = soundex + codeToSoundex.charAt(0);
            codeToSoundex = codeToSoundex.substring(1,codeToSoundex.length());
            codeToSoundex = (buildCode(codeToSoundex));

            for(int i=0;i<=7;i++){
                String deleting = "HWYAEIOU";
                codeToSoundex = removeLetters(deleting.substring(i,i+1), codeToSoundex);
            }

            soundex = soundex.concat(codeToSoundex);
            //soundex = removeAdjacentDuplicates(soundex);
            soundex = padCode(soundex);
        }
        return soundex;    
    }
}