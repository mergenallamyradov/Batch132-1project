package day21inheritance;

public class Vehicle{

    //    1)Every class excepts Object class has parent class in Java
    //    2)Objective Class is the parent class of all classes in Java
    //    3) Just object class does not have any parent class in java
    //
    //    4) java executes "Constructors" from top to bottom in inheritance
    //    5) to be able to execute "Constructors from top to bottom, Java goes to "Objective class" as default
    //       execution
    //     6) super () is for calling constructor from the first level parent(closest parent)
    //     7) super() is located by Java into every constructor but it is invisible
    //     8) if you want to make visible, you can type it explicitly
    //     9) When you type "super()" explicitly, you have to type it into the first line inside the constructor body
    //     10) "this()" is for calling constructor from the class itself
    //    11) When you type "this()", you have to type it in the first line of constructor body.
    //    12) "this()" and "super()" cannot be used in the same constructor body together, because if you anyone of them
    //    the other line can accept the second one.
    //
    //    13) if a variable exist in  a class Java uses the variable from the class itself
    //    14) if a class does not have the requested variable in it, Java looks for the variable in the parent classes
    //    15) if use "this" inside the constructor, it means you are calling a varaible from the class itself
    //    16) if use "super" inside the constructor, it means you are calling a variable from the first level parent class
    //
    //    What is the difference between "this()" and "super()"?
    //    Answer: "this()" is calling for constructor from the class itself.
    //            "super()" is calling constructor from the first level parent class
    //
    //    What is the difference between "this()" and "this"?
    //    Answer: "this()" is calling for constructor from the class itself.
    // super   is calling variable from the class itself.
    //
    //    What is the difference between "super()" and "super"?
    //     Answer: "super()" is calling constructor from the first level parent class
    //             this is calling variable from the class itself.

    public void move(){
        System.out.println("All vehicles move...");
    }

    public void price(){
        System.out.println("You should pay the price...");
    }


    public Vehicle() {
        super();
        System.out.println("Vehicle constructor...");

    }

    public Vehicle(String name){
        System.out.println("Vehicle constructor with String parameter");

    }

}
