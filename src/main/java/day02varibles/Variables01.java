package day02varibles;

public class Variables01 {
    public static void main(String[] args) {

        //Data Type Variable Name = value   ;
            int        age        = 28      ;

            //Example 1: Create a variable whose value is 1.99

      double priceofPen = 1.99 ;

      /* Data Types
        // 1) integer; W use "integer" data type for whole numbers. The minimum value of integer value of integer is -2,147,483,648
        and the maximum value for integer data type is 2,147,483,648
        Integer variables use 32 bits in memory.

        2) short: it is used for numeric value. The minimum value of short -32,768 and maximum value is 32,767.
        short variables uses 16 bit in memory

        3) byte: it is used for whole numbers. The minimum value for byte is -128 and maximum value is 127. byte variables
        use 8 bits in memory.

        4) long: it is used for whole numbers. The minimum value for long is -9,223,372,036,854,808 and the maximum value is
         9,223,372,036,854,808



       */

        int populationofGermany = 7856784 ;
                System.out.println(populationofGermany);


         //Note: Java accepts long values as integers in default. But if your value is greater than the maximum value of integers
        // you will get error and to fix that error you have to put "L" at the end of numeric value.
                long populationofWorld = 700000000000L ;
                System.out.println(populationofWorld);

                byte ageofstudents = 23 ;
                System.out.println(ageofstudents);

                short populationofVillage = 23000 ;
                System.out.println(populationofVillage);


                /*
                Data types for decimal values
                1) float: it is used for decimal values ( like 12.99, 34.89)
                float values use 32 bits in memory

                2) double: used for decimal values and it uses 64 bits in memory
                what is the value of double Max_value?
                positive 1.79769311348E+308


                When you create a float object, you have to use "f" or "F" at the end of the value.
                       */

         float priceofShirt = 34.99F ;
         System.out.println(priceofShirt);

         double weightofCell = 0.000000122345 ;



         /*
         Numeric data types in Java ==> byte < short < int< long< float < double
         2 more data types;

          1) boolean ==> has "true" or "false" values. boolean uses 1 bit in memory
          2) char == > used for just a single charcter values ==> "a" or "K". it uses 16 bits in memory

          */


    }




}
