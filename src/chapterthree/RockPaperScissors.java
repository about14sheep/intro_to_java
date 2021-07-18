package chapterthree;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter choice (0 = Scissor, 1 = Rock, 2 = Paper): ");
        int choice = input.nextInt();

        String userString = switch (choice) {
            case 0 -> "Scissors";
            case 1 -> "Rock";
            case 2 -> "Paper";
            default -> throw new Exception(choice + " is not a valid value, read prompt");
        };

        int compChoice = (int)(Math.random() * 3);

        String compString = switch (compChoice) {
            case 1 -> "Rock";
            case 2 -> "Paper";
            default -> "Scissors";
        };

        String outcome = switch (choice) {
            case 1 -> compChoice == 1 ? "draw" : compChoice == 0 ? "win" : "lost";
            case 2 -> compChoice == 2 ? "draw" : compChoice == 1 ? "win" : "lost";
            default -> compChoice == 0 ? "draw" : compChoice == 2 ? "win" : "lost";
        };

        System.out.print(userString + "(you)" + " vs " + compString + "(computer)" + ": You " + outcome + "!");
    }
}
