package practices04dt;

import day03nonprimitivescannerclass.Scanner01;

import java.util.Scanner;

public class SelfStudy01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a month name to see the season: ");

        String month= input.next().toLowerCase();

        if(month.equals("june") || month.equals("july") || month.equals("august")){
            System.out.println("SUMMER");
        }else if (month.equals("september") || month.equals("october") || month.equals("november")){
            System.out.println("AUTUMN");
        } else if (month.equals("december") || month.equals("january") || month.equals("february")) {
            System.out.println("WINTER");
        } else if (month.equals("march")||month.equals("april")||month.equals("may")) {
            System.out.println("SPRING");
        }else{
            System.out.println("PLEASE ENTER VALID MONTH NAME");
        }



    }
}
