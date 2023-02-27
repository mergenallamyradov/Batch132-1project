package practices02;

import javax.print.DocFlavor;

public class Q05 {
    public static void main(String[] args) {
        //1.Task: Count the alphabetical characters in a given value.

        String str= "Wow!...Ali is 13 years old and he is a university student!!!";

        String noPunct1=str.replaceAll("\\p{Punct}", "");
        System.out.println(noPunct1);
        int noPunct2=str.replaceAll("\\p{Punct}", "").length();
        System.out.println("No punctuations:" + noPunct2);
        int alphabeticalOnly=str.replaceAll("[^a-zA-Z]", "").length();
        System.out.println("alphabeticalOnly = " + alphabeticalOnly);


    }
}
