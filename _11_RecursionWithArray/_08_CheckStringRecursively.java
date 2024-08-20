package _11_RecursionWithArray;

public class _08_CheckStringRecursively {
    /**
     * Input: str = "mohammad"
     * Key: 'r' => r is present in str or not
     *      (using recursively)
    */

    public static boolean checkKey(String str, int i, char key) {
        /**
         * Base Case:
        */
        if(i >= str.length()) {
            // key not found
            return false;
        }

        // Ek case solve kr do
        if(str.charAt(i) == key) {
            return true;
        }

        // Baaki recursion sambhal lega
        boolean ans = checkKey(str, i+1, key);
        return ans;
    }
    public static void main(String[] args) {
        String str = "mohammad";
        char key = 'd';
        int i = 0;

        boolean ans = checkKey(str, i, key);
        System.out.println("Answer is: " + ans);

    }
}
