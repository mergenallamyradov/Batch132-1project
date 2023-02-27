package day16_arrayList;

public class PassByValuePassByReference {
    public static void main(String[] args) {

        /*
        1) PassByValue creates a copy of the value and uses the copy in the method.
        That's why methods can change just the copy of value
        Java uses PassByValue to protect original values
        2) C# uses PassByReference. map example (both copy and original values are updated)
         */

        int shirtPrice=100;
        studentShirtPrice(shirtPrice, 10);
        System.out.println(shirtPrice); // 100= original value is protected

        String name = "Ajda";
        String result = putExclamation("Ajda");
        System.out.println(result);//Ajda!
        System.out.println(name);  //Ajda

        //using a method inside the main method is called "Method Call"
        double newSalary = increasedSalary(20000);
        System.out.println(newSalary); //24000


       int result2= getAbsoluteValue(-7);
        System.out.println(result2); // 7

        int result3=additionOfTwoIntegers(89,-85);
        System.out.println(result3);

    }
    public static void studentShirtPrice (int shirtPrice,int discount){
        int discountedPrice=shirtPrice-discount;
        System.out.println("student discount 10% =" + discountedPrice);
    }

    public static String putExclamation(String name) {
        return name + "!";
    }

    //create a method increases the salary 20 percent
    public static double increasedSalary(double salary){
        return salary*1.2;

    }

    public static int getAbsoluteValue(int number){
        return Math.abs(number);

    }

    // Create a method adds two Integers
    public static int additionOfTwoIntegers(int a, int b){
        return a+b;
    }



    // Create a method prints the first and the last character on the console



    }


