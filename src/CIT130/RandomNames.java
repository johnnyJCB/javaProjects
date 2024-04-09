package CIT130;

public class RandomNames {

    public static void main(String[] args) {

        String[] firstNames = {"Jane", "Tony", "Sarah", "Frank", "Carl"};
        String[] lastNames = {"Smith", "Johnson", "Trent", "White"};

        int r1 = (int)(Math.random() * firstNames.length);
        int r2 = (int)(Math.random() * lastNames.length);

        String person = firstNames[r1] + " " + lastNames[r2];
        System.out.println(person);

        System.out.println("Populating a town of people");
        for (int i = 0; i < 10; i++){
            r1 = (int)(Math.random() * firstNames.length);
            r2 = (int)(Math.random() * lastNames.length);
            person = firstNames[r1] + " " + lastNames[r2];

        }
    }

}
