package day07ifStatementTernanryStatement;

public class Ternary01 {
    public static void main(String[] args) {
        // Example1: Type code to check if a number is even or not by using ternary
        int num=8;

        //1st way:
        if(num%2==0){System.out.println("Even");}else {System.out.println("odd");}

        //2nd way: Ternary
        //    Condition  ?  The code will be executed  :   The code will be executed
        //                        true condition               for false condition
         String result = num%2==0 ? "Even"             :            "odd";
        System.out.println(result);



        //Example2: type a code to check if a number has 3 digits or not, use ternary
        int t=-123;
        t=Math.abs(t);

        String result2= t>99 && t<1000 ? "It has 3 digits": "it has no 3 digits";
        System.out.println(result2);


    }
}
