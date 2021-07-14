package chapterthree;

import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();

        int remainingAmount = (int)(amount * 100);

        int numberOfDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int numberOfNickles = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int numberOfPennies = remainingAmount;

        System.out.println("Your amount " + amount + " consists of:");
        System.out.println(" " + numberOfDollars + (numberOfDollars == 1 ? " Dollar " : " Dollars "));
        System.out.println(" " + numberOfQuarters + (numberOfQuarters == 1 ? " Quarter " : " Quarters "));
        System.out.println(" " + numberOfDimes + (numberOfDimes == 1 ? " Dime " : " Dimes "));
        System.out.println(" " + numberOfNickles + (numberOfNickles == 1 ? " Nickle " : " Nickles "));
        System.out.println(" " + numberOfPennies + (numberOfPennies == 1 ? " Penny " : " Pennies "));
    }
}
