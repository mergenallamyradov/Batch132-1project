package day03nonprimitivescannerclass;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        // Ask user to enter width and length of rectangle, then calculate
        //perimeter and the area of the rectangle
        Scanner input = new Scanner (System.in) ;
        System.out.println("Enter width and length of the rectangle: ");

        double width = input.nextDouble();
        double length = input.nextDouble();

        System.out.println("perimeter of the rectangle = " + (2*width+2*length));
        System.out.println("Area of the rectangle = " + (width*length));




    }

}
