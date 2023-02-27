package day24interface;

public interface Ac   {

   public abstract void cool();

   void heat(); // Even if you don't mention public and abstract for the heat method it automatically understands

   // By using "default keyword before "return type" of the method, you can create "method with body" in an interface
   //2) When you create "bacteriaKiller() default method, "Honda Concrete Child Class" will not complain, because
   //Overriding is mandatory for "abstract methods" but "bacteriaKiller() default method" is not abstract.
   //3)
   default void bacteriaKiller(){
      System.out.println("Ac's kill the bacteria %99.9...");
   }

   static void climate(){
      System.out.println("Climate settings are working... ");
   }
}
