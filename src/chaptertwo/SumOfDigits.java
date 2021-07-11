package chaptertwo;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        int firstValue = number % 10;
        number = number / 10;
        int secondValue = number % 10;
        number = number / 10;
        int sum = firstValue + secondValue + number;
        System.out.println("The sum of the digits is " + sum);
    }
}
