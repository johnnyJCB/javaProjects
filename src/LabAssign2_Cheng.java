import java.util.Scanner;

public class LabAssign2_Cheng {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        getOperand(scan, "first");
        getOperand(scan, "second");
    }
    public static void getOperand(Scanner scan, String wordNumber) {
        System.out.println("Please enter the " + wordNumber + " whole number");
        int number = scan.nextInt();


//        System.out.println("Please enter the " + wordNumber + " whole number");
//        int secondNumber = scan.nextInt();

        System.out.println("""
                What operation would you like to conduct with the 2 numbers provided?
                + for addition
                - for subtraction
                * for multiplication
                / for division
                % for modulus""");
        char operationSelection = scan.next().charAt(0); // reads the operation the user selected

//        int result;
        System.out.println(operationSelection + number);
    }
}
