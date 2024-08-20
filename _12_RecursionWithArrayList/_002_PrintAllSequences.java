package _12_RecursionWithArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class _002_PrintAllSequences {
    /**
     * Q. Print all the sequences of a string using recursion.
     * => For example, {1, 2}
     * => Sequences: {1}, {2}, {1,2}
     * 
     * => Example, {1, 2, 3}
     * => Sequences: {1}, {2}, {3}, {1,2}, {1,3}, {2,3}, {1,2,3}
     * 
     * Let's derive example-1:
     *     0  1
     * => {1, 2}
     * => [] <= empty sequence
     *    (a) don't include
     *    (b) include
     * 
     * => Hume 2 direction m jaenge, ek direction m hm bolnge ki hm "1"
     *    ko include krnge aur dusre direction m hm bolnge ki hm "1" ko
     *    exclude krnge.
     * => Index-0: [ ]
     *             (a) Don't include 1: []
     *             (b) Include 1      : [1]
     * 
     * => [], [1]
     * 
     * => Index-1: [ ]                        |  [1]
     *             (a) Don't include 2: [ ]   |  (a) Don't include 2: [1]
     *             (b) Include 2      : [2]   |  (b) Include 2      : [1,2]
     *              => [], [2]                    => [1], [1,2]
     * Note: Dont' include []
     * 
     * => Output = [2], [1], [1,2]
     * 
     * 
     * Let's derive example-2:
     *     0  1  2
     * => {1, 2, 3}
     * => [] <= empty array
     * 
     * Index-0:
     * 1. Don't include 1: []           2. Include 1: [1]
     * => [], [1]
     * 
     * Index-1:
     * 1. []                                |  2. [1]
     *    (a)Don't include 2  (b) Include 2 |  (a) Don't include 2 (b) Include 2
     *     => []               => [2]           => [1]              => [1,2]
     * 
     * Index-2:
     * 1. []                                 |  2. [2]                           | 3. [1]                            | 4. [1,2]
     *    (a)Don't include 3   (b) Include 3 |(a)Don't include 3   (b) Include 3 |(a)Don't include 3   (b) Include 3 |(a)Don't include 3   (b) Include 3 
     *     => []                => [3]         => [2]               => [2,3]       => [1]               => [1,3]       => [1,2]             => [1,2,3]
     * 
     * => Output: [3], [2], [2,3], [1], [1,3], [1,2], [1,2,3]
     * => Agar value [] empty hai to hm include nhi krnge
     */ 
    
    
    /** For every element in the array, we have 2 choices:
     * (a) To include in the subsequence
     * (b) To not include in the subsequence
     * Apply this in all the elements in the array starting with index-0
     * and do this recursively until we reach the last index.
     * 
     * Base Case:
     * => if(index == length of array)
     *        print all the subsequences
     * 
     * Recursive Call:
     * => Jb hum grow krte hai to chahe wo value ko include kre ya naa
     *    kre, dono cases m humaara index to increase hoga hi, aur hm
     *    har ek element ko 2 choice de rhe hai.
     *    (a) Include kro
     *    (b) Include mt kro
     *    Aur isi k basis pe hm iska recursive call banaenge.
     * => ps(arr, index, tempArr)
     *    {
     *       ps(arr, index+1, tempArr) <= include
     *       Add the value in tempArr jo humari given arr[index] pe hai
     * 
     *       ps(arr, index+1, tempArr) <= exclude
     *       Remove the last value from tempArr 
     *    }
     * 
     * Note: tempArr is to store the subsequences
     * 
     * Note: Here tempArr is dynamic array i.e. ArrayList, because arrays
     *       are of fixed length, means they cannot grow or shrink in size.
     *       But ArrayLists can grow and shrink according to requirement.
     * */ 

    public static void printSequence(int[] arr, int index, ArrayList<Integer> tempArr) {
        // Base Case
        if(index == arr.length) {
            // print the subsequence -- but do not print empty entries
            if(tempArr.size() > 0) {
                System.out.print(tempArr + " ");
            }
            return;
        }

        // Recursive Call

        // include
        printSequence(arr, index+1, tempArr);
        // add the current value in temArr
        tempArr.add(arr[index]);

        // exclude
        printSequence(arr, index+1, tempArr);
        // remove the last added value
        tempArr.remove(tempArr.size()-1);
    }
    public static void main(String[] args) {
        ArrayList<Integer> tempArr = new ArrayList<>();

        int[] arr1 = {1, 2};
        System.out.println("For the array - " + Arrays.toString(arr1));
        printSequence(arr1, 0, tempArr);

        System.out.println();

        int[] arr2 = {1, 2, 3};
        System.out.println("For the array - " + Arrays.toString(arr2));
        printSequence(arr2, 0, tempArr);
    }
}


