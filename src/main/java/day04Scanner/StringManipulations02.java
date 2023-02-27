package day04Scanner;

import java.util.Scanner;

public class StringManipulations02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Example1: Get the first 4 characters from a String and convert them to lower cases
        // Albania ==> Alba ==> alba

        String s="GERMANY";
        String t= s.substring(0, 4).toLowerCase();
        System.out.println(t);

     //Example 2
        String r= "Java";
        String u="java";
        boolean same =r.equals(u);
        System.out.println(same);

        boolean sameIgnoreCase =r.equalsIgnoreCase(u);
        System.out.println(sameIgnoreCase);



    }
}
