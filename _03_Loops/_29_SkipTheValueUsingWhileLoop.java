package _03_Loops;

public class _29_SkipTheValueUsingWhileLoop {
    public static void main(String[] args) {
        int x = 1;
        while (x <= 10) {
            if (x == 7) {
                x = x + 2;
                continue;
            }
            System.out.println(x);
            x = x + 2;
        }
    }
}
