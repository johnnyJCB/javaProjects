package CustomClasses;

public class Car extends Vehicle{
    int maxSpeed = 120;

    public void displaySpeed(){
        System.out.printf("The speed is %d.\n", maxSpeed);
        System.out.printf("The parent has a max speed of %d.", super.maxSpeed);
    }

}
