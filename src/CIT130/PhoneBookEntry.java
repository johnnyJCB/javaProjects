package CIT130;
/**
  * The PhoneBookEntry class stores data about an phone book entry
  * Exam 2b
  * Complete this class using UML diagram
*/


public class PhoneBookEntry {
   /**
    * 1. Create Instance variables as shown in the UML
    */
   private String name;
   private String phoneNumber;
   private int age;

   /**
    * 2.  Constructor with parameters,
    * Assign values to name and phone number and call the setAge method passing a
    */
   public PhoneBookEntry(String n, String pn, int a) {
      name = n;
      phoneNumber = pn;
      setAge(a);
   }


   /**
    * setName method
    *
    * @param n The person's name.
    */
   public void setName(String n) {
      name = n;
   }

   /**
    * setPhoneNumber method
    *
    * @param pn The person's phone number.
    */
   public void setPhoneNumber(String pn) {
      phoneNumber = pn;
   }

   /**
    * 3. setAge method
    *
    * @param a The person's age.
    *          method checks to see if the age is valid (>0) if this is the case then
    *          // age is set to a, otherwise a is set to 1
    */
   public void setAge(int a) {
      if (a > 0) {
         age = a;
      } else {
         age = 1;
      }
   }


   /**
    * getName method
    *
    * @return The person's name.
    */
   public String getName() {
      return name;
   }


   /**
    * getPhoneNumber method
    *
    * @return The person's phone number.
    */
   public String getPhoneNumber() {
      return phoneNumber;
   }

   /**
    * getAge method
    *
    * @return The person's  age.
    */
   public int getAge() {
      return age;
   }

   /* 4.
    * this method displays a formatted text string with the values the
    * instance variables hold. See example of output for formatting
    */
   @Override
   public String toString() {
      return "";
   }
}



