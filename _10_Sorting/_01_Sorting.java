package _10_Sorting;

public class _01_Sorting {
    public static void main(String[] args) {
        /**
         * Sorting:
         * => Arranging data in a meaningful order.
         * => 5,2,3,1,7 :
         *    (a) Increasing Order => 1,2,3,5,7
         *    (b) Decreasing Order => 7,5,3,2,1
         *    (c) Increasing Set Bits =>  2(10), 1(1), 5(101), 3(11), 7(111) => less bits to more bits
         * Note: It's not only increasing/decreasing order, but it can be arranged in any particular property.
         * 
         * We have many types of sorting, but some of the most famous sorting are:
         * 1. Ascending/Increasing Order: 
         * => [2,3,4,5,6,7]
         * => a[i] > a[i-1], valid for all 'i' greater than 0.
         * 
         * 2. Descending/Decreasing Order:
         * => a[i] < a[i-1], valid for all 'i' greater than 0.
         * 
         * 3. Non-decreasing Order/Non-descending Order:
         * => 1,3,3,5,5 
         * => Not increasing, because two numbers are same => a[i] <= a[i-1], valid for all 'i' greater than 0.
         * 
         * 4. Non-increasing/Non-ascending:
         * => [9,7,7,7,3,3]
         * => a[i] <= a[i-1], where valid for all 'i' greater than 0.
         * */ 

        /**
         * Q. Given an array of N elements, find no. of elements > k, where 'k' belongs to Ai
         *    where Ai is anything between 0 to 10^5 (0 < Ai < 10^5).
         * => Input-> A = [7,3,1,2,5], k = 2
         * => Output-> 3 ( 3 numbers are greater than 2)
         * 
         * => Approach: for loop => if(arr[i] < k) => count++;
         * => TC: O(n)
         * */ 

        /**
         * Q. We were provided 'q' queries, in each query, a value of k will be
         *    provided: k1, k2, k3, k4, ..., kq. For each 'k', we have to tell
         *    the answer. (Difficult)
         * => K = 2, 1, 3, 7, 5,...
         * => Note: For one query, TC: O(n). So, for 'q' queries, TC: O(q*n)
         * 
         * Constraint: 1 < n < 10^5
         *             1 < q < 10^5
         * 
         * Q. Do you think this approach will pass?
         * => No!, In worst case, it can go upto 10^10 as well.
         * => So, we need to improve on this.
         * 
         * Q. How we can improve?
         * => Sorting can be used.
         * => If we sort this, we will get: [1,2,3,5,7], k=5
         * 
         * Q. After receiving 5, how would I know that one element is right to the 5?
         * => last index - index of 5 (formula)
         * => idx-4 - idx-3
         * => 4 - 3
         * => 1
         * 
         * => Similarly, if k = 2, we can use the formula:
         * => last index - index of 2
         * => idx-4 - idx-1
         * => 4 - 1
         * => 3
         * 
         * Q. But how would be know which is the index of 5 and which is the index of 2?
         * => For that we have to iterate and check:
         * => [1,2,3,5,7]
         *     0 1 2 3 4
         * 
         * => Concept of Attendance Array:
         *    for(i->0 to n-1) {
         *       idx[arr[i]] = i;
         *    }
         * 
         * 1. First we start Traversing and found 1 at idx-0. So, we will go to idx-1 and store 0.
         * 2. Then we start Traversing and found 2 at idx-1. So, we will go to idx-2 and store 1.
         * 3. Then we start Traversing and found 3 at idx-2. So, we will go to idx-3 and store 2.
         * 4. Then we start Traversing and found 5 at idx-3. So, we will go to idx-5 and store 3.
         * 5. Then we start Traversing and found 7 at idx-4. So, we will go to idx-7 and store 4.
         * 
         *    +-------------------------------+
         *    |-1 | 0 | 1 | 2 |-1 | 3 |-1 | 4 |
         *    +-------------------------------+
         *      0   1   2   3   4   5   6   7  
         * 
         * Q. Now, how many elements are greater than 'k'?
         * => k = n-1-idx[k]  (formula), where (a) n-1 = last index
         *                                     (b) idx[k] = index of our element(K)
         * 
         * => 2 = 4 - 1 
         *      = 3 elements greater than '2'.
         * 
         * 
         * Q. Can pass the code with this TC and Constraint?
         * => TC: O(Sorting) + O(n) + O(q)
         * => Constraint: 1 < n < 10^5
         *             1 < q < 10^5
        */

        /**
         * Q. But how to actually write the code to sort this question?
         * => 
         * */ 


        /**
         * There are 2 types of sorting:
         * 1. Comparison based Sorting
         *    (a) Bubble Sort
         *    (b) Selection Sort
         *    (c) Insertion Sort
         *    (d) Heap Sort
         *    (e) Merge Sort => O(N logN)
         *    (f) Quick Sort => O(N logN)
         * 
         * Note: No comparison based sorting has TC less than O(N logN).
         * 
         * 2. Non-Comparison based Sorting
         *    (a) Radix Sort
         *    (b) Bucket Sort
         *    (c) Count Sort
         * Note: Sometimes Count Sort has TC of O(N) => also has some disadvantages.
         * */  


    }
}
