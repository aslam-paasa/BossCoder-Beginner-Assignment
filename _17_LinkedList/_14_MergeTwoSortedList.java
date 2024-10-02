package _17_LinkedList;

import java.util.Scanner;

public class _14_MergeTwoSortedList {
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

            while(one != null && two != null) {
                if(one.data < two.data) {
                    res.addLast(one.data);
                    one = one.next;
                } else {
                    res.addLast(two.data);
                    two = two.next;
                }
            }

            if(one == null) {
                while(two != null) {
                    res.addLast(two.data);
                    two = two.next;
                }
            } else if(two == null) {
                while(two != null) {
                    res.addLast(two.data);
                    two = two.next;
                }
            }
            return res;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();

        System.out.println("Enter the number of elements in the first sorted list:");
        int n1 = sc.nextInt();
        System.out.println("Enter the elements of the first sorted list:");
        for (int i = 0; i < n1; i++) {
            l1.addLast(sc.nextInt());
        }

        System.out.println("Enter the number of elements in the second sorted list:");
        int n2 = sc.nextInt();
        System.out.println("Enter the elements of the second sorted list:");
        for (int i = 0; i < n2; i++) {
            l2.addLast(sc.nextInt());
        }

        LinkedList merged = LinkedList.mergeTwoSortedLists(l1, l2);

        System.out.println("The merged sorted list is:");
        merged.display();

        sc.close();
    }
}

/**
 * Input:
 * 1. Enter the number of elements in the first sorted list:
 * => 4
 * 
 * 2. Enter the elements of the first sorted list:
 * => 1 3 5 7
 * 
 * 3. Enter the number of elements in the second sorted list:
 * => 5
 * 
 * 4. Enter the elements of the second sorted list:
 * => 2 4 6 8 9
*/