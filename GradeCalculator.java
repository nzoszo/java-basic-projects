/* Calculate grade by averaging multiple test inputs */ 

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // Initalize variable that will contain final grade
        double sum = 0;

        // Create a Scanner object to handle user input
        Scanner input = new Scanner(System.in);

        // Gets number of tests taken
        System.out.print("Please input the number of tests you took: "); // Prompts input while on the same line
        int numberOfTests = input.nextInt(); // Reads an integer

        // Prompts for each test's grade while adding that grade to sum
        for (int i = 1; i <= numberOfTests; i++) {
            System.out.print("Input your grade for Test " + i + ": ");
            int testGrade = input.nextInt();

            sum += testGrade;
        }

        // Calculates final grade based on the added scores and number of tests taken
        double finalGrade = sum / numberOfTests;

        // Prints final grade to two decimal points
        System.out.printf("Your final grade is %.2f!\n", finalGrade);

        // Close the scanner
        input.close();
    }
}