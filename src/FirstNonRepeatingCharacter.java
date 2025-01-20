import java.util.Scanner;

public class FirstNonRepeatingCharacter {
        public static int firstNonRepeatingCharIndex(String s) {
            for (int i = 0; i < s.length(); i++) {
                char currentChar = s.charAt(i);

                // Check if the current character is not repeated
                if (s.indexOf(currentChar) == s.lastIndexOf(currentChar)) {
                    return i;
                }
            }

            // No non-repeating character found
            return -1;
        }

        public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
            System.out.println("Enter String ");
           String input = scanner.nextLine();
            int result = firstNonRepeatingCharIndex(input);
            System.out.println("result = " + result);
//            if (result != -1) {
//                System.out.println("The index of the first non-repeating character in '" + input + "' is: " + result);
//            } else {
//                System.out.println("There is no non-repeating character in '" + input + "'.");
//            }
        }
    }


