/**
 * Lab05_Q1
 */

import java.util.Scanner;
public class Lab05_Q1 {

    public static void main(String[] args) {
        int flag;
        int specialNumber;
        String checker;
        Scanner input = new Scanner(System.in);

        do {
            double specialNumberOperation = 0;
            int stepNumber = 0;
            int sum = 0;
            int checkers = 1;
            String word = "";
            System.out.print("Menu:\n\t1 - Special Number\n\t2 - Vowel Word\n\t3 - Quit\nEnter choice: ");
            flag = Integer.valueOf(input.next());
            if (flag == 1){
                do {
                    System.out.print("Enter number: ");
                    specialNumber = input.nextInt();
                    specialNumberOperation = specialNumber;
                    for(int i = 1;specialNumberOperation > 0; i++){
                        specialNumberOperation = (int) specialNumberOperation/10;
                        stepNumber = i;
                    }
                } while (stepNumber != 4);
                specialNumberOperation = specialNumber;
                for(int i = 1;specialNumberOperation > 0;i++){
                    sum += (specialNumberOperation % 10)*Math.pow(10,stepNumber-i);
                    specialNumberOperation = (int) specialNumberOperation / 10;
                }
                if (specialNumber * 4 == sum){
                    System.out.printf("%d is a very special number indeed.\n",specialNumber);
                }
                else {
                    System.out.printf("%d is not that very special.\n",specialNumber);
                }
            }
            else if (flag ==2){
                System.out.print("Enter WORD: ");
                word = input.next();
                for(int i=0; i +1 <= word.length();i++){
                    checker = word.substring(i, i+1);
                    if (checker.equalsIgnoreCase("a")){
                        checkers = checkers * 2;
                    }
                    else if (checker.equalsIgnoreCase("e")){
                        checkers = checkers * 3;
                    }
                    else if (checker.equalsIgnoreCase("i")){
                        checkers = checkers * 5;
                    }
                    else if (checker.equalsIgnoreCase("o")){
                        checkers = checkers * 7;
                    }
                    else if (checker.equalsIgnoreCase("u")){
                        checkers = checkers * 11;
                    }
                    }
                if( checkers % 2*3*5*7*11 == 0){
                    System.out.printf("%s is a vowel word!\n",word);
                }
                else{
                    System.out.printf("%s is not a vowel word!\n",word);
                }
            }
            else if (flag == 3){
                break;
            }
        } while (flag != 3);
        input.close();
        System.out.println("GOODBYE!");
    }
}
