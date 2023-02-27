package day09loops;

public class loops01 {
    public static void main(String[] args) {
        /*
        When we need to do "repeated actions" in java we use loops
        THere are 4 types of Loops in Java ==> i) for-loop ii) while-loop iii) do-while loop iv) for each
               */

        //Example 1: Type "Hi" for 5 times
        // Starting value      condition/stop point value      increment/Decrement
        for (int i=1;              i<7;        i=i+1          ) {
            System.out.print("Hello!"+ " ");
        }
         //example2: type all integers from 11 to 44 "in the same line" with a space between consecutive integers
         // 11 12 13 14 15...

            for (int i=11; i<45; i=i+1) {
                System.out.print(i+ " ");
            }
        System.out.println();

            //Example3: print only even numbers starting from 11 and ending at 44

        for( int i=11; i<45; i=i+1){
            if(i%2==0){
                System.out.print(i+ " ");
            }
        }
        System.out.println();

        //Example4: loop starting from 68 to 13. print only odd numbers

        for (int i=68; 12<i; i--){
            if (i%2!=0){
                System.out.print(i+ " ");
            }
        }
        System.out.println();

        //Example5; print letters starting from c to u
        for (char i='c'; i<'v'; i++){
            System.out.print(i+" ");
        }
        System.out.println();

        //Example6: print numbers starting from 0 to 100 without using any numbers!!!
        // if you use chars with math operations java will use ASCII values.

        for( int i='a'-'a'; i<'e'; i++ ){
            System.out.print(i + " ");
        }




        }




    }


