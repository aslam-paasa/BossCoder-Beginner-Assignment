package _19_LinkedList;

import java.util.Scanner;

public class _15_MergeSortLL {
    /**
     * LL = [20]->[50]->[30]->[80]->[10]->[40]->[60]->[70]
     *      head               mid                    tail
     * 
     * Step-1: 
     * => Humein "mid" nikaalne aata hai.
     * => Head se le k mid tk ki list ek taraf jae aur sort ho kr aae
     *    aur dusri taraf mid.next se le kr tail tk ki list jae aur
     *    sort ho kr aae, aur faith rkhnge ki aisa ho jaega.
     * 
     * LL = [20]->[50]->[30]->[80]->[10]->[40]->[60]->[70]
     *      head               mid                    tail
     *      ([20]->[30]->[50]->[80])->([10]->[40]->[60]->[70])
     * 
     * Step-2:
     * => Ab humein 2 sorted list merge krne aata hi hai.
     * => Ans:
     * LL = [10]->[20]->[30]->[40]->[50]->[60]->[70]->[80]
     *      
     * Note: Assumption ye hai, we already know:
     *       (a) Merge Sort in Array
     *       (b) Merge 2 sorted LL  
     *       (c) Mid in LL
     * 
     * 
    */
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        public void addLast(int val) {
            Node temp = new Node();
            temp.data = val;

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }

            size++;
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public static LinkedList mergeTwoSortedLists(LinkedList l1, LinkedList l2) {
            LinkedList res = new LinkedList();

            // array not allowed
            // O(l1.size() + l2.size())

            Node one = l1.head;
            Node two = l2.head;

            while (one != null && two != null) {
                if (one.data < two.data) {
                    res.addLast(one.data);
                    one = one.next;
                } else {
                    res.addLast(two.data);
                    two = two.next;
                }
            }

            while (one != null) {
                res.addLast(one.data);
                one = one.next;
            }

            while (two != null) {
                res.addLast(two.data);
                two = two.next;
            }

            return res;
        }

        // Phle mid int return krta tha but iss baar Node return krwaenge
        public static Node midNode(Node head, Node tail) {
            Node fast = head;
            Node slow = head;

            //    odd case             even case
            // Logic yha change hogi qki iss baar tail baar baar change ho rhi hai
            while(fast != tail && fast.next != tail) {
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow;
        }

        public static LinkedList mergeSort(Node head, Node tail) {
            /**
             * Base Case: 
            */
            if(head == tail) {
                LinkedList baseList = new LinkedList();
                baseList.addLast(head.data);
                return baseList;
            }

            // Array m (low+high)/2 se mid aata tha but yha aise nhi aata
            // mid yha mangwana pdta hai: Iss head or tail k bich k mid dega ye
            Node mid = midNode(head, tail);
            Node midNext = mid.next;

            LinkedList firstSortedHalf = mergeSort(head, mid);
            LinkedList secondSortedHalf = mergeSort(midNext, tail);
            LinkedList fullSortedList = mergeTwoSortedLists(firstSortedHalf, secondSortedHalf);
            return fullSortedList;
            
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList list = new LinkedList();

        System.out.println("Enter the number of elements in the list:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < n; i++) {
            list.addLast(sc.nextInt());
        }

        LinkedList sortedList = LinkedList.mergeSort(list.head, list.tail);

        System.out.println("The sorted list is:");
        sortedList.display();

        sc.close();
    }
}
