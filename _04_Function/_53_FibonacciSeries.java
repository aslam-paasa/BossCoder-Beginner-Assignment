package _04_Function;

import java.util.Scanner;

public class _53_FibonacciSeries {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        if(n >= 1) {
            System.out.println(0); // 1st element
        }
        if(n >= 2) {
            System.out.println(1); // 2nd element
        }

        int p = 1;
        int pp = 0;

        for(int i = 3; i < n; i++) { // 3rd element till 'n'
            int curr = p + pp;
            System.out.println(curr);
            pp = p;
            p = curr;
        }
    }
}
