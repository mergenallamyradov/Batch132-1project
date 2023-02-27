package day13_arrays_multidimensionalarrays.day06stringmanipulationsifstatement;

import javax.print.DocFlavor;

public class StringManipulations01 {
    public static void main(String[] args) {
        // Example 1: Type a code to fnd the index of the first occurrence of "a" in given String
        //       Alabama ==> 2

        String s="Alabama";
        int idxA=s.indexOf('a');
        System.out.println(idxA);

        // Example 2: Type code to find index of the first occurrence of 'java' in a given String.
        // "java is easy to learn, java is common in the market java is OOP"

        String t="java is easy to learn, java is common in the market java is OOP";
        int idxJava=t.indexOf("java");
        System.out.println("idxJava = " + idxJava);

        // Note1: non-existing characters in indexOf() method, it will give you "-1"
        // Note2: indexOf() method can be used with 'char' and "String" data types

        // Example3: Type code to find the index of the last occurrence of 'm' in a given string

        String u="miami";
        int idxM = u.lastIndexOf('m');
        System.out.println(idxM); // 3

        //Example 4: Type code to find the index of the last occurrence of 'earn' in a given string

        String v= "learn Java, earn money";
        int idxEarn=v.lastIndexOf("earn");
        System.out.println("idxEarn = " + idxEarn);

        // Note1: non-existing characters in lastIndexOf() method, it will give you "-1"
        // Note2: lastIndexOf() method can be used with 'char' and "String" data types

        //Example 5:Type code to check if a given character is unique or not in a given String
//       miami ==> 'a' --> Unique - 'i' --> Not unique
        // if character is Unique in a String indexOf() and lastIndexOf() gives the same output.

        String y="miami";
        char ch='m';

        boolean r1=y.indexOf(ch)==y.lastIndexOf(ch);
        System.out.println("Is the character unique = " + r1);

        /*
        Note: When you type code you should be careful about "coding standards"
            i) Separate "data" and the "main code"

         */



    }
}
