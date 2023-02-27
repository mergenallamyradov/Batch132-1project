package day03_typecasting_scanner;

public class TypeCasting01_DT {
    public static void main(String[] args) {


        int a=23, i=45 ;

        String str = "tom" ;
                str.toUpperCase() ; // TOM
         System.out.println(a + i + str);
         System.out.println(str + a + i);
         System.out.println(str + (a+i));

         int m=14 ;
         double d=m;

         int n=20;
         byte b=(byte) n;

        int num1= 33000;
        short num2 = (short)num1;
        System.out.println(num2);






    }




}
