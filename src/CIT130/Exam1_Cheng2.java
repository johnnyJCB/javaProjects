package CIT130;

import java.util.Arrays;
import java.util.Scanner;
/*Johnny Cheng
Exam 1 | Question #2
 */
public class Exam1_Cheng2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] array = loadArray(scan);           // store value of loadArray method into "array" array
        int evenCount = countEven(array);           // stores value of countEven method into evenCount variable
        System.out.println("The array contains: " + Arrays.toString(array));
        System.out.printf("%d of these values are even numbers", evenCount);

    }
    public static double[] loadArray(Scanner sc) {
        double[] doubArray = new double[5];             // array of size 5 created
        for (int i = 0; i < doubArray.length; i++) {    // iterate over array
            System.out.print("Enter a number (Whole or decimal) to store in the array: ");
            doubArray[i] = sc.nextDouble();             // insert user input to each array index
        }
        return doubArray;
    }
    public static int countEven(double[] a) {
        int evenCount = 0;
        for (double num : a) {      // iterate over list provided
            if (num % 2 == 0) {     // identify even numbers
                evenCount++;        // increase count for every even number found
            }
        }return evenCount;          // return counter of even numbers
    }
}

