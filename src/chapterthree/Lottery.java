package chapterthree;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (three digits): ");
        int guess = input.nextInt();
        int lottery = (int)(Math.random() * 1000);

        int lDigit2 = (lottery / 10) % 10;
        int lDigit3 = lottery % 10;
        int lDigit1 = (lottery / 100) % 10;

        int guessDigit2 = (guess / 10) % 10;
        int guessDigit3 = guess % 10;
        int guessDigit1 = (guess / 100) % 10;

        boolean digitOneInLottery = guessDigit1 == lDigit1 || guessDigit1 == lDigit2 || guessDigit1 == lDigit3;
        boolean digitTwoInLottery = guessDigit2 == lDigit1 || guessDigit2 == lDigit2 || guessDigit2 == lDigit3;
        boolean digitThreeInLottery = guessDigit3 == lDigit1 || guessDigit3 == lDigit2 || guessDigit3 == lDigit3;

        if (guess == lottery) {
            System.out.println("Exact match: you win $10,000");
        } else if (digitOneInLottery && digitTwoInLottery && digitThreeInLottery) {
            System.out.println("Match all digits: you win $3,000");
        } else if (digitOneInLottery || digitTwoInLottery || digitThreeInLottery) {
            System.out.println("Match one digit: you win $1,000");
        } else {
            System.out.println("Sorry, no match");
        }

        System.out.print(" Lottery was " + lottery);

    }
}
