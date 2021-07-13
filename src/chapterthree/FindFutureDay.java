package chapterthree;

import java.util.Scanner;

public class FindFutureDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int day = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsed = input.nextInt();
        int futureDay = day + elapsed;
        if (futureDay > 6) {
            futureDay = futureDay % 7;
        }
        String dayString = switch (day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            default -> "Saturday";
        };
        String futureDayString = switch (futureDay){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            default -> "Saturday";
        };
        System.out.println("Today is " + dayString + " and the future day is " + futureDayString);
    }
}
