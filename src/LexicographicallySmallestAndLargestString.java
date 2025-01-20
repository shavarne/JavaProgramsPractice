public class LexicographicallySmallestAndLargestString {

    public static void main(String[] args) {
        String result = getSmallestAndLargest("welcometojava", 3);
        System.out.println("result = " + result);
    }

    public static String getSmallestAndLargest(String s, int k) {

        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 0; i <= s.length() - k; i++) {
            String current = s.substring(i, k + i);


            // Compare current substring with smallest and largest
            if (current.compareTo(smallest) < 0) {
                smallest = current;
            }
            if (current.compareTo(largest) > 0) {
                largest = current;
            }
        }

        return smallest + "\n" + largest;
    }
}
