package day10forloopwhileloop;

import java.util.Scanner;

public class ForLoop02 {
    public static void main(String[] args) {
        // Example1: Type a code to find the sum of the unique digits in an integer
        //         123214 ==> 3+4=7

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        String num= input.next().replaceAll("[^0-9]", "");

        int sunOfUniques=0;
        for(int i=0; i<num.length(); i++){
            String ch=num.substring(i, i+1);
            if(num.indexOf(ch)==num.lastIndexOf(ch)){
                sunOfUniques=sunOfUniques + Integer.valueOf(ch);

            }
        }
        System.out.println(sunOfUniques);

    }
}
