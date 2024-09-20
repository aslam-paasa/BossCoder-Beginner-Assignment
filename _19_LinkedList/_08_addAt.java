package _19_LinkedList;

import java.util.Scanner;

public class _08_addAt {

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

        void addLast(int val) {
            Node node = new Node(); 
            node.data = val; 
            node.next = null; 

            if(size == 0) {
                head = tail = node;
            } else {
                tail.next = node; 
                tail = node; 
            }
            size++; 
        }

        /**
         * => Humne ek logic likha hai jisme hum kisi bhi index pe node 
         *    add kar sakte hai.
         * => Humne nodeMin1 ko idx-1 position pe le jate hai, phir hum
         *    naye node me data stored karte hain, aur uske next me 
         *    nodePlus1 ko daalte hain. Phir hum nodeMin1 ke next me 
         *    naye node ko daalte hain aur size increase karte hain. 
         *    Isse hum kisi bhi index pe node add kar sakte hain.
        */
        public void addAt(int idx, int val)  {
            if(idx == 0) {
                addFirst(val);
            } else if(idx == size) {
                addLast(val);
            } else if(idx < 0 || idx > size) {
                System.out.println("Invalid arguments");
            } else {
                Node nodeMin1 = head;
                for(int i = 0; i < idx - 1; i++) {
                    nodeMin1 = nodeMin1.next;
                }

                Node nodePlus1 = nodeMin1.next;

                Node node = new Node();
                node.data = val;
                node.next = nodePlus1;

                nodeMin1.next = node;
                size++;
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
