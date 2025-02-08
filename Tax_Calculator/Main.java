import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double income = getIncome(input);
        double tax = calculateTax(income);
        printResult(income, tax);
        input.close();
    }

    private static double getIncome(Scanner input) {
        while (true) {
            try {
                System.out.print("Enter your annual income: ");
                return input.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                input.next(); // Clear invalid input
            }
        }
    }

    private static double calculateTax(double income) {
        if (income <= 0) {
            return 0;
        } else if (income <= 400000) {
            return 0;
        } else if (income <= 800000) {
            return income * 0.05;
        } else if (income <= 1200000) {
            return income * 0.10;
        } else if (income <= 1600000) {
            return income * 0.15;
        } else if (income <= 2000000) {
            return income * 0.20;
        } else if (income <= 2400000) {
            return income * 0.25;
        } else {
            return income * 0.30;
        }
    }

    private static void printResult(double income, double tax) {
        System.out.printf("Total income: %.2f%n", income);
        System.out.printf("Tax: %.2f%n", tax);
    }
}