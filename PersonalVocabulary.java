/* List of vocabulary words that can be appended or removed */

import java.util.ArrayList;
import java.util.Scanner;

public class PersonalVocabulary {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(); // Create a list of vocab words
        Scanner input = new Scanner(System.in);      // Creates new Scanner object to access input
        int choice;

        // Action prompts
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Learn");
            System.out.println("2. Add");
            System.out.println("3. Remove");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = input.nextInt();
            input.nextLine(); // Clears the newline character from the buffer

            // Switch case statement to handle actions
            switch (choice) {
                case 1: // See array of words
                    System.out.println(); // prints a blank line
                    for (int i = 0; i < words.size(); i++) {
                        System.out.println(words.get(i));
                    }
                    break;
                case 2: // Add a word
                    System.out.print("Please input your vocab word: ");
                    String addedWord = input.nextLine().trim().toLowerCase();

                    if (words.indexOf(addedWord) == -1) {
                        words.add(addedWord);
                        System.out.println(addedWord + " was added!");
                    }
                    else {
                        System.out.println(addedWord + " is already in the list!");
                    }
                    break;
                case 3: // Remove a word
                    System.out.print("Please input your vocab word: ");
                    String removedWord = input.nextLine().trim().toLowerCase();
                    
                    int index = words.indexOf(removedWord);
                    if (index != -1) {
                        words.remove(index);
                        System.out.println(removedWord + " was removed!");
                    }
                    else {
                        System.out.println(removedWord + " isn't in the list!");
                    }
                    break;
                case 4: // Exit
                    System.out.println("Excelsior! Keep learning new words!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose 1-4.");
            }
        } while (choice != 4); // Ends program

        input.close();
    }
}
