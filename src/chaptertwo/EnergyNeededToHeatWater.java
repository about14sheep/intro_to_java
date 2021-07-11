package chaptertwo;

import java.util.Scanner;

public class EnergyNeededToHeatWater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms: ");
        double water = input.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double temp = input.nextDouble();
        System.out.print("Enter the final temperature: ");
        double finalTemp = input.nextDouble();
        double energyNeeded = water * (finalTemp - temp) * 4184;
        System.out.println("The energy needed is " + energyNeeded);
    }
}
