package day12_arrays_foreachloop;

public class Array03 {
    public static void main(String[] args) {
        //Example1:create a String array with 5 elements, delete the elements whose length is less than 5
        //         [Orange, Blue, red, yellow, Brown] ==> [Orange, yellow, Brown]

        String colors[]=new String[5];
        colors[0]="Orange";
        colors[1]="Blue";
        colors[2]="Red";
        colors[3]="Yellow";
        colors[4]="Brown";

        //How many elements have greater than or equal to 5 characters
        int counter=0;
        for(String w: colors){
            if(w.length()>=5){
                counter++;

            }
        }
        System.out.println(counter);






    }

}
