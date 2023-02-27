package day22overriding;

public class Mammal extends Animal{
    public void feed(){
        System.out.println("Mammals feed their child with milk...");

    }

    public Animal occur(){
        return new Mammal();
    }


}
