package _17_LinkedList;

public class _06_get {
    
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        // O(1)
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

        // Get the first element in the linked list
        // O(1)
        public int getFirst() {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            }
            return head.data;
        }

        // Get the last element in the linked list
        // O(1)
        public int getLast() {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            }
            return tail.data;
        }

        // Get the element at a specific index in the linked list
        // O(n)
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
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        System.out.println("First element: " + list.getFirst()); // Should display: 10
        System.out.println("Last element: " + list.getLast());   // Should display: 30
        System.out.println("Element at index 1: " + list.getAt(1)); // Should display: 20
    }
}
