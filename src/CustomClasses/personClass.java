package CustomClasses;

public class personClass {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAge(int age){
        this.age = age;
    }
    public boolean isTeen(){
        if(age > 12 && age < 20){
            return true;
        }return false;
    }
    public String getFullName(){
        if(firstName.isEmpty()&& lastName.equals("")){
            return "";
        }else if(lastName.isEmpty()){
            return firstName;
        }else if(firstName.isEmpty()){
            return lastName;
        }
        return firstName + " " + lastName;
    }
}
