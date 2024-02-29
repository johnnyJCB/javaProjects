package CIT130;

public class CarDemo {
    public static void main(String[] args) {
        CarClient car = new CarClient("Toyota", "Camry", "Silver", 2008, 145.2, 32.5);
        System.out.println(car.toString());
        System.out.printf("For my European friends, in Kilometers it would be a top speed of %.2f Kilometers per hour and " +
                "it would give me %.2f Kilometers per gallon.\n", car.getMaxKPH(), car.getKPG());
        System.out.printf("If I add nitrous oxide to the car, it would increase the max speed by 10 miles per hour and the max speed would be %.2f miles per hour.", car.getMaxMPH() + car.increaseSpeedBy10());
    }
}
