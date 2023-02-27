package day03nonprimitivescannerclass;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        // Example 1: Get the shirtPrice and shoPrice from the user and print the total price on the console

        Scanner input = new Scanner (System.in);
        System.out.println("Give me shirt price, please = " );
        double shirt = input.nextDouble();
        System.out.println(" Give me shoes pric, please = ");
        double shoes = input.nextDouble() ;

        System.out.println("Total price is " + (shirt+shoes));




    }
}
