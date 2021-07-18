package chapterthree;

import java.util.Scanner;

public class PalindromeInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        int numberInput = input.nextInt();
        int number = Math.abs(numberInput);
        int lastDigit = number % 10;
        int firstDigit = (number / 100) % 10;
        boolean isPalindrome = lastDigit == firstDigit;
        System.out.println(numberInput + " is" + (isPalindrome ? " " : " not ") + "a Palindrome");
    }
}
