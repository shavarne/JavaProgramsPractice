package LeetCode;

import java.util.*;

public class MostCommonWord {

    public static String mostCommonWord(String paragraph, String[] banned){


        //jahan bhi non word milega wahan se string ko tod dega remember this
        String[] words = paragraph.toLowerCase().split("\\W+");

        // Create a set for banned words for quick lookup
        Set<String> bannedWords = new HashSet<>();
        for (String word : banned) {
            bannedWords.add(word);
        }

        // StringBuilder to build the filtered paragraph
        StringBuilder filteredParagraph = new StringBuilder();


        //agar banned word ke andar word hai to word ko add nahi karenge filtered paragraph mein
        for (String word : words) {
            if (!bannedWords.contains(word)) {
                filteredParagraph.append(word).append(" ");
            }
        }

        // Remove trailing space
        String result = filteredParagraph.toString().trim();
        String[] words1 = result.split(" ");

        Map<String,Integer> wordCountMap = new HashMap<>();
        
        for(String word : words1){
            if(wordCountMap.containsKey(word)){
                wordCountMap.put(word,wordCountMap.get(word)+1);
            }
            else{
                wordCountMap.put(word,1);
            }
        }
        System.out.println("wordCountMap = " + wordCountMap);


        Set<String> wordsInMap = wordCountMap.keySet();

        //to get maximum value in hashmap
        int maxValueInMap = (Collections.max(wordCountMap.values()));
        System.out.println("maxValueInMap = " + maxValueInMap);

        //to get key which is having the maximum value in hashmap
        String key = Collections.max(wordCountMap.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("key = " + key);


        //by iterating the map
        int maxCount=0;
        String mostCommonWord = "";
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostCommonWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return key;
    }

    public static void main(String[] args) {
        mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit","hit"});
    }
}
