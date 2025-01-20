package LeetCode;

public class ValidParentheses {


    public static boolean validParanthesisCheck(String inputString) {
        String[] s = {"(", ")", "[", "]", "{", "}"};

        if (inputString.indexOf("()")==-1 || inputString.indexOf("{}")==-1 || inputString.indexOf("[]")==-1){

            return false;
        }
    return true;
    }

    public static void main(String[] args) {

        System.out.println(validParanthesisCheck("{}"));
    }
}
