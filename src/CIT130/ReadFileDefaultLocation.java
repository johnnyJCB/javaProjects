package CIT130;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileDefaultLocation {

    public static void main(String[] args) {
        File file = new File("example.txt");

        try {
            Scanner scan = new Scanner(file);

            while(scan.hasNext())
            {
                System.out.println(scan.nextLine());
            }

        } catch (FileNotFoundException fne) {
            System.out.println(file + " not found");
        }


    }
}
