package _04_Function;

public class _15_PrimeNumberTillN {
    public static void main(String[] args) {
        primesInRange(20); // 2 to 20
    }

    public static boolean isPrime(int n) {
        if(n == 2) {
            return true;
        }

        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primesInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) { // true
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
