public class ReverseAString {
    //ek ek character nikalte jana hai aur dusre string me add karte chala jana hai
    // java program to reverse a word
    public static void main(String[] args) {

        String str = "Geeks", nstr = "";
        char ch;

        System.out.println("Original word: "+ str);

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); //extracts each character
            nstr = ch + nstr; //pehle latest nikala hua character uske bad jo usme pehle se thaadds each character in front of the existing string
        }
        System.out.println("Reversed word: " + nstr);
    }
}
