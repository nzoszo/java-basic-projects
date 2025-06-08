/* Calculate wage based on hourly wage and number of hours worked (includes overtime) */

import java.util.Scanner;

public class PaycheckCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to handle user input
        Scanner input = new Scanner(System.in);

        // Gets hourly wage for regular and overtime
        System.out.print("Please input your hourly wage: "); // Prompts input while on the same line
        double hourlyWage = input.nextInt(); // Reads an integer

        System.out.print("Please input your hourly, overtime wage: ");
        double overtimeHourlyWage = input.nextInt();
        
        // Gets number of regular and overtime hours worked
        System.out.print("Enter the number of hours you worked: ");
        int hours = input.nextInt();
        
        System.out.print("Enter the number of hours overtime you worked: ");
        int overtimeHours = input.nextInt(); 

        // Calculates and prints wage
        double wage = (hours * hourlyWage) + (overtimeHours * overtimeHourlyWage);
        System.out.printf("Congratulations, your wage is $%.2f!\n", wage);

        // Close the scanner
        input.close();
    }
}