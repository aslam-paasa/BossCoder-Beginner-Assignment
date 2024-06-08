package _03_Loops;

public class _24_PrintOnlyEvenNumbers {
    public static void main(String[] args) {
        int n = 20;

        int i;
        for(i = 0; i <= n; i = i+2) {
            System.out.println(i);
        }
        System.out.println(i); // i+2 = 22
    }
}

// 1:01:51