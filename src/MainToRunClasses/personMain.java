package MainToRunClasses;

import CustomClasses.personClass;

public class personMain {
    public static void main(String[] args) {
        personClass person = new personClass();
        person.setFirstName("");   // firstName set to empty string
        person.setLastName("");    // lastName set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName set to Smith
        System.out.println("fullName= " + person.getFullName());
    }
}
