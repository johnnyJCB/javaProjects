package CIT130;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BadInput {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num;
        boolean isInt = false;

    do {
        try {
            do {
                System.out.println("Enter a positive number");
                num = scan.nextInt();
            } while (num <= 0);

            isInt = true;

            System.out.println(num + " is positive");
        } catch (InputMismatchException ex) {
            System.out.println("Needs to be integer");
            scan.nextLine();
        }
    }while(!isInt);
    }
}
