package CIT130;
// Name: Johnny Cheng
// Regarding above error - Either leave package blank OR ensure BOTH files belong to the same package

import java.util.Scanner;


/**
 * This program will use the HouseListing class and display a list of
 * houses sorted by the house's listing number
 *
 * Complete the code below the numbered comments, 1 - 4. DO NOT CHANGE the
 * pre-written code
 * Exam 2
 * @author
 *
 */

public class HouseListingDemo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HouseListing[] list;
        String listNumber, listDesc;
        int count = 0;
        double listPrice;
        String output;

        double mostExpensive;

        do{
            System.out.print("Enter the number of houses --> ");
            count = scan.nextInt();
        }while(count < 1);

        /* 1.
         * create an array of HouseListing objects using the variable that holds
         * the user's response to the prompt above
         */
        HouseListing [] HlObjects = new HouseListing [count];

        // for loop loads the array with HouseListing's constructor
        for (int i = 0; i < HlObjects.length; i++){
            System.out.println("\n***HOUSE " + (i+1) + "***");
            // Prompt for house listing #
            System.out.print("Enter house listing " +
                    "number (Alphanumeric) #"+ (i+1) +": ");
            listNumber = scan.next();

            // Clear buffer
            scan.nextLine();

            // Prompt for house description
            System.out.print("Enter description for " +
                    "house #" +(i+1) + ": ");
            listDesc = scan.nextLine();

            // Prompt for house price
            System.out.print("Enter listing price for "
                    + "house #" +(i+1) + ": ");
            listPrice = scan.nextDouble();

            /* 2.
             * create a HouseListing object using the input values and store/load
             * the object in the array
             */
            HlObjects[i] = new HouseListing(listNumber, listDesc, listPrice);
        }


        /* 3.
         * Assign the 0th element of the array to the most expensive house
           think ... you can't assign an object to a price but the object
           has a method that may help you here ...

           ***If you decide to complete this step a different way (or perhaps not at all?)
           Please write a comment explaining how / why.***
         */

        mostExpensive = HlObjects[0].getListPrice();            //"mostexpensive" variable was set to the price of the first object in the array
        for(int i = 1; i < HlObjects.length; i++){              // iterate over "HlObjects" array
            if(HlObjects[i].getListPrice() > mostExpensive){    // if it finds that the price of an object is higher than the current "mostexpensive"
                mostExpensive = HlObjects[i].getListPrice();    // then the price attribute of that object is assigned to "mostexpensive"
            }
        }

        output = "Listings:\n";
        /*
         * loop below builds the output string
         */
        for (int i = 0; i < HlObjects.length; i++) {
            output += HlObjects[i] + "\n";

            /* 4.
              Using a control structure, find and the store the double varaible
              which holds the most expensive house (We don't need to listing #)
              JUST THE PRICE
            */
        }
        // output
        System.out.println(output);
        System.out.printf("The most expensive house on the market costs: $%,.2f",mostExpensive);
    }
}
