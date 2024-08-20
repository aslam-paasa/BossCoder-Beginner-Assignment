package _25_Hashing;

import java.util.Comparator;
import java.util.PriorityQueue;

public class _08_PriorityQueueForCollections {
    /**
     * PriorityQueue k andr agar mujhe String, boolean, integer etc
     * store karane hue to uske liye mere paas ye syntax hai.
     * */
    public static void main(String[] args) {

        /**
         * 1. Handling datatypes like boolean, integer, string etc.
         * */ 
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(3); // O(logn)
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()) {
            System.out.print(pq.peek() + " "); // O(1)
            pq.remove(); // O(logm)
        }


    }
}
