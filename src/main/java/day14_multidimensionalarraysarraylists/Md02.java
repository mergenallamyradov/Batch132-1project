package day14_multidimensionalarraysarraylists;

public class Md02 {
    public static void main(String[] args) {
        //Example1: type code to find the multiplication of all elements of multidimensional array;

        int a[][] = {{5, 4}, {10, 6, 3}};

        int multiplication = 1;

        for (int[] w : a) {
            for (int k : w) {
                multiplication=multiplication*k;
            }

        }
        System.out.println(multiplication);
    }
    }