package CustomClasses;

import CIT130.Animal;

public class Bat implements Animal {

    @Override
    public void sound() {
        System.out.println("Screech");
    }

    @Override
    public void eat() {
        System.out.println("Eating insects");

    }

}
