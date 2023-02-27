package day11nestedforloopwhileloopdowhilelloop;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {
        //example 1: type code to print integers from 4 to 7 on the console

        //1. way: use for-loop
        for (int i = 4;i < 8; i++){
            System.out.print(i + " ");
        }

        System.out.println();
        //2. way: use while-loop ==> it is more readable than for-loop
        int i = 4;
        while (i<8){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        //Example 2: Type code to print odd integers from 12 to 67 in the same line with a space between them
        int j=12;
        while (j<68){
            if (j%2!=0){
                System.out.print(j+ " ");
            }
            j++;
        }
        System.out.println();

        //Example 3: Type code to find the sum of integers from 12 to 67
        int k=12;
        int sumOfIntegers=0;
        while (k<68){
            sumOfIntegers=sumOfIntegers+k;
            k++;
        }
        System.out.println(sumOfIntegers);

        //Example 4: Type java code by using while loop,
//           Write a program that prompts the user to input an integer.
//           It should then find the sum of the digits of that number.
//           123 ==> 1+2+3 = 6

        Scanner input = new Scanner (System.in);
        System.out.println("Enter an Integer, please");
        int num2= input.nextInt();
        int addition=0;
        while(num2>0){
            addition=addition+num2%10;
            num2=num2/10;
        }
        System.out.println(addition);

        /*
     Example 5: Type java code by using while loop,
     Write a program that prompts the user to input a number.
     It should then print the multiplication table of that number.
     3x1=3  3x2=6  3x3=9  3x4=12 3x5=15  3x6=18  3x7=21  3x8=24  3x9=27  3x10=30
 */
        System.out.println("Enter an Integer to create multiplication table...");
        int n=input.nextInt();
        int r=1;

        while(r<11){
            System.out.print(n+"x"+r+"="+(n*r)+ " ");
            r++;
        }





    }
}
