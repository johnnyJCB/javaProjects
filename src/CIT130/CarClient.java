package CIT130;

public class CarClient {
    private String brand;
    private String model;
    private String color;
    private int year;
    private double maxMPH;
    private double MPG;

    public CarClient(){
    this.brand = "unknown";
    }
    public CarClient(String brand){
        this.brand = brand;
        this.model = "unknown";
    }
    public CarClient(String brand, String model){
        this.brand = brand;
        this.model = model;
        this.color = "unknown";
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
        this.year = year;
    }
    public CarClient(String brand, String model, String color, int year, double maxMPH){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        setMaxMPH(maxMPH);
    }
    public CarClient(String brand, String model, String color, int year, double maxMPH, double MPG) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        setMaxMPH(maxMPH);
        setMPG(MPG);
    }

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
        this.year = year;
    }
    public int getYear(){
        return year;
    }
    public void setMaxMPH(double MaxMPH){
        if(MaxMPH < 0){
            System.out.println("Your input is invalid for max speed");
            this.maxMPH = 0;
        }else{
            this.maxMPH = MaxMPH;
        }
    }
    public double getMaxMPH(){
        return maxMPH;
    }
    public double getMaxKPH(){
        return getMaxMPH() * 1.609344;
    }
    public void setMPG(double MPG){
        if(MPG < 0){
            System.out.println("Your input is invalid for miles per gallon");
            this.MPG = 0;
        }else{
            this.MPG = MPG;
        }
    }
    public double getMPG(){
        return MPG;
    }
    public double getKPG(){
        return getMPG() * 1.609344;
    }
    public String toString(){
        return String.format("My car is a %s %s and its color is %s.\n" +
                "It was built in the year %2d and it has a max speed of %.2f miles per hour.\n" +
                "It gives me an average of %.2f miles per gallon.", getBrand(), getModel(), getColor(), getYear(), getMaxMPH(), getMPG());
    }
}
