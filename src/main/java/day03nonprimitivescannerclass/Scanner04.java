package day03nonprimitivescannerclass;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Eneter the width, length and height to calculate the Volume: ");
        double width = input.nextDouble();
        double height = input.nextDouble();
        double length = input.nextDouble();

        System.out.println(" Volume of the Container = " + (width*height*length));

        
    }
    
}
