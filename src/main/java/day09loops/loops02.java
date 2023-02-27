package day09loops;

public class loops02 {
    public static void main(String[] args) {
        //Example1. Put * between 2 consecutive and the end in a String. Example
        // Java ==> J*a*v*a*
        //String uses indexes (starting value is zero)

        String s="Java";
        for (int i=0; i<s.length(); i++){
            System.out.print(s.charAt(i) + "*");
        }

        System.out.println();

        //Example2; Type a code to print unique characters in a String.
        //          Hello ==> Heo
        String t="Hello";
        for (int i=0; i<t.length(); i++ ){
            if(t.indexOf(t.charAt(i)) == t.lastIndexOf(t.charAt(i))){
                System.out.print(t.charAt(i));
            }

            }
        System.out.println();

        // Example3: Type a code to print a String in reverse order
        //          "Ali Can" ==>   "naC ilA"
        String u="Ali Can";
        for (int i=u.length()-1; i>=0; i--){
            char ch = u.charAt(i);
            System.out.print(ch);

        }
        System.out.println();

        //Example4: type a code to find the sum of the integers from 3 to 7

        int sum=0;
        for(int i=3; i<8; i++){
            sum=sum+i;
            System.out.println(sum);

        }



    }

}
