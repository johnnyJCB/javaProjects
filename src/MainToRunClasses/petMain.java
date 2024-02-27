package MainToRunClasses;

import CustomClasses.Pet;

import java.util.Scanner;

public class petMain {
    public static void main(String[] args) {
//        Pet cat = new Pet("Billy", 10, 20.0);
//        System.out.println(cat.toString("Billy"));
        Pet pet = new Pet();
        System.out.println(pet);

        Scanner scan = new Scanner(System.in);
        String name;
        int age;
        double weight;

        System.out.print("Enter yur pet's name --> ");
        name = scan.nextLine();

        System.out.printf("Enter %s 's age --> ", name);
        age = scan.nextInt();

        System.out.printf("Enter %s 's weight --> ", name);
        weight = scan.nextDouble();

        pet = new Pet(name, age, weight);
        System.out.println(pet.toString());

    }
}
