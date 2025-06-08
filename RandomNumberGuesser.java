/* Guess a randomly generated number between 1-10 */

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuesser {
    public static void main(String[] args) {
        // Declares variable to store number of attempts
        int attempts = 0;

        Random random = new Random();           // Create a Random object to generate random numbers
        Scanner input = new Scanner(System.in); // Create a Scanner object to handle user input

        // Generates a random number from 1 to 10 (inclusive)
        int randomInt = random.nextInt(10) + 1;

        while (true) {
            // Prompts user to guess, storing the inputted guess
            System.out.print("Guess a random integer between 1-10: "); 
            int guess = input.nextInt(); 

            // Increments attempt
            attempts++;

            // Checks if the user guessed correctly, ending the program if so with a congratulatory message
            if (guess == randomInt) {
                System.out.println("Congratulations! You correctly guessed the number was " + randomInt + " in only " + attempts + " guesses!");
                break;
            }
        }

        // Close scanner object
        input.close();
    }
}
