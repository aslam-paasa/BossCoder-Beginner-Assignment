package _09_Strings;

public class _12_SubString {
    public static void main(String[] args) {
        String s1 = "hello";

        /**
         * Substring:
         * => The substring() method returns the part of the string between 
         *    the start and end indexes or the end.
         * */ 

        String sub01 = s1.substring(1,3); // endIndex include nhi hoga (1,2)
        System.out.println("Index-1 to 3 : " + sub01);

        String sub02 = s1.substring(0, 4); // hell (0,1,2,3)
        System.out.println("Index-0 to 4 : " + sub02);

        /**
         * 5 to koi idx nhi hai, to jaha tak ho 0 se waha tak hi dega i.e. 0-4
        */
        String sub03 = s1.substring(0, 5); 
        System.out.println("Index-0 to 5 : " + sub03);

    }

}
