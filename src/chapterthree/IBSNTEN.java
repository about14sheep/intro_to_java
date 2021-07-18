package chapterthree;

import java.util.Scanner;

public class IBSNTEN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an IBSN as Integer: ");
        int ibsn = input.nextInt();
        int dNine = ibsn % 10;
        ibsn = ibsn / 10;
        int dEight = ibsn % 10;
        ibsn = ibsn / 10;
        int dSeven = ibsn % 10;
        ibsn = ibsn / 10;
        int dSix = ibsn % 10;
        ibsn = ibsn / 10;
        int dFive = ibsn % 10;
        ibsn = ibsn / 10;
        int dFour = ibsn % 10;
        ibsn = ibsn / 10;
        int dThree = ibsn % 10;
        ibsn = ibsn / 10;
        int dTwo = ibsn % 10;
        ibsn = ibsn / 10;

        int checkSum = (ibsn + (dTwo * 2) + (dThree * 3) + (dFour * 4) + (dFive * 5) + (dSix * 6) + (dSeven * 7) + (dEight * 8) + (dNine * 9)) % 11;

        System.out.println(ibsn + "" + dTwo + "" + dThree + "" + dFour + "" + dFive + "" + dSix + "" + dSeven + "" + dEight + dNine + "" + (checkSum == 10 ? "X" : checkSum));
    }
}
