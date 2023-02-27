package day19constructorsaccessmodifiersstatic;

public class TeacherRunner {
    public static void main(String[] args) {
        Teacher tn1= new Teacher("Ali", 13, "male");
        Teacher tn2= new Teacher("Veli");
        System.out.println(tn1.tName);     //Ali
        System.out.println(tn1.age);     //13
        System.out.println(tn1.gender);  //male
        System.out.println(tn1.success); //false

        System.out.println(tn2.tName); //veli
        System.out.println(tn2.gender); //null







    }
}
