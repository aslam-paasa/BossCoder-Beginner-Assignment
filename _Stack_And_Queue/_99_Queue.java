package _Stack_And_Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class _99_Queue {
    public static void main(String[] args) {
        /**
         * Queue:
         * 1. Queue v ArrayList ki tarah dynamic hoti hai.
         * 2. Queue v stack ki tarah ek end se add kr skta hai aur ek
         *    fixed end se delete kr skta hau aur ek fixed end se get
         *    kar skta hau.
         *    => Ye Queue k principle/discipline hai.
         * 
         * 3. Queue m element add krne wale function ko bolte hai - enqueue()
         * 4. Queue m element delete karne wale function ko bolte hai - dequeue()
         * 5. Queue m element get krne wale function ko bolte hai - front()
         * 6. Queue ka size janne wale function ko bolte hai - size()
         * 
         * Note: Queue m end se add hota hai & front se delete hota hai:
         *       +-----------------------+
         *       | 10 | 20| 30 | 40 | 50 |
         *       +-----------------------+
         *       => Enque(10)
         *       => Enque(20)
         *       => Enque(30)
         *       => Enque(40)
         *       => Enque(50)
         * => Last(end) se element add hota hai Queue m.
         * => Front(Start) se element delete hota hai Queue m.
         * */ 

        /**
         * List of Operations in Queue:
         * 1. Enqueue/add()
         * 2. Dequeue/remove()
         * 3. Front/peek()
         * 4. Size()
         * Note: TC of all Operations: O(1)
         * 
         * 1. Dequeue/remove() => front se element remove hoga
         *    +------------------------+
         * => | 10 | 20 | 30 | 40 | 50 |
         *    +------------------------+
         *    +-------------------+
         * => | 20 | 30 | 40 | 50 |
         *    +-------------------+
         * => Element-10 is removed. 
         * 
         * 
         * 1. Dequeue/remove() => front se element remove hoga
         *    +------------------------+
         * => | 10 | 20 | 30 | 40 | 50 |
         *    +------------------------+
         *    +-------------------+
         * => | 20 | 30 | 40 | 50 |
         *    +-------------------+
         * => Element-10 is removed. 
         * 
         *    +--------------+
         * => | 30 | 40 | 50 |
         *    +--------------+
         * => Element-20 is removed. 
         * 
         *    +---------+
         * => | 40 | 50 |
         *    +---------+
         * => Element-30 is removed. 
         * 
         *    +----+
         * => | 50 |
         *    +----+
         * => Element-40 is removed. 
         * 
         *    +----+
         * => |    |
         *    +----+
         *    Now, the Queue is empty.
        */

        Queue<Integer> queue = new ArrayDeque();
        
        queue.add(10); // 10
        queue.add(20); // 10, 20
        queue.add(30); // 10, 20, 30

        System.out.println(queue.peek()); // 10 is added.
        System.out.println(queue.remove()); // 10 is removed.

        System.out.println(queue.peek()); // 20 is added.
        queue.remove(); // 20 is removed.

        System.out.println(queue.peek()); // 30 is added.
        queue.remove(); // 30 is removed => Now queue is empty.
    }
}

/**
 * +------------------------------------------+
 * | Concept    | Stack  | Queue   | Function |
 * +------------------------------------------+
 * | 1. add     | push() | enqueue | add()    |
 * | 2. remove  | pop()  | dequeue | remove() |
 * | 3. get     | peek() | front   | peek()   |
 * | 4. size    | size() | size    | size()   |
 * +------------------------------------------+
 * 
 * Queue:
 * => A queue is also very similar to an arraylist because of its dynamic
 *    size property, but if follows FIFO Principle i.e. First In First Out
 *    principle. 
 * => The elements are always inserted at the rear end of the queue and
 *    always deleted from front.
 * 
 *    First In
 *    +---------------+
 *    | 9 | 8 | 6 | 3 |
 *    +---------------+
 *    First Out
*/