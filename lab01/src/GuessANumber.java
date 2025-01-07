import java.util.Random;
import java.util.Scanner;

public class GuessANumber
{

    public static void main(String[] args)
    {
        Random rand = new Random();
        // This produces a random number between 1 and 10
        // rand.nextInt(10) produces a number between 0 and 9
        // and then adding 1 makes it between 1 and 10
        int secretNumber = rand.nextInt(10) + 1;
        
        // this reads input from the user that they type into
        // the Terminal (sometimes also called the Console)
        Scanner scanner = new Scanner(System.in);

        // start guess at 0 since 0 is not between 1 and 10
        // this ensures that the while loop will run at least once
        int guess = 0;
        while (guess != secretNumber)
        {
            System.out.println("Guess the secret number between 1 and 10: ");
            guess = scanner.nextInt();
            System.out.println("The guess is " + guess);
        }
        System.out.println("You guessed the secret number!");
    }
    
}
