package day08ternary_switch;

public class Ternary01 {
    public static void main(String[] args) {
        int a=12;
        int b=70;
        int result=a<b ? a:b;
        System.out.println(result);

        //Example2: Type code to calculate absolute value of Integer

        int c=-5;
        int d=Math.abs(c);
        System.out.println(d); // using Math.util to get absolute value

        int r2= c<0 ? -1*c : c;  // using ternary to get absolute value
        System.out.println("Absolute value is: " + r2);

        //Example3: If two integers are positive return the multiplication
        //          otherwise, give a message like " I don't know hot to multiply"

        int e=-3;
        int f=4;

        Object r3=e>0 && f>0 ? f*e : "I don't know how to multiply"; //Object is like an ocean!!!
        System.out.println(r3);
    }

}
