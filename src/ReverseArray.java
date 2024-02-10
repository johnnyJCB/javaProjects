import java.util.Arrays;
/* Reverse Array
Write a method called reverse() with an int array as a parameter.
The method should not return any value. In other words, the method is allowed to modify the array parameter.
To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
For example, if the array is [1, 2, 3, 4, 5], then the reversed array is [5, 4, 3, 2, 1].
The method should first print out the newly passed in array as Array = [1, 2, 3, 4, 5]
and then once it's been reversed, print it out as Reversed array =
TIP: When swapping the elements, use a variable to temporarily hold the current element.
NOTE: The method should be defined as private static.
NOTE: Do not add a main method to the solution code.
NOTE: Classes that are not in the java.lang package should be manually imported.
*/
public class ReverseArray {
    public static void main(String[] args) {
        int [] newArray = {21, 54, 87, 95, 47, 15, 78 , 100};
        reverse(newArray);
    }
    public static void reverse(int [] array){
        int [] sortedArray = new int[array.length];
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int j = 0;
        for(int i = array.length-1; i >= 0; i--){
            sortedArray[j] = array[i];
            j++;
        }
        System.out.println(Arrays.toString(sortedArray));
    }
}
