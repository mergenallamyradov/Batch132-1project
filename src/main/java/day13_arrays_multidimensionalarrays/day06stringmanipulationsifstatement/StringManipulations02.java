package day13_arrays_multidimensionalarrays.day06stringmanipulationsifstatement;

public class StringManipulations02 {
    public static void main(String[] args) {
        //Example1: Type a code to check if a given String is empty or not
        //          "Java" ==> false      -     ""==> true

        String s="";

        boolean r1=s.length()==0; // method and compariosn operator
        System.out.println("Is the given String empty = " + r1);

        //2.way:Recommended because if Java has a method for a specific task we always prefer to use it
        boolean r2=s.isEmpty();
        System.out.println("Is the given String empty = " + r2);


        // Example2: Type a code to check if a given String is containing just "space character" or not
        //      "     "  ==> true     "     -   b   v" ==> false

        String t ="      ";
        boolean r3=t.replaceAll("[ ]", "").length()==0;
        System.out.println("Is it blank = " + r3);

        //2.Way: better way
        // isBlank(): checks if the string has any character different from space
        boolean r4=t.isBlank();
        System.out.println("Is it blank = " + r4);

        //Example3:  Type a code to join multiple Strings
        //           "Parkland" - "Miami" - "USA"==> ParklandMiamiUSA
        String u1="Parkland";
        String u2="Miami";
        String u3="USA";
        String result1 = u1+u2+u3;
        System.out.println(result1); //ParklandMiamiUSA

        String result2=u1.concat(u2).concat(u3);
        System.out.println(result2); //ParklandMiamiUSA


    }
}
