import CIT130.SuperCoolTotallyNotMadeException;

public class MyException {
    public static void main(String[] args) {

        int n = 9;

        try {
            if (n < 10) {
                throw new SuperCoolTotallyNotMadeException();
            }
        }catch(SuperCoolTotallyNotMadeException ex){
            System.out.println("Caught it");
        }

    }
}
