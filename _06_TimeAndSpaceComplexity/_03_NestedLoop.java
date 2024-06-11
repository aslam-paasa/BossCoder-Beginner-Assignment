package _06_TimeAndSpaceComplexity;

public class _03_NestedLoop {
    public static void main(String[] args) {
        int n = 5;

        // TC: N*N => N^2 => O(N^2) 
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }

        // Note: Nested loop is not always O(n^2) because if we set the ith-condition 
        //       as 'n^2' instead of 'n', then 'i*j' will become 'n^2 x n = n^3'.
        //       O(n^3).
    }
}
