package _19_LinkedList;

import java.util.Scanner;

public class _10_KthNodeFromEnd {
    /**
     * Q. Find the Kth Node from the end without using Size Property?
     * fast
     * => Approach: Fast and Slow Pointer or Hare & Tortoise:
     * => [a]->[b]->[c]->[d]->[e]->[f]->[g] ,k=3
     * Slow |
     * V
     * Kth Node
     * => We will use 2 pointers: (a) Fast, (b) Slow
     * => Akele fast ko chala do 'k' baar to isse dono k bich 'k' ka gap
     * ho jaega. Ab dono ko ek ek step move krte rho jisse dono ka 'k'
     * ka gap maintain rahega, aur jb fast end pe pahuchega to slow
     * kth position pe hoga.
     * 
     * Q. Difference between at Index and at Position?
     * => Index : 0, 1, 2, 3
     * => Position: 1, 2, 3, 4
     * 
     * Input: Output LinkedList
     * 1. addLast 10 [10]
     * 2. getFirst => 10
     * 3. addLast 20 [10, 20]
     * 4. addLast 30 [10, 20, 30]
     * 5. getFirst => 10
     * 6. getLast => 30
     * 7. getAt 1 => 20
     * 8. addLast 40 [10, 20, 30, 40]
     * 9. kthFromEnd 3 => 10 (Position)
     * 10. getLast => 40
     * 11. addLast 50 [10, 20, 30, 40, 50]
     * 12. removeFirst [20, 30, 40, 50]
     * 13. getFirst => 20
     * 14. removeFirst [30, 40, 50]
     * 15. removeFirst [40, 50]
     * 16. kthFromEnd 0 => 50
     * 17. removeFirst [50]
     * 18. removeFirst []
     * 19. getFirst => -1(List is Empty)
     * 20. quit
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

        public void addFirst(int val) {
            Node node = new Node();
            node.data = val;

            if (size == 0) {
                head = tail = node;
            } else {
                node.next = head;
                head = node;
            }
            size++;
        }

        public void addAt(int idx, int val) {
            if (idx == 0) {
                addFirst(val);
            } else if (idx == size) {
                addLast(val);
            } else if (idx < 0 || idx > size) {
                System.out.println("Invalid arguments");
            } else {
                Node nodeMin1 = head;
                for (int i = 0; i < idx - 1; i++) {
                    nodeMin1 = nodeMin1.next;
                }

                Node nodePlus1 = nodeMin1.next;

                Node node = new Node();
                node.data = val;
                node.next = nodePlus1;

                nodeMin1.next = node;
                size++;
            }
        }

        void addLast(int val) {
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

        public int getFirst() {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            }
            return head.data;
        }

        public int getLast() {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            }
            return tail.data;
        }

        public int getAt(int idx) {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            } else if (idx < 0 || idx >= size) {
                System.out.println("Invalid arguments");
                return -1;
            }

            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        public void removeFirst() {
            if (size == 0) {
                System.out.println("List is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                head = head.next;
                size--;
            }
        }

        void display() {
            if (size == 0) {
                System.out.println("List is empty.");
                return;
            }
            for (Node temp = head; temp != null; temp = temp.next) {
                System.out.print(temp.data + " ");
            }
            System.out.println();
        }

        public int kthFromLast(int k) {
            Node fast = head;
            Node slow = head;

            for (int i = 0; i < k; i++) {
                fast = fast.next;
            }

            // there is a gap of k between fast and slow
            while (fast.next != tail) {
                fast = fast.next;
                slow = slow.next;
            }

            return slow.data;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        while (true) {
            System.out.print("Enter command: ");
            String str = sc.nextLine();
            if (str.equals("quit")) {
                break;
            }

            if (str.startsWith("addLast")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                list.addLast(val);
            // } else if (str.startsWith("size")) {
            //     System.out.println(list.size());
            } else if (str.startsWith("display")) {
                list.display();
            } else if (str.startsWith("removeFirst")) {
                list.removeFirst();
            } else if (str.startsWith("getFirst")) {
                int val = list.getFirst();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("getLast")) {
                int val = list.getLast();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("getAt")) {
                int idx = Integer.parseInt(str.split(" ")[1]);
                int val = list.getAt(idx);
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("addFirst")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                list.addFirst(val);
            } else if (str.startsWith("addAt")) {
                int idx = Integer.parseInt(str.split(" ")[1]);
                int val = Integer.parseInt(str.split(" ")[2]);
                list.addAt(idx, val);
            // } else if (str.startsWith("removeLast")) {
            //     list.removeLast();
            // } else if (str.startsWith("removeAt")) {
            //     int idx = Integer.parseInt(str.split(" ")[1]);
            //     list.removeAt(idx);
            // } else if (str.startsWith("reverseDI")) {
            //     list.reverseDI();
            // } else if (str.startsWith("reversePI")) {
            //     list.reversePI();
            } else if (str.startsWith("kthFromEnd")) {
                int idx = Integer.parseInt(str.split(" ")[1]);
                System.out.println(list.kthFromLast(idx));
            }
        }
        sc.close();
    }
}
