package CIT130;

import CustomClasses.Pet;
//non-static = import object (instance of class) before using its methods
public class PetDemoArray {
    public static void main(String[] args) {
        Pet[] pets = new Pet [5];                       //created object array of type Pet
        pets[0] = new Pet();                            // default constructor
        pets[1] = new Pet("Billy, 2, 7.7");       // Fully overloaded constructor
        pets[2] = new Pet("Bob");
        pets[3] = new Pet(10);
        pets[4] = new Pet(1.23);

        for(Pet i: pets){
            System.out.println(i);
        }
        System.out.printf("The numbers of pet without names is %s", Pet.getWithoutName());

    }

}
