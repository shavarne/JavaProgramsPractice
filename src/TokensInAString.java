import java.util.Arrays;
import java.util.List;

public class TokensInAString {

    public static void main(String[] args) {

        String s = "He is a very very good boy, isn't he?";

        String output = s.replaceAll("[^a-zA-Z0-9\\s]", " ");

        String[] z = output.split(" ");

        List<String> cleanedList = Arrays.stream(z)
                .filter(word -> !word.isEmpty()) // Keep only non-empty strings
                .toList();

        String[] cleanedArray = cleanedList.toArray(new String[0]);

        System.out.println(cleanedArray.length);

        for (String i : cleanedArray){
            System.out.println(i);
        }
    }
}
