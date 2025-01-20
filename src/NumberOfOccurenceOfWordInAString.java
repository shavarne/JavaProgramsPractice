import java.util.HashMap;
import java.util.Map;

public class NumberOfOccurenceOfWordInAString {

    private static void occurenceCounter(String str){

      String[] words = str.split(" ");

      Map<String,Integer> countMap = new HashMap<>();

      for (String word : words){

          if (countMap.containsKey(word)){
              countMap.put(word,countMap.get(word)+1);
          }
          else {
              countMap.put(word,1);
          }
      }
        System.out.println("countMap = " + countMap);
    }

    public static void main(String[] args) {
        String test = "Jai Jai Shri Jai Hanuman";
        occurenceCounter(test);

    }
}
