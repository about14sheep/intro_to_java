package chapterthree;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter choice (0 = Scissor, 1 = Rock, 2 = Paper): ");
        int choice = input.nextInt();
        int compChoice = (int)(Math.random() * 3);
        String userString = switch (choice) {
            case 1 -> "Rock";
            case 2 -> "Paper";
            default -> "Scissor";
        };
        String compString = switch (compChoice) {
            case 1 -> "Rock";
            case 2 -> "Paper";
            default -> "Scissor";
        };

        String outcome = switch (choice) {
            case 1 -> compChoice == 1 ? "draw" : compChoice == 0 ? "win" : "lost";
            case 2 -> compChoice == 2 ? "draw" : compChoice == 1 ? "win" : "lost";
            default -> compChoice == 0 ? "draw" : compChoice == 2 ? "win" : "lost";
        };

        System.out.print(userString + "(you)" + " vs " + compString + "(computer)" + ": You " + outcome + "!");
    }
}
