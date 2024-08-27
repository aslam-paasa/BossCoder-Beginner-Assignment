package _26_Stack_And_Queue;

import java.util.Stack;

public class _05_Stack_Implementation {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Hello"); // "Hello"
        stack.push("Bye");   // "Hello", "Bye"
        stack.push("World"); // "Hello", "Bye", "World"

        /**
         * Jbtk stack m element-0/empty nhi ho jaata tbtk peek(top of the stack)
         * ko print karaate chalo aur 1 element pop karaate chalo
        */
        while(stack.size() > 0) {
            /**
             * Top of the stack:
            */
            String tos = stack.peek();
            System.out.println(tos);
            stack.pop();
        }
    }
}

/**
 * Cons of Stack:
 * 1. Stack m different datatypes of data nahi daal skte.
 * 2. Stack m reverse split nhi hota.
 * 3. Stack k bass top se hi data get kar skte hai.
*/