import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Random random = new Random();
        int guess= 0;
        int attempts =0;
        int randomNumber = random.nextInt(100) +1;
        System.out.println("NUMBER GUESSING GAME:");
        System.out.println("Guess Number Between 1-100");
        do{
            System.out.println("Enter Your Guess:");
            guess = sc.nextInt();
            attempts++;
            if( guess < randomNumber){
                System.out.println("Your Guess is Too Low");
            }
            else if( guess > randomNumber){
                System.out.println("Your Guess is Too High");
            }
            else {
                System.out.println("Correct!! You Won");
                System.out.println("Total Attempts: "+attempts );
            }

        }while( guess != randomNumber);
        sc.close();
    }
}
