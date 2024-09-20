package _19_LinkedList;

import java.util.Scanner;

/**
 * LinkedList Vs Array Vs ArrayList:
 * 1. int[] arr = new int[5];
 * 2. ArrayList<> list = new ArrayList<>();
 * => Array bnta heap mai bnta hai aur iski memory continuous store
 *    hoti jisse O(1) TC hoti hai lekin iski limitation iski fixed 
 *    size hai.
 * => ArrayList ka size dynamic hoti hai aur memory continuous store
 *    hoti hai.
 * => LinkedList is:
 *    (a) non-continuous
 *    (b) dynamic in size 
 * 
 * 1. LinkedList Class:
 * Q.  Data bikhra bikhra hota hai node k saath jo agla data ka addr
 *     btata hai. But iski relevance kya hai? Isse kb use krnge?
 * =>  Kai baar memory fragmented hoti hai, to array aur arraylist
 *     aise cases m fass jaenge qki ye dono continuous hote hai.
 * 
 *      data    Head Node        data   Node            data   Tail Node
 *     +------------------+    +------------------+    +-------------+
 *     | d=10 | next() 5k |===>| d=20 | next() 6k |===>| d=40 | null |
 *     +------------------+    +------------------+    +-------------+
 *       4k                       5k                     6k
 * Note: Agar Head Node kho jaega to hum poori list travel kr hi ni skte
 *       isliye head ko humesa preserve kr k rkhna pdta hai.
 * 
 * 2. Summary Class: 
 * => Isme hum 3 chij rkhte hai:
 *    (a) Node head
 *    (b) Node tail
 *    (c) int size => means kitne nodes hai
 * 
 * => +      +      +---------------+
 *    |      |      | Node Head: 4K |
 *    |      |      | Node Tail: 6K |
 *    |  10k |=====>| Size     : 3  |
 *    +------+      |---------------+
 *        +---------+
 *        |        
 *        V          
 *       data    Node            data   Node            data   Tail Node
 *     +------------------+    +------------------+    +-------------+
 *     | d=10 | next() 5k |===>| d=20 | next() 6k |===>| d=30 | null |
 *     +------------------+    +------------------+    +-------------+
 *       4k                       5k                     6k
 *     Head Node
 *                       
*/

public class _03_addLast {

    /**
     * Yeh LinkedList class hai jisme hum 3 cheezein store karte hain:
     * (a) head: yeh first node ka reference hota hai
     * (b) tail: yeh last node ka reference hota hai
     * (c) size: yeh LinkedList me kitne nodes hain, uski count hoti hai
     */
    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        // O(1)
        void addLast(int val) {
            // Naya node banaya
            Node node = new Node(); 
            node.data = val; 
            node.next = null; 

            // Agar LinkedList khali hai to head aur tail dono naye node ko point karenge
            if(size == 0) {
                head = tail = node;
            } else {
                // Naye node ko last node ke next me daala
                tail.next = node; 
                // Tail ko update kiya naye node ke liye
                tail = node; 
            }
            // LinkedList me size increase kiya
            size++; 
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
    }
}
