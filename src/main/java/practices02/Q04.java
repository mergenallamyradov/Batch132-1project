package practices02;

public class Q04 {
    public static void main(String[] args) {
 /*
        Create a String variable and find the sum of ASCII values of the first and the last characters
        of the String.
        String s= "Miami";
         */

        String s= "California";
        int indexOfLastChar = s.length() - 1;

        int AsciiFirst= s.charAt(0);

        int AsciiLast = s.charAt(indexOfLastChar);
        System.out.println("Ascii value of C="+AsciiFirst);
        System.out.println("Ascii value of i="+AsciiLast);
        System.out.println("Total Value of first and Last characters: "+ (AsciiFirst+AsciiLast));

        String t=" ";
        int AsciiSpace=t.charAt(0);
        System.out.println(" Ascii value of space:"+AsciiSpace);





    }
}
