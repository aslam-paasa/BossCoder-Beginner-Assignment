package _12_RecursionWithArrayList;

public class _897_Working_With_Variables_In_Recursion {
    /**
     * Q. Binary Search with recursion.
     * => Break the array into two parts.
     *    Compare target element with right hand side of arr & left hand
     *    side of array. If it is RHS then remove the LHS part, if it is
     *    LHS then remove the RHS part. Now again break the subarray into
     *    two parts: RHS & LHS and do the same.
     * => At every step it is doing two things:
     *    (a) Comparing : 1 step O(1)
     *        Checking the middle element is greater than equal to or less
     *        than equal to the target element will take O(1).
     *    (b) Dividing into two halves:
     *        f(n) = O(1) + f(n/2) [Recurrence Relation]
     *                 |       |
     *                 V       V
     *             Comparison  Dividing arr into two halves
     * 
     * Types of Recurrence Relation:
     * 1. Linear Recurrence Relation:
     *    Ex: Fibonacci Num (subtracted or added linearly)
     * 
     * 2. Divide & Conquer Recurrence Relation
     *    Ex: Binary Search (Search is reduced/divided by a factor)
     *        So, Search Spaces are getting reduced much faster in divide
     *        and conquer recurrences.
     *        [Efficient for division or multiplication].
     * 
     * Note: Don't overthink. 
     * */ 

    /**
     * Variables can be used in 3 types/places in a fn:
     * 1. Arguments
     * 2. Return Type
     * 3. Body of the function
     * 
     * Return type:
     * => Whatever we want to return, that will be the return type.
     * 
     * Q. What will go in the argument and what will go in the body of
     *    the function?
     * => In binary search, we have 3 variables:
     *    (a) s : start
     *    (b) e : end
     *    (c) m : mid
     * => Here, we are trying to reduce the size of the array. So, what
     *    all variables that determine whether the size of the array is
     *    reduced? [start, end]
     * 
     * Tip: Whatever we put in the "argument", it will go in the next fn
     *      call.
     * 
     * 
     * Q. We want to divide this 'arr' into two subparts. How can we do
     *    that?
     * => search(arr, target); 
     * => Right now, we can't do that.
     * 
     * Note: int s = 0 & int e = arr.length - 1 is determining what size
     *       of the array we are taking.
     * 
     * Q. How do I pass this start and end into the future methods?
     * => Only one way to do that: Put it inside the argument.
     *    public static int search(int[] arr, int target, int s, int e) {...}
     * => Don't overthink and start writing the base condition. If we 
     *    don't find the ans then return -1.
     * 
     *    if(s > e) {
     *       return -1;
     *    }
     * 
     * 
     * Q. What type of variable go into the body of the function?
     * => Check middle element: Variables which are specific to that 
     *    fn call will go inside that body of the function.
     * 
     *    int m = s + (e - s) / 2;
     * 
     * 
     * Continuation of where to take which variables:
     * +---------------+---------------+
     * |               |               |
     * +---------------+---------------+
     * s               m       |       e
     *                         V
     *                 +-------+-------+
     *                 |       |       |
     *                 +-------+-------+
     *                 s   |   m       e
     *                     V
     *                 +---+---+
     *                 |   |   |
     *                 +---+---+
     *                 s   m   e
     * 
     * => Can you see that these start and end are being passed in the
     *    function call, that is why they will go in the argument. So,
     *    in short, there are some variables that  we need to paas for
     *    future function calls, put it inside the argument. 
     * 
     * => But this middle value 'm', is this really beneficial for the 
     *    future calls? No! this is only beneficial for that particular
     *    call. Hence, this will go inside the body of the function.
     * 
     * Remember:
     * 1. Whatever variable we need to pass in the future fn call, put it
     *    inside the fn argument.
     * 2. Whatever variable is consider valuable only to that function call,
     *    that we don't need to pass into the future recursuin calls, put
     *    it inside the body of the function.
     * 
     * Tip: Whenever you are calling a recursion call, make sure you are
     *      returning it if there is a recursion.
    */

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 55, 66, 78};
        int target = 4;
        System.out.println(search(arr, target, 0, arr.length-1));
    }

    public static int search(int[] arr, int target, int s, int e) {

        /**
         * Base Case:
        */
        if(s > e) {
            return -1;
        }

        /**
         * Body of the function:
        */
        int m = s + (e - s) / 2;

        if(arr[m] ==  target) {
           return m;
        }

        /**
         * Recursive Call:
        */

        /**
         * Change the end of the array: (LHS)
         * Whenever you are calling a recursion call, make sure you 
         * are returning it if there is a recursion.
        */
        if(target < arr[m]) {
          return search(arr, target, s, m-1);
        }

        /**
         * Change the start of the array: (RHS)
        */
        return search(arr, target, m+1, e);
    }
}
