/* Student: Johnny J. Cheng
Lab Assignment 4 */

package CustomClasses;

public class Employee {

    private String name;
    private double salary;
    private int yearsWith;
    private double sales;

    public Employee(String name, double salary, int yearsWith, double sales ){      // overloaded constructor
        this.name = name;
        setSalary(salary);                  // setSalary method with salary as argument
        setYearsWith(yearsWith);            // setYearsWith method with yearsWith as argument
        setSales(sales);                    // setSales method with sales as argument
    }

    public String getName(){                // getter for name variable
        return name;
    }

    private double setSalary(double salary){        // set salary to 0 if salary is less than 0
        if (salary < 0){
            this.salary = 0;
            System.out.println("\nError: Invalid SALARY entered. Setting to 0");
        }else{
            this.salary = salary;
        }
    return this.salary;
    }

    private int setYearsWith(int yearsWith){        // set yearsWith to 0 if yearsWith is less than 0
        if(yearsWith < 0){
            this.yearsWith = 0;
            System.out.println("Error: Invalid YEARS with company entered. Setting to 0");
        }else{
            this.yearsWith = yearsWith;
        }
    return this.yearsWith;
    }

    private double setSales(double sales){          // set sales to 0 if sales is less than 0
        if (sales < 0){
            this.sales = 0;
            System.out.println("Error: Invalid SALES entered. Setting to 0\n");
        }else{
            this.sales = sales;
        }
    return this.sales;
    }

    public boolean promote(){                     // function to return true if sales greater than 999 and has been with company more than 2 years
        if (sales > 999 && yearsWith >= 3){
            return true;
        }else{
            return false;
        }
    }

    public double calculateRaise(){
        setSalary(salary + salary * 0.05);          // sets salary to add the 5 percent
        return salary;
    }

    @Override
    public String toString() {
        return String.format("\nEmployee Name: %s, has a current salary of $%,.2f.\nHas been with the Company for %d years and last year sold a total of $%,.2f.\n" +
                "Promotion status = %s", this.name, setSalary(salary), setYearsWith(yearsWith), setSales(sales), promote());
    }
}
