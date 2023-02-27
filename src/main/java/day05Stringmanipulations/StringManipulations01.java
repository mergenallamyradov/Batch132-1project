package day05Stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        String s="Alabama State" ;

        //1st Way
        boolean result1= s.charAt(6)=='a';
        System.out.println(result1);
        //2nd Way
        boolean result2=s.startsWith("a" , 6);
        System.out.println(result2);

    //Example : Type code to check if a String is ending with "money"

        String t="learn Java earn money";
        boolean result3=t.substring(t.length()-5).equals("money"); // 21-5

        //2.Way
        boolean result4 = t.endsWith("money");
        System.out.println("result4 "+result4);

        //Example 3: Type code to convert "money" to "dollar"
       String newT = t.replace("money", "dollar");
        System.out.println("NewT = " + newT);

        //Example4: Type code to convert "a" to"*"
        // Note: you can use "char" and Strings in replace() parenthesis. Both data types should be matching
        // either use '' or "" in both data types inside the parenthesis.
        String t2=t.replace("a", "*");
        System.out.println("t2:"+ t2);

        //Example5: Type code to convert "earn" to "win"
        String t3=t.replace("earn", "win");
        System.out.println("t3:"+t3);



    }

}
