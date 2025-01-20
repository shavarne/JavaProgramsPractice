import java.util.Scanner;

public class FahrenheitToCelsius {

    private static double fahrenheitToCelsiusConversion(double f) {

        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of time you want to convert : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Fahrenheit : ");
            float v = sc.nextFloat();
            sc.nextLine();


            double v1 = fahrenheitToCelsiusConversion(v);
            System.out.println("Celsius :" + v1);
        }
    }
}
