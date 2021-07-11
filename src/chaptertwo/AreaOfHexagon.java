package chaptertwo;

import java.util.Scanner;

public class AreaOfHexagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the side: ");
        double length = input.nextDouble();
        double area = ((3 * Math.sqrt(3)) / 2) * Math.pow(length, 2);
        System.out.println("The are of the hexagon is " + area);
    }
}
