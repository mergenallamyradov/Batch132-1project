package day03nonprimitivescannerclass;

import java.util.Scanner;

public class ScannerDraft01 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //Enter the names and midterm scores of 3 students
        // calculate the average of midterm among 3 students and print it

        System.out.println("your name: ");
        String name = input.nextLine();
        System.out.println("score: ");
        double score01= input.nextDouble();

        System.out.println("your name2: ");
        String name02 = input.next();
        System.out.println("score: ");
        double score02= input.nextDouble();

        System.out.println("your name3: ");
        String name03 = input.next();
        System.out.println("score: ");
        double score03= input.nextDouble();

        System.out.println("Average of Midterm " + (score01+score02+score03)/3);



    }
}
