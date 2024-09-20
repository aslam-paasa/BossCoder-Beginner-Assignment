package _28_Hashing;

import java.util.Collections;
import java.util.PriorityQueue;

public class _07_PriorityQueue {
    /**
     * Heap: 
     * => Means "dher".
     * => Using Heap Data Structure, Priority Queue is created.
     * 
     * Queue: LIFO
     * => Queue ek line hoti hai, jb log ek line m lagte hai to usko hm
     *    english m queue kehte hai.
     * => And priority means preference.
     * => For example, agar bus m ek seat khali hai aur bahut passengers
     *    khade hai to unme se sbse high priority/preference pregnant
     *    lady ko milega.
     * => Example, College k admission k liye bahut saare applicants hai
     *    aur seats limited hai to hum on the basis of percentage select
     *    krnge. Means jiski percentage high hai usko jyda priority.
     * => But priority alag alag hoti hai, ho skta hai km rank m jyda 
     *    priority milti ho aur jyda percentage m jyda priority. Basically
     *    kvi kvi priority k basis pe humein data ko sort krna pdta hai.
     * => Bahut saare college application bna k rkhte hai jisme jiski
     *    jyda percentage hogi usko automatically seat allocate ho jaegi,
     *    to humein manually koi teacher nhi baithana pda. To aise systems
     *    ko bnane k liye humari jo real life priority ki problems hoti hai
     *    unko jb hm implement krte hai code k form m to uske liye humein
     *    ek data structure chaiye jo priority k basis pe chalta hai, aur
     *    yhi se concept aata hai priority queue ka.
     * 
     * Functions:
     * (a) add()    => Last In   
     * (b) remove() => First Out
     * (c) peek()   => See First
     * 
     * Priority Queue:
     * => Priority Queue is almost similar to queue, but the only 
     *    difference is jo remove hoga wo front se nhi hoga, remove hoga
     *    highest priority wala.
     * Note: Smaller number has higher priority. For example, Topper
     *       has the smallest rank in exam.
     * 
     *       +-----------------------------+
     *  <----| 40 | 50 | 20 | 60 | 10 | 25 |<----
     *       +-----------------------------+
     * (a) add(40)
     *     peek() => 40
     * (b) add(50)
     *     peek() => 40
     * (c) add(20)
     *     peek() => 20
     * (d) add(60)
     *     peek() => 20
     * (e) add(10)
     *     peek() => 10
     * (f) add(25)
     *     peek() => 10
     * (f) remove()        [remove highest priority first i.e. 10]
     *     peek() => 20
     * 
     * 1. peek() TC: O(1)
     * 2. add() TC:  O(logn)
     * 3. remove() TC:  O(logn)
     * */ 

    public static void main(String[] args) {
        /**
         * Smallest number has highest priority:
        */
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(20);
        pq.add(40);
        pq.add(33);
        pq.add(57);
        pq.add(10);
        pq.add(67);

        System.out.println(pq.peek()); // 20, 40, 33, 57, 10, 67 => 10
        pq.remove(); // 20, 40, 33, 57, 67 => 20

        System.out.println(pq.peek()); // 20, 40, 33, 57, 67 => 20
        pq.remove(); // 40, 33, 57, 67 => 33

        System.out.println(pq.peek()); // 40, 33, 57, 67 => 33
        pq.remove(); // 40, 57, 67 => 40

        System.out.println(pq.peek()); // 40, 57, 67 => 40
        pq.remove(); // 57, 67 => 57

        System.out.println(pq.peek()); // 57, 67 => 57
        pq.remove(); // 67 => 67

        System.out.println(pq.peek()); // 67 => 67
        pq.remove();


        System.out.println();


        /**
         * Printing array in sorted order using Priority Queue:
         * TC: O(n logn)
        */
        int[] arr = {10, 57, 33, 44, 56, 11, 98};
        for(int val: arr) {
            pq.add(val);
        }

        while(pq.size() > 0) {
            System.out.print(pq.peek() + " ");
            pq.remove();
        }


        System.out.println();

        /**
         * Printing array in reverse sorted order using Priority Queue:
         * Biggest number has highest priority. [But still smaller has highest priority]
        */
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
        
        int[] arr2 = {10, 57, 33, 44, 56, 11, 98};
        for(int val: arr2) {
            pq2.add(val);
        }

        while(pq2.size() > 0) {
            System.out.print(pq2.peek() + " ");
            pq2.remove();
        }


    }
}
