package _26_Stack_And_Queue;

public class _03_Stack_Implementation {

    /**
     * Ye node class humare linkedlist ki saare nodes banegi
     */
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Stack {
        public static Node head = null;

        /**
         * Agar head == null hai means LinkedList m ek v Node nhi hai.
         * Iss case m humaare liye LinkedList khali hai to hm true return kr denge, nhi to false.
        */
        public static boolean isEmpty() {
            return head == null;
        }

        // push(): LinkedList m push krne ka mtlb hai apne head ko replace kr dena
        public static void push(int data) {
            Node newNode = new Node(data);
            /**
             * Agar stack khali hai to head ko hi apna new node bna skte hai
            */
            if(isEmpty()) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        // pop():
        public static int pop() {
            if(isEmpty()) {
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        // peek():
        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        /**
         * Jbtk isEmpty humein true nhi de deta tbtk ye loop chlega
         */
        while (!s.isEmpty()) {
            /**
             * Element ko print krwa k fir remove krnge jbtk stack khali nhi ho jaata
             */
            System.out.println(s.peek());
            s.pop();
        }
    }
}
