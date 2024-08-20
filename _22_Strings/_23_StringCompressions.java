package _22_Strings;

import java.util.Scanner;

public class _23_StringCompressions {
    public static void main(String[] args) {
        /**
         * => Humein ek String given hai: 
         *    aaa bb cc aa bbb ccc d ee
         * => Aur iss String par 2 compression karni hai i.e. Compression-1 & Compression-2
         * 
         * 1. Apply Compression-1 on given String: 
         *    a b c a b c d e
         * => Iss compression m ye nhi likhna hai ki wo alphabets kitni
         *    no. of times occur hua.
         * 
         * 2. Applying Compression-2 on given String:
         *    a3 b2 c2 a2 b3 c3 d e2
         * => Iss Compression m humein ye likhna hai ki wo alphabets kitni
         *    no of times occur hua.
         * */ 

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine(); // Use nextLine() to capture the entire input including spaces

        System.out.println("Compression-1: " + compression01(str));
        System.out.println("Compression-2: " + compression02(str));
    }

    /**
     * Compression-1:
     * => s1 = aaa bb cc aa bbb ccc d ee
     * => Agar current element and next element ek jaise nhi ho to print
     * => Jb s1.charAt(i) equal nhi to s1.charAt(i+1) k tb usse print krna
     *    hai aur lastIdx wala element to humesa hi print krna hai qki ye
     *    ek side case m count hoga qki isko kisi next se compare nhi kr
     *    skte.
     * */

    public static String compression01(String str) {
        StringBuilder str01 = new StringBuilder(); 

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != str.charAt(i + 1)) {
                str01.append(str.charAt(i));
            }
        }
        str01.append(str.charAt(str.length() - 1)); // Adding the last character
        return str01.toString();
    }
    
    /**
     * Compression-2:
     * => Iss compression m wo sb to hoga hi jo compression-1 m tha, but
     *    ek extra kaam v karenge.
     * => Isme hum count ko badhate chalenge i.e. count++ agar current element
     *    == next element hua to.
     * 1. count++
     * 2. Print alphabet
     * 3. Print count
     * => Isme ek exception case hoga agar count-1 hai to, count print nhi krna.
     * => Agar count-1 nhi ho to print. 
     * */  

    public static String compression02(String str) {
        StringBuilder ans = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                ans.append(str.charAt(i));
                if (count > 1) {
                    ans.append(count);
                }
                count = 1;
            }
        }
        ans.append(str.charAt(str.length() - 1)); // Adding the last character
        if (count > 1) {
            ans.append(count);
        }
        return ans.toString();
    }
}

/**
 * TC: 
 * => We are traversing the input String once, hence the TC will be O(n).
 * 
 * SC:
 * => If we are taking an extra space for output (i.e. String ans), then 
 *    the solution is taking O(n) space. If we ignore the space taken by
 *    output (which we generally do), then the solution is said to take
 *    O(1) space.
 */
