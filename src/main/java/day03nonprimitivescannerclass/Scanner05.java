package day03nonprimitivescannerclass;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in) ;
        System.out.println("Enter the radius of the Circle: ");
        float radius = input.nextFloat();
        float pi = 3.14159F ;

        System.out.println("area=" + pi*radius*radius);
        System.out.println("perimeter=" + 2*pi*radius);


    }

}
