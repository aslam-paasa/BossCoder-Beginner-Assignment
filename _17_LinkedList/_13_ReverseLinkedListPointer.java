package _17_LinkedList;

import java.util.Scanner;

public class _13_ReverseLinkedListPointer {
    /**
     * Reverse Linked List Pointer: (Pointer Iterative)
     * => Humne ek linked list li hai: a -> b -> c -> d -> e -> f
     * => Hum isko ulta karna chahte hai: f -> e -> d -> c -> b -> a
     * 
     * => Hum 2 pointers lete hai: prev aur curr
     * => curr ko hum first node (a) pe rkhte hai aur prev ko null pe
     *
     *
    */
    /**
     * Initial LinkedList:  10 -> 20 -> 30 -> 40 -> 50
     * 
     * Step 1: Initialize Pointers
     * ---------------------------
     * prev = null
     * curr = head (10)
     * 
     * LinkedList:
     * 10 -> 20 -> 30 -> 40 -> 50
     * 
     * Pointers:
     * prev = null
     * curr = 10
     * next = null (will be set in the next step)
     * 
     * 
     * Step 2: First Iteration
     * -----------------------
     * next = curr.next (20)
     * curr.next = prev (null)
     * prev = curr (10)
     * curr = next (20)
     * 
     * LinkedList:
     * 10 -> null   20 -> 30 -> 40 -> 50
     * 
     * Pointers:
     * prev = 10
     * curr = 20
     * next = 20
     * 
     * 
     * Step 3: Second Iteration
     * ------------------------
     * next = curr.next (30)
     * curr.next = prev (10)
     * prev = curr (20)
     * curr = next (30)
     * 
     * LinkedList:
     * 20 -> 10 -> null   30 -> 40 -> 50
     * 
     * Pointers:
     * prev = 20
     * curr = 30
     * next = 30
     * 
     * 
     * Step 4: Third Iteration
     * -----------------------
     * next = curr.next (40)
     * curr.next = prev (20)
     * prev = curr (30)
     * curr = next (40)
     * 
     * LinkedList:
     * 30 -> 20 -> 10 -> null   40 -> 50
     * 
     * Pointers:
     * prev = 30
     * curr = 40
     * next = 40
     * 
     * 
     * Step 5: Fourth Iteration
     * ------------------------
     * next = curr.next (50)
     * curr.next = prev (30)
     * prev = curr (40)
     * curr = next (50)
     * 
     * LinkedList:
     * 40 -> 30 -> 20 -> 10 -> null   50
     * 
     * Pointers:
     * prev = 40
     * curr = 50
     * next = 50
     * 
     * 
     * Step 6: Fifth Iteration (Final)
     * -------------------------------
     * next = curr.next (null)
     * curr.next = prev (40)
     * prev = curr (50)
     * curr = next (null)
     * 
     * LinkedList:
     * 50 -> 40 -> 30 -> 20 -> 10 -> null
     * 
     * Pointers:
     * prev = 50
     * curr = null
     * next = null
     * 
     * 
     * Step 7: Swap head and tail
     * --------------------------
     * After the loop ends, swap head and tail.
     * 
     * Final LinkedList:
     * head = 50
     * tail = 10
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

        void display() {
            for (Node temp = head; temp != null; temp = temp.next) {
                System.out.print(temp.data + " ");
            }
            System.out.println();
        }

        /**
         * Taking reference from getAt(), jo humein int nhi, poora ka poora
         * Node hi return kr dega. Means getAt() m temp.data return
         * krte the waha pe temp return kr dega.
         * => So, bascially iss loop m hm jo v index pass krte hai, ye
         *    loop chalata hai, next-next krta hai aur wo poora node
         *    address return kr deta hai. Aur iss node ko hm reverseDI
         *    m use krnge
        */
        public Node getNodeAt(int idx) {
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp;
        }

        public void reverseDI() {
            int leftIdx = 0;
            int rightIdx = size - 1;
            while(leftIdx < rightIdx) {
                Node left = getNodeAt(leftIdx);
                Node right = getNodeAt(rightIdx);

                int temp = left.data;
                left.data = right.data;
                right.data = temp;

                leftIdx++;
                rightIdx--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        while (true) {
            System.out.print("Enter command: ");
            String str = sc.nextLine();
            if (str.equals("quit")) {
                break;
            }

            if (str.startsWith("addLast")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                list.addLast(val);
            } else if (str.startsWith("display")) {
                list.display();
            } else if (str.startsWith("reverseDI")) {
                list.reverseDI();
            }
        }
        sc.close();
    }
}


        