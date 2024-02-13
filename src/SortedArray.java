import java.util.*;

/*Sorted Array
Create a program using arrays that sorts a list of integers in descending order.
Descending order is highest value to lowest.
In other words if the array had the values in it [106, 26, 81, 5, 15] your
program should ultimately have an array with [106, 81, 26, 15, 5] in it.
Set up the program so that the numbers to sort are read in from the keyboard (Scanner).
Implement the following methods:
- getIntegers has one parameter of type int which is the size of the array. It returns an
array of entered integers from the keyboard.
- printArray accepts an array and prints out the contents of the array.
It should be printed in the following format:
Element 0 contents 106
Element 1 contents 81
sortIntegers accepts the unsorted array. It should sort the array and return a new array containing the sorted numbers
The scenario is:
1. getIntegers() is called.
2. The returned array from getIntegers() is then used to call sortIntegers().
3. The returned array from sortIntegers() is then printed to the console.
[Do not try and implement this. It is to give you an idea of how the methods will be used]
TIP: you will have to figure out how to copy the array elements from the passed array
into a new array and sort them and return the new sorted array.
TIP: Instantiate (create) the Scanner object inside the method.
TIP: Be extremely careful about spaces in the printed message.
*/
public class SortedArray {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(getIntegers(5)));
//        printArray(getIntegers(4));
//        printArray(sortIntegers(getIntegers(4)));
          printArray(sortIntegers(getIntegers(10)));
    }
    public static int[] getIntegers(int size) {
        Scanner scan = new Scanner(System.in);
        int[] Array1 = new int[size];
        for (int i = 0; i < Array1.length; i++) {
            Array1[i] = scan.nextInt();
        }
        return Array1;
    }
    public static void printArray(int[] Array) {
        for (int j = 0; j < Array.length; j++)
            System.out.printf("Element %d contents %d\n", j+1, Array[j]);
    }
    public static int[] sortIntegers(int[] Array2) {        // method takes an array of integers (Array2) as input and returns an array of integers
        Arrays.sort(Array2);                                // Sort the input array of integers in ascending order
        int[] newArray = new int[Array2.length];            // new array of integers "newArray" with same length as the input array "Array2"
        int j = 0;
        for (int i = Array2.length - 1; i >= 0; i--) {      // Iterate through the input array "Array2" in reverse order starting from last element
            newArray[j] = Array2[i];                        // Assign value of current element of input array "Array2" to the index of the newArray
            j++;
        }
        return newArray;
    }
}