import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class FrequencyOfTheCharacter {


    public static HashMap<Character, Integer> frequencyOfChar(String s){

        s=s.toLowerCase();
        char[] charArray = s.toCharArray();
        System.out.println("Arrays.toString(charArray) = " + Arrays.toString(charArray));
        HashMap<Character,Integer> hashMap = new HashMap<>();

        for (char character : charArray) {

            if(character==' '){
            continue;
            }
            //if the character is met for the first time add it in hashmap => character,initial count i.e 1
            if(!hashMap.containsKey(character)){
                hashMap.put(character, 1);
            }

            else{
                hashMap.put(character, hashMap.get(character) + 1);
            }
        }
        return hashMap;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The String: ");
        String s = scanner.nextLine();
        HashMap<Character, Integer> characterIntegerHashMap = frequencyOfChar(s);
        System.out.println("characterIntegerHashMap = " + characterIntegerHashMap);

    }
}
