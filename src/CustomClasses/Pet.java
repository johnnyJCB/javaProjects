package CustomClasses;

public class Pet {
    private String name;
    private int age;
    private double weight;
    private static int withoutName;

//    Constructors
    public Pet() {
        this.name = "unknown";
        withoutName++;
    }

    public Pet(String name) {
        this.name = name;
    }

    public Pet(int age) {
        setAge(age);
        withoutName++;
    }

    public Pet(double weight) {
        this.weight = weight;
        withoutName++;
    }

    public Pet(String name, int age, double weight) {
        this.name = name;
        setAge(age);
        setWeight(weight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0) {
            System.out.println("Invalid age");
            this.age = 0;
        }else{
            this.age = 0;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight <= 0) {
            System.out.println("Invalid weight");
            this.weight = 0.1;
        }else{
            this.weight = weight;
        }
    }

    @Override
    public String toString() {
//        return "Name: " + this.name + "Age: " +this.age + "Weight: " + this.weight;
        return String.format("Name: %s Age: %d Weight: %.2f", this.name, this.age, this.weight);
    }
    public String toString(String name) {
        return String.format("Name: %s", name);
    }
    public static int getWithoutName(){
        return withoutName;
    }
}
