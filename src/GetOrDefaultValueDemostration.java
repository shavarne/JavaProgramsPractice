import java.util.*;

public class GetOrDefaultValueDemostration {

    public static void main(String[] args) {


        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 100);
        map.put("b", 200);
        map.put("c", 300);
        map.put("d", 400);

        String a = "e";
        System.out.println("map = " + map);


        Integer value = map.getOrDefault(a, 0);
        System.out.println("value = " + value);

    }
}
