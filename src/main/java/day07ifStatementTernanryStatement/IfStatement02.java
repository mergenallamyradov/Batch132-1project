package day07ifStatementTernanryStatement;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        //Example1: Get user's age
        // 0-4== > Baby -- 5-12==>Kid  -- 13-19 ==> teenager   20-30 ==>Adult --  others==> Undefined
        // Negative ages ==> Invalid age

        Scanner input = new Scanner(System.in);
        System.out.println("ENTER YOUR AGE: ");
        byte age = input.nextByte();

        if (age < 0) {
            System.out.println("INVALID AGE...");
        } else if (age < 5) {
            System.out.println("BABY");
        } else if (age < 13) {
            System.out.println("KID");
        } else if (age < 20) {
            System.out.println("TEENAGER");
        } else if (age < 31) {
            System.out.println("ADULT");
        } else {
            System.out.println("UNDEFINED");


        }
    }
}