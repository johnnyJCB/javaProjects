/* Johnny J. Cheng #1520504
LabAssignment1 Control Structures*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class LabAssign1_Cheng {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###,###.00");
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the first whole number");
        int firstNumber = scan.nextInt();       // first number that user entered//

        System.out.println("Please enter the second whole number");
        int secondNumber = scan.nextInt();      // second number that user entered//

        System.out.println("What operation would you like to conduct with the 2 numbers provided? \n1 - addition \n2 - substraction\n" +
                "3 - multiplication \n4 - division \n5 - modulus");
        int operationSelection = scan.nextInt();    //reads the operation the user selected//
        int result = 0;

        if (operationSelection == 1) {      // user selects addition operation//
            result = firstNumber + secondNumber;
            System.out.println("Option selected: --> 1\n");
            System.out.println("The result of adding " + firstNumber + " to " + secondNumber + " is " + result);
        } else if (operationSelection == 2) {       // user selects subtraction operation//
            result = firstNumber - secondNumber;
            System.out.println("Option selected: --> 2\n");
            System.out.printf("The result of subtracting " + secondNumber + " from " + firstNumber + " is " + result);
        } else if (operationSelection == 3) {       // user selects multiplication operation//
            result = firstNumber * secondNumber;
            System.out.println("Option selected: --> 3\n");
            System.out.printf("The result of multiplying " + firstNumber + " from " + secondNumber + " is " + result);
        } else if (operationSelection == 4) {       // user selects division operation//
            System.out.println("Option selected: --> 4\n");
            if (secondNumber == 0) {        // user tried to divide by 0//
                System.out.println("Value Error, Division by 0 is not possible");
            } else {
                double doubleResult = (double) firstNumber/secondNumber;
                System.out.printf("The result of dividing %d by %d is %.2f", firstNumber, secondNumber, doubleResult);
//                double doubleResult = (double) firstNumber / secondNumber;
//                System.out.println("The result of dividing " + firstNumber + " by " + secondNumber + " is " + df.format(doubleResult));
            }
        } else if (operationSelection == 5) {
            System.out.println("Option selected: --> 5\n");
            if (secondNumber == 0) {        // user tries to modulus divide by 0//
                System.out.println("Value Error, Modulo division does not allow division by zero, Goodbye!");
            } else {
                result = firstNumber % secondNumber;
                System.out.printf("The result of %d modulus %d is %d", firstNumber, secondNumber, result);
            }
            } else{
                System.out.println("Invalid selection, Goodbye!");
            }
        }
    }


