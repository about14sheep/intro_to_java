package chapterthree;

import java.util.Scanner;

public class SortThreeIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int numberOne = input.nextInt();
        int numberTwo = input.nextInt();
        int numberThree = input.nextInt();

        if (numberOne > numberTwo) {
            int temp = numberTwo;
            numberTwo = numberOne;
            numberOne = temp;
        }

        if (numberThree < numberTwo) {
            int temp = numberThree;
            numberThree = numberTwo;
            numberTwo = temp;
        }

        if (numberTwo < numberOne) {
            int temp = numberTwo;
            numberTwo = numberOne;
            numberOne = temp;
        }

        System.out.println(numberOne + " " + numberTwo + " " + numberThree);
    }
}
