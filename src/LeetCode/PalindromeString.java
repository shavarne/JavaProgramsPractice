package LeetCode;

public class PalindromeString {

    public static void main(String[] args) {
        boolean result = isPalindrome("rada");
        System.out.println("result = " + result);
    }

    public static boolean isPalindrome(String str){


        int length = str.length();
        for(int i =0 ; i<=length/2; i++){
            if(str.charAt(i)!=str.charAt(length-i-1)){
                return false;
            }
        }
        return true;
    }
    
}
