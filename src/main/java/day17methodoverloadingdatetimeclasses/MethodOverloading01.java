package day17methodoverloadingdatetimeclasses;

public class MethodOverloading01 {
    /*
    1) if you create methods with i) the same name and ii) different parameters, it means you created "method overloading"
    2) if you make method names and the parameters same in 2 different methods Java complains because if the names and the
    parameters are same , Java accepts the methods exactly same.
    Typing same methods repeatedly cannot be accepted by Java
    3) Java checks just the "method name" and "parameter" to understand if the methods are same or not.
       "method name" and "parameter" are called " method signatures"
    4) How can we make the parameters different?
       i) use different data types for the parameters
       ii) if data types are different you can change the order of the parameters
       iii) Change the number of parameters
    5) Access modifiers don't take any role in "method overloading" , any method can be overloaded
    6) to be static or non-static does not effect  "method overloading" , both can be overloaded


     */


    public static void main(String[] args) {
        multiply(3, 4);

        multiply(3,3.2);

        multiply(3.2,3);



    }

    //Create a method multiplies tw integers

    public static int multiply(int a, int b) {
        return a * b;
    }

    // Create a method multiplies one double and one integer
    public static double multiply(double a, int b) {
        return a * b;
    }

    // Create a method multiplies one int and one double
    public static double multiply(int a, double b) {
        return a * b;
    }

    //create a method multiplies three integers
    public int multiply(int a, int b, int c){
        return a*b*c;
    }

}