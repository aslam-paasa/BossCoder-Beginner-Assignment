package _03_Loops;

import java.util.Scanner;

public class _43_OddNumberSum {
    public static void main(String[] args) {
    // Arithmetic Progression => 1 + 3 + 5 + 7 + 9 + (2n - 1)
    // Formula: 
    // (a) Sn = n/2(2a + (n-1)d), where d = common difference
    // (b) Sn = n/2(a + l), where a = 1st number, l = last number
    //        = n/2(1 + 2n-1)
    //        = n/2 * 2n
    //        = n^2
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    System.out.println(n*n);
    }
}
