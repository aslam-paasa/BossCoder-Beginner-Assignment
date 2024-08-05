package _Stack_And_Queue;

import java.util.Stack;

public class _04_Stack_Implementation {
    public static void main(String[] args) {
        /**
         * Stack v ArrayList k tarah declare hota hai
         * */ 
        Stack<Integer> stack = new Stack<>();

        stack.push(10); // 10
        stack.push(20); // 10, 20
        stack.push(30); // 10, 20, 30
        stack.push(40); // 10, 20, 30, 40


        System.out.println(stack);

        System.out.println(stack.peek()); // 40
        stack.pop(); // 10, 20, 30

        System.out.println(stack.peek()); // 30
        stack.pop(); // 10, 20

        System.out.println(stack.peek()); // 20
        stack.pop(); // 10

        System.out.println(stack.peek()); // 10
        stack.pop();  // blank

        // System.out.println(stack.peek());
        // stack.pop(); // Error: Stack Empty

        System.out.println(stack);
    }
}
