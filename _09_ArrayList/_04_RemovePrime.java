package _09_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class _04_RemovePrime {
    
    public static boolean isPrime(int num) {
        boolean isPrime = true;

        for(int div = 2; div * div <= num; div++) {
            if(num % div == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void solution(ArrayList<Integer> list) {
        /**
         * Way-1: Remove Prime logic using ArrayList:
        */
        // for(int i = 0; i < list.size(); i++) {
        //     int val = list.get(i);
        //     boolean isThisValPrime = isPrime(val);
        //     if(isThisValPrime == true) {
        //         list.remove(i);
        //         i--;
        //     }
        // }

        /**
         * Way-2: Remove Prime logic using ArrayList(loop utla chla lo)
        */
        for(int i = list.size() - 1; i >= 0; i--) {
            int val = list.get(i);
            boolean isThisValPrime = isPrime(val);
            if(isThisValPrime == true) {
                list.remove(i);
            }
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            list.add(scn.nextInt());
        }

        solution(list);
        System.out.println(list);
    }
}
