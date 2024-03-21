package MainToRunClasses;

import CustomClasses.Basketball;
import CustomClasses.Football;

public class SportTeamDemo {
    public static void main(String[] args) {
        Basketball bulls = new Basketball("Bulls", 1966, 6);
        Football steelers = new Football("Steelers", 1933, 6);

        System.out.println(bulls);
        System.out.println(steelers);
    }
}
