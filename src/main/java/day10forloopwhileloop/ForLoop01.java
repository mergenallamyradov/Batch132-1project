package day10forloopwhileloop;

public class ForLoop01 {
    public static void main(String[] args) {
        //Example1: Type a code to calculate the multiplication of Integers from 3 to 6

        int multiplication=1;
        for(int i=3; i<7; i++) {
            multiplication=multiplication*i;
        }
        System.out.print(multiplication);
        System.out.println();

        //Example2: Type a code to find the sum of the digits in a given integer

        int num=578;
        num=Math.abs(num); // Math.abs is used to get + number all the time

        int sumOfDigits=0;
        for (int i=578;i>0; i=i/10){
            sumOfDigits=sumOfDigits+i%10;
            System.out.println(sumOfDigits);
            /*
            Note 1: If you want to get the last digit of an integer use "number%10"
            Note 2: If all numbers are Integers in a mathematical operation, the result will be in "Integer" data type.
            If the result is in decimal data type, Java converts the decimal to Integer by removing the decimal part.
            Java does not do "rounding operation" to convert decimals to integers
            57/10 ==> 5
            Note 3: If you use different data types in mathematical operations, the result will be in the largest data type
            12/5.0 ==> 2.4
            57.0/10 ==> 5.7
            57/10.0 ==> 5.7
            57.0/10.0 ==> 5.7

             */
        }
             //Example 3: Type code to check if a String is "palindrome" or not?
             //           anna, civic, 1234321 is palindrome

        String str= "anna";
        String reverse="";
        for (int i=str.length()-1; i>=0; i--){
            char ch=str.charAt(i);
            reverse = reverse+ch;
        }
        System.out.println(reverse);
        if (str.equals(reverse)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }



    }
}
