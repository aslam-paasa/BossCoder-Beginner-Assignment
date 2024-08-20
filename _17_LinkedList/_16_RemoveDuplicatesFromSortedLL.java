package _17_LinkedList;

import java.util.Scanner;

public class _16_RemoveDuplicatesFromSortedLL {
    /**
     * Input: 10 
     *         2 2 2 3 3 5 5 5 5 5
     * Output: 2 3 5
     * 
     * Explanation:
     * => this (LL) = [2 2 2 3 3 5 5 5 5 5]
     * => res [] 
     * => Isme mai assume kr rha hu ki mere paas function hai removeFirst
     *    or AddLast. Hum "this" se removeFirst krte hai to "2" nikal jaega
     *    aur res[] m addLast kr denge. Ab idx-1 pe removeFirst krnge lekin
     *    addLast nhi krnge qki res[2] ki tail k equal hai, fir se
     *    removeFirst krnge addLast nhi krnge. Ab "3" ko removeFirs krnge
     *    aur addLast v krnge qki res[2] k tail k equal nhi hai.
     *    Similarly, we will do with 5, 7 & 9.
     * 
     * => Comparison:
     *    this.head = res.head;
     *    this.tail = res.tail;
     *    this.size = res.size;
     * 
     * Note: removeFirs & addLast: O(1)
    */

    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

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

        public int getFirst() {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            }
            return head.data;
        }

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

        

        public void removeDuplicates() {
            LinkedList res = new LinkedList();

            while(this.size > 0) {
                int val = this.getFirst();
                this.removeFirst();

                if(res.size == 0 || res.tail.data != val) {
                    res.addLast(val);
                }
            }

            this.head = res.head;
            this.tail = res.tail;
            this.size = res.size;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList list = new LinkedList();

        System.out.println("Enter the number of elements in the list:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < n; i++) {
            list.addLast(sc.nextInt());
        }

        list.display();
        list.removeDuplicates();
        list.display();

        sc.close();
    }    
}
