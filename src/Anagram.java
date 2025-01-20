import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String s1, String s2) {
        // If lengths are not the same, return false immediately
        if (s1.length() != s2.length()) {
            return false;
        }

        // Convert both strings to lowercase for case-insensitive comparison
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // Map to track character counts
        java.util.Map<Character, Integer> charCountMap = new java.util.HashMap<>();

        // Iterate through both strings and count frequencies
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            // Increment count for character in s1 and decrement for character in s2
            charCountMap.put(c1, charCountMap.getOrDefault(c1, 0) + 1);
            charCountMap.put(c2, charCountMap.getOrDefault(c2, 0) - 1);
        }

        //Iterate all values and if any one value is non zero it means false
        for (int value : charCountMap.values()) {
            if (value != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
