package _19_LinkedList;

import java.util.Scanner;

public class _12_ReverseLinkedList {
    /**
     * Q. You are required to complete the body of reverseDI function.
     *    The function should be an iterative function and should
     *    reverse the contents of linked list by changing the "data"
     *    property of nodes. [Only change data property]
     * => TC: O(n^2) 
     */

    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

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

        /**
         * Taking reference from getAt(), which returns a full node, not just data.
         * This is used in reverseDI to get nodes at specific indexes.
         */
        public Node getNodeAt(int idx) {
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp;
        }

        public void reverseDI() {
            int leftIdx = 0;
            int rightIdx = size - 1;
            while(leftIdx < rightIdx) {
                Node left = getNodeAt(leftIdx);
                Node right = getNodeAt(rightIdx);

                int temp = left.data;
                left.data = right.data;
                right.data = temp;

                leftIdx++;
                rightIdx--;
            }
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
            } else if (str.startsWith("display")) {
                list.display();
            } else if (str.startsWith("reverseDI")) {
                list.reverseDI();
            }
        }
        sc.close();
    }
}
