package CustomClasses;

public class Student {
    private String name;
    private String major;
    private int credits;
    private static int numStudent;
//    private int


    public Student(){
        this.name = "Blank";
        this.major = "Blank";
        this.credits = 0;
        numStudent++;
    }
    public Student(String name, String major, int credits){
        this.name = name;
        this.major = major;
        this.credits = getCredits();
        numStudent++;
    }
    public void setName(){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setMajor(){
        this.major = major;
    }
    public String getMajor(){
        return major;
    }

    public void setCredits(int credits) {
        if (credits < 0) {
            this.credits = 0;
        }else{
            this.credits = credits;
        }
    }
    public int getCredits(){
        return credits;
    }
    public String toString(){
        return String.format("Student %d \nStudent Name %s \nStudent Major %s \nStudent Credits %d", numStudent, this.name, this.major, this.credits);
    }
}
