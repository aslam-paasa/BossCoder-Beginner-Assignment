package _19_LinkedList;

import java.util.Scanner;

public class _17_KReverseInLL {
    /**
     * a->b->c->d->e->f->g->h->i->j->k k=3
     * <------><-------><-------><---->
     * 
     * => k=3 means 3-3 k group m reverse kr do, but jo poora group
     * nhi hai usse waise hi rehne do:
     * => c->b->a->f->e->d->i->h->g->j->k
     * <------><-------><-------><---->
     * 
     * Approach:
     * => 2 list banaunga: (a) prev, (b) curr
     * => prev avi khali pdi hai.
     * => c->b->a->f->e->d->i->h->g->j->k
     * <------><-------><-------><---->
     * prev
     * curr: c->b->a
     * => removeFirst from LL and addFirst in curr 'k' times, jisse list
     * ulti bnaegi.
     * => After 'k' times, prev == curr and curr ko new kr lo:
     * prev: c->b->a
     * curr: f->e->d
     * 
     * Q. Ab curr ko prev kaise consume kregi?
     * => prev ki next ka tail, curr ka head k equal kr de to prev poori
     * bn jaegi aur curr ko fir se new kr lo.
     * => prev: c->b->a->f->e->d->i->h->g
     * => But ab 'k' bacha hi nhi hai, 'k' se less bache hai. To iss case
     * m removeFirst, addLast krnge:
     * prev: c->b->a->f->e->d->i->h->g
     * curr: j->k
     * 
     * => prev: c->b->a->f->e->d->i->h->g->j->k
     * => curr:
     * 
     * => Ab this ka head "c" par aur this ka tail "k" par aur this ka
     * size prev k size k equal.{soln}
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

        public int size() {
            return size;
        }

        public int getFirst() {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            }
            return head.data;
        }

        public void removeFirst() {
            if (size == 0) {
                System.out.println("List is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                head = head.next;
                size--;
            }
        }

        public void addFirst(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = head;
            head = temp;

            if (size == 0) {
                tail = temp;
            }

            size++;
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

        public void kReverse(int k) {
            LinkedList prev = null;
            LinkedList curr = new LinkedList();

            while (this.size() > 0) {
                if (this.size() < k) {
                    int sz = this.size();

                    for (int i = 0; i < sz; i++) {
                        int val = this.getFirst();
                        this.removeFirst();
                        curr.addLast(val);
                    }
                } else {
                    for (int i = 0; i < k; i++) {
                        int val = this.getFirst();
                        this.removeFirst();
                        curr.addFirst(val);
                    }
                }

                if (prev == null) {
                    prev = curr;
                    curr = new LinkedList();
                } else {
                    prev.tail.next = curr.head;
                    prev.tail = curr.tail;
                    prev.size += curr.size;
                    curr = new LinkedList();
                }
            }

            this.head = prev.head;
            this.tail = prev.tail;
            this.size = prev.size;
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

        System.out.println("Original List:");
        list.display();

        System.out.println("Enter the value of k for reversing:");
        int k = sc.nextInt();

        list.kReverse(k);

        System.out.println("List after reversing in groups of " + k + ":");
        list.display();

        sc.close();
    }
}

/**
 * 1. Enter the number of elements in the list:
 * => 10
 * 2. Enter the elements of the list:
 * => 1 1 2 2 3 3 4 5 5 6
 * 3. Enter the value of k for reversing:
 * => 2
 * 
 * Output:
 * 1. List after reversing in groups of 3: 
 * => 2 1 1 3 3 2 5 5 4 6
 * */ 

