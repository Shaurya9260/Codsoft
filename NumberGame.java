import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int guess;
        int attempts = 0;

        System.out.println("Guess the number between 1 and 100:");

        do {
            guess = sc.nextInt();
            attempts++;
            if (guess < numberToGuess) {
                System.out.println("Too low, try again!");
            } else if (guess > numberToGuess) {
                System.out.println("Too high, try again!");
            } else {
                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
            }
        } while (guess != numberToGuess);

        sc.close();
    }
}
