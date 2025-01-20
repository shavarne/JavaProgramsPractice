import java.util.Scanner;

public class SumOfTwoNumbers {

    public static double sumOfTwoNumbers(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number Of Times You Want To Add : ");
        int i = sc.nextInt();

        for (int j = 1; j <= i; j++) {


            System.out.println("Enter First Number : ");
            double p = sc.nextDouble();

            System.out.println("Enter Second Number : ");
            double q = sc.nextDouble();

            double result = sumOfTwoNumbers(p, q);

            System.out.println("Result = " + result);
            System.out.println("................................." + j);


        }

    }
}
