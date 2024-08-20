package _22_Strings;

public class _20_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");

        /**
         * Adding character to the StringBuilder:
         * => append means ek k piche ek jodna
         * => O(26)
         * => O(n^2)
        */
        for(char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        /**
         * Printing final String:
        */
        System.out.println(sb);
        System.out.println("Length of string: " + sb.length());
    }
}
