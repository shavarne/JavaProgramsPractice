import java.util.Scanner;

import static java.lang.Math.sqrt;

public class PrimeNumberCheck {

    public static boolean isPrime(int n) {
    ///////1 aur usse chota check karlo
        if (n <= 1) {
            return false;
        }

        ///////baaki logic square root tak chala lo loop mil gaya to false aur nahi mila to mtlb true
        for (int i = 2; i <= (int) sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number To Check");
        int n = scanner.nextInt();

        boolean result = isPrime(n);
        System.out.println(n + " is prime " + result);
    }
}

