package _04_Function;

import java.util.Scanner;

public class MaxOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        int maximumNumber = findMax(a, b, c);
        System.out.println(maximumNumber);

    }



    public static int findMax(int num1, int num2, int num3) {
        if(num1 > num2 && num1 > num3) {
            return num1;
        } else if(num2 > num1 && num2 > num3) {
            return num2;
        } else {
            return num3;
        }
    }
}
