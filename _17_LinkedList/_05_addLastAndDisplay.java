package _17_LinkedList;

import java.util.Scanner;


public class _05_addLastAndDisplay {

    /**
     * Yeh LinkedList class hai jisme hum 3 cheezein store karte hain:
     * (a) head: yeh first node ka reference hota hai
     * (b) tail: yeh last node ka reference hota hai
     * (c) size: yeh LinkedList me kitne nodes hain, uski count hoti hai
     * 
     * Ab hum kuch functions banayenge isme:
     * (a) display(): yeh function LinkedList me jo bhi data hai, usko print karta hai
     * (b) addLast(): yeh function naya node banakar LinkedList ke last me add karta hai
     * 
     * Yeh code humne LinkedList ko samajhne ke liye banaya hai, aur isme humne comments me Hindi me samjhaaya hai ki yeh code kya karta hai.
    */

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
            if(size == 0) {
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
            if(size == 0) {
                return;
            }
            // Yeh loop LinkedList me se data print karta hai
            for(Node temp = head; temp != null; temp = temp.next) {
                System.out.println(temp.data + " ");
            }
            System.out.println();
        }
    }

    // Node class hai jo LinkedList me har ek node ko represent karta hai
    private static class Node {
        int data;
        Node next;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // LinkedList object banaya
        LinkedList list = new LinkedList();

        System.out.println("Kitne elements add karne hain? ");
        int n = sc.nextInt();
        
        // User se input lekar LinkedList me data add kiya
        for (int i = 0; i < n; i++) {
            System.out.println("Element " + (i + 1) + " ka value kya hai?");
            int val = sc.nextInt();
            list.addLast(val);
        }


        // LinkedList me jo data hai, usko print kiya
        list.display();

        // LinkedList me kitne nodes hai, uski count print kiya
        System.out.println("LinkedList me kitne nodes hai: " + list.size());
    }
}
