package day04Scanner;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {

        //Example 1: Get the full name of the user and make all characters in upper case.
        //
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your first name and last name");
        String fullName= input.nextLine().toUpperCase();

        System.out.println(fullName);


      //Example 2: Get the full name of the user, make all characters in upper cases and remove spaces
      // from the beginning and from the end
      // trim doesn't remove spaces between two names


        System.out.println("Enter your first name and last name");
        String name= input.nextLine().toUpperCase().trim();
        System.out.println(name);

        //Example 3. get the String from the user and count the number of characters in the String
        System.out.println("Enter a String: ");
        String s= input.nextLine();
        int numofChars = s.length();

        System.out.println(numofChars);



    }
}
