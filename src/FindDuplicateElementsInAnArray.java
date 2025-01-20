import java.util.*;

public class FindDuplicateElementsInAnArray {

    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 6, 4, 3, 9};

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int current : nums) {

            if (countMap.containsKey(current)) {
                countMap.put(current, countMap.get(current) + 1);
            }
            else {
                countMap.put(current, 1);
            }

        }
        System.out.println("countMap = " + countMap);

        Set<Integer> integers = countMap.keySet();

        List<Integer> dupList = new ArrayList<>();
        
        for (int i : integers){
            if (countMap.get(i)>1){
                dupList.add(i);
            }
        }
        System.out.println("dupList = " + dupList);
        
    }
}
