package day19constructorsaccessmodifiersstatic;

public class StudentsRunner {
    public static void main(String[] args) {

        Students std1= new Students("Tom", 13, true, "male");

        Students std2=new Students("Ali",21, false);

        System.out.println(std2.age);// 21
    }
}
