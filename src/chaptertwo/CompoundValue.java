package chaptertwo;

import java.util.Scanner;

public class CompoundValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double saving = input.nextDouble();
        double interest = (1 + 0.00417);
        double totalInterest = saving * interest;
        totalInterest = (saving + totalInterest) * interest;
        totalInterest = (saving + totalInterest) * interest;
        totalInterest = (saving + totalInterest) * interest;
        totalInterest = (saving + totalInterest) * interest;
        totalInterest = (saving + totalInterest) * interest;
        System.out.println("After six months, the account value is: " + totalInterest);
    }
}
