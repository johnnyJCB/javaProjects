package CIT130;

public class SuperCoolTotallyNotMadeException extends Exception {

    public SuperCoolTotallyNotMadeException () {
        System.err.println("Super cool crash happening");
    }

    public SuperCoolTotallyNotMadeException (String s) {
        System.err.println(s);
    }

}
