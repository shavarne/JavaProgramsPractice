public class StringImmutability {

    public static void main(String[] args) {
//        String a1 = "ab";           // Creates "ab" in the string pool
//        String a2 = "ab";           // Reuses "ab" from the string pool
//
//        String b1 = new String("ab");  // Creates a new object on the heap
//        String b2 = new String("ab");  // Creates another new object on the heap
//
//        String intern = a1.intern();
//        System.out.println("intern = " + intern);
//
//        System.out.println(a1 == a2);  // true (same reference from string pool)
//        System.out.println(a1 == b1);  // false (different references)
//        System.out.println(b1 == b2);  // false (different new objects)
//        System.out.println(a1.equals(b1)); // true (same content comparison)

        String str1 = new String("Hello");  // Creates a new String object
        String str2 = "Hello";              // Points to the string in the String Constant Pool

        System.out.println("++++" + (str1 == str2));   // False, since str1 refers to a new object

        String str3 = str1.intern();        // Interns str1, now str3 points to the String Pool version

        System.out.println(str3 == str2);   // True, both refer to the same String in the pool

    }
}
