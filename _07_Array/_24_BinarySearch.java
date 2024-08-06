package _07_Array;

public class _24_BinarySearch {
    public static void main(String[] args) {
        
        /**
         * Binary Search Algorithm:
         * => Agar humein ek element find krna hai to linear search
         *    1000 elements m search krne k liye 1000 operations lagega.
         * => But Binary Search ko sirf 10 operations lagenge target element
         *    ko search krne mai.
         * 
         * Note: Binary Search lagaane ko condition hoti hai:
         *       => Humaare array k andr elements should be in monotonic order.
         *       => Means either array should be in increasing/decreasing order.
         * 
         * => target = 15
         * => arr = [1, 2, 4, 6, 9, 11, 15, 19, 23]
         *           0  1  2  3  4   5   6   7   8
         * => Agar mai idx-4 pe khada hu, aur meri target value-15 hai, to mai
         *    left side m dhundu ya right side m dhundu.
         * => Agar mai element-9 k upar khada hu aur ye ek sorted array hai to
         *    15 right side m aaega.
         * => To mai ye bol skta hu:
         *    (a) target > n => search right-side
         *    (b) target < n => search left-side
         * 
         * Working of Binary Search:
         * 1. Initialize start with idx-0.
         * 2. Initialize end with idx=lastIdx(n-1).
         * => arr = [1, 2, 4, 6, 9, 11, 15, 19]
         *         start                    end
         * 3. Find Mid Element: (start+end)/2 => (0+7)/2 => 3.
         * => arr = [1, 2, 4, 6, 9, 11, 15, 19]
         *         start        mid         end
         * 
         * 4. Check if:
         *    (a) target > n => search right-side (don't search left-side)
         *    (b) target < n => search left-side  (don't search right-side)
         * 
         * 5. Search right-side:
         * => start = idx-4, end = idx-7
         * => mid = (4+7)/2 => 5
         * 
         * 6. Check if:
         *    (a) target > n => search right-side (don't search left-side)
         *    (b) target < n => search left-side  (don't search right-side)
         * 
         * 7. Search right-side:
         * => start = idx-6, end = idx-7
         * => mid = (6+7)/2 => 6 
         * => Target-15 == Element-15 => Return Idx-6.
         * Note: Agar value nhi milti to -1 return kr dete.
         * 
         * mid Issue:
         * => Isme integer overflow ho skta hai.
         * => Humaare integer ki range hoti hai => -2^31 to 2^31 - 1
         * 
         * => Let's say humaare 's = 2^31 - 1' & 'e = 2^31 - 1'.
         * => Jb hum isse computer krnge to sbse pehle (s+e) compute
         *    hoga uske baad '(s+e)/2' hoga.
         * => Jb s+e compute hoga tbhi wo mere integer k range se bahar
         *    nikal jaega.=> Integer Overflow.
         * 
         * Solution:
         * => mid = s + (e - s)/2
         *        = s + e/2 - s/2
         *        = s/2 + e/2
         *        = (s+e)/2
         * 
         * Logic:
         *    start=0, end=n-1
         *    while(start<=end) {
         *       find mid (start + end) / 2
         *       compare mid & key
         *          mid == key // Found
         *          mid > key  // Left
         *          mid < key  // Right
         *    }
         * 
         * TC: Based on Iteration : O(log n)
         * 1. Iteration-1 = size of array = n   = n/2^0
         * 2. Iteration-2 = size of array = n/2 = n/2^1
         * 3. Iteration-3 = size of array = n/4 = n/2^2
         * .....
         * .....
         * 4. Iteration-k = size of array = n/2^k
         * 
         * Note: Jb size of array '1' ho jaati hai tb hm Binary Search ko rokte hai:
         * => n/2^k = 1
         * => n = 2^k
         * => k = logn base-2
         * 
         * TC: O(k) = O(log n)
        */
            int numbers[] = {2,4,6,8,10,12,16};
            int key = 10;

            System.out.println("Key found at index : " + binarySearch(numbers, key));

    }

    public static int binarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length-1;

        while(start <= end) {
            // int mid = (start+end)/2;
            int mid = start + (end - start) / 2;
            int element = numbers[mid];
            /**
             * Comparison:
             * 1. Target Found:
            */
            if(element == key) { // found
                return mid;
            } 
            /**
             * 2. Search Right:
            */
            else if(element < key) { 
                start = mid + 1;
            } 
            /**
             * 3. Search left:
            */
            else { 
                end = mid - 1;
            }
        }
        return -1;
    }
}
