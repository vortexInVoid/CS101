
import java.util.Scanner;

public class lab05_Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int width;
        String space = "";
        int m = 0;
        int summa = 0;
        boolean flag = false;

        do {
            System.out.print("Enter mountain width: ");
            width = input.nextInt();
        } while (width % 2 != 1);
        input.close();

        for(int i = 0; i <= width;i++){
            space = space.concat(" ");
        }

        for (int i = width; flag == false;i--){
            System.out.print(space);
            for(int k = m; k >=0;k--){
                System.out.print((i-k) + " ");
                summa += i-k;
                if ( i-k == 1){
                    flag = true;
                }
            }
            for(int k = 1; k <= m;k++){
                System.out.print((i-k) + " ");
                summa += i-k;
            }
            System.out.print("\n");
            space = space.substring(0,space.length()-2);
            m = m + 1;
        }
        System.out.printf("Weight of mountain with width of %d is %d",width,summa);
    }
}

