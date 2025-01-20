package LeetCode;

public class LongestCommonPrefix {


        public static String longestCommonPrefix(String[] strs) {

            String prefix = strs[0];

            for(String str : strs){
                while(str.indexOf(prefix)!=0){
                    prefix = prefix.substring(0,prefix.length()-1);
                }
            }
            return prefix;

        }

    public static void main(String[] args) {
            String[] strings = {"flower","flow","flight"};
        String s = longestCommonPrefix(strings);
        System.out.println("s = " + s);
    }


}
