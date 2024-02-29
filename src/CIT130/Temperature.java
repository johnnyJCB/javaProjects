package CIT130;

public class Temperature {
    private double ftemp;

    public Temperature(double t){
        ftemp = t;
    }
    public void setFahrenheit(double t){
        ftemp = t;
    }
    public double getFahrenheit(){
        return ftemp;
    }
    public double getCelsius(){
        double c = (ftemp - 32) * ((double)5/9);
        return c;
    }
    public double getKelvin(){
        double k = getCelsius() + 273.15;
            return k;
    }

}
