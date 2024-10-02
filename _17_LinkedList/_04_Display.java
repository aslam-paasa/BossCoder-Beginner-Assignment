package _17_LinkedList;

import java.util.Scanner;

public class _04_Display {

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        // O(n)
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
    }

    private static class Node {
        int data;
        Node next;
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.display(); // Expected output: List is empty.
    }
}
