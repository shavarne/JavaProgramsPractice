import java.util.ArrayList;
import java.util.List;

public class PrimeNumbersInAList {

    public static void primeNumberInAList(List<Integer> numbers) {
        List<Integer> primeNumberList = new ArrayList<>();
        List<Integer> nonPrimeNumberList = new ArrayList<>();

        for (Integer number : numbers) {
            if (isPrime(number)) {
                primeNumberList.add(number);
            } else {
                nonPrimeNumberList.add(number);
            }
        }
        System.out.println("Non Prime Numbers are = " + nonPrimeNumberList);
        System.out.println("Prime Numbers Are = " + primeNumberList);
    }

    private static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 25, 88, 101, 0);
        primeNumberInAList(numbers);
    }

}
