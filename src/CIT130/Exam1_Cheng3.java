package CIT130;

import java.util.Arrays;
import java.util.Scanner;
/*Johnny Cheng
Exam 1 | Question #3
 */
public class Exam1_Cheng3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double [] Array1 = loadArray(scan);                         // store value of "loadArray" method into "Array1" array
        int EvenCount = countEven(Array1);                          // stores value of "countEven" method into "EvenCount" variable
        double [] evenArray = getEvenArray(Array1, EvenCount);      // invokes "getEvenArray" method and "Array1" and "EvenCount" are passed as arguments
        System.out.println(Arrays.toString(evenArray));
        System.out.printf("%d of these values are even numbers", EvenCount);
    }
    public static double[] loadArray(Scanner sc) {
        double[] doubArray = new double[5];                 // list of size 5 created
        for (int i = 0; i < doubArray.length; i++) {        // iterate over list
            System.out.print("Enter a number (Whole or decimal) to store in the array: ");
            doubArray[i] = sc.nextDouble();                 // assigns user input to current index of "doubArray" list
        }
        return doubArray;                                   // returns "doubArray" array, with values inputed by user
    }
    public static int countEven(double[] a) {
        int evenCount = 0;
        for (double num : a) {          // iterates over provided array
            if (num % 2 == 0) {         // identifies even numbers
                evenCount++;            // count increases every time even number is found
            }
        }return evenCount;              // returns count of even numbers
    }
    public static double[] getEvenArray (double[] arr, int eCount){
        double[] evenArray = new double[eCount];        //creates empty list
        int evenPos = 0;
        for (int i = 0; i < arr.length; i++) {          // iterates over list provided
            if (arr[i] % 2 == 0) {                      // identifies even numbers
                evenArray[evenPos] = arr[i];            // adds even numbers to evenArray
                evenPos++;
            }
        }
        return evenArray;                               // returns "evenArray" array, which is composed of even numbers
    }
}
