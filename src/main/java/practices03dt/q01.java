package practices03dt;

public class q01 {
    public static void main(String[] args) {
        //Example 1: Type code to select the minimum one of two integers
        // ternary should be used

        int a=35;
        int b=5;
        //1way:
        if(a<b){
            System.out.println("a is minimum");
        }else{
            System.out.println("b is minimum");
        }

        //2Way
        int res= a<b ? a : b;
        System.out.println("minimum value is: "+ res);

         String result = a<b ? "a is minimum": "b is minimum"; // less coding syntax
        System.out.println(result);


        //Example2: Type a code to calculate absolute value of an integer
                int c=-5;
        int r2= c<0 ? -1*c : c;
        System.out.println("Absolute value is: "+ r2);

        //Example3: If 2 integers are positive return the multiplication
        //         otherwise, give a message like " I cannot do that"

        int d=5;
        int e=-7;
        Object r3=d>0 && e>0 ? d*e : "I cannot do it pal";
        System.out.println(r3);

        //Type code to check if an integer has 3 digits or not==>
        // Boundary Value Analysis--> -1000, -999, 100, -99, 0, 99, 999, 1000

        int h=789;
        int h1=Math.abs(h);

        String r4=h1>99 && h1<1000 ? " It has 3 integer": "NO";
        System.out.println(r4);







    }

}