/**
* Dry Run:
 * 
 *           0  1
 * => arr = {1, 2}
 * 
 * 1. Initial Call: ps(arr, 0, tempArr)
 *    tempArr = []
 *    index = 0
 * 
 *    (a) Check base case:
 *        if(0 == arr.length) => false
 * 
 *    (b) Proceed with recursion:
 * 
 *      i. Case 1: Exclude current element (arr[0] = 1)
 *         ps(arr, 1, tempArr)  // tempArr remains []
 * 
 *         - Check base case: if(1 == arr.length) => false
 *         
 *          # Case 1a: Exclude current element (arr[1] = 2)
 *             ps(arr, 2, tempArr)  // tempArr remains []
 * 
 *             - Check base case: if(2 == arr.length) => true
 *             - Since tempArr is empty, no sequence is printed.
 * 
 *          # Case 1b: Include current element (arr[1] = 2)
 *             tempArr.add(2)  // tempArr becomes [2]
 *             ps(arr, 2, tempArr)
 * 
 *             - Check base case: if(2 == arr.length) => true
 *             - Print [2]
 *             - Backtrack: tempArr.remove(tempArr.size() - 1)  // tempArr becomes []
 * 
 *      ii. Case 2: Include current element (arr[0] = 1)
 *          tempArr.add(1)  // tempArr becomes [1]
 *          ps(arr, 1, tempArr)
 * 
 *         - Check base case: if(1 == arr.length) => false
 *         
 *          # Case 2a: Exclude current element (arr[1] = 2)
 *             ps(arr, 2, tempArr)  // tempArr remains [1]
 * 
 *             - Check base case: if(2 == arr.length) => true
 *             - Print [1]
 * 
 *          # Case 2b: Include current element (arr[1] = 2)
 *             tempArr.add(2)  // tempArr becomes [1, 2]
 *             ps(arr, 2, tempArr)
 * 
 *             - Check base case: if(2 == arr.length) => true
 *             - Print [1, 2]
 *             - Backtrack: tempArr.remove(tempArr.size() - 1)  // tempArr becomes [1]
 * 
 *          - Backtrack: tempArr.remove(tempArr.size() - 1)  // tempArr becomes []
 * 
 * Final output:
 * Sequences are: [2], [1], [1, 2]
 * 
 * The tree diagram for this recursive process can be visualized as follows:
 * 
 *      ps(arr, 0, [])
 *     /             \
 *  ps(arr, 1, [])  ps(arr, 1, [1])
 *    /   \            /   \
 *  []    [2]      [1]   [1, 2]
 * 
 * Note: Jb v ye ham krnge tb DFS se krnge i.e. Depth First Search
 *       Means ek baar ek node ko pakde i.e. [1], uske baad humaare
 *       paas 2 option hai. Ya to [2] wali call ko krne ka yaa [3] 
 *       wali call ko krne ka. Order waise [2] pehle aati hai to
 *       hm pehle [2] ko krnge. Jb hm [2] ko krnge to completely
 *       run kr lenge, ab job [2] complete ho jaega tb hm [3] pe
 *       aaenge.
 * 
 * The dry run helps in understanding how the recursion works by systematically including or excluding each element from the array, printing sequences when a base case is reached, and using backtracking to explore all possible sequences.
 *
 * */ 