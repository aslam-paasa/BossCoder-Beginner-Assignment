package _19_Strings;

public class _06_PrintAllElements {
    public static void main(String[] args) {
        String str = "Hello World!";

        /**
         * Print all elements of a String
         * => Retrieve specific characters/index value of a String
         * => System.out.println(str[2]);
         * => Error: Array required but string found, because in Java, Array & String are considered different.
         * => So, for String also we have different function like charAt().
        */
        System.out.println("Character at index-2 : " + str.charAt(2));

        /**
         * Note: Updation is not allowed in some languages like Java, Python.
         * => Strings are immutable(cannot be modified) in Java & Python.
        */

        System.out.print("Here is the complete String: ");
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            System.out.print(ch);
        }
    }
}
