package MainToRunClasses;

import CIT130.Temperature;

import java.util.Scanner;

public class TemperatueMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double temp;

        System.out.println("Enter a temperature in Fahrenheit");
        temp = scan.nextDouble();
        Temperature myTemp = new Temperature(temp);

        System.out.printf("Your temperature in Fahrenheit is %.2f\n", myTemp.getFahrenheit());
        System.out.printf("Your temperature in Celsius is %.2f\n", myTemp.getCelsius());
        System.out.printf("Your temperature in Kelvin is %.2f", myTemp.getKelvin());
    }
}
