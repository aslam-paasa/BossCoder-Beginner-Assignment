package _09_Strings;

public class _10_StringComparison {
    public static void main(String[] args) {

        System.out.println("Comparing Literal: ");
        String s1 = "Hello";
        String s2 = "Hello";
        
        /**
         * 1. '==' : It is used to compare the addresses.
         * 2. 's1.equals(s2)' : It is used to compare the content.
         * => Jb v 2 strings k value k hisaab se humein unhein compare krna
         *    ho tb hum ".equals()" use krnge
        */

        if(s1 == s2) {
            System.out.println("Literals are pointing to the same address");
        } else {
            System.out.println("Literals are pointing to different address");
        }


        System.out.println();


        System.out.println("Comparing Objects:");
        String s3 = new String("World");
        String s4 = new String("World");

        if(s3 == s4) {
            System.out.println("Objects are pointing to the same address");
        } else {
            System.out.println("Objects are pointing to different address");
        }
    }
}
