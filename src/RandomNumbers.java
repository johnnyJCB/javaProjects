import java.lang.Math;
import java.util.Random;

public class RandomNumbers {
    //Math Class Random
    public static void main(String[] args) {
        int random = (int) (Math.random() * 10) + 1;
        System.out.println("The random number is " + random);

    //Random Class Random
        Random rng = new Random();
        int rand = rng.nextInt(10) + 1;
        System.out.println("Rand is " + rand);
    }
}
