package _18_Stack;

public class _02_StackIntro {
    /**
     * Stack: [LIFO: Last In First Out]
     * 1. Stack v ArrayList ki tarah dynamic size ka hota hai means
     *    size ko hum kam ya jyda kr skte hai.
     * 2. Stack is disciplined & Queue is disciplined.
     *    => Ek hi end se add kar skte hai aur ek hi end se remove kar 
     *       skte hai, ek hi end se get kr skte hai.
     *    => Ye disciplines hai stacks & queue k. That's why stacks &
     *       queues are disciplined.
     * 3. Stack m add wale function ko bolte hai    => push()
     *    Stack m remove wale function ko bolte hai => pop()
     *    Stack m get wale function ko bolte hai    => peak()
     * 
     * (a) push(): Add value at the top of the stack
     *    +        +
     *    |        | Note: Stack pe pointer humesa top pe hota hai
     *    +--------+
     *    |   50   | => Push-50 -> Now the top is 50
     *    +--------+
     *    |   40   | => Push-40 -> Now the top is 40
     *    +--------+
     *    |   30   | => Push-30 -> Now the top is 30
     *    +--------+
     *    |   20   | => Push-20 -> Now the top is 20
     *    +--------+
     *    |   10   | => Push-10 -> Now the top is 10
     *    +--------+
     * => Stack ko humne "vertically" represent kiya hai.
     * 
     * (b) peek():
     * => 50 mil jaega because peak() function return the top of the
     *    stack.
     * 
     * (c) pop():
     * => pop() se top of stack milta v hai aur stack se remove v
     *    ho jaata hai.
     * 
     * (d) get()
     * 
     * (e) size()
     * 
     * Note: Stack k sabhi operations ki TC O(1).
     * */ 

    /**
     * A stack data structure is also dynamic just like an ArrayList
     * but it follows LIFO principle i.e. Last In First Out principle.
     * The element that is inserted first, comes out of it in the last.
     * The elements are inserted and deleted from the top only.
     * 
     * Note: Insertion and Deletion both occur at the top of the stack.
    */
}
