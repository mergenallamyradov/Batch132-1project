package day14_multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        /*
            1) To create "Array" we need to declare " the number of elements" at the beginning,\
               we may need more elements to store or less elements to store inside the array.
               That is why declaring the number of elements at the beginning is not good.
               This is negative side of arrays.

               To remove that negativity, Java created a new structure whose name is "ArrayList" (List is also used),
               when we use "ArrayList", no need to declare the number of elements you want to store

               As a result: "Array" is fixed in length, "ArrayList" is flexible

             2) "ArrayList" can store only "non-primitive" data, can store " primitive" data and "references"

             3) "Array"s work super fast
                "Array"s use less memory
                if you are sure the number of elements will not change (month name), using "Array" is better


         */

        //1.Way
        ArrayList<Integer> ages = new ArrayList<>();
        System.out.println(ages); // []

        //2.way
        List<Integer> prices = new ArrayList<>();

        //How to add elements into an ArrayList
        //Note: add() method puts the element to the end
        //      add() puts the element in "insertion order"

        ages.add(13);
        ages.add(9);
        ages.add(21);
        ages.add(1, 44);
        System.out.println(ages); //[13, 9, 21]

        prices.add(230);
        prices.add(456);
        prices.add(789);
        System.out.println(prices);

        // How to add list to another list
        ages.addAll(prices);
        System.out.println(ages);

        //ages.addAll(2,prices); adds "prices" list elements into the "ages" list at index 2
        ages.addAll(2,prices);
        System.out.println(ages);

        //How to remove all elements from a list
        //clear() method removes all elements in a list
        //prices.clear();
        //System.out.println(prices);

        //How to check if a specific element exist in a list
        boolean r1=ages.contains(44);
        System.out.println(r1); //true

       //ages.containsAll(prices); if all prices list elements exist in ages list, Java returns true otherwise returns false
        prices.add(2222);
        boolean r2=ages.containsAll(prices);
        System.out.println(r2);

      //How to check if two lists are same or not
     List<String> names1=new ArrayList<>();
     names1.add("Tom");
     names1.add("Angie");
     names1.add("Mark");

        List<String> names2=new ArrayList<>();
        names2.add("Tom");
        names2.add("Angie");
        names2.add("Mark");

        //equals() method check if the lists have same elements in the same indexes
        //if the same elements in the same indexes, equals() method returns true otherwise false

        boolean r3= names1.equals(names2);
        System.out.println(r3); // true

       //Example1: type code to check if 2 lists have same elements.
        //         Same elements can be in different indexes.
        //         [A, B, C] and [A,C,B] and [B, A, C] etc ==> true

        List<Character> m= new ArrayList<>();
        m.add('A');
        m.add('B');
        m.add('C');

        List<Character> n= new ArrayList<>();
        n.add('B');
        n.add('C');
        n.add('X');

        Collections.sort(m);
        Collections.sort(n);

        boolean r4= m.equals(n);
        System.out.println(r4);





    }

}
