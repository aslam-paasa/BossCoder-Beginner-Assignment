package _02_ConditionalStatements;

/**
 * Q. Find Maximum among two numbers:
 * => Input: a=2, b=4
 * => Output: 4
 */

public class _19_MaximumInteger {

    public static int max_Integer(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 4;

        System.out.println(max_Integer(a, b));
    }
}
