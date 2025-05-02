package _29_LinkedList;

/**
 * Leetcode-206: Reverse Linked List
*/
public class _02_ReverseLinkedList {

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


    public ListNode reverseList(ListNode head) {
        /**
         * LinkedList null hai to reverse kr k fayda nhi hai
         * LinkedList ki size-1 hai to reverse kr k fayda nhi
         * => Dono case m head return kr do 
        */
        if(head == null || head.next == null) {
            return head;
        }

        ListNode previous = null;
        ListNode current  = head;

        while(current != null) {
            // Current k next ko store kr denge forward pe
            ListNode forward = current.next; // backup

            // current k next ko point kra denge previous pe (direction ulta)
            current.next = previous; // linkup

            // Ab previous ko utha k rkh denge current pe
            // Fir current ko utha k rkh denge forward pe
            previous = current; // move
            current = forward;
        }
        return previous;
    }
}
