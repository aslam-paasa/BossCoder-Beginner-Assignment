package _13_TimeAndSpaceComplexityI;

public class _02_Loop {
    public static void main(String[] args) {

        int n = 5;

        // Operations: N-iterations => O(N)
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }

        // Operations: N-iterations => O(N)
        for (int j = 0; j < n; j++) {
            System.out.println(j);
        }

        // O(1)
        int k = 5;

        // O(1)
        int m = 7 * 2 + 3;

        System.out.println(k + m);

        // Total Time Complexity:
        // => N + N => 2N => O(N)

        // Majority Factor:
        // => O(1000 + 7) operations => O(1007)
        // => Ignore the small part, and we can write it as: O(1000)

        // Imagine 'n' is very big number and 'c' is constant, where c <<< n.
        // We can say: 
        //    (a) O(N+C) = O(N) 
        //    (b) O(N-C) = O(N)
        //    (c) O(N*C) = O(N)
        //    (d) O(N/C) = O(N)
        // Note: Constants can be ignored.

        // So, if order is: O(N + N^2 + NlogN + 2) = O(N^2)

        // N^2 = 10^6
        // NlogN = 10^4
    }
}
