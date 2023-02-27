package day18_varargsstringbuilderstringbuffer;

public class StringBuilder01 {
    public static void main(String[] args) {
        /*
           1) StringBuilder is a class in Java, it is used to create Strings.
           2) We have "String Class" to create "Strings", Why we have "String Builder" class?
              "String Class" is "Immutable String", we sometimes need "Mutable String" That's why we need it

              -String Class protects original value and creates another container for new value
              -StringBuilder class will update the original value!


         */
              String s="Java";

              //Let's create a "MutableString"
        StringBuilder sb1=new StringBuilder("Java");
        System.out.println(sb1); //java

        //original value will be updated (append is used to update String)
        sb1.append("!");
        System.out.println(sb1); //Java is Love

        sb1.insert(4, " is money"); //skip first four characters and insert "is money"
        System.out.println(sb1);

         sb1.replace(2, 5, "1");
        System.out.println(sb1);

         sb1.deleteCharAt(2);
        System.out.println(sb1);

         sb1.insert(2, "v");
        System.out.println(sb1);

        // If "Reverse a String" question is asked to you in an interview,
        sb1.reverse();
        System.out.println(sb1); // reverse method() easy or use loops

        //toString(); method is for converting "StringBuilder" to "String(); method does not change
        //structure of original "StringBuilder"
        sb1.toString();



    }


}
