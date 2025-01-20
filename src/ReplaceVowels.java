



public class ReplaceVowels {
    public static void replaceVowels(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if ("AEIOUaeiou".indexOf(chars[i]) != -1) {
                chars[i] = '*'; // Replace vowel with '*'
            }
        }
    }

    public static void main(String[] args) {
        String str = "Hello, World!";
        char[] chars = str.toCharArray();
        replaceVowels(chars);
        System.out.println(new String(chars)); // H*ll*, W*rld!
    }
}