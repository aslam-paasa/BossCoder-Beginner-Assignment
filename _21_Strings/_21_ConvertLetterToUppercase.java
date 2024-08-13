package _20_Strings;

public class _21_ConvertLetterToUppercase {
    public static void main(String[] args) {

        /**
         * Q. For a given String convert each the first letter of each
         * word to uppercase.
         * 
         * => Input: "hi, i am mohammad"
         * => Output: "Hi, I Am Mohammad"
         * 
         * => Input: "hello WORLD"
         * => Output: "Hello WORLD
         * 
         * Logic:
         * => Character.toUpperCase(ch);
         * | |
         * V V
         * 'A'(Output) 'a'(Input)
         */

        String str = "hi, i am mohammad";
        String str01 = "hello WORLD";

        System.out.println(toUpperCase(str));
        System.out.println(toUpperCase(str01));
    }

    /**
     * This function will convert the first letter of each word to uppercase
     */
    public static String toUpperCase(String str) {
        /**
         * Initialize StringBuilder with empty String
         */
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        /**
         * 1. Check for empty space
         * 2. Uske baad word ka first letter aaega
         * 3. First letter ko capital m convert krnge
         */
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
