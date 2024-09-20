package _19_LinkedList;

public class _20_removeLast {

    // Node class hai jo LinkedList me har ek node ko represent karta hai
    private static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        int size() {
            return size;
        }

        // O(1)
        void addLast(int val) {
            // Naya node banaya
            Node node = new Node();
            node.data = val;
            node.next = null;

            // Agar LinkedList khali hai to head aur tail dono naye node ko point karenge
            if (size == 0) {
                head = tail = node;
                tail = node;
            } else {
                // Naye node ko last node ke next me daala
                tail.next = node;
                // Tail ko update kiya naye node ke liye
                tail = node;
            }
            // LinkedList me size increase kiya
            size++;
        }

        // O(n)
        void display() {
            if (size == 0) {
                return;
            }
            // Yeh loop LinkedList me se data print karta hai
            for (Node temp = head; temp != null; temp = temp.next) {
                System.out.println(temp.data + " ");
            }
            System.out.println();
        }

        public void removeLast() {
            if(size == 0) {
                System.out.println("List is empty");
            } else if(size == 1) {
                head = tail = null;
                size = 0;
            } else {
                Node secLast = head;
                for(int i = 0; i < size - 2; i++) {
                    secLast = secLast.next;
                }

                this.tail = secLast;
                this.tail.next = null;
                this.size--;
            }            
        }
    }

}
