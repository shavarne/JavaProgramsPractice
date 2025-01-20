import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        //add elements
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("list = " + list);

        //get elements
        int i = list.get(0);
        System.out.println("i = " + i);

        //add element in between
        list.add(1, 1);
        System.out.println("list = " + list);

        //set element
        list.set(0, 5);
        System.out.println("list = " + list);

        //delete element
        list.remove(3);
        System.out.println("list = " + list);

        //size
        int size = list.size();
        System.out.println("size = " + size);

        //loops
        for (int j = 0; j < list.size(); j++) {
            System.out.println("Element at " + j + "th position is " + list.get(j));
        }

        //sort
        Collections.sort(list);
        System.out.println("list = " + list);

    }
}
