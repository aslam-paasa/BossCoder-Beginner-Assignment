package _17_LinkedList;

import java.util.Scanner;

public class _19_DisplayReverseRecursively {
    /**
     * Array k tarah hi hoga, upar jaate jaenge aur wapas aate hue
     * print kr denge.
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

        public int size() {
            return size;
        }

        public int getFirst() {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            }
            return head.data;
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

        public void addFirst(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = head;
            head = temp;

            if (size == 0) {
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

        public void displayReverseHelper(Node node) {
            // base case:
            if(node == null) {
                return;
            }

            // chlte jao, wapas aate hue print kr dena
            displayReverseHelper(node.next);
            System.out.print(node.data + " ");
        }

        public void displayReverse() {
            displayReverseHelper(head);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            list.addLast(val);
        }

        System.out.println("Original List:");
        list.display();

        System.out.println("Reverse List:");
        list.displayReverse();
    }
}


/**
 * 1. Enter the number of elements:
 * => 7
 * 
 * 2. Enter the elements:
 * => 1 2 3 4 5 6 7
 * 
 * 3. Reverse List:
 * => 7 6 5 4 3 2 1
*/