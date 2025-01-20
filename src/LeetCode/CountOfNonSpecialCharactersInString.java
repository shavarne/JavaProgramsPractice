package LeetCode;

public class CountOfNonSpecialCharactersInString {

    public static void main(String[] args) {

        String str = "@#Hello_+World";
        int count = 0;


        for(int i =0; i<str.length();i++){

            char ch = str.charAt(i);

            //ye method yaad rakho
            if(!Character.isLetterOrDigit(ch) || !Character.isWhitespace(ch)){
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}
