package _26_LinkedList;

import java.util.Scanner;

public class _02_DisplayLinkedList {

    /**
     * Creating data & Node
     * */ 
    public static class Node {
        int data;
        Node next;
    }

    /**
     * Creating LinkedList head, tail & size
    */
    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        int size() {
            return size;
        }

        /**
         * Display LinkedList
        */
        void display() {
            for(Node temp = this.head; temp != null; temp = temp.next) {
                System.out.println(temp.data + " ");
            }
            System.out.println();
        }

        /**
         * Add data & Node at the Last
        */
        void addLast(int val) {
            Node node = new Node();
            node.data = val;
            node.next = null;
            tail.next = node;
            tail = node;
            size++;
        }
    }
    public static void main(String[] args) {
        /**
         * Q. Display LinkedList
         * => 1. Sabse pehle humein chaiye Node to create a LinkedList because 
         *       LinkedList can be said as a chain of nodes. So, we are creating
         *       a node class to get objects of type node.
         * */ 

        Scanner scn = new Scanner(System.in);
        LinkedList list = new LinkedList();
    }
}
