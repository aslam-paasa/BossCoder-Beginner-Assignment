package _19_Strings;

public class _14_PrintLargestString {
    public static void main(String[] args) {
        
        /**
         * Q. For a given set of Strings, print the largest string:
         * => "apple", "mango", "banana"
         * => Largest String hum nikaalnge lexocographic order m
         * => Means sbse pehle letter sbse chota hai, aur sbse last wala letter sbse bda
         * => Inn sb ko compare krne k liye hum String ka ek special method use krnge: compareTo()
         * 
         * compareTo():
         * => It is used to compare two strings.
         *       str1.compareTo(str2)
         * 
         * => Agar is function ka output '0' k equal aata hai means Strings humaari equal hai.
         * => (a) [< 0: -ve, str1 < str2] => Agar String less than '0' aata (negative) means str1 is less than str2 
         *    (b) [> 0: +ve, str1 > str2] => str1 is greater than str2 (positive number)
         *    (c) [ 0: equal, str1 == str2] => output == 0 means str1 is equal to str2.
         * 
         * Note: 'A' and 'a' ko different treat kiya jaata hai.
         * */
        
        /**
         * compareToIgnoreCase():
         * => Is function k andr 'A' & 'a' ko equally treat kiya jaata hai.
         * Note: Iss case m hm compareToIgnoreCase() use krnge.
         * */ 

        String fruits[] = {"apple", "mango", "banana"};

        String largest = fruits[0];

        for(int i = 0; i < fruits.length; i++) {
            if(largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}

/**
 * TC: 
 * => compareTo() function letter wise jaata hai
 * => O(n)
*/