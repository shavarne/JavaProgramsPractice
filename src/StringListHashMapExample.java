import java.util.*;

public class StringListHashMapExample {

    public static void main(String[] args) {
        // Sample data
        List<String> valuesForA = List.of("Apple", "Apricot", "Avocado");
        List<String> valuesForB = List.of("Banana", "Blueberry");
        List<String> valuesForC = List.of("Cherry", "Coconut", "Cucumber");

        // Create a HashMap with String as key and List<String> as value
        Map<String, List<String>> stringListMap = new HashMap<>();

        // Add values to the map
        stringListMap.put("A", valuesForA);
        stringListMap.put("B", valuesForB);
        stringListMap.put("C", valuesForC);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Key Whose Value You Want To Search: ");

        String k = scanner.nextLine();




//
//        retrievedValues = stringListMap.containsKey(k) ? stringListMap.get(k) : new ArrayList<>();

        List<String> retrievedValues = stringListMap.getOrDefault(k, new ArrayList<>());


        // Print the results
        System.out.println("Values for key " + k + ": " + retrievedValues);

    }
}
