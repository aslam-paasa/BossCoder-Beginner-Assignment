package _29_LinkedList;

public class _01_MiddleOfTheLinkedList {
    /**
     * Avi tk humne LinkedList m jo v methods kiye the aur avi jo
     * krnge usme bahut fark hai. Humne jo kiya hai uska bahar m
     * koi value nhi hai.
     * 
     * Purpose of LinkedList:
     * Ek RAM k andr mai bahut km continuous space bna skta hu, isliye
     * hum Nodes bna k bich bich m fill kr dete hai aur unn sbko ek
     * dusre se connect kr dete hai. Aur jbtk memory available hai tbtk
     * hm LinkedList bna skte hai.
    */

    /**
     *  H
     * [1]->[2]->[10]->[30]->[40]->[3]
     * => Mujhe head given hai aur iski tail nhi pta, aur mujhe middle
     *    nikaalna hai.
     * 
     * Approach-1: Length nikaal k (length/2) kr de. But uske liye iterate
     *             krna hoga fir (length/2) pe loop chla k pahuchna hoga.
     * TC: O(N) + O(N)
     * 
     * Approach-2: Tortoize and Hare Approach or 
     *             Floyd's Cycle Detection or
     *             Slow Pointer and Fast Pointer
     *             Suppose 2 log hai, (A) & (B). Ab jb A wala bnda last
     *             m pahuche to B wala bnda half m pahuch jae.
     *                               X
     * A <------------------------------------------------------>
     * B <----------------------------->
     *               X/2
     * t=0                                                     t=T
     * 
     * Speed = (distance/time)
     * 1. VA = X/T      2. VB = X/2T
     *    T  = X/VA        T  = X/2VB
     * 
     * => X/VA = X/2VB
     * => VA   = 2VB
     * Means VA is speed VB k double honi chaiye.
     * Suppose, B = 4km/hr se chl rha hai to A ko 8km/hr k speed se chlna
     * chaiye.
     * 
     * Slow Pointer (X-Speed)
     *  |
     *  V
     *  S
     * [1]->[2]->[10]->[30]->[40]->[3]
     *  F
     *  |
     *  V
     * Fast Pointer (2X-Speed)
     * 
     * Note: Middle Node are of two types:
     *       (a) Odd Length - Always unique(middle node)
     *       (b) Even Length - 2 mid node
     * Q. Kn sa mid node mujhe use krna chaiye?
     * => Jb v mid node nikaalne ki baari aaegi to hm humesa mid node ko
     *    preference denge, agar hm midnode ko as a function use krna
     *    chahte hai.
     * => Agar koi humein forcefully 2nd node dene ko bolega ko tb 2nd node
     *    denge.
     * 
    */

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /**
     * Leetcode-876:
     * Input: head = [1, 2, 3, 4, 5]
     * Output: [3, 4, 5]
     * Explanation: The middle node of the list is node 3.
     * 
     * Note: If there are two middle nodes, return second middle node.
     * 
     * Input: head = [1, 2, 3, 4, 5, 6]
     * Output: [4, 5, 6]
     * Explanation: Since the list has two middle nodes with values
     * 3 and 4, we return the second one.
     * 
     * Stopping Condition:
     * 1. fast == null
     * 2. fast.next == null
    */

    /**
     * This fn will return the 2nd middle node of even-length list
    */
    public ListNode middleNode_leetcode(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    /**
     * This fn will return the 1st middle node of even-length list
    */
    public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode slow = head, fast = head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {

    }
}
