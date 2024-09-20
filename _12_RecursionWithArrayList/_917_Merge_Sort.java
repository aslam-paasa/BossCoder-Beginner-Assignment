package _12_RecursionWithArrayList;

public class _917_Merge_Sort {
    /**
     * Divide & Conquer:
     * arr = [8, 3, 4, 12, 5, 6]
     * 
     * Step-1: Divide this array into two parts:
     *         [8, 3, 4] [12, 5, 6]
     * Step-2: Hey Recursion!, please sort the first half of the array,
     *         then sort 2nd half of the array. 
     *         [3, 4, 8] [5, 6, 12] 
     *      
     * Step-3: Merge the two sorted paths:
     *         [3, 4, 5, 6, 8, 12]
     * 
     * 
     *                [8, 3, 4, 12, 5, 6]
     *                        |
     *                        V
     * =>         [8, 3, 4]         [12, 5, 6]
     *             |     |           |      |
     *             V     V           V      V
     *          [8, 3]  [4]         [12, 5] [6]
     *           |  |                |   |
     *           V  V                V   V
     *          [8] [3]             [12] [5]
     * 
     * => When ans of the length is '1' then return the array. And the
     *    thing which is returning is an array itself. And while 
     *    returning, this will compare the elements and merge them
     *    accordingly, and they will return from where they are called.
     *    [3, 8]        [5, 12]
     *      |             |
     *      V             V
     *    [3, 4, 8]     [5, 6, 12]
     *               |
     *               V
     *       [3, 4, 5, 6, 8, 12]
     * 
     * Note: Every fn call while returning store the array in a variable
     *       and we can merge it and return that entire thing.
     * */ 


}
