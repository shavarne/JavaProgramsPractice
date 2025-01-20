public class PalindromeString {

    public static void main(String[] args) {


        String s = "ABA", nStr = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                nStr = ch + nStr;
            }
        }

        if (nStr.equalsIgnoreCase(s)) {
            System.out.println(true);
        } else {
            System.out.println(false);

        }
    }


}
