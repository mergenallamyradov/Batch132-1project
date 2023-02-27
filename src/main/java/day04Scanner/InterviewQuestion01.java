package day04Scanner;

public class InterviewQuestion01 {
    public static void main(String[] args) {
        //Example1: Type code to swap two integers
        // a=12 and b=5 ==> a=5 and b=5

        int a=12;
        int b=5;
        System.out.println(a+ " "+ b);

        int temp=0;
        //1.step:

        temp=a;
        //2.Step:
        a=b;

        //3.Step:
        b=temp;
        System.out.println(a+ " "+ b);




    }
}
