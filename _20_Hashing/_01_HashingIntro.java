package _20_Hashing;

import java.util.HashMap;

public class _01_HashingIntro {
    public static void main(String[] args) {
        /**
         * Q. Given data in a kye-value pair, create an algorithm to store and retrieve it?
         * => insert(5, 15)   => key=5, value=15
         * => insert(10, 20)  => key=10, value=20
         * => insert(2, 1)    => key=2, value=1
         * So, we are storing values for different-different keys.
         * 
         * => get(5) => 15
         * => get(2) => 1
         * */ 

        /**
         * Approach-1:
         * Create two arrays, one array is called as "keys" and another array is called as "values".
         * => And we are storing values like this:
         * 
         * (a) keys   => [5,  10, 2]
         * (b) values => [15, 20, 1]
         * 
         * Q. What is the TC for addition of the element?
         * Q. How much time it take to insert a key-value pair?
         * 
         * keys[1000]
         * values[1000]
         * int idx = 0;
         * 
         * void insert(k, v) {
         *      keys[idx] = k;
         *      values[idx] = v;
         *      idx++;
         * }
         * 
         * int get(int k) {
         *      for i -> 0 to 999
         *            if(keys[i] == k) {
         *                return values[i];
         *            } else {
         *                return -1;
         *            }
         * }
         * 
         * => insert() -> O(1) 
         * => get()    -> O(n) => We need to search
         * */  

        /**
         * Approach-2:
         * Q. Can we have something better than approach-2?
         * => Create a 2D Array with 2 rows:
         *    +-----------------------------+
         *    |  |  |  |  |  |  |  |  |  |  |
         *    +-----------------------------+
         *    |  |  |  |  |  |  |  |  |  |  |
         *    +-----------------------------+
         * 
         * => Or we can create something like this:
         *    +----+----+
         *    | 5  | 15 |
         *    | 10 | 20 |
         *    | 2  | 1  |
         *    |    |    |
         *    |    |    |
         *    |    |    |
         *    +----+----+
         * => In one column we can create key and on another column we can create values.
         * => insert -> O(1)
         * => get    -> O(n)
         * */ 

        /**
         * Approach-3:
         * => +-----------------------------------+
         *    | {5,10} | {10,20} | {2,1} | ...... |
         *    +-----------------------------------+
         * => Insertion: O(1)
         * => get:       O(n)
         * */  

        /**
         * Approach-4
         * Q. Can we use the concept of attendance array?
         * => Key    :    Value
         *    5      :    15
         *    10     :    20
         * => At 5th index, I will put 15.
         * => At 10th index, I will put 20.
         * 
         * Q. What should be the size of our data set of our array?
         * => We are creating on the basis of keys, not values.
         * => And that is why maximum of keys is 10.
         * => For that reason, size of our array is 11.
         * 
         * +------------------------------------------------------+
         * |    |    | 1  |    |    | 15 |    |    |    |    | 20 |
         * +------------------------------------------------------+
         *   0    1    2    3    4    5    6    7    8    9    10
         * => At idx-2, we will store 1.
         * => At idx-5, we will store 15
         * => At idx-10, we will store 20.
         * 
         * (a) get(int k) {
         *        return val[k];
         *     }
         * => TC: O(1)
         * 
         * (b) insert(k, v) {
         *        val[k] = v;
         *     }
         * => TC: O(1)
         * 
         * So, in this approach, both "insert()" and "get()" has TC of O(1).
         * But SC is bigger.
         * Note: We can always go for approach-4, instead of other approaches.
         * 
         * => But,
         * 
         * Key     :     Value
         * 1       :     2
         * 10^17   :     10
         * 
         * Q. Just to create 2 elements, what would be the size of array?
         * => 10^7 + 1
         * => This is not wastage of space, this is something which is not possible to create.
         * => So, our problem is unsolvable now, if we are using approach-4.
         * => Interviewer will try to confuse us here. 
         * 
         * Note: Approach-4 is good, but we cannot always solve using approach-4.
         * Because there is one limitation, it should not have bigger numbers.
         * And we can solve it using approach-1,2,3.
         * 
         * */
        
        /**
         * Let's try to solve with smaller numbers using approach-4:
         * 
         * Q. Using approach-4, is this solvable:
         * 
         * => Key     :     Value
         *    2       :     5
         *   -1       :     0
         *    1       :     3
         * => Storing 5 at idx-2
         * => Storing 3 at idx-1
         * => But there is one more limitation: We cannot go to idx- -1 to store 0.
         * 
         * Note: We can solve it using approach-1,2,3.
         * */  

        /**
         * Key     :     Value
         * abc     :     def
         * jhi     :     klm
         * 
         * Q. Is this solvable using approach-4?
         * => No!, but we can solve using approach-1,2,3.
         * */  

        /**
         * Limitations of Approach-4:
         * 1. Unsolvable for large case.
         * 2. Solvable only for whole number keys.
         * 3. Range of keys should be known in advance.
         * 4. Wastage of Space.
         * */  

        /**
         * Q. How to handle negative numbers?
         * => 
         * Key     :     Value
         * 2       :     15
         * -5      :     10
         * 3       :     3
         * -7      :     11
         * 
         * => We can apply a function on the keys:
         *    f(k) = k+7
         * => This will create "modified key":
         *    mKey   Key     :     Value
         *    9      2       :     15
         *    2     -5       :     10
         *    10     3       :     3
         *    0     -7       :     11
         * 
         * Note: 
         * => So, first we will calculate the offset i.e. what is the minimum value? If it is
         *    negative then we will add the same positive number to all the indexNo.
         * => Instead of using Original Keys as our index, we will use modified keys as our index.
         * => So, instead of storing 10 at idx-(-5), we will store 10 at idx-2.
         * 
         * => insert(k, v) {
         *       values[k + offset] = v
         *    }
         * 
         * => get(k) {
         *      return values[k + offset]
         *    }
         * */  

        /**
         * Q. How to handle range?
         * Q. What should we do such that these big numbers can be converted into small numbers?
         * => Example: Suppose max size of array = 64
         * => So, if we are allowed to have array only as big as size 64, that means our indices
         *    can be anything from 0-63.
         * => What hashing function we will use such that any key in this range can be converted
         *    to smaller range.
         *    Max Element = 63, k = 200
         * => f(k) = k%m, where m = 0 to m-1
         *         = k%64
         * 
         * 
         *    Key   modKey     :     Value
         *    50       50      :     100
         *    64       0       :     200
         *    30       30      :     300
         *    4        4       :     500
         *    133      5       :     -5
         *    5        5       :     0
         * Note: If we override the index-5, the value -5 gets deleted, and new value 0 will be updated.
         * But if we cannot override then we cannot store value 0. So, it is guaranteed that two keys 
         * cannot be same. 
         * => If we are using modified key, we are sure that each index will be unique, but when we are 
         *    using a formula to convert our key into modified key, there can be cases where modified
         *    keys can be same.
         * => Now we don't know where to store -5 and where to store 0. These kind of issue are known as
         *    "Collision" => When multiple keys have same modifed keys.
         *    
        */

        /**
         * Q. How to resolve collisions?
         * => To resolve collisions, different different methods are there, and one of them is "chaining".
         * => In chaining, instead of storing one value at one index, we store a list.(Kind of 2D Array).
         * 
         * => +---------------------------------------------+
         *    |      | {5:0, 133:5} | {2,1} | ...... |      | 
         *    +---------------------------------------------+
         *        0         5                           63
         * 
         * Note: We will have to traverse the whole list present at index-5 to get a value.
         * => Get TC : O(n)
         * => Insertion TC: O(1)
         * => At each index, we can store a LinkedList.
         * => Strings can also be handled the same way.
         */

        /**
         * 
         * Balanced Binary Search Tree:
         * => Actually, we don't even use LinkedList. Instead we use "Balanced Binary Search Tree".
         * => To insert anything in balanced binary search tree, TC is O(log n).
         * => And to retrieve anything, TC is also O(log n).
         * 
         *    +----+
         *    |    |
         *    |    |
         *    |    |
         *    |    |
         *    | 5  |---> X  "Balanced Binary Search Tree"
         *    |    |    / \
         *    +----+   X   X
         *            / \ / \
         *           X  XX   X
         *          ..........
         *          ........
         *          ..........
         * */ 


        /**
         * Concept of Load Factor: 
         *    Keys      Values
         *    +----+   +--------------+
         *    | 0  |-->|  |  |  |  |  |
         *    |    |   +--------------+---+
         *    |    |-->|  |  |  |  |  |   |
         *    |    |   +--------------+---+
         *    |    |-> ......
         *    | 63 |-> ......
         *    +----+
         * => At every index, we will have list of elements. 
         * => Some can be very small, some can be large.
         * +---------------------------------------------------------------+
         * | Load factor = Total No. of Keys/Total No. of Slots available  |
         * +---------------------------------------------------------------+
         * => For example, if we have 128 keys to be stored, and slots are just 64.
         *    So, load factor is 2.
         * => This means at every index, we should be having 1,2,3 list maximum, otherwise
         *    this list will be unbalanced.
         * => To get any value we have to go on and search the list always, which don't want to do always.
         *    So, we want these lists as small as possible and these list will be smaller only when
         *    elements are uniformly distributed. So, this will depend on our "hash function".
         * 
         * 
         * Two types of Hash Functions:
         * 1. F(K) = k + offset
         * 2. F(K) = k%m
         * => If our hash function is good then our load factor will be correct and elements will be
         *    balanced.
         * => If our hash function is good then elements will be balanced. And if our hash function 
         *    is bad then elements will be unbalanced.
         * 
         * Find Name of everyone in India:
         * => Good Hash Function           Bad Hash Function
         *    (a) Less Collision
         *    (b) Maximum Uniformity
         * 
         *    +----+
         *    | 0  |
         *    |... |
         *    |... |
         *    |... |
         *    |... |
         *    | 25 |
         *    +----+
         * 
         * => Let's say max allowed size is 26. So, from 0 to 25 we will have our indices.
         * => hash(name) = Rank of 1st letter => A
         *               = Rank of 2nd letter => B
         * 
         * Key        :    Value
         * Aman       :    5
         * Bob        :    7
         * Aishwariya :    6
         * Zeeshan    :    25
         * => Aman & Aishwariya, both has same letter. So, we will store:
         * 
         *    +----+    +--------+---------------+
         *    | 0  |--->| Amar, 5| Aishwariya, 6 |
         *    |... |    +--------+---------------+
         *    |... |--->| Bob, 7 |
         *    |... |    +--------+
         *    |... |    +----------+
         *    | 25 |--->|Zeeshan,25|
         *    +----+    +----------+
         * 
         *    +----+    +--------+---------------+
         *    | A  |--->|        |               |
         *    |    |    +--------+---------------+
         *    | B  |--->|        |
         *    |... |    +--------+
         *    |... |    +----------+
         *    | Z  |--->|          |
         *    +----+    +----------+
         * 
         * Q. Is this good hash function or bad hash function?
         * => Good Hashing Function: (0 to n-1)%26
        */

        /**
         * Concept of Re-Hashing:
         * => Let's say we have created a Hash Function, based on that we are adding elements also
         *    to our array. It is added in very balanced fashion.
         * => We cannot have list of same size but try to have it in same order. So, this is considered
         *    as balanced.
         * => But for same reason, later some of our list starts getting bigger and list become 
         *    unbalanced and we realized there was a mistake in our formula. We didn't think of
         *    this scenario, and due to this, the list is becoming very big and now we want to
         *    change our hash function and then rehash the whole keys, and this process is called
         *    rehashing.
         * => Rehashing means reapplying hash function to all the keys for uniformity.
         * */ 

        /**
         * Using these concepts, these limitations are resolved:
         * 1. Using modified hash function, we have solved the bigger number problem.
         * 2. We have solved the issue of negative integer.
         * 3. We have solved the data structure other than integer like Strings.
         * 
         * Note: We are not going to use any of these things in code. But we will be having
         *       in-built support. We will directly use HashMap, which will implement all these
         *       things.
         * 
         * Note: Duplicate Keys not allowed in Built-In HashMap.*/
        
        // 1. Unordered HashMap => HashMap Declaration
        HashMap<Integer, Integer> hm = new HashMap<>();
        // 2. Insert Values
        hm.put(5, 9);
        hm.put(-1, 100);
        // 3. Display Values
        System.out.println(hm.get(5));

        // 1. Ordered HashMap => Tree Map


        /**
         * Q. Identify the difference between Unordered HashMap (HashMap) and Ordered HashMap(TreeMap)?
        */
    }
}
