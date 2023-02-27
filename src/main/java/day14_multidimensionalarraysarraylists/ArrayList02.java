package day14_multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {
        //Example2: type code to print the elements of the list if the elements are greater than the number of elements
        //        [5,9,3,4,6] ==> 9 and 6 is greater than number of list elements(5)

        List<Integer> nums= new ArrayList<>();
        nums.add(5);
        nums.add(9);
        nums.add(3);
        nums.add(4);
        nums.add(6);

        // 1.Step: Find the number of List elements
        int numOfEl = nums.size();

        //2.Step: Check if an element is greater than the number of List elements then print it
        for (Integer w: nums){
            if (w>numOfEl){
                System.out.print(w+ " ");
            }
        }

    }
}
