package day21inheritance;

public class AnimalRunner {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        System.out.println(myCat.age); // 14 Cat class has age variable that is why the object does not use parent's variable.

        System.out.println(myCat.initial); // A <== Cat Class does not have "initial" but parent Mammal has

       //When you create an object, you can select data type of the object from the class itself or
        // from any parent

        //When you select a variable in an inheritance, focus on the "data type of the object"
        //The variable will be looked for starting from the class used in "data type of the object"

        // When you call a method in inheritance, focus on the constructor.
        //start to look for the method from the class used its constructor.

        /*OOP concept has 4 principles;
          1) Inheritance (Ok)
          2) Polymorphism = Method Overloading(OK) + Method Overriding(NOT ok)
          3) Encapsulation (Not OK)
          4) Abstraction = Abstract Class(Not OK) + Interface(not OK)

         */



        Object cat0=new Cat();

        Animal cat1=new Cat();
        System.out.println("Parent is Animal" + cat1.age);//4

        Mammal cat2=new Cat();
        System.out.println("Parent is Mammal" + cat2.age);//6
        System.out.println("Parent is Mammal" + cat2.name);//A

        Cat cat3=new Cat();
        System.out.println("Parent is Cat" + cat3.age);//14



    }
}
