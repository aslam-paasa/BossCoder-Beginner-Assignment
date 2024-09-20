package _12_RecursionWithArrayList;

import java.util.ArrayList;

public class _912_Recursion_With_ArrayList {
    /**
     *Working with arraylist:
     * => In the recursion, the return type has to be an arraylist.
     *    So, we can return an entire arraylist.
     * => Two way to return arraylist:
     *    (a) Take an arraylist inside the parameter of the function
     *        call.
     *    (b) We will create it inside the fn body.
     * 
     * Note: There are difference between passing things inside argument
     *       and body of the function.
     *       1. Arguments: They will be passed to the function calls.
     *       2. Body : It will remain for that particular fn only.
     * */ 

    /**
     * Find Number of occurrences:
     * Q. arr = [1, 2, 3, 4, 4, 8],  target = 4
     *    => return ans = 3, 4 (idx)
     * 
     * => If we are asking to an arraylist, return type will be arraylist.
     * => If we are asking to a  string,    return type will be string.
     * 
     * 1. Arguments:
     *    fn(arr, target, index, list) {
     *       if(index == end) {
     *          return list;
     *       }
     * 
     *       if(target == arr[index]) {
     *          add.list();
     *       }
     * 
     *       fn(arr, target, index+1, list);
     *    }
     * 
     *   Q. How does this add.list() getting added to the original list
     *      avail in the parameter?
     *   => fn(arr, target, index, list) => These lists are just different fn
     *      calls have different reference variables but the object is same.
     *      Means at every fn calls, reference variables are changing but
     *      they all are pointing to the same object. Hence, whenever we are
     *      adding a value in the list at different fn calls, values are
     *      being added in the original list.
     * 
     *      main() => fn ended (8)
     * 
     *      fn(arr, target, index, list)
     *      fn((1,2,3,4.4,8), 4, 0, [])    => return [3,4] & terminate(7)
     *              |
     *              V
     *      fn((2,3,4.4,8), 4, 1, [])      => return list & terminate(6)
     *              |
     *              V
     *      fn((3,4.4,8), 4, 2, [])        => return list & terminate(5)
     *              |
     *              V
     *      fn((4.4,8), 4, 3, [])          => return list & terminate(4)
     *              |
     *              V
     *      fn((4,8), 4, 4, [3])           => return list & terminate(3)
     *              |
     *              V
     *      fn((8), 4, 5, [3,4])           => return list & terminate(2)
     *              |
     *              V
     *      fn((), 4, 6, [3,4]) X          => return list & terminate(1)
    */

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 4, 5};

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = findAllIndex(arr, 4, 0, list);
        // System.out.println(findAllIndex(arr, 4, 0, list));
        System.out.println(ans);
        System.out.println(list);

        System.err.println(findAllIndex2(arr, 4, 0));
    }

    public static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if(index == arr.length) {
            return list;
        }

        if(arr[index] == target) {
            list.add(index);
        }

        return findAllIndex(arr, target, index+1, list);
    }

    /**
     * 2. Body:
     * => If we pass arraylist to the body, for every recursion call, it
     *    will create a new arraylist.
     * 
     * Goal   : Return the list, but don't take it in argument.
     * Problem: The fn of recursion executed again and again, so if we
     *          create a new list in the body of the fn, a new list will
     *          be create again and again for every fn call. 
     * 
     * Challenges: 
     * We know return type will be ArrayList. But the problem is, every
     * call will have a new list. So, we need some sort of way to pass
     * the data of fn calls above.
     * 
     *    (arr, target, 0)
     *         |
     *         V
     *      list = [] => body of particular fn call (cannot passed to next fn)
     * 
     *    (arr, target, 1)
     *         |
     *         V
     *      list = [] => body of particular fn call (cannot passed to next fn)
     * 
     *    (arr, target, 2)
     *         |
     *         V
     *      list = [] => body of particular fn call (cannot passed to next fn)
     * 
     * => In the previous case, we knew that all these lists are different
     *    reference variables, but they are pointing to the same object, but
     *    here it will not happen. 
     * => Here, we know its different object for different fn call. So,
     *    every returned list will be empty. 
     * 
     * Note: How do we connect these answers?
     * => Whenever we are returning the answer from the below fn calls,
     *    while doing that we can check something: "Does the current fn
     *    call has some answers? Yes!.". You are returning whatever ans
     *    you are getting from below and add my ans also.
     * 
     * Note: Not Optimized
    */

    public static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        if(index == arr.length) {
            return list;
        }

        // this will contain answer for that fn call only
        if(arr[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index+1);
        list.addAll(ansFromBelowCalls);

        return list;
    }

}
