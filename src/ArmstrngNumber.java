import java.util.ArrayList;
import java.util.List;

public class ArmstrngNumber {


    public static boolean isArmstrong(int n) {

        //number ko alag kar ke list me rakh lo
        List<Integer> digitsList = digitsInList(n);



        int power = digitsList.size();

        //sare array of digit ko power nikal le sum kardo aur check lo
        int sum = digitsList.stream()
                .mapToInt(d -> (int) Math.pow(d, power))
                .sum();
        return n == sum;
    }

    public static List<Integer> digitsInList(int n) {
        List<Integer> list = new ArrayList<>();
        while (n > 0) {
            list.add(n % 10);
            n = n / 10;
        }
        return list;
    }



    public static void main(String[] args) {
        boolean armstrong = isArmstrong(153);
        System.out.println("is armstrong = " + armstrong);
    }
}
