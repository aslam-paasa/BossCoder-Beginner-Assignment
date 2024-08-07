package _19_Strings;

public class _11_CustomSubString {
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(substring(str, 0, 5));
    }

    public static String substring(String str, int sIdx, int eIdx) {
        String substr = "";

        /**
         * Starting index se le k ending index tk k saare character humare
         * substr k andr add ho jaenge.
         */
        for (int i = sIdx; i < eIdx; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
}
