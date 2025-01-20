package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

//        for (int i = 0; i <= nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return new int[]{};

        //by hashmap
        Map<Integer, Integer> map = new HashMap<>();

      
        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            // Check if the complement is already in the hash table
            if (map.containsKey(complement)) {
                // If found, return the indices of the two numbers
                return new int[] { map.get(complement), i };
            }

            // If not found, add the current number and its index to the hash table
            map.put(nums[i], i);
        }

        // If no solution is found (though the problem guarantees one solution), return an empty array
        return new int[] {};
    } 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        // Input the array elements
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Input the target value
        System.out.println("Enter the target value:");
        int target = scanner.nextInt();

        // Call the twoSum method and get the result
        int[] result = twoSum(nums, target);

        // Print the result
        if (result.length == 2) {
            System.out.println(Arrays.toString(result));
        } else {
            System.out.println("No solution found");
        }

        // Close the scanner
        scanner.close();
    }


}

