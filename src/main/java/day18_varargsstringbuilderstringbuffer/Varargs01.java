package day18_varargsstringbuilderstringbuffer;
      /* 1)  Varargs are used to work with any number of parameters.
         2) "Varargs" is a data structure uses "Arrays behind that is why when you use "Varargs"
            you may think you use "Arrays"
         3) Varargs are endless pit that's why you cannot use multiple varargs in one method!!!
            you cannot use another parameter with varargs (boolean...)
         4) Can I put any parameter before "Varargs"?
            Yes. it is possible.

            NOTE: "Varargs" should be last parameter in a method




    */




public class Varargs01 {
    public static void main(String[] args) {

     int r1=add(3,2,3,4);
        System.out.println(r1);




    }
    //Create a method to add any number of integers
    public static int add(int... v){
        int sum=0;
        for (int w:v){
            sum=sum+w;
        }
     return sum;
    }



}
