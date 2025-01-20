import java.util.Scanner;

public class StringBreak {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        int sum = A.length() + B.length();

        char a = A.charAt(0);
        char b = B.charAt(0);

        String upperCaseA = Character.toString(a).toUpperCase();
        String upperCaseB = Character.toString(b).toUpperCase();

        String A1 = upperCaseA + A.substring(1);
        String B2 = upperCaseB + B.substring(1);

        String result = A1 + " " + B2;

        int res = A.compareTo(B);
        String flag = res > 0 ? "Yes" : "No";

        System.out.println(sum);
        System.out.println(flag);
        System.out.println(result);
    }


}
