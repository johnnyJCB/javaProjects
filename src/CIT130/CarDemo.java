package CIT130;

import java.util.Scanner;

public class CarDemo {
    public static void main(String[] args) {
        CarClient car1 = new CarClient();
        Scanner scan = new Scanner(System.in);
        String brand;
        String model;
        String color;
        int year;
        double maxMPH;
        double MPG;

        System.out.print("Enter your cars's brand --> ");       // will prompt user input for the car's brand
        brand = scan.nextLine();                                // stores user input in variable "brand"

        System.out.print("Enter your cars's model --> ");       // will prompt user input for the car's model
        model = scan.nextLine();                                // stores user input in variable "model"

        System.out.print("Enter your cars's color --> ");       // will prompt user input for the car's color
        color = scan.nextLine();                                // stores user input in variable "color"

        System.out.print("Enter your cars's year --> ");        // will prompt user input for the car's year
        year = scan.nextInt();                                  // stores user input in variable "year"
        car1.setYear(year);                                     // if year input > than current year, year will default to current year

        System.out.print("Enter your cars's top Miles per hour speed --> ");    // will prompt user input for the car's max speed
        maxMPH = scan.nextDouble();                                     // stores user input in variable "maxMPH"
        car1.setMaxMPH(maxMPH);                                 // if maxMPH input < 0, max Miles per hour will default to 0

        System.out.print("Enter your cars's average Miles per gallon --> ");    // will prompt user input for the car's average miles per gallon
        MPG = scan.nextDouble();                                        // stores user input in variable "MPG"
        car1.setMPG(MPG);                                       // if MPG input < 0, MPG will default to 0

        car1 = new CarClient(brand, model, color, year, maxMPH, MPG);       // car instance takes user input to use as arguments
        System.out.println(car1.toString());
        System.out.printf("For my European friends, in Kilometers it would be a top speed of %.2f Kilometers per hour and " +
                "it would give you %.2f Kilometers per gallon.\n", car1.getMaxKPH(), car1.getKPG());
        System.out.printf("If you add nitrous oxide to the car, it would increase the max speed by 10 miles per hour and the max speed would be %.2f miles per hour.\n", car1.increaseSpeedBy10());


        CarClient car = new CarClient("Toyota", "Camry", "Silver", 2008, 145.2, 32.5);
        System.out.println(car.toString());
        System.out.printf("For my European friends, in Kilometers it would be a top speed of %.2f Kilometers per hour and " +
                "it would give me %.2f Kilometers per gallon.\n", car.getMaxKPH(), car.getKPG());
        System.out.printf("If I add nitrous oxide to the car, it would increase the max speed by 10 miles per hour and the max speed would be %.2f miles per hour.\n", car.increaseSpeedBy10());

        System.out.println();
        CarClient car2 = new CarClient("Honda", "Accord");
        System.out.println(car2.toString());

        System.out.println();
        CarClient car3 = new CarClient("Ford", "Focus", "Blue");
        System.out.println(car3.toString());

        System.out.println();
        CarClient car4 = new CarClient("Jeep", "Wrangler", "Black", 2015);
        System.out.println(car4.toString());
    }
}
