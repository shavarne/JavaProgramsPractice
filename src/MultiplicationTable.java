import java.util.Scanner;

public class MultiplicationTable {

    public static void multiplicationTable(int n) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + "=" + n * i);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = scanner.nextInt();
        multiplicationTable(n);
    }
}
