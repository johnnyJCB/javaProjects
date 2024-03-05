package CustomClasses;

public class Countable {
    public static int instanceCount = 0;
    public Countable(){
        instanceCount++;
    }
    public static int getInstanceCount(){
        return instanceCount;
    }
}
