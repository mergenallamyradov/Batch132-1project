package day21inheritance;

public class Civic extends Honda{

    public void ecoSystem(){

        System.out.println("Using Civic is not expensive...");
    }

    public Civic() {
        super();
        System.out.println("Civic constructor...");

    }

    public Civic(boolean hybrid){
        super(2021);
        System.out.println("Civic constructor with boolean parameter");
    }
}
