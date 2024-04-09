package MainToRunClasses;

import CustomClasses.Bat;
import CustomClasses.Pig;

public class AnimalDemo{
    public static void main(String[] args) {
        Pig pig = new Pig();
        pig.eat();
        pig.sound();
        pig.rollInMud();
        pig.printFarm();
        System.out.println();
        pig.swear();
        System.out.println();
        Bat bat1 = new Bat();
        bat1.sound();
        bat1.eat();

    }
}
