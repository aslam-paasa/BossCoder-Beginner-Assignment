package _28_Hashing;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class _13_MedianPriorityQueue {
    /**
     * Q. What does this class do?
     * => This class mimics the behavior of a PriorityQueue but gives the highest priority 
     *    to the median of its data.
     * 
     * Q. What is median?
     * => Middle element:
     *                       mid
     *    (a) Odd  : 10  20  30  40  50    
     *                      mid  mid
     *    (b) Even : 10  20  30  40  50  60  
     *     => Even k case m 2 median hota hai, but hm first mid print 
     *        karaenge or we can say first half ka last chaiye.
     * 
     * Q. What are the functions to implement?
     * => The following functions need to be implemented:
     *    (a) add(int val): Adds a new value to the queue.
     *    (b) remove(): Removes and returns the median value. If the queue is empty, 
     *                  prints "Underflow" and returns -1.
     *    (c) peek(): Returns the median value without removing it. If the queue is empty, 
     *                prints "Underflow" and returns -1.
     * 
     * Approach:
     * => Humne 2 PriorityQueue daale hai i.e. Left & Right. Aadhe element
     *    left m rahenge aur aadhe element right m rahenge. Left i.e. chote
     *    elements m bade wale sabse aage range(reverse order) and right
     *    wale apni regular PriorityQueue m hogi
     * => Inke terms m humein 4 functions likhne hai:
     *    (a) add():
     *     => add(10) => left = [10], right = []
     *     => add(20) => left = [10, 20], right = []
     *     => Ab jaisi hi dono k bich gap "2" ka ho jae left m se ek
     *        nikaal k right m daal de:
     *        => left = [10], right = [20]
     *     => add(30) => Ab agar right k 20 ki peek() se bda element
     *                   hai tabhi left se right m add hoga. But agar
     *                   right ki peek() se chota element hai to left
     *                   m add hoga.
     *                => left = [10], right = [20,30]
     * Note: Left m chota "n" element pade hai, right m bade "n+1"
     *       elements pade hai, aur right m peek() m saare bade elements
     *       ka sabse chota element pda hai, to wo apne aap hi median
     *       hoga.
     *      => add(40) => left = [10], right = [20,30, 40]
     *      => But dono k size m bich m 2 ka gap ho gya to right k peek()
     *         element ko utha k left m daal denge. 
     *         => left = [10, 20], right = [30, 40]
     *      => Ab left ka peek() 20 hoga qki isme bda k priority high hai
     *         aur right m 30 chamkega qki isme chota ka priority high hai.
     *      => add(5)  => left = [5,10,20], right = [30,40]
     *      => add(1)  => left = [1,5,10],  right = [20,30,40]
     * 
     * Conditions to ensure:
     * (a) Size of left == size of right, or
     * (b) |Size of left - size of right| == 1
     * */ 

    
    public static class MedianPriorityQueue {
        PriorityQueue<Integer> left;
        PriorityQueue<Integer> right;

        public MedianPriorityQueue() {
            left = new PriorityQueue<>(Collections.reverseOrder());
            right = new PriorityQueue<>();
        }

        public void add(int val) {
            if (right.size() > 0 && val > right.peek()) {
                right.add(val);
            } else {
                left.add(val);
            }

            // handle gap
            if (left.size() - right.size() == 2) {
                right.add(left.remove());
            } else if (right.size() - left.size() == 2) {
                left.add(right.remove());
            }
        }

        public int remove() {
            if (this.size() == 0) {
                System.out.println("Underflow");
                return -1;
            } else if (left.size() >= right.size()) {
                return left.remove();
            } else {
                return right.remove();
            }
        }

        public int peek() {
            if (this.size() == 0) {
                System.out.println("Underflow");
                return -1;
            } else if (left.size() >= right.size()) {
                return left.peek();
            } else {
                return right.peek();
            }
        }

        public int size() {
            return left.size() + right.size();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        MedianPriorityQueue qu = new MedianPriorityQueue();

        String str = scn.nextLine();
        while (!str.equals("quit")) {
            if (str.startsWith("add")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                qu.add(val);
            } else if (str.startsWith("remove")) {
                int val = qu.remove();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("peek")) {
                int val = qu.peek();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("size")) {
                System.out.println(qu.size());
            }
            str = scn.nextLine();
        }
    }
}

/**
 * Input:
 * 1. add 10
 * 2. add 20
 * 3. add 30
 * 4. add 40
 * 5. peek
 * 6. add 50
 * 7. peek
 * 8. remove
 * 9. peek
 * 10. remove
 * 11. peek
 * 12. remove
 * 13. peek
 * 14. quit
 */