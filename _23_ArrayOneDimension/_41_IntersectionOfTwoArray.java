package _23_ArrayOneDimension;

import java.util.ArrayList;

public class _41_IntersectionOfTwoArray {
    public static void main(String[] args) {
        /**
         * Intersection of two arrays:
         * => Intersection humein common elements deta hai.
         * => Iske andr duplicate wala solve ho jaaata.
         * 
         * => Input: (a) [1, 2, 3, 4, 6, 8]
         *           (b) [3. 4. 9. 10]
         * => Output: [3, 4]
         * 
         * Q. How can we achieve this?
         * => arr[i] se element ko uthaenge aur arr2[j] k elements se
         *    match kr k dekhnge. Agar match nhi hoga to intersection
         *    ka part nhi hoga.
         * => Aur arr[i] & arr2[j] match krega to intersection ka part 
         *    hoga.
         * => Isi tarah har single element ko hm ek array se utha rhe
         *    hai aur dusre array m check kr rhe hai. And this traversing
         *    is known as Linear Search Mechanism.
         * 
         * Note: Nested Loop => Har ek element k liye humein loop chalana
         *       par rha hai. 
        */


        /**
         * Intersection of two array:
        */
        int[] arr = {1, 2, 3, 3, 4, 6, 8};
        int[] brr = {3, 3, 3, 4, 9, 10};

        ArrayList<Integer> intersection = new ArrayList<>();

        /**
         * Outer Loop on arr[] array: 
         * Find the intersection elements and store them in the array
         */
        for(int i = 0; i < arr.length; i++) {
            /**
             * for every element, run loop on brr[] array
            */
            for(int j = 0; j < brr.length; j++) {
                if(arr[i] == brr[j]) {
                    intersection.add(arr[i]);
                    break;
                }
            }
        }

        /**
         * Print the intersection array:
        */
        for(int i = 0; i < intersection.size(); i++) {
            System.out.print(intersection.get(i) + " ");
        }
    }
}