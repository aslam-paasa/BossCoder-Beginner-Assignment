package _28_Hashing;

import java.util.PriorityQueue;
import java.util.Scanner;

public class _12_SortKSortedArray {
    /**
     * arr = [30  20  10  60  40  50  70  90  80]
     * k-sorted, where k = 2
     * [k-sorted means nearly sorted i.e. each element is upto k distance
     *  away from where it should be]
     * => Sort the k-sorted array
     * 
     *  30  20  10  60  40  50  70  90  80
     *  10  20  30  40  50  60  70  80  90
     * => Jo element jaha hona chaiye usse max either 2 position left m 
     *    hai ya right m hai.
     * 
     * TC: O(n logk)
     * SC: O(k)
     * 
     * Note: Pair use nhi hoga, normal integer k PriorityQueue banegi
     * */ 

    /**
     * Explanation: k = 2
     * => a  b  c  d  e  f  g  h  i  j
     *    _<----->
     * => Agar k=2 hai to "a" element pe "a" khud aa skta hai aur uske
     *    bagal wale aur "2" elements.  To humein "k+1" size ka.
     *  
    */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int k = scn.nextInt();

        // Code starts from here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i <= k; i++) {
            pq.add(arr[i]);
        }

        for(int i = k + 1; i < arr.length; i++) {
            int value = pq.peek();
            System.out.println(value);

            pq.remove();
            pq.add(arr[i]);
        }

        while(pq.size() > 0) {
            int value = pq.peek();
            System.out.println(value);

            pq.remove();
        }
    }
}
