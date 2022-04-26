import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 * FlashCardApp
 */
public class FlashCardApp {

    public static void main(String[] args) throws FileNotFoundException {

        String menu = "1 - Play Game \n2 - View Player Information \n3 - Quit\nChoice: ";

        ArrayList<Player> allPlayers = new ArrayList<Player>();
        
        int x = -1;
        FlashCardQuiz.devour = new Scanner(System.in);

        do {

            System.out.print(menu);
            x = FlashCardQuiz.devour.nextInt();
            //System.out.println("\n");

            if (x == 1){

            System.out.print("Player name: ");
            String name = FlashCardQuiz.devour.next();
            Boolean present = false;
            Player dummy = null;

            for(Player players:allPlayers){
                if (players.getPlayerName().equals(name)){
                    present = true;
                    dummy = players;
                }
            }

            if (present){
                //FlashCardQuiz dummy1 = new FlashCardQuiz(dummy, "turkish_english_words.txt");
                //dummy1.takeQuiz();
            }
            else{
                dummy = new Player(name);
                allPlayers.add(dummy);
                //FlashCardQuiz dummy1 = new FlashCardQuiz(dummy, "turkish_english_words.txt");
                //dummy1.takeQuiz();
            }
            FlashCardQuiz dummy1 = new FlashCardQuiz(dummy, "turkish_english_words.txt");
            dummy1.takeQuiz();


            }

            else if ( x ==2){
                System.out.print("Player name: ");
                String name = FlashCardQuiz.devour.next();

                for(Player players:allPlayers){
                    if (players.getPlayerName().equals(name)){
                        System.out.println(players.toString());
                    }
                }
            }
            System.out.print("\n");

            
        } while (x != 3);
        FlashCardQuiz.devour.close();
    }
}