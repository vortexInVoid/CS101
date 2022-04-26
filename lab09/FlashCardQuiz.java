
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;

public class FlashCardQuiz {
    

    public static Scanner devour;
    private ArrayList<FlashCard> cardList = new ArrayList<FlashCard>();
    private ArrayList<FlashCard> quizlList = new ArrayList<FlashCard>();
    private Player player;

    public FlashCardQuiz(Player player,String fileName) throws FileNotFoundException
    {
        this.player = player;
        loadCards(fileName);
        initializeQuiz();
    }

    public void loadCards(String fileName) throws FileNotFoundException
    {
        //fileName = "\""+fileName+"\"";
        devour = new Scanner(new File(fileName));
        while (devour.hasNext()){
            String front = devour.next();
            String back = devour.next();
            int difficulty = devour.nextInt();

            FlashCard dummy = new FlashCard(front, back, difficulty);
            this.cardList.add(dummy);
        }
        //devour.close();
    }
    public void initializeQuiz()
    {
        int cardsNeeded;
        Random aynRand = new Random();

        devour = new Scanner(System.in);
        System.out.print("Enter the number of flash cards to generate: ");
        cardsNeeded = devour.nextInt();
        //devour.close();
        
        while (cardsNeeded != 0)
        {
            int johnGalt = aynRand.nextInt(this.cardList.size());
            if(!this.quizlList.contains(this.cardList.get(johnGalt)))
            {
                this.quizlList.add(this.cardList.get(johnGalt));
                cardsNeeded--;  
            }
        }
    }

    public void takeQuiz()
    {
        int runTime = this.quizlList.size() -1;
        int quizScore = 0;
        String playerResponse;
        FlashCard dummy;
        devour = new Scanner(System.in);

        while (runTime >= 0)
        {
            dummy = this.quizlList.get(runTime);
            dummy.showFlashCard();

            devour = new Scanner(System.in);

            System.out.print("Answer: ");
            playerResponse = devour.next();

            if (playerResponse.equals(dummy.getAnswer()))
            {
                System.out.println("Correct! ");
                quizScore++;
            }
            else 
            {
                System.out.println("Wrong Answer");
                dummy.flipFlashCard();
            }
            runTime--;
        }
        this.player.increaseGamesPlayed();
        this.player.setHighScore(quizScore);
        System.out.println("Your Score : "+Integer.toString(quizScore)+"/"+Integer.toString(quizlList.size()));
    }





}
