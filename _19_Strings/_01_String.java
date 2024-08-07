package _19_Strings;

public class _01_String {
    public static void main(String[] args) {
        
        /**
         * Basic of String:
         * => Array of characters ['b', 'o', 's', 's', 'c', 'o', 'd', 'e', 'r']
         * => For these array of characters to look good, we have created a 
         *    separate data structure called as String.
         *    String str = "bosscoder"
        */

        /**
         * 1. Create a value:
        */
        String str = "bosscoder";

        /**
         * 2. Retrieve the value
        */
        System.out.println(str);

        /**
         * 3. Retrieve specific characters/index value of a String
         * => System.out.println(str[2]);
         * => Error: Array required but string found, because in Java, Array & String are considered different.
         * => So, for String also we have different function like charAt().
        */
        System.out.println(str.charAt(2));

        /**
         * Note: Updation is not allowed in some languages like Java, Python.
         * => Strings are immutable(cannot be modified) in Java & Python.
        */

        /**
         * 4. Length of the String
        */ 
        System.out.println("Length of the String is " + str.length());

        /**
         * 5. Print all elements of a String
        */
        System.out.print("Here is the complete String: ");
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            System.out.print(ch);
        }
    }
}
