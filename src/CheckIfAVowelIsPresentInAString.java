import java.util.Arrays;

public class CheckIfAVowelIsPresentInAString {
    public static void main(String[] args) { 
        boolean isVowelPresent = vowelCheck("hllo");
        System.out.println("is vowel present : " + isVowelPresent);
    }
    public static boolean vowelCheck(String str){



        char[] charArray = str.toCharArray();

        for (char c : charArray) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                return true;
            }

        }
        return false;

    }
}
