import java.util.Scanner;

public class FloydTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows for Floyd's Triangle:");

        int rows = scanner.nextInt();
        printFloydTriangle(rows);
    }

    public static void printFloydTriangle(int rows) {

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
