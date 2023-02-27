package day15_ArrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList03 {
    public static void main(String[] args) {
        // Example: Ask a user to enter a letter. if the letter exist in the list convert it "X"
        //         otherwise add element user entered to the list

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a letter: ");
        char letter=input.next().charAt(0);

        List<Character> myList= new ArrayList<>();
        myList.add('J');
        myList.add('A');
        myList.add('V');
        myList.add('A');

        if (myList.contains(letter)){
            myList.set(myList.indexOf(letter), 'X');
        }else{
            myList.add(letter);
    }
        System.out.println(myList);
}

}