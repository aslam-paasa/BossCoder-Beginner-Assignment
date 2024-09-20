package _12_Recursion_With_ArrayList_And_String;

public class _01_String_Basics {
    public static void main(String[] args) {
        String str = "hello";
        
        /**
         * 1. Print String
         * */
        System.out.println(str);
        
        /**
         * 2. Find char of String:
        */
        char cha = str.charAt(3);

        /**
         * 3. Length of String:
        */
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
        }

        /**
         * 4. Substring
        */
        String subStr = str.substring(1, 5);
        System.out.println(subStr);


    }
}
