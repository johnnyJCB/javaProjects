package MainToRunClasses;

import CustomClasses.DogEats;

public class EatsDemo {
    public static void main(String[] args) {

        DogEats dog = new DogEats();
        dog.eat();
        dog.bark();
        dog.eatNBark();

        dog.eat("rice");
    }
}
