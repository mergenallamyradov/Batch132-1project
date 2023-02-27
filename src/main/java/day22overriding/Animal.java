package day22overriding;
 /*
   1) Sometimes using method directly from parent class may not be enough for us.
      We may need the method to specify
      When we need the method to specify, we change the method body.
      This is called "Method Overriding"
   2) We cannot touch "Method Signature"(Method Name and Method Parameters) in "Method Overriding"
      I mean do not touch Method Name and Method Parameters
   3) The method in child class(Overriding Method) can use "same" or "Wider" access modifier than the method in parent
      class (Overridden Method).
   4) When you change a return type in "Method Overriding", from child to parent you must have "IS-A/AN" relationship
   5) Return type of overridden method can be the "top return type" of the Overriding method
   6) if there is "IS-A/AN" relationship between return types , those called "Covariant return Types"
   7) Between the "Wrapper Classes" there is no parent/child relationship that is why you cannot have "IS-A"relationship
      if you cannot have "IS-A relationship" you cannot change  return type in "Method Overriding"
    8)Between the"primitive data types" there is no "parent-child relationship" that is why you cannot have "IS-A" relationship
     If you do not have "IS-A" relationship you cannot change return type in "Method Overriding"
    9)If the return type is void you cannot change it in method overriding
    10) "private" methods in "parent class" cannot be overridden
    11) "Static" method  cannot be overridden

    "final" keyword in Java:
    1) "final" keyword can be used for variables
        i) You have to initialize the variable ii) After assigning a value you cannot update the value
    2) "final" keyword can used for classes
        if you use "final" keyword for a class, the class cannot have "Child Class"
     3)"final" keyword can be used for methods
          If you use "final" keyword for methods, the method cannot be overridden.
          The body of a "final method" cannot be updated, so it cannot be overridden because in overriding we update the method

  12) Polymorphism = Method Overloading + Method Overriding
  What is the difference between "Method Overloading" occurs in a single class we do not need "inheritance"

  */


public class Animal {
    public void eat(){
        System.out.println("Animals eat..."); //Overridden method

    }
    public Animal create(){
        return new Animal();
    }

    public String word(){
        return "Tom";
    }

    public Integer number(){
        return 123;
    }

    public int num(){
        return 12;
    }


}
