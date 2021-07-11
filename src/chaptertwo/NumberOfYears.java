package chaptertwo;

import java.util.Scanner;

public class NumberOfYears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();
        int hours = minutes / 60;
        int days = hours / 24;
        int remainingDays = days % 365;
        int years = days / 365;
        System.out.println(minutes + " minutes is " + years + " years and " + remainingDays + " days");

    }
}
