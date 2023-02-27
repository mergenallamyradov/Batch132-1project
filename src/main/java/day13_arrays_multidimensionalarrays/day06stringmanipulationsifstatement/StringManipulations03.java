package day13_arrays_multidimensionalarrays.day06stringmanipulationsifstatement;

public class StringManipulations03 {
    public static void main(String[] args) {
        //Example 1: Type code to check if given String contains a specific character or characters
//           "New York" ==> w --> ture    -    York --> true    -    Xxx --> false

        String ContainSpesific= "New York";

        boolean control= ContainSpesific.toLowerCase().contains("york");
        System.out.println("control = " + control);

        //Example 2: Type code to change the first occurrence of "java" to "python"
//           java is java, I like java ==> python is java, I like java
        String w="java is java, i like java";
        String wPython=w.replaceFirst("java","python");
        System.out.println(wPython);

        //Example 3: Type code to repeat a given String
//           "Java" 4 times ==> JavaJavaJavaJava

        String u="Java";
        //1st way;
        String u1=u+u+u+u;
        System.out.println("firstway = " + u1);

        String u3= u.repeat(4);
        System.out.println("repeat method = " + u3);
    }

}
