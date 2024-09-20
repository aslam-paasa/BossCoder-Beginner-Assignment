package _19_LinkedList;

import java.util.Scanner;

public class _07_addFirst {

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


/**
 * Memory Diagram:
 * 
 * Initially:
 * head -> null
 * tail -> null
 * size -> 0
 * 
 * After adding 1st element (val = 10):
 * head -> Node(10)
 *        |
 *        | next -> null
 * tail -> Node(10)
 * size -> 1
 * 
 * After adding 2nd element (val = 20):
 * head -> Node(20)
 *        |
 *        | next -> Node(10)
 *        |       |
 *        |       | next -> null
 * tail -> Node(10)
 * size -> 2
 * 
 * After adding 3rd element (val = 30):
 * head -> Node(30)
 *        |
 *        | next -> Node(20)
 *        |       |
 *        |       | next -> Node(10)
 *       |       |       |
 *        |       |       | next -> null
 * tail -> Node(10)
 * size -> 3
 * 
 * And so on...
*/