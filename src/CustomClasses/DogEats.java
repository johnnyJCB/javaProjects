package CustomClasses;

public class DogEats extends AnimalEats{

    public void eat(){
        System.out.println("The dog is eating dog food.");
    }

    public void eat(String food){
        System.out.println("Eating " + food);
    }
    public void bark(){
        System.out.println("*Bark*");
    }
    public void eatNBark(){
        this.bark();
        super.eat();
    }
}
