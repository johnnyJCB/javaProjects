/* Johnny J. Cheng #1520504
LabAssignment2 Refactoring, Looping, Characters, Methods*/

import java.util.List;
import java.util.Scanner;
public class LabAssign2_Cheng {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = getOperand(scan, "first");
        int num2 = getOperand(scan, "second");
//        DecimalFormat df = new DecimalFormat("#,###,###.00");
        List<Character> operList = List.of('+', '-', '*', '/', '%');
        int result;
        while (true) {
            System.out.println("""
                    What operation would you like to conduct with the 2 numbers provided?
                    + - addition
                    - - subtraction
                    * - multiplication
                    / - division
                    % - modulus""");
//            scan.nextLine(); ??? ask why weird output of scanner waiting for 2 inputs on 2nd time of wrong selection
            char operationSelection = scan.nextLine().charAt(0);
            if (!operList.contains(operationSelection)) {
                System.out.println("Invalid Selection!");
                continue; // restart loop if option not valid
            } else {
                if (operationSelection == '+') {      // user selects addition operation//
                    result = num1 + num2;
                    System.out.println("Option selected: --> +\n");
                    System.out.println("The result of adding " + num1 + " to " + num2 + " is " + result);
                } else if (operationSelection == '-') {       // user selects subtraction operation//
                    result = num1 - num2;
                    System.out.println("Option selected: --> -\n");
                    System.out.printf("The result of subtracting " + num2 + " from " + num1 + " is " + result);
                } else if (operationSelection == '*') {       // user selects multiplication operation//
                    result = num1 * num2;
                    System.out.println("Option selected: --> *\n");
                    System.out.printf("The result of multiplying " + num1 + " by " + num2 + " is " + result);
                } else if (operationSelection == '/') {       // user selects division operation//
                    System.out.println("Option selected: --> /\n");
                    if (num2 == 0) {        // user tried to divide by 0//
                        System.out.println("Value Error, Division by 0 is not possible, Goodbye!");
                    } else {
                        double doubleResult = (double) num1 / num2;
                        System.out.printf("The result of dividing %d by %d is %.2f", num1, num2, doubleResult);
                    }
                } else if (operationSelection == '%') {
                    System.out.println("Option selected: --> %\n");
                    if (num2 == 0) {        // user tries to modulus divide by 0//
                        System.out.println("Value Error, Modulo division does not allow division by zero, Goodbye!");
                    } else {
                        result = num1 % num2;
                        System.out.printf("The result of %d modulus %d is %d", num1, num2, result);
                    }
                }
            }break;
        }
    }
        public static int getOperand (Scanner scan, String wordNumber){
            System.out.println("Please enter the " + wordNumber + " whole number");
            int number = scan.nextInt();
            scan.nextLine();
            return number;
        }
    }

