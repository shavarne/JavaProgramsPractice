import java.util.Scanner;

public class GetInputFromUser {

    public static void main(String args[]) {

        int a;
        float b;
        String s;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter A String : ");
        s = in.nextLine();
        System.out.println("You Entered String = " + s);

        System.out.println("Enter An Integer: ");
        a = in.nextInt();
        System.out.println("You Entered String = " + a);

        System.out.println("Enter A float: ");
        b = in.nextFloat();
        System.out.println("You Entered a float = " + b);

        in.close();
    }
}
