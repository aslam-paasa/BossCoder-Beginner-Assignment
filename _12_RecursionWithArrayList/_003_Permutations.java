package _12_RecursionWithArrayList;

public class _003_Permutations {
    /**
     * Q. Print all the permutations of the given string
     * => Permutation means rearrangement of values.
     * => Example, String str = "xy
     *    Permutations:
     *    (a) xy
     *    (b) yx
     *    Output: {"xy", "yx}
     * Note: Same values ko rearrange kr k different different possible
     *       values banana is permutation.
     * 
     * => Example, String str = "abc"
     *    Permutations:
     *    (a) abc
     *    (b) acb [swap b & c]
     *    (c) bac 
     *    (d) bca [swap a & c]
     *    (e) cab 
     *    (f) cba [swap a & b]
     * 
     * For String = "abc"
     * 1. "abc" => swap 'a' with other values one-by-one
     *    (a) swap 'a' to 'a' => [a, b, c]
     *        Case-1: Swap 'b' to 'b' => [a, b, c]
     *        Case-2: Swap 'b' to 'c' => [a, c, b]
     *    => Output: [a, b, c], [a, c, b]
     * 
     *    (b) swap 'a' to 'b  => [b, a, c]
     *        Case-1: Swap 'a' to 'a' => [b, a, c]
     *        Case-2: Swap 'a' to 'c' => [b, c, a]
     *    => Output: [b, a, c], [b, c, a]
     * 
     *    (c) swap 'a' to 'c' => [c, b, a]
     *        Case-1: Swap 'b' to 'b' => [c, b, a]
     *        Case-2: Swap 'b' to 'a' => [c, a, b]
     *    => Output: [c, b, a] [c, a, b]
     * 
     * Note: Hum har ek case m apne left ko increase by 1 kr rhe hai.
     * */ 

    /**
     * Steps:
     * 1. Create a function permute with arguments with parameters:
     *    str - input String
     *    l   - starting index
     *    r   - ending index
     * 
     * 2. Call the permute function with values -
     *    str - value of your input String
     *    l   - 0
     *    r   - str.length - 1
     * 
     * 3. If values of l and r are equal then print the string.
     * 
     * 4. Run a loop from l to r and swap the current element off the
     *    string with input string at index-"l".
     * 
     * 5. Call the same permute function by incrementing the value of
     *    l by 1.
     * 
     * 6. After this again swap the  previously swapped values to initiate
     *    backtracking.
     *    
    */

    public static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] =  temp;

        return String.valueOf(charArray);
    }
    
    public static void permute(String str, int l, int r) {
        if(l == r) {
            System.out.println(str);
        } else {
            for(int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l+1, r);

                // backtracking
                str = swap(str, l, i);
            }
        }
    }
    public static void main(String[] args) {
        String str1 = "XY";
        int n1 = str1.length();
        System.out.println("For the String : " + str1 + " permutations are : ");
        permute(str1, 0, n1-1);

        System.out.println();

        String str2 = "ABC";
        int n2 = str2.length();
        System.out.println("For the String : " + str2 + " permutations are : ");
        permute(str2, 0, n2-1);
    }
}
