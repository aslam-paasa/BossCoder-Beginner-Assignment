package _02_ConditionalStatements;

/**
 * Q. WAP to find minimum of 3 numbers using Nested If-Else
 */
public class _14_MinimumOfThreeNum {
    public static void main(String[] args) {
        int a = 80, b = 90, c = 60;

        if (a > b) {
            if (a > c)
                System.out.println("A is largest");
            else
                System.out.println("C is largest");
        } else {
            if (b > c)
                System.out.println("B is largest");
            else
                System.out.println("C is largest");
        }
    }
}
