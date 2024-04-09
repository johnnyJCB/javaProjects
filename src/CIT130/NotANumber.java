package CIT130;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NotANumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double number;

        try {
            System.out.println("Enter a number");
            number = scan.nextDouble();
            System.out.printf("The number is %f", number);
        }
        catch (InputMismatchException ex) {
            System.out.println("That was not a number, but it did not crash");
        }
    }
}
