package chaptertwo;

import java.util.Scanner;

public class PopulationProjection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int numberOfYears = input.nextInt();
        int currentPopulation = 312032486;
        int numberOfDays = numberOfYears * 365;
        int numberOfSeconds = ((numberOfDays * 24) * 60) * 60;
        double births = numberOfSeconds / 7.0;
        double deaths = numberOfSeconds / 13.0;
        double immigrants = numberOfSeconds / 45.0;
        double populationChange = currentPopulation - deaths + births + immigrants;
        System.out.println("In " + numberOfYears + " years the population will be " + (int)populationChange);

    }
}
