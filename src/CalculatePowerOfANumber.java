import java.util.Scanner;

public class CalculatePowerOfANumber {

    public static double calculatePower(int base , int exponent){

        return Math.pow(base, exponent);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = scanner.nextInt();
        System.out.println("Enter Power: ");
        int k = scanner.nextInt();
        long v = (long) calculatePower(n, k);
        System.out.println("v = " + v);
        scanner.close();
    }
}
