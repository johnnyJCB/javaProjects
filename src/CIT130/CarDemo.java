package CIT130;

public class CarDemo {
    public static void main(String[] args) {
        CarClient car = new CarClient("Toyota", "Camry");
        System.out.println(car.toString());
        System.out.printf("In Kilometers it would be a top speed of %.2f Kilometers per hour and " +
                "it would give me %.2f Kilometers per gallon.", car.getMaxKPH(), car.getKPG());
    }
}
