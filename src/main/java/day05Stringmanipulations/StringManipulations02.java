package day05Stringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {
        // Example1: Delete all "y"s from a given String

        String s= "Everything is easy if you study";
        String s1=s.replace("y", "");
        System.out.println("s1="+s1);

        //Example2: Delete all digits (0,1,2,3,4,5,6,7,,8,9) from a given string
        // [0-9] ==> regular expressions in Java

        /*
        What are Regular Expressions ==> Regex
            1) All digits ==> [0-9]
            2) All lowercases ==> [a-z]
            3) All UpperCases ==> [A-Z]
            4) All letters ==> [a-zA-Z]
            5) All letters and digits [a-zA-Z0-9]
            6) All vowels ==> [aeiouAEIOU]
            7) All punctuation marks ==> \\p{Punct}
            8) all characters "different from"(^i) ==>[^]
            9) All characters "different from" [^a-z]
            10) All characters "different from" letters ==> [^a-zA-Z]
            11) All characters "different from" vowels ==> [^aeiouAEIOU]

                            */

        String t = "Tom is 13 years old, and his GPA is 3.98";
        String t1=t.replaceAll("[0-9]", "");
        System.out.println("t="+t);
        System.out.println("t1=" + t1);

        //Example3: Delete all vowels from a given String
        String t2=t.replaceAll("[aeiouAEIOU]", "");
        System.out.println("t2"+t2);

        //Example4;Count how many letters are there in the String
        // Logic i) Delete all characters different from letters
        //       ii) Count the remaining characters

        String m="Tom, are you here?";
        int numM=m.length();
        System.out.println("numM = "+numM);
        int numofletter=m.replaceAll("[^a-zA-Z]", "").length();
        System.out.println("numofletters = " + numofletter);

        //Example4: Count how many digits are there in a String

        String n = "Tom is 13 years old, and his GPA is 3.98";
        int n1=n.replaceAll("[^0-9]", "").length();
        System.out.println("Number of Digits = " + n1);

        //Example 5: Check the user's password according to the given rules
        //           i)Password should have at least 8 characters
        //           ii)Password should not have "space" character
        //           iii)Password should have at least 1 upper case
        //           iv)Password should have at least 1 lower case
        //           v)Password should have at least 1 symbol
        //           vi)Password should have at least 1 digit

        String pwd = "As1?fdes3";

        boolean condition1=pwd.length()>7;
        System.out.println("condition1 = " + condition1);
        boolean condition2=pwd.replaceAll("[^ ]", "").length()==0;
        System.out.println("condition2 = " + condition2);
        boolean condition3=pwd.replaceAll("[^A-Z]", "").length()>0;
        System.out.println("condition3 = " + condition3);
        boolean condition4=pwd.replaceAll("[^a-z]", "").length()>0;
        System.out.println("condition4 = " + condition4);
        boolean condition5=pwd.replaceAll("[a-zA-Z0-9]", "").length()>0;
        System.out.println("condition5 = " + condition5);
        boolean condtion6=pwd.replaceAll("[^0-9]", "").length()>0;
        System.out.println("condtion6 = " + condtion6);



    }
}
