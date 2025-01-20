import java.util.HashMap;
import java.util.Map;

public class CharacterOccurrence {

    public static Map<Character, Integer> countCharacterOccurrence(String str) {
        // Initialize the HashMap to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Iterate through each character in the string
        for (char c : str.replaceAll("\\s+", "").toCharArray()) {
            // Check if the character is already in the HashMap
            if (charCountMap.containsKey(c)) {
                // Increment the count of the character
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                // Add the character to the HashMap with a count of 1
                charCountMap.put(c, 1);
            }
        }

        return charCountMap;
    }

    public static void main(String[] args) {
        String str = "hello world";
        Map<Character, Integer> charCountMap = countCharacterOccurrence(str);

        // Print the character counts
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }
}
