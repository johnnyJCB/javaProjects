public class SimpleCalculator {
    // write code here
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber(){
        return firstNumber;
    }

    public double getSecondNumber(){
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }
    public double getAdditionResult(){
        return(firstNumber+secondNumber);
    }
    public double getSubtractionResult(){
        double result1 = firstNumber - secondNumber;
        return result1;
    }
    public double getMultiplicationResult(){
        return(firstNumber * secondNumber);
    }
    public double getDivisionResult(){
        if(secondNumber != 0){
            double result = firstNumber/secondNumber;
            return result;
        }else{
            return 0;
        }
    }
}