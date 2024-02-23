package MainToRunClasses;

import CustomClasses.SimpleCalculatorClass;

public class SimpleCalculatorMain {
    public static void main(String[] args) {

        SimpleCalculatorClass calculator = new SimpleCalculatorClass();

        // Set 1st & 2nd numbers
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4.0);

        double additionResult = calculator.getAdditionResult();
        double subtractionResult = calculator.getSubtractionResult();
        double multiplicationResult = calculator.getMultiplicationResult();
        double divisionResult = calculator.getDivisionResult();

        // Print results
        System.out.println("Addition Result: " + additionResult);
        System.out.println("Subtraction Result: " + subtractionResult);
        System.out.println("Multiplication Result: " + multiplicationResult);
        System.out.println("Division Result: " + divisionResult);
    }
}
