import java.util.Arrays;
import java.util.List;

public class ArrayToListConversion {


    private static void performArrayToListConversion(String[] array) {
        System.out.println("String array = " + Arrays.toString(array));

        List<String> list = Arrays.asList(array);
        System.out.println("List = " + list);
    }


    public static void main(String[] args) {

        String[] s = {"Apple", "Banana", "Grapes"};
        performArrayToListConversion(s);
    }
}
