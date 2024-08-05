package _16_ArrayTwoDimensional;

public class _01_2DIntro {
    public static void main(String[] args) {
        /**
         * Q. What is the worst case time complexity of adding 1 element in a static array(adding by index)?
         * => O(1)
         * 
         * Q. What is the worst case time complexity of adding n elements in a static array(adding by index)?
         * => O(n)
         * 
         * Q. What is the worst case time complexity of adding n elements in a dynamic array(pushing at the end)?
         * => O(n)
         * 
         * Let's say I have an array of size 'n' and last 5 places are empty.
         * +---------------------------------------+
         * |                   | X | X | X | X | X | <==== N-Size
         * +---------------------------------------+
         * I a doing a push back, what will be it's time complexity?
         *  => push_back = (5)  -> O(1)
         *  => push_back = (-1) -> O(1)
         *  => push_back = (1)  -> O(1)
         *  => push_back = (4)  -> O(1)
         *  => push_back = (8)  -> O(1)
         * We don't need to create new array, we already have space, that is
         * why it will be stored instantly in O(1).
         * 
         * Q. But once all the elements are filled and we want to do one more
         *    push back, what will happen?
         * => In dynamic array, resizing will happen. 
         * => If our array is of size-N then a resize will happen with size-2N.
         * => First 'N' elements will be copied from old array and then whatever
         *    new elements will be pushed back.
         * 
         * +-------------------------------------------------+
         * |                             | X | X | X | X | X | <==== 2N-Size
         * +-------------------------------------------------+
         *  => push_back = (5)  -> O(1)
         *  => push_back = (-1) -> O(1)
         *  => push_back = (1)  -> O(1)
         *  => push_back = (4)  -> O(1)
         *  => push_back = (8)  -> O(1)
         *  => push_back = (16)  -> O(N)
         * TC: O(N) at the end of the dynamic array.
         * 
         * 
         * Q. What is the worst case time complexity of adding N elements in a
         *    dynamic array(pushing at the end)?
         * => O(N)
         * 
         * */ 
    }
}
