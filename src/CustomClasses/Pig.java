package CustomClasses;

import CIT130.Animal;
import CIT130.FarmAnimal;

public class Pig extends TalkingAnimal implements Animal, FarmAnimal {


    @Override
    public void sound() {
        System.out.println("Oink");
    }

    @Override
    public void eat() {
        System.out.println("Eating anything");
    }
    public void rollInMud(){
        System.out.println("Rolling in the mud!");
    }

    @Override
    public void printFarm() {
        System.out.printf("The farm is %s", FARM);
    }
}
