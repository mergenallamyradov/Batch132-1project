package day10forloopwhileloop;

import java.util.Scanner;

public class NestedForLoop01 {
    public static void main(String[] args) {
        /*
            2.Example:Type code to get the output like
                Week: 1
                  Day: 1
                  Day: 2
                  Day: 3
                  .....
                Week: 2
                  Day: 1
                  Day: 2
                  Day: 3
                  ....
                Week: 3
                  Day: 1
                  Day: 2
                  Day: 3
                  ....
 */
        for(int i=1; i<5; i++){
            System.out.println("Week: "+ i);
            for (int k=1;k<8; k++){
                System.out.println("Day: "+ k);
            }

        }

        /*
     Example 3: Write a Java Program to Print Rectangle Star Pattern using For Loop
                 ****
                 ****
                 ****
     Note: Get the number of rows and columns from user
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows please: ");
        int rows= input.nextInt();

        System.out.println("Enter the number of columns");
        int columns= input.nextInt();

        for(int i=1; i<=rows; i++){
            for (int k=1; k<=columns; k++){
                System.out.print("*");
            }
            System.out.println();
        }






    }
}
