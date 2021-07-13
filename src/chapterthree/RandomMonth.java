package chapterthree;

import java.util.Scanner;

public class RandomMonth {
    public static void main(String[] args) {
        int monthNumber = (int)(Math.random() * 12 + 1);
        String month = switch (monthNumber) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            default -> "December";
        };

        System.out.println(month);

    }
}
