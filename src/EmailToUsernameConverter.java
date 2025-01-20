import java.util.Scanner;

public class EmailToUsernameConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input email from the user
        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();

        // Extract username from the email
        String username = extractUsername(email);

        // Display the username to the user
        System.out.println("Your username is: " + username);

        // Close the scanner
        scanner.close();
    }

    // Method to extract username from the email
    private static String extractUsername(String email) {
        // Find the index of '@' in the email
        int atIndex = email.indexOf('@');

        // Check if '@' is present in the email
        if (atIndex != -1) {
            // Extract the substring before '@' as the username
            return email.substring(0, atIndex);
        } else {
            // If '@' is not present, return the original email
            return email;
        }
    }
}
