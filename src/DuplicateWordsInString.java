import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DuplicateWordsInString {
    static void duplicateWords(String inputString) {
        // Splitting inputString into words on the basis of space in the sentence
        String[] words = inputString.split(" ");

        // Creating a HashMap with words as keys and their count as values
        HashMap<String, Integer> wordCount = new HashMap<String, Integer>();

        // Checking each word of the sentence(words) and generating our hashmap
        for (String word : words) {
            // Check whether it is present in wordCount(hashmap me .get(key) pass krenge to jo key ka value hai wo dedega)
            if (wordCount.containsKey(word.toLowerCase())) {
                // If it is present, add karo word ko ...aur key me.... incrementing its count by 1
                wordCount.put(word.toLowerCase(), wordCount.get(word.toLowerCase()) + 1);
            } else {
                // If it is not present, put that word into wordCount with 1 as its value
                wordCount.put(word.toLowerCase(), 1);
            }
        }
        System.out.println("wordCount = " + wordCount);

        // Extracting all keys of wordCount
        Set<String> wordsInString = wordCount.keySet();
        

        // Iterating through all words in wordCount
        for (String word : wordsInString) {
            // If word count is greater than 1
            if (wordCount.get(word) > 1) {
                // Printing that word and its count
                System.out.println(word + " : " + wordCount.get(word));
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter The String : ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        duplicateWords(s);
    }
}
