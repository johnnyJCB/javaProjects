/* Minimum Element
Write a method called readInteger() that has no parameters and returns an int.
It needs to read in an integer from the user - this represents how many elements the user needs to enter.
Write another method called readElements() that has one parameter of type int
The method needs to read from the console until all the elements are entered, and then return an array containing the elements entered.
And finally, write a method called findMin() with one parameter of type int[]. The method needs to return the minimum value in the array.
The scenario is:
1. readInteger() is called.
2. The number returned by readInteger() is then used to call readElements().
3. The array returned from readElements() is used to call findMin().
4. findMin() returns the minimum number.
[Do not try and implement this. It is to give you an idea of how the methods will be used]
TIP: Assume that the user will only enter numbers, never letters.
TIP: Instantiate (create) the Scanner object inside the method. There are two scanner objects, one for each of the two methods that are reading in input from the user.
TIP: Be extremely careful about spaces in the printed message.
NOTE: All methods should be defined as private static.
NOTE: Do not add a main method to the solution code.
NOTE: Classes that are not in the java.lang package should be manually imported.
*/
import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(readElements(readInteger())));
        System.out.printf("The smallest number in the list is %d"  ,findMin(readElements(readInteger())));

    }
    private static int readInteger(){
        System.out.println("How many elements would you like your list to contain");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
    private static int [] readElements(int size){
        System.out.printf("Enter the %d elements\n", size);
        Scanner scan = new Scanner(System.in);
        int [] array1 = new int[size];
        for(int i = 0; i < array1.length ; i++){
            array1[i] = scan.nextInt();
        }return array1;
    }
    private static int findMin(int[] array){
        int lowestNumber = Integer.MAX_VALUE;
        for(int num = 0; num < array.length; num++){
            if(array[num] < lowestNumber){
                lowestNumber = array[num];
            }
        }return lowestNumber;
    }
}
