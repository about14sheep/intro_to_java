package chaptertwo;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius cylinder: ");
        double radius = input.nextDouble();
        System.out.print("Enter the length of a cylinder: ");
        double length = input.nextDouble();
        double area = radius * radius * 3.14159;
        double volume = area * length;
        System.out.println("The area is: " + area);
        System.out.println("The volume is: " + volume);
    }
}
