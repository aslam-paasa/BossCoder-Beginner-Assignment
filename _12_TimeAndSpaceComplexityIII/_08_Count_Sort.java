package _12_TimeAndSpaceComplexityIII;

public class _08_Count_Sort {
    /**
     * Count Sort without comparing the elements:
     * 
     * Q. Find Frequency of Elements?
     * => arr = [5, 2, 1, 7, 4, 2, 5, 5, 4, 1, 1, 2, 2]
     * 
     * 1. We have seen:
     *    (a) attendance array: We store if the element is present or not.
     *    (b) index array: We store the index of the element.
     * 2. We will create:
     *    (c) frequency index: We store how many times that particular element
     *        is present.
     * 
     * Note: All of these are HashMap. Once we will famililar with
     *       hashmaps, we will not use these names.
     * */ 

    /**
     * Q. What should be the size of our frequency array?
     * => Since 7 is the max element here, our size should be 8.
     * 
     * => Initially, we can say that all of these have frequency '0'.
     *    freq arr = [0, 0, 0, 0, 0, 0, 0, 0]
     *                0  1  2  3  4  5  6, 7
     * 
     *           0  1  2  3  4  5  6  7  8  9  10 11 12
     * => arr = [5, 2, 1, 7, 4, 2, 5, 5, 4, 1, 1, 2, 2]
     * => One-by-One go the index of original array and increment the 
     *    value:
     *    (1) Go to fIdx[arr[i]] and increment the value of that index by 1.
     *        (a) fIdx[arr[0]]  => fIdx[5] => count++
     *        (b) fIdx[arr[1]]  => fIdx[2] => count++
     *        (c) fIdx[arr[2]]  => fIdx[1] => count++
     *        (d) fIdx[arr[3]]  => fIdx[7] => count++
     *        (e) fIdx[arr[4]]  => fIdx[4] => count++
     *        (f) fIdx[arr[5]]  => fIdx[2] => count++
     *        (g) fIdx[arr[6]]  => fIdx[5] => count++
     *        (h) fIdx[arr[7]]  => fIdx[5] => count++
     *        (i) fIdx[arr[8]]  => fIdx[4] => count++
     *        (j) fIdx[arr[9]]  => fIdx[1] => count++
     *        (k) fIdx[arr[10]] => fIdx[1] => count++
     *        (l) fIdx[arr[11]] => fIdx[2] => count++
     *        (m) fIdx[arr[12]] => fIdx[2] => count++
     * 
     * => freq arr = [0, 3, 4, 0, 2, 3, 0, 1]
     *                0  1  2  3  4  5  6, 7
     * 
    */

    /**
     * Now traverse the array:
     * 1. idx-0 = 0 => print 0, 0-times.
     * 2. idx-1 = 3 => print 1, 3-times.
     * 3. idx-2 = 4 => print 2, 4-times.
     * 4. idx-3 = 0 => print 3, 0-times.
     * 5. idx-4 = 2 => print 4, 2-times.
     * 6. idx-5 = 3 => print 5, 3-times.
     * 7. idx-6 = 0 => print 6, 0-times.
     * 8. idx-7 = 1 => print 7, 1-times.
     * 
     * => Print: 1,1,1,2,2,2,2,4,4,3,3,3,3,3,7
     * => This is Count Sort.
    */

    /**
     * Disadvantage of Count Sort:
     * (a) Space Limitation
     * (b) Wastage Space
     * (c) Unsolvable for large numbers
     * (d) Unsolvable for different data types
     * 
     * Negative numbers will also work if we modify the code. But even
     * negative numbers will work, there are a lot of disadvantages of
     * the count sort. For example, Let's say my two elements are:
     * => 10^18, 2 and I just want to solve.
     * 
     * If we do Bubble Sort, Selection Sort, this will get sorted
     * instantly. Swapping will happen and we will get the answer.
     * But if we use count sort, first we have create an array of size
     * 10^18+1, which is impossible to create. So, here only our solution
     * fails.
     * 
     * Note: Count Sort should only be used for smaller numbers upto
     *       10^6, but if the elements are greater than 10^6, we have
     *       to use some other algorithm.
     * 
    */

    public static void main(String[] args) {
        int[] arr = { 5, 2, 1, 7, 4, 2, 5, 5, 4, 1, 1, 2, 2 };
        int max = getMax(arr);
        int[] frequency = new int[max + 1];

        // Count frequency
        for (int i = 0; i < arr.length; i++) {
            frequency[arr[i]]++;
        }

        // Print sorted array
        for (int i = 0; i < frequency.length; i++) {
            for (int j = 0; j < frequency[i]; j++) {
                System.out.print(i + " ");
            }
        }
    }

    // size of the hashmap or frequency array
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    
}
