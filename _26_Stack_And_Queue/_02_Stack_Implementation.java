package _26_Stack_And_Queue;

import java.util.ArrayList;
/**
 * Custom Stack using ArrayList:
*/
public class _02_Stack_Implementation {
    /**
     * Iss Stack Class k andr hm array list ko create krnge
     * */ 
    public static class Stack {
        public static ArrayList<Integer> list = new ArrayList<>();
        /**
         * Stack ko create krne k liye humein 4 functions bnane hote hai:
         * (a) push()
         * (b) pop()
         * (c) peek()
         * (d) isEmpty() => Ye btata ha Stack humara empty h ya nhi
        */

        // isEmpty():
        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // push():
        public static void push(int data) {
            list.add(data);
        }

        // pop():
        public static int pop() {

            /**
             * If Stack is empty:
            */
            if(isEmpty()) {
                return -1;
            }

            /**
             * ArrayList k last index ka value is our top.
            */
            int top = list.get(list.size() - 1);

            /**
             * Ab last index pe jo v stored value h ye usko remove kr dega
            */
            list.remove(list.size() - 1);
            return top;
        }

        // peek():
        public static int peek() {
            
            /**
             * If Stack is empty:
            */
            if(isEmpty()) {
                return -1;
            }
            
            /**
             * ArrayList k last index ka value is our top.
            */
            int top = list.get(list.size() - 1);
            return top;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        /**
         * Jbtk isEmpty humein true nhi de deta tbtk ye loop chlega
         * */
        while(!s.isEmpty()) {
            /**
             * Element ko print krwa k fir remove krnge jbtk stack khali nhi ho jaata
            */
            System.out.println(s.peek());
            s.pop();
        }
    }
}
