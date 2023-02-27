package day12_arrays_foreachloop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //Example1: create an integer array, add 6 elements in it. Find the sum of all elements

        int number[] = new int[6];
        number[0]=2;
        number[1]=4;
        number[2]=6;
        number[3]=8;
        number[4]=10;
        number[5]=12;
        int sumOfNumber=0;
        for (int w: number){
            sumOfNumber=w+sumOfNumber;
        }
        System.out.println("Sum of Array:" + sumOfNumber);

        //Example2: Create an integer array, type code to find the sum of the min and the max value.

        int math[]= new int[4];
        math[0]=12;
        math[1]=45;
        math[2]=9;
        math[3]=56;
        System.out.println(Arrays.toString(math)); //[12, 45, 9, 56]

        // sort() method puts the elements in ascending order
        Arrays.sort(math);
        System.out.println(Arrays.toString(math)); //[9, 12, 45, 56]

        int sumOfMinMax = math[0] + math[math.length-1];
        System.out.println(sumOfMinMax); //65

        //2.Way
        int mat[]= new int[4];
        mat[0]=12;
        mat[1]=45;
        mat[2]=9;
        mat[3]=56;
        System.out.println(Arrays.toString(mat)); //[12, 45, 9, 56]

        int minValues= mat[0];
        int maxValues=mat[0];

        for(int w: mat){
            minValues=Math.min(minValues, w);
            maxValues=Math.max(maxValues, w);
        }
        System.out.println(minValues); //9
        System.out.println(maxValues); //56

        System.out.println(minValues+maxValues);

    }

}
