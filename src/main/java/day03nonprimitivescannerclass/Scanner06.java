package day03nonprimitivescannerclass;

import java.util.Scanner;
// First and Lastname and print on Console
public class Scanner06 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("ENTER YOUR ADDRESS: ");
        String adress = input.nextLine();

        System.out.println("ENTER YOUR NAME: ");
        String firstName = input.next();
        System.out.println("ENTER YOUR LAST NAME: ");
        String lastName = input.next();

        System.out.println(firstName + " " + lastName);
        System.out.println(adress);



    }
}
