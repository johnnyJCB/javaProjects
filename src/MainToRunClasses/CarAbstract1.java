package MainToRunClasses;

import CustomClasses.CarAbstract;

public class CarAbstract1 extends CarAbstract {

    public CarAbstract1(){
        System.out.printf("The number of tires on this car is %d.\n", tires());
        wifi();

    }

    public int tires() {
        return 4;

    }

}
