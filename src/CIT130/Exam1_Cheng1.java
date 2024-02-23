package CIT130;

import java.util.Arrays;
import java.util.Scanner;
/*Johnny Cheng
Exam 1 | Question #1
 */
public class Exam1_Cheng1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int evenCount = 0;
        double [] doubArray = new double[5];                // create new array of size 5
        for(int i =0; i < doubArray.length; i++){           // iterate over array
            System.out.print("Enter a number (Whole or decimal) to store in the array: ");
            doubArray[i] = scan.nextDouble();               // assign user input to each array index
        }
        for(double num: doubArray){     // iterate over doubArray completely
            if(num % 2 == 0){           // identify even numbers
                evenCount++;            // increase counter for every even number found
            }
        }System.out.println("The array contains: " + Arrays.toString(doubArray));
        System.out.printf("%d of these values are even numbers", evenCount);
    }
}
