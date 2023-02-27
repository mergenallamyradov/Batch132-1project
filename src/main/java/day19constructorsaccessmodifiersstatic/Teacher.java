package day19constructorsaccessmodifiersstatic;

public class Teacher {
    public String tName;
    public int age;
    public String gender;
    public boolean success;


    //only variables can change
    public Teacher(String tName, int age, String gender){
        this.tName= tName;
        this.age=age;
        this.gender=gender;
    }

    //Constructor must have same name
    public Teacher(String tName){
        this.tName=tName;
    }

    // Constrcutor by using Intellij
    public Teacher(String tName, int age, String gender, boolean success) {
        this.tName = tName;
        this.age = age;
        this.gender = gender;
        this.success = success;
    }
}
