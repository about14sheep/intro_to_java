package chaptertwo;

import java.util.Scanner;

public class WindChillTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit between -58 and 41: ");
        double temp = input.nextDouble();
        System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
        double speed = input.nextDouble();
        double windChill = 35.74 + (0.6215 * temp) - (35.75 * Math.pow(speed, 0.16)) + (0.4275 * temp * Math.pow(speed, 0.16));
        System.out.println("The wind chill index is " + windChill);
    }
}