package chaptertwo;

import java.util.Scanner;

public class CalculateFutureInvestmentValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double investment = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double percentage = (input.nextDouble() / 100) / 12;
        System.out.print("Enter number of years: ");
        double years = input.nextDouble();
        double value = investment * Math.pow(1 + percentage, years * 12);
        System.out.println("Future value is " + value);
    }
}
