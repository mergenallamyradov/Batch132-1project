package day17methodoverloadingdatetimeclasses;

public class MethodCreation {
    public static void main(String[] args) {

        int result1 = addTwoInt(-2023,2050 );
        System.out.println(result1);

        String result2=getFirstLastChar("Mergen AllamyradoV");
        System.out.println(result2);

        int result3=getSumOfAsciisOfAllChars("Ajda");
        System.out.println(result3);

    }

    //variables used in method parenthesis are called "parameters"
    public static int addTwoInt(int a, int b){
    return a+b;
    }
    //Example2: Create a method prints the first and the last character on the console
    public static String getFirstLastChar(String name){
      return  "" + name.charAt(0) + name.charAt(name.length()-1);
    }

    //Example3: create a method that prints the sum of all ASCII values of String characters;

    public static int getSumOfAsciisOfAllChars(String s){
        int sumOfAsciis=0;
        for (int i=0; i<s.length(); i++){
            sumOfAsciis=sumOfAsciis+ s.charAt(i);
        }
        return sumOfAsciis;
    }

}
