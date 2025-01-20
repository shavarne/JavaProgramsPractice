import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElementCounter {

    public static void main(String[] args) {
        // Sample list of elements
        List<String> elements = List.of("A", "B", "C", "A", "B", "C", "A", "D", "E");

        // Create a HashMap to store element counts
        Map<String, Integer> elementCounts = new HashMap<>();

        // Iterate through the list and count occurrences
        for (String element : elements) {
                if (!elementCounts.containsKey(element)){
                    elementCounts.put(element,1);
                }
                else{
                    elementCounts.put(element,elementCounts.get(element)+1);
                }
        }

        // Print the result
        System.out.println("Element Counts: " + elementCounts);
    }
}
