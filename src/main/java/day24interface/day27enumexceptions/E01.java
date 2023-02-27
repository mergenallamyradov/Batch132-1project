package day24interface.day27enumexceptions;

public class E01 {
     /*
    1) Exception means "un-expected issue" in codding
    2) When we have exception we have two ways:
        i) We can handle it by using "try-catch block"
        ii) We "Throw Exception" and block the application.
    3) We handle the Exception mostly, if you do not handle the exception
        i) Execution will be stopped
        ii) Application will be blocked
     */

    public static void main(String[] args) {

        System.out.println(divide1(4, 2));//2
        System.out.println(divide1(0, 55));//0
        System.out.println(divide1(6, 0));//ArithmeticException ==> / by zero
        System.out.println("Hello World");//divide1(6,0) threw ArithmeticException that is why this code can not be executed.
        //When you break any mathematical rule like dividing by zero, Java throws ArithmeticException.

        System.out.println(divide2(4, 0));
        System.out.println(divide2(4, 1));

    }

    //Example 1: Create a method divides two integers
    //1. Way: We can use if-else but it is not recommended.
    public static int divide1(int a, int b) {
        if (b == 0) {
            System.out.println("Divider can not be 0");
            return 0;
        } else {
            return a / b;
        }
    }

        //2. Way: We can use try-catch block

    public static int divide2(int a, int b) {
        int result = 0;
        try {
            result = a / b;
            System.out.println("Hello World 2");
        } catch (ArithmeticException e) {
            System.out.println("Divider can not be 0");
        }

        return result;
    }

}
