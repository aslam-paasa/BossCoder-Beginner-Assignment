package _12_RecursionWithArrayList;

public class _908_Count_No_Of_Zeroes {
    /**
     * N = 30204, ans = 2
     * 
     * 1. If we take count inside argument:
     *    f(n, 0) = (a) If digit = 0  => f(n/10, count+1);
     *              (b) If digit != 0 => f(n/10, count);
     * */
    
    public static void main(String[] args) {
        System.out.println(count(3021000));
    }

    public static int count(int n) {
        return helper(n, 0);
    }

    // special pattern, how to pass a value to above calls
    public static int helper(int n, int count) {
        if(n == 0) {
            return count;
        }

        int rem = n % 10;
        if(rem == 0) {
            return helper(n/10, count+1);
        }  

        return helper(n/10, count);
    }
}
