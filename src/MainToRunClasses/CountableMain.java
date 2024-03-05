package MainToRunClasses;

import CustomClasses.Countable;

public class CountableMain {
    public static void main(String[] args) {
        Countable c1 = new Countable();
        Countable c2 = new Countable();
        Countable c3 = new Countable();
        Countable c4 = new Countable();
        Countable c5 = new Countable();
        System.out.println(Countable.getInstanceCount());
    }


}
