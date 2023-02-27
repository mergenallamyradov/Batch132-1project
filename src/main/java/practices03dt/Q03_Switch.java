package practices03dt;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Q03_Switch {
    public static void main(String[] args) {
        //Example1: Ask user to enter character, if it is vowel print "Vowel" or "not Vowel"
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter to check if it is vowel or not: ");
        char r=input.next().toLowerCase().charAt(0);

        switch (r){
            case 'a': case 'e':  case 'i': case 'o': case 'u':
                System.out.println("Vowel");
                break;
            case 'b':
            case 'c':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'v':
            case 'w':
            case 'z':
            case 'y':
                System.out.println("NOT Vowel");
                break;
            default:
                System.out.println("Please enter letter only!");
        }

    }
}
