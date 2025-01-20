import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratingAHashMapByIterator {

    public static void main(String[] args) {

        HashMap<String, Integer> countMap = new HashMap<>();
        countMap.put("One", 1);
        countMap.put("Two", 2);
        countMap.put("Three", 3);

        Iterator<Map.Entry<String, Integer>> iterator = countMap.entrySet().iterator();

        System.out.println("Original Map: " + countMap);

        while (iterator.hasNext()) {

            Map.Entry<String, Integer> element = iterator.next();

            if (element.getKey().equalsIgnoreCase("One")) {
                iterator.remove();
                System.out.println("Removed Key: 'One'");
            }
        }
        System.out.println("Map After Removal = " + countMap);


    }
}
