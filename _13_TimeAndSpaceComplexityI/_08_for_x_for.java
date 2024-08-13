package _13_TimeAndSpaceComplexityI;

public class _08_for_x_for {
    /**
     * for*for loop having O(n) TC: 
     * => TC => O(n)
     * 
     * Note: Humesa for*for-loop ki TC: O(n^2) nhi hota.
     * 
     * Analysis & Proof:
     * for(int i = 0; i <= n; i += c) {
     *    for(int j = 1; j <= c; j++) {
     *       => do some work
     *    }
     * }
     * 
     * 1. Dekho bahar wala loop kitni baar chlega
     * 2. Fir dekho andr wala loop kitni baar chlega
     * 
     * Outer Loop: 
     * for(int i = 0; i <= n; i++) {
     *    ....   
     * }
     * 
     * => Ye har baar 'c' se badh rha hai upto 'n'. So, n/c baar chlega.
     * => For example,
     *    Input: n = 1000
     *           c = 50
     *    Operation: 20
     *    => If 'n' is 1000 and 'c' is 50, it means per iteration it will 
     *       jump elements.
     *    => 01, 51, 101, 151, ....., n
     * 
     * Inner Loop:
     * for(int i = 0; i <= n; i++) {
     *    for(int j = 1; j <= c; j++) {
     *       => do some work
     *    }
     * }
     * => Jb ye first iteration m inner loop m jaega to inner loop upto 'c'
     *    baar chlega.
     * => Means bahar wala loop chlega "n/c" baar aur andr wala chlega upto
     *    "c" baar, to total andr wala kitna chlega?
     *     => Outer Loop * Inner Loop
     *     => (n/c) * c
     *     => n => Total Iteration. 
     * */ 
}
