package practices02;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        //Ask user to enter an integer then print "Even" on the console if the number is even.
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int number=input.nextInt();
        boolean checkedNum=number%2==0;
        System.out.println("Is the number even?="+checkedNum);

        //Check a number if it is an odd or not.

        Scanner input2= new Scanner(System.in);
        int checkodd=input2.nextInt();
        System.out.println("Is the number odd? = " + (checkodd%2!=0));

    }
}
