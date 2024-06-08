package _03_Loops;

public class _27_SkipValueInLoop {
    public static void main(String[] args) {
        int x;

        // Print even loop but skip 54
        for(x = 2; x <= 100; x+=2) {
            if(x == 54) {
                continue; // skip the current iteration
            }
            System.out.println(x);
        }
    }
}
