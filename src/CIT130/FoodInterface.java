package CIT130;

// This interface should be implemented into the Food class
public interface FoodInterface {
    
    public String foodName(String f);
    
    public int calories(int cal);
    
    public int servings(int serv);
    
    public double caloriesPerServing(int cal, int serv);
    
    public String toString();

}
