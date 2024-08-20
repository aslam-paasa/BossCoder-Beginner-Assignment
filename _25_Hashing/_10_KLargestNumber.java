package _25_Hashing;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class _10_KLargestNumber {
    /**
     * arr = [10, 19, 3, 74, 86, 57, 24, 5, 11]
     * k = 3 => 86, 74, 57
     * 
     * TC: O(n logk)
     * SC: O(k)
     * 
     * Example:
     * => Hospital m limited oxygen cylinder hai to jo jyda bimar hoga
     *    uski priority jyda hogi.
     * => Priority Queue is implemented by Heap Data Structure.
     */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int k = scn.nextInt();


        // Approach-1
        // Collections.reverseOrder() => O(n)
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

        // O(n logn)
        for(int val : arr) {
            pq.add(val);
        }

        // O(k logn)
        for(int i = 0; i < k; i++) {
            int val = pq.peek();
            pq.remove();
            System.out.print(val + " ");
        }
        // Total TC: O(n+k logn)



        System.out.println();




        // Approach-2
        PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>();

        // Add k elements in pq2
        for(int i = 0; i < k; i++) {
            pq2.add(arr[i]);
        }

        // Compare pq2 with arr[k+1 to end]
        // If arr[i] greater than smallest element of pq2 then remove
        // that element from pq2 and add arr[i] to pq2. By following
        // this approach, we will get the top "k" elements.
        for(int i = k; i < arr.length; i++) {
            int val = arr[i];
            if(val > pq2.peek()) {
                pq2.remove();
                pq2.add(val);
            }
        }

        // Now display in ascending order
        // while(pq2.size() > 0) {
        //     System.out.print(pq2.peek() + " ");  // 57, 74, 86
        //     pq2.remove();
        // }


        // Now display in descreasing order
        int[] res = new int[k];
        int i = 0;
        while(pq2.size() > 0) {
            res[res.length - 1 - i] = pq2.peek();
            i++;
            pq2.remove();
        }

        for(int val : res) {
            System.out.print(val + " "); // 86 74 57
        }
    }
}

