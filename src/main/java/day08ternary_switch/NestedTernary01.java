package day08ternary_switch;

import java.util.Scanner;

public class NestedTernary01 {
    public static void main(String[] args) {
          /*
            Type java code by using nested ternary.
            Write a program to check if a year is "leap year" or not.
            i)If the year is divisible by 100 then it must be divisible by 400.==>1600+   1800-
            ii)If a year is not divisible by 100 then it must be divisible by 4.==>2004+  1997-
        */

        Scanner input = new Scanner (System.in);
        System.out.println("Please enter the year to see whether it is leap year");
        int result=input.nextInt();


        String out=result%100==0 ? (result%400==0 ? "Leap Year": "NOT LEAP"): (result%4==0 ? "Leap": "NOT LEAP");
        System.out.println(out);

         /*
            Type code to check the password
            If it has more than 8 characters, initial should be 'i'
            If it has no more than 8 characters initial should be 'K'
            Solve the task by using nested-ternary
        */

        String pwd = "ia1b3c";
        String output=pwd.length()>8 ? (pwd.startsWith("i") ? "Valid password": "INVALID") :
                (pwd.startsWith("K") ? "Valid" : "INVALID");
        System.out.println(output);



    }
}
