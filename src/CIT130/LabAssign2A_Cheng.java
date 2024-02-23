package CIT130;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LabAssign2A_Cheng {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Character> operandList = Arrays.asList('+', '-', '*', '/', '%');
        int result;
        int num1 = getOperand(scan, "first");
        int num2 = getOperand(scan, "Second");
        char operandSelection;

        do {
            System.out.println("""
                    What operation would you like to conduct with the 2 numbers provided?
                    + - addition
                    - - subtraction
                    * - multiplication
                    / - division
                    % - modulus""");
            operandSelection = scan.next().charAt(0);
        }
        // still need to print "Invalid Choice" message
        while (!operandList.contains(operandSelection)); {   //if operandList not contain operandSelection input "do" will repeat
            for (int i = 0; i < operandList.size() - 1; i += 1) {  //Iterate over list of operations
                if (operandList.get(i) == operandSelection) {
                    if (operandList.get(i) == '+') {
                        result = num1 + num2;
                        System.out.println("Option selected: --> +\n");
                        System.out.printf("The result of adding %d to %d is  %d", num1, num2, result);
                    } else if (operandList.get(i) == '-') {       // user selects subtraction operation//
                        result = num1 - num2;
                        System.out.println("Option selected: --> -\n");
                        System.out.printf("The result of subtracting %d from %d is  %d", num2, num1, result);
                    } else if (operandList.get(i) == '*') {       // user selects multiplication operation//
                        result = num1 * num2;
                        System.out.println("Option selected: --> *\n");
                        System.out.printf("The result of multiplying %d by %d is  %d", num1, num2, result);
                    } else if (operandList.get(i) == '/') {       // user selects division operation//
                        System.out.println("Option selected: --> /\n");
                        if (num2 == 0) {        // user tried to divide by 0//
                            System.out.println("Value Error, Division by 0 is not possible, Goodbye!");
                        } else {
                            double doubleResult = (double) num1 / num2;
                            System.out.printf("The result of dividing %d by %d is %.2f", num1, num2, doubleResult);
                        }
                    } else if (operandList.get(i) == '%') {
                        System.out.println("Option selected: --> %\n");
                        if (num2 == 0) {        // user tries to modulus divide by 0//
                            System.out.println("Value Error, Modulo division does not allow division by zero, Goodbye!");
                        } else {
                            result = num1 % num2;
                            System.out.printf("The result of %d modulus %d is %d", num1, num2, result);
                        }
                    }
                }
            }
        }
    }
        public static int getOperand (Scanner scan, String wordNumber){
            System.out.println("Please enter the " + wordNumber + " whole number");
            return scan.nextInt();
        }
    }
