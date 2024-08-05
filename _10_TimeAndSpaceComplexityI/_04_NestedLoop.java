package _10_TimeAndSpaceComplexityI;

public class _04_NestedLoop {
    public static void main(String[] args) {
        // What will be the TC when 'j < i'?
        // i=0 -> 1 iteration
        // i=1 -> 2 iteration
        // i=2 -> 3 iteration
        // ....
        // ....
        // i=n-1 -> n iteration

        // 1+2+3+...+n
        // => n(n+1)/2
        // => n^2+n => Ignore 2, using this formula O(N/C) = O(N) [Majority Factor]
        // => O(n^2)

        int n = 10;

        // TC: O(n^2)
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.println(i + "" + j + " ");
            }
        }
    }
}
