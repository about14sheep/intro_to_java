package chapterthree;

import java.util.Scanner;

public class HeadsOrTails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1 for heads or 0 for tails: ");
        int guess = input.nextInt();
        int flip = (int)(Math.round(Math.random()));

        String headsOrTails = flip == 1 ? "Heads" : "Tails";

        System.out.println("It was " + headsOrTails + (guess == flip ? " you win!" : " you lose!"));
    }
}
