/* Student: Johnny J. Cheng
Lab Assignment 4 */

package MainToRunClasses;

import CustomClasses.Employee;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee [] employees;
        int size;
        String name;
        double salary;
        int years;
        double sales;

        System.out.print("Enter the number of employees to poll: ");
        while (!scan.hasNextInt() || (size = scan.nextInt()) <= 0) {    // Check if input is not an int or if int <= 0
            System.out.println("Please enter a valid number.");
            System.out.print("Enter the number of employees to enter: ");
            scan.nextLine();                    // Clear buffre
        }
        scan.nextLine();                        // Clear buffer

        employees = new Employee[size];         // create list of Employee objects, size is de

        for (int i = 0; i < size; i++) {
            System.out.println("Enter details for Employee number " + (i + 1));     // will print the String repeatedly from first to last index +1

            System.out.print("Enter the name of the employee: ");
            name = scan.nextLine();             // assigning name input to "name"

            System.out.print("Enter the salary of the employee: ");
            salary = scan.nextDouble();         // assigning salary input to "salary"
            scan.nextLine();                    //Clear buffer

            System.out.print("Enter the years with the company of the employee: ");
            years = scan.nextInt();             // assigning years with company input to "years"
            scan.nextLine();                    //Clear buffer

            System.out.print("Enter the sales of the employee: ");
            sales = scan.nextDouble();          // assigning sales input to "sales"
            scan.nextLine();                    //Clear buffer


            employees[i] = new Employee(name, salary, years, sales);        // setting attributes for every employee in the employees list

        }
        for (Employee employee : employees) {                   // for each loop to print all Employee objects in employees list
            System.out.println(employee.toString());
        }

        System.out.println("\n***And now for the promotions! ***");
        for (Employee employee : employees) {           // for each loop that will print the name attribute of the Employee objects that will receive a raise and how much their new salary will be
            if (employee.promote()) {                   // if employee has more than 2 years with the company and has sold 1,000 or more, their salary will be increased by 5 percent
                double updatedSalary = employee.calculateRaise();
                System.out.printf("%s's salary increased to %,.2f\n", employee.getName(), updatedSalary);
            }
        }
    }
}

