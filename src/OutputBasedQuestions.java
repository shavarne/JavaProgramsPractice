import java.io.IOException;

public class OutputBasedQuestions {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";

        System.out.println("s1 == s2 is:" + s1 == s2);


        String s3 = "JournalDev";
        int start = 1;
        char end = 5;

        System.out.println(s3.substring(start, end));


        String str = null;
        String str1="abc";


        //this case is circuit complete means both conditions are evaluated sp this will throw null pointer exception
//        System.out.println(str1.equals("abc") | str.equals(null));

        //this condition is without short circuit if left is true means true no need to check right
        System.out.println(str1.equals("abc") || str.equals(null));




        //strings are immutable new string abc abc is created but x is the same only
        String x = "abc";
        String y = "abc";

        x.concat(y);
        System.out.println(x);







    }
}
