package _02_ConditionalStatements;

public class _17_EvenOdd {

    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(isEven(n)); // This will print the result of the isEven method
    }
}
