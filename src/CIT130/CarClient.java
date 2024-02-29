package CIT130;

import java.util.Calendar;

public class CarClient {
    // Class variables
    private String brand;
    private String model;
    private String color;
    private int year;
    private double maxMPH;
    private double MPG;
    //Constructors
    public CarClient(){         //default constructor
    this.brand = "unknown";
    }
    public CarClient(String brand){
        this.brand = brand;
        this.model = "unknown";
    }
    public CarClient(String brand, String model){
        this(brand, model, "unknown");
    }
    public CarClient(String brand, String model, String color){
        this.brand = brand;
        this.model = model;
        this.color = color;
    }
    public CarClient(String brand, String model, String color, int year){
        this.brand = brand;
        this.model = model;
        this.color = color;
        setYear(year);
    }
    public CarClient(String brand, String model, String color, int year, double maxMPH){
        this(brand, model, color);
        setYear(year);
        setMaxMPH(maxMPH);
    }
    public CarClient(String brand, String model, String color, int year, double maxMPH, double MPG) {
        this(brand, model, color);
        setYear(year);
        setMaxMPH(maxMPH);
        setMPG(MPG);
    }
    // Setters and getters
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setYear(int year){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        if (year > currentYear) {
            System.out.printf("\nDanger! Invalid input for year. Year set to current year, which is %2d.\n", currentYear);
            this.year = currentYear;
        } else {
            this.year = year;
        }
    }
    public int getYear(){
        return year;
    }
    public void setMaxMPH(double MaxMPH){       //if user inputs less than 0 for MaxMPH, it will default to 0
        if(MaxMPH < 0){
            System.out.println("\nDanger! Your input for max speed was invalid, max speed set to 0.\n");
            this.maxMPH = 0;
        }else{
            this.maxMPH = MaxMPH;
        }
    }
    public double getMaxMPH(){
        return maxMPH;
    }
    public void setMPG(double MPG){         //if user inputs less than 0 as the MPG argument, MPG will default to 0
        if(MPG < 0){
            System.out.println("Danger! Your input for miles per gallon was invalid, miles per gallon to set to 0.\n");
            this.MPG = 0;
        }else{
            this.MPG = MPG;
        }
    }
    public double getMPG(){
        return MPG;
    }
    public double getMaxKPH(){          //method that converts the maximum miles per hour (MaxMPH) to max Kilometers per hour (MaxKPH)
        return getMaxMPH() * 1.609344;
    }
    public double getKPG(){         //method that converts the Miles per gallon (MPG) to Kilometers per gallon (KPG)
        return getMPG() * 1.609344;
    }
    public double increaseSpeedBy10(){      // method increases MaxMPH by 10
        return getMaxMPH() + 10;
    }
    public String toString(){
        return String.format("Below is a summary of your car.\n" + "Your car is a %s %s and its color is %s.\n" +
                "It was built in the year %2d and it has a max speed of %.2f miles per hour.\n" +
                "It gives you an average of %.2f miles per gallon.", getBrand(), getModel(), getColor(), getYear(), getMaxMPH(), getMPG());
    }
}
