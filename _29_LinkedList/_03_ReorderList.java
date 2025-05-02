package _29_LinkedList;

/**
 * Leetcode-143: Reorder List 
*/
public class _03_ReorderList {
    /**
     * Given: L0 -> L1 -> ..... -> Ln-1 -> Ln
     * 
     * Reorder List in this form:
     * L0 -> Ln -> L1 -> Ln-1 -> L2 -> Ln-2 -> ...
     *        |           |             |
     *        V           V             V
     *        R           R             R   
     * 
     * Dhyan se dekhe to aadhi list reverse ho rkhi hai
     * 
     * Note: This is like folding paper.
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

    /**
     * [A] -> [B] -> [C] -> [D] -> [E] -> [F] -> [G] -> [H]
     * 
     * Break the LL into two parts:
     * [A] -> [B] -> [C] -> [D]  ||  [E] -> [F] -> [G] -> [H]
     * 
     * Reverse the 2nd half:
     * [A] -> [B] -> [C] -> [D]  ||  [E] <- [F] <- [G] <- [H]
     * 
     *           C1     F1
     * head:    [A] -> [B] -> [C] -> [D]
     * newHead: [H] -> [G] -> [F] -> [E]
     *           C2     F2
    */
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) {
            return;
        }

        ListNode midNode = middleNode(head);
        ListNode newHead = midNode.next;
        midNode.next = null;

        newHead = reverseList(newHead);

        ListNode c1 = head;
        ListNode c2 = newHead;
        while(c1 != null) {
            // Backup
            ListNode f1 = c1.next;
            ListNode f2 = c2.next;

            // Linkup
            c1.next = c2;
            c2.next = f1;

            c1 = f1;
            c2 = f2;
        }
    }
}
