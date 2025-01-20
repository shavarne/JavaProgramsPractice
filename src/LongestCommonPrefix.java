import java.util.Arrays;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strings){

        String prefix = strings[0];

        for (String str : strings){

            while (str.indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
            }

        }

        return prefix;

    }

    public static void main(String[] args) {
        String[] strings = {"Shivam","Shiva","Shrinath"};
        String s = longestCommonPrefix(strings);
        System.out.println("s = " + s);
    }
}
