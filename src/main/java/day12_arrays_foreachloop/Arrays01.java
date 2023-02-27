package day12_arrays_foreachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        /*
        1) primitive variables and Strings can store just a single data in them
        sometimes we need to store multiple data in a single container.
        To be able to store multiple data in a single container, Java created a new structure whose
        name is "Arrays"

        2) Arrays cannot store "non-primitives", if you see "non-primitives" were stored actually they are
           "references of non-primitives"
           Arrays can store i) primitive data types and ii) references of non-primitives
         */
        int num=12;
        String str="Tom";
        // How to create an Array
        String sixthGraders[] = new String [5];

        System.out.println(sixthGraders); // [Ljava.lang.String;@3ac3fd8b=> this is address of array
                                          //  we need address elements mostly that's why we use it as follows:
        System.out.println(Arrays.toString(sixthGraders));//[null, null, null, null, null]

        //How to add elements into an Array
        sixthGraders[1]="Ali";
        sixthGraders[4]="Angie";
        sixthGraders[0]="Tom";
        sixthGraders[3]="Mark";
        sixthGraders[2]="Jim";
        System.out.println(Arrays.toString(sixthGraders)); //[Tom, Ali, Jim, Mark, Angie]

        //How to print specific element or elements from an array
        System.out.println(sixthGraders[1]); //Ali

        System.out.println(sixthGraders[0]+" - "+ sixthGraders[4]); // Tom - Angie

        // How to find the number of elements in an Array
        int numOfElements = sixthGraders.length;
        System.out.println(numOfElements); //5

     //Example 1: create a String Array, add 5 elments in it, type a code to print
        // first and last element on the console. Make your code dynamic.

        String example[] = new String[5];
        example[0]="Ahal";
        example[1]="Mary";
        example[2]="Lebap";
        example[3]="Dashoguz";
        example[4]="Balkan";
        System.out.println(Arrays.toString(example));

        int numOfCharInFirst=example[0].length();
        int numOfCharInLast= example[example.length-1].length();
        System.out.println(numOfCharInFirst+numOfCharInLast);

      // again similar with above: The sum of all characters in all element on the console
         String names[]=new String[5];
         names[0]="Mergen Allamyradow";
         names[1]="Serdar Bayramow";
         names[2]="Suray otuzova";
         names[3]="Davud Allamyradow";
         names[4]="Kuvvat Gittikov";

          int sumOfChars=0;
         for(int i=0; i<names.length; i++){
             int chars=names[i].length();

             sumOfChars=sumOfChars+chars;
         }
        System.out.println(sumOfChars);

         // 2.Way: Use for-each loop(Enhanced loop)
        int total=0;

        for(String w: names ){
            total=total+w.length();
        }
        System.out.println(total);

       // Note: "for-each loop" can be used with "Arrays" and " Collections", if there is no
        // "arrays" and " collections" you cannot use "for-each loop", you have to use "for-loop"
        // or "do while loop"

        //Note2: sometimes "for-each loop" cannot be used with "Arrays" and "Collections" as well.
        //        When using indexes is must, using "for-each loop" can be impossible.
    }
}
