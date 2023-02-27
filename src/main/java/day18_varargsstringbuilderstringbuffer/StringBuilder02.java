package day18_varargsstringbuilderstringbuffer;
    // StringBuilder is NOT "thread-safe" and is not "synchronized"
     // "thread-safe" means being able to do multiple threads(tasks) at the same time
    // Synchronization is order of operations in "multi-thread"
    //If you need a String to use in "multi-thread" use "StringBuffer"
  // "StringBuffer" is class in Java, and it is used to create Strings.
  // "StringBuffer" is "thread-safe" and it is "synchronized"

   //"StringBuffer" was created before "StringBuilder". created in Java 5.

   /*
       1) String class is immutable
       2) StringBuilder is mutable but not thread-safe and synchronized
       3) StringBuffer is mutable, threadsafe and synchronized

    */


public class StringBuilder02 {
    public static void main(String[] args) {
        //Another way to create a StringBuilder
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Java");
        sb1.append("xxxxxxxxxxxxx");

        int length=sb1.length();
        System.out.println(length); //17

        int capacity= sb1.capacity();
        System.out.println(capacity);//34 ==> 16*2+2 general formula for capacity

        //Another way to create a StringBuilder
        StringBuilder sb2 = new StringBuilder(2);
        sb2.append("FL").append("!");
        System.out.println(sb2);

        int c2=sb2.capacity();
        System.out.println(c2); //2*2+2



    }
}
