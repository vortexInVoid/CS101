/**
 * part_I
 */

import java.util.Scanner;
import java.util.ArrayList;

public class part_I {

    static Scanner input;

    public static void main(String[] args) {

        ArrayList<Integer> TransformedSet = new ArrayList<Integer>();
        ArrayList<Integer> set = new ArrayList<Integer>(fillList());
        System.out.print("Enter divisor: ");

        input = new Scanner(System.in);
        int divisor = input.nextInt();
        input.close();
        
        //ArrayList<Integer> k = new ArrayList<Integer>(fillList());
        //System.out.println(k.equals(set));
        sumDivisible(TransformedSet, set, divisor);
        System.out.println("List: " + set);
        System.out.println("Sum List: " + TransformedSet);
        removeDuplicates(TransformedSet);
        System.out.println("Sum List (no duplicates): " + TransformedSet);

    }

    //Question to Mr Ali ;; By declaring a new scanner are not we creating a new scanner each time? Is this a resource leakage?? Also, after closing the scanner it cannot be opened!
    public static ArrayList<Integer> fillList(){
        System.out.print("Please enter the values: ");
        input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //Input the values
        while (input.hasNextInt()) {
            numbers.add(input.nextInt());
        }
        //Should we close it???
        //scan.close();
        //input.close();
        return numbers;
    }
    
    public static void sumDivisible(ArrayList<Integer> tSet,ArrayList<Integer> set,int divisionFactor){
        int sum = 0;
        for(int i = 0;i<set.size();i++){
            if (set.get(i) % divisionFactor == 0){
                sum += set.get(i);
                tSet.add(sum);
            }
            else{
                tSet.add(sum);
            }
        }
    }

    public static void removeDuplicates(ArrayList<Integer> input){
        ArrayList<Integer> dummy = new ArrayList<Integer>();
        
        boolean present;
        int i= 0;
        while (i<input.size()) {
            present = false;
            for(int num : dummy){
                if(num == input.get(i)){
                    present = true;
                }
            }
            /*
            for(int j = 0;j<dummy.size();j++){
                if(dummy.get(j) == input.get(i)){
                    System.out.println(dummy.get(j)+" "+input.get(i)+" "+dummy.size());
                    present = true;
                }
            }
            */
            if (!present){
                dummy.add(input.get(i));
            }
            //System.out.println(dummy+" "+dummy.size());
            i++;
            }
            input.clear();
            input.addAll(dummy);
        }
    }