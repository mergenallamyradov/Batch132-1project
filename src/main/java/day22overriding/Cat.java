package day22overriding;


public class    Cat extends Mammal{
    @Override // Override Annotation ==> Checks the overriding rules
    public void eat() {
        System.out.println("Cats eat..."); //Overriding method
    }

    @Override
    public Animal create() {
        return new Cat();
    }

    @Override
    public Mammal occur() {
        return new Cat();
    }

    @Override
    public Integer number() {
        return 456;
    }

    @Override
    public int  num() { return 24;  }
}
