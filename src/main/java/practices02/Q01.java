package practices02;

public class Q01 {
    public static void main(String[] args) {
        //Type code to check if a String does not have any space character at the beginning and at the end
        //Example==> ' Ali ' should print false on the console
        //            'Ali' should print true on the console

        String txt="Ali";
        String txttrimmed =txt.trim();
        boolean result = txt.equals(txttrimmed);
        System.out.println("result=" + !result);
    }
}
