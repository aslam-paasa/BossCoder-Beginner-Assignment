package _11_Maths;

import java.util.Scanner;

public class _12_PerfectSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();// humne n ki value input li
        for (int i = 1; i * i <= n; i++) {
            System.out.println(i * i);

        }
        // hume n tk k vo digit print krane hai jo ki perfect square hai

    }
}
