package day29exceptionsmaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static java.time.chrono.JapaneseEra.values;
/*
1)Maps have key-value structure.
        2)Keys are unique; values can be repeated.
        3)Map elements are called "Entry".
        4)All Map elements are called "Entry Set".
        5)Maps are in 3 types: i)HashMap
        ii)HashTable
        iii)TreeMap

 */

public class HashMap01 {
    public static void main(String[] args) {

        HashMap<String, Integer> cp = new HashMap<>();
        System.out.println(cp); // {}

        cp.put("USA", 400000000);
        cp.put("Germany", 83000000);
        cp.put("Albania", 30000000);
        cp.put(null, 450000000);
        cp.put("Democratic Congo", null);
        cp.put("Nicaragua", null);
        cp.put("Nicaragua", 1200000);


        System.out.println(cp);//

        //How to get just the keys
        //Example 1: Type code to find the number of characters used in the keys
        Set<String> keys = cp.keySet();
        System.out.println(keys);

        int sum=0;
        for (String w: keys){
            if(w!=null){
                sum=sum+ w.length();
            }
        }
        System.out.println(sum);

        //How to get just values
       //Example2: Type a code to find the total population of the countries in the Map
        Collection<Integer> values = cp.values(); // values() method returns all values
        System.out.println(values);

        int total = 0;
        for (Integer w: values){
            if(w!=null){
                total = total + w;
            }
        }
        System.out.println(total);

        // How to get the value of a specific key
        // Type code to find the population of the USA.

        Integer populationUsa=cp.get("USA");
        System.out.println(populationUsa);

        //How to update values in Map
        cp.replace("USA", 410000000);
        System.out.println(cp);

        cp.replace("USA", 410000000, 390000000);
        System.out.println(cp);

        int numOfEntries = cp.size();// size() method returns num of enteries
        System.out.println(numOfEntries);//6

        Integer r1=cp.getOrDefault("USA", 0);
        Integer r2=cp.getOrDefault("XYZ", 0); //used not to get null value for non-existing entries
        System.out.println(r1);
        System.out.println(r2);

        cp.putIfAbsent("USA", 500000000);// USA already exists
        cp.putIfAbsent("Belgium", 500000000);// will be added

        boolean r3 = cp.containsKey("USA");
        System.out.println(r3); // true

        Set<Map.Entry<String,Integer>> allEntries=cp.entrySet(); // entrySet() method returns all entries in a Set whose elements are in "Set<Map.Entry<K,V>>
        for(Map.Entry<String,Integer> w: allEntries){
                        System.out.println(w.getKey() + "-" + w.getValue());
        }


    }
}
