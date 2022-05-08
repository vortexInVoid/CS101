
import java.util.Scanner;
/**
 * Diary
 */
public class Diary {

    public static void main(String[] args) {

        int pageSize;
        int numberOfPages;
        int menu = -1;
        String dashes = "-----------------------------------------------------";
        String dummy;
        int pageCounter = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of pages: ");
        numberOfPages = scan.nextInt();
        System.out.print("Enter page size: ");
        pageSize = scan.nextInt();
        System.out.println(dashes);

        Notebook diary = new Notebook(numberOfPages, pageSize);

        do {
            System.out.print("What do you want to do?\n(1) Take a note\n(2) Browse notebook\n(3) Exit\nYour choice: ");
            menu = scan.nextInt();
            scan.nextLine();

            if (menu == 1)
            {
                System.out.print("Take note: ");
                dummy = scan.nextLine();
                if(pageCounter<numberOfPages)
                {
                diary.writeNote(dummy);
                pageCounter++;
                System.out.println(dashes);
                }
                else
                {
                    System.out.println("Notebook full! No pages remaining!");
                }
            }
            else if (menu == 2)
            {
                // Better to make void or the other way?
                diary.printNotebook();
                System.out.println(dashes);
            }
            
        } while (menu != 3);

        scan.close();
        System.out.println("GoodBye Asma! and Ali! Thanks for everything!!");

    }
}