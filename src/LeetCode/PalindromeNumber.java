package LeetCode;

public class PalindromeNumber {

    public static boolean isPalindrome(int x){

        int remainder;
        int sum=0;
        int originalNumber = x;
       while (x>0){
           remainder = x%10;
           sum = sum*10 + remainder;
           x = x/10;

       }
        System.out.println("sum = " + sum);

        return (originalNumber == sum) ? true : false;
    }

    public static void main(String[] args) {
        boolean palindrome = isPalindrome(123);
        System.out.println("palindrome = " + palindrome);
    }
}
