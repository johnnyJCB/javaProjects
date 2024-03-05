package MainToRunClasses;

import CustomClasses.Student;

public class StudentDemo {
    public static void main(String[] args) {
        Student tom = new Student("Tom", "English", 45);
//        System.out.println(tom);
        Student frank = new Student("Frank", "Chemistry", -75);
//        System.out.println(frank);
        Student claire = new Student("Claire", "Computer Science", 12);
//        System.out.println(claire);
        Student blank = new Student();
//        System.out.println(blank);
        Student [] students = {tom, frank, claire, blank};
        for(Student i : students){
            System.out.println(i);
        }
    }
}
