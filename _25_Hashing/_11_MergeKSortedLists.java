package _25_Hashing;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class _11_MergeKSortedLists {
    /**
     * Multiple arraylist ko merge kr k ek sorted arryalist bnani hai
     *   List Idx   Data
     *               0   1   2   3   4  <= [Data idx]
     * 1. arr1[] = [10, 20, 30, 40, 50]
     * 2. arr2[] = [15, 19, 24]
     * 3. arr3[] = [5, 12, 18, 77]
     * 4. arr4[] = [2, 92]
     * 
     * Output:
     * => [2, 5, 10, 12, 15, 18, 19, 20, 24, 30, 40, 50, 77, 92]
     * 
     * Note: We will use two concepts:
     *       (a) Comparable
     *       (b) Comparator
     * => Search online and take reference.
     * */ 

    
    /**
     * Comparable:
     * => Ek chij hoti hai jisme hm 3 chij rkh rhe hai:
     *    (a) data
     *    (b) li : means data kis list ka hai  (list index)
     *    (c) di : means data ka index kya hai (data index)
     * 
     * Store it like:
     * +----------------------
     * | data(di,li)
     * | 10  (0 , 0)
     * | 15  (0 , 1)
     * |  5  (0 , 2)
     * |  2  (0 , 3)
     * +----------------------
     * => Priority Queue is on the basis of data. To 2(0 , 3) display
     *    hoga.
     * 
     * Q. Priority Queue kaise ye decision lega ki ListIdx m basis pe
     *    decision lena hai qki yha to Data v hai, Data Idx v hai?
     * => Usse sikhana padega. Bas ek line likhna hoga:
     *    "implements Comparable"
     * => Comparable means 2 pair of objects aapas m compare kiye jaa skte
     *    hai, aur uske liye code likhna pdega "compareTo".
     * => Jb koi v class implements Comparable krti hai to usko apne andr
     *    ek compareTo() function likhna pdta hai, jisme "Pair o" as a
     *    parameter aaega.
     * => Ab humaare paas 2 object hai:
     *    (a) this object
     *    (b) "o" i.e. other object
     *    Humein btana hai ki this bda hai ya other.
     * => Agar ye +ve return krta hai to "this" is bigger
     * => Agar ye -ve return krta hai to "this" is smaller
     * => Agar ye 0 return krta hait to this and other are equal.
     * 
     * 
     * Priority Queue m Pair use kiye, to Priority Queue ne ye bola ki
     * mujhe to ye pta krna hota hai ki kn bda aur kn chota. Integer m
     * m hum pta kr lete the but Pair m kaise pta kre?
     * => Agar hum Pair daalna chahte hai to humein Pair ko Comparable
     *    implement krana hoga. But comparable implement krane ka mtlb
     *    kya hota hai?
     * => Comparable is an interface.
     * => Interface means contract of functions. Agar hum koi contract
     *    sign krte hai to usme jo likha hota hai wo krna pdta hai.
     * => Interface k andr functions ki body nhi hoti, sirf naam hota 
     *    hai:
     * 
     *    static interface Comparable {
     *       int compareTo(Object o);
     *    }
     * 
     * => Ye basically kehta hai ki mai functions ka contract hu, mai
     *    unka signature btata hu ki input m kya aaega, output m kya
     *    aaega.
     * => Ab koi class Comparable interface ko implement krta hai to usse
     *    ki usse contact of fn poora krna pdega means usse unn fns ki
     *    body provide krni pdti hai.
     * 
     * Q. Body m kya likhna hoga?
     * => Compares this object with specified object for order.
     * => Returns:
     *    (a) a negative integer,
     *    (b) zero
     *    (c) a positive integer,
     *    as this object is less than, equal to, or greater than the
     *    specified object.
    */


    /**
     * Pair class to store data, list index, and data index:
    */
    static class Pair implements Comparable<Pair> {
        int data;
        int li;
        int di;

        /**
         * Compare method to compare Pair objects based on data:
         * (a) +ve => this is bigger (p1)
         * (b) -ve => this is smaller (p2)
         * (c) 0 => this and other are equal
        */
        public int compareTo(Pair o) {
            return this.data - o.data;
        }   
    }


    // Method to merge K sorted lists
    public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists) {
        ArrayList<Integer> rv = new ArrayList<>(); // Resultant list
        /**
         * Priority queue to store pairs:
         * => Hum priority queue ka use kar rahe hain jisme Pair objects store karenge.
         * */ 
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        /**
         * Step 1: Add first element of each list to priority queue
         * => Isme hum har list ka pehla element priority queue me daal rhe hai
        */ 
        for (int li = 0; li < lists.size(); li++) {
            Pair p = new Pair();
            p.li = li;
            p.di = 0;
            p.data = lists.get(li).get(0);
            pq.add(p);
        }

        /**
         * Step 2: Merge lists
         * => Smallest element ho highest priority milti hai, to jo sbse chota hoga wo
         *    sbse pehle ArrayList "rv" m add hoga.
         * => We are comparing pair that's why we are using Comparable.
        */ 
        while (pq.size() > 0) {
            Pair rp = pq.peek();
            pq.remove();

            rv.add(rp.data);

            /**
             * Step 3: Add next element from the same list to priority queue
             * => Priority queue hamesha sabse chhota element return karegi, 
             *    isliye jo element pehle milega woh final result list "rv" 
             *    me add hoga.
             * => Agar list me aur elements hai to unhe priority queue me daal do
             * => rp.di++ means ab jis list k element remove hua tha uska list nhi
             *    badlega, data index bdha do. Ab uss list pe next priority queue
             *    wo ho jaega.
             * => lists.get(rp.li).get(rp.di) means humein data mil gya, usse
             *    priority queue m add kr diye.
            */
            rp.di++; 
            if (rp.di < lists.get(rp.li).size()) {
                rp.data = lists.get(rp.li).get(rp.di);
                pq.add(rp);
            }
        }

        return rv;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

        // Step 4: Read input lists from user
        // Isme hum user se input lists padh rhe hai
        for (int i = 0; i < k; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            int n = scn.nextInt();
            String[] elements = scn.nextLine().split(" ");
            for (int j = 0; j < n; j++) {
                list.add(Integer.parseInt(elements[j]));
            }
            lists.add(list);
        }

        // Step 5: Call mergeKSortedLists method and print result
        // Isme hum mergeKSortedLists method ko call kar rhe hai aur result print kar rhe hai
        ArrayList<Integer> mList = mergeKSortedLists(lists);
        for (int val : mList) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}