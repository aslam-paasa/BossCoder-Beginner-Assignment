package _19_LinkedList;

import java.util.Scanner;

public class _09_removeFirst {
    private static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        public void addFirst(int val)  {
            Node node = new Node();
            node.data = val;
            

            if(size == 0) {
                head = tail = node;
            } else {
                node.next = head;
                head = node;
            }
            size++;
        }

        /**
         * Mark and Sweep Algorithm:
         * => Unreachable elements ko garbade collector clean kr deta hai
         * => First element unreachable h to wo clean hoga aur baaki mark save ho jaega
        */
        public void removeFirst() {
            if(size == 0) {
                System.out.println("List is empty");
            } else if(size == 1) {
                head = tail = null;
                size = 0;
            } else {
                head = head.next;
                size--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        LinkedList list = new LinkedList();

        System.out.println("Kitne elements add karne hain? ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Element " + (i + 1) + " ka value kya hai?");
            int val = sc.nextInt();
            list.addFirst(val);
        }
    }
}
