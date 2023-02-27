package day24interface;

public class CarRunner {
    public static void main(String[] args) {
        Honda myHonda = new Honda();

        myHonda.cool();
        myHonda.heat();
        myHonda.run();
        myHonda.bacteriaKiller();

        Ac.climate();

        //Ac myAc = new Ac(); ==> "Ac" is interface; cannot be instantiated


    }



}
