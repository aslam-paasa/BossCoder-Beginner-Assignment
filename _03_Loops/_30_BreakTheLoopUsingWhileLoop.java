package _03_Loops;

public class _30_BreakTheLoopUsingWhileLoop {
    public static void main(String[] args) {
        int x = 1;
        while (x <= 10) {
            if (x == 7) {
                break;
            }
            System.out.println(x);
            x = x + 2;
        }
    }
}
