package day21inheritance;

public class Honda extends Vehicle{

    public void engine(){
        System.out.println("Honda uses perfect engine system... ");

    }

    public void brake(){
        System.out.println("Honda uses sturdy brakes...");

    }

    public Honda() {
        super();
        System.out.println("Honda Constructor...");
    }

    public Honda(int year){
        super("luxury");
        System.out.println("Honda constructor with int parameter");
    }

}
