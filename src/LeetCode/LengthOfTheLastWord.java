package LeetCode;

public class LengthOfTheLastWord {

    private static int length;

    public static void lengthOfTheLastWord(String s){

        String[] words = s.split(" ");
        System.out.println(words[words.length-1].length());

//        s = s.trim();
//
//        // Find the index of the last space after trimming
//        int lastSpaceIndex = s.lastIndexOf(' ');
//
//        // The last word is the substring after the last space
//        String lastWord = s.substring(lastSpaceIndex + 1);
//
//        // Return the length of the last word
//        System.out.println("length = " + lastWord.length());
    }

    public static void main(String[] args) {

        lengthOfTheLastWord("Om Namah Shivay");
    }
}


