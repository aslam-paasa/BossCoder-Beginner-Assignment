package _25_Hashing;

import java.util.ArrayList;

public class _17_HeapDataStructure {
    /**
     * Humaare paas Java m 2 tarike ka heap hota hai:
     * (a) Max Heap: Max Element has highest priority
     *                   [10]
     *                  /    \
     *               [4]      [5]
     *              /   \
     *           [1]     [2]
     * (b) Min Heap: Min Element has highest priority.
     *                   [1]
     *                  /   \
     *               [2]     [4]
     *              /   \
     *           [5]     [10]
     * So, we can say Java m by default Priority Queue iss min Heap se
     * banti hai. Aurr inn heaps ko hm visualize krte hai as a tree.
     * (a) Visualize : Binary Tree
     * (b) Implement : Array
     * */ 

    /**
     * Q. What is Heap?
     * => Heap DS has 3 properties:
     * 
     *    (a) Heap is a Binary Tree: 
     *     => At most 2 children.
     * 
     *    (b) Complete Binary Tree(CBT):
     *     => CBT is a BT in which all the levels are completely filled
     *        except possibly the last one, which is filled from the 
     *        left to right.
     * 
     *    (c) Heap Order Property(HOP):
     *     => Children >= Parent (minHeap)
     *     => Children <= Parent (maxHeap)
    */

    /**
     * Heap implementation using CBT:
     * => Heap is not implemented as a class, because of ArrayList.
     *    Iske piche ek logic hai jo time complexity se aata hai.
     * => add(1): Maan lijiye humein "1" add krna hai iss already existing
     *    heap k andr. Aur mujhe pehle se pta hai ki ye "minHeap" hai means
     *    parent node ki value child node se choti hai. Agar humein "1"
     *    add krna hai aur humne normal class bnayi hui hai Binary Tree ki
     *    to uske andr hm har ek level pe jaenge aur dekhnge kaha jagha
     *    khali hai. To jitne nodes honge mere tree k andr, unn sb nodes
     *    m mujhe jaa k dekhna hoga ki kaha par mai iss insert kr skta hu.
     * => Sbse pehle root pe dekhnge, iske dono child hai to insert nhi hoga.
     *    Fir ek step niche jaenge to [3] k v dono child hai, lekin jb [4]
     *    pe jaenge to dekhnge yha jgha khali hai means yha insert kr skte
     *    hai. Aur jaise hi humne [1] insert kiya humein time lga O(n).
     * => Avi aur time lagega qki heap mai value insert kr diye but property
     *    kharab ho gyi, qki minHeap kehta hai min value parent ki honi
     *    chaiye but yha child ki hai.
     *                   [2]
     *                  /   \
     *               [3]     [4]
     *              /   \    /
     *           [5]   [10] [1]
     * 
     * => Heap ko humein insert krne k baad correct v krna padega aur
     *    iske liye extra time lagage. Jbki humaare add() ko O(logn)
     *    time lagna chaiye.
     *                   [1]
     *                  /   \
     *               [3]     [2]
     *              /   \    /
     *           [5]   [10] [4]
     * => Isliye humein apni tree m proper place dhundne k bahut jyda 
     *    time lg jaata hai isliye class ki form m hm apni heap ko form
     *    nhi krte. And that's the reason Heap ko hm implement krte hai
     *    using Array or ArrayList.
     * 
    */

    /**
     * Heap as an Array/ArrayList:
     * Q. Heap ko tree k form m q visualize krte hai?
     * => Qki humein parent-child relationship ko dikhana hota hai.
     * => tree: Parent-Child relationship m humein ye dikhana hota hai
     *    ki minheap k andr ye jo parent hota hai iski value humesa
     *    less than equalto hoti hai apni child Node se.
     * => Aur qki ye parent-child relationship hai isliye sbse best
     *    tree k form m hm dikha skte hai.
     *                    1
     *                   [2]
     *                2 /   \ 3
     *               [3]     [4]
     *            4 /   \ 5   
     *           [5]    [10] 
     * 
     * arr = [2, 3, 4, 5, 10]
     *        0  1  2  3   4
     * 
     * => Jb v hum ek tree ko visualize krte hai array/arraylist m to
     *    ek special property hoti hai.
     * => Ye property kehti hai agar koi Node hai jiska index "i" k
     *    baraabar hai to mai ye keh skta hu ki uska left child ka
     *    index humesa "2.i+1" hoga aur uske right child ka index
     *    humesa "2.i+2" k equal hoga.
     * 
     *    index(node) = i
     *       leftChild  = 2.i+1;
     *       rightChild = 2.i+2;
     * 
     *  => index(node) = 0
     *        leftChild  = 2.0+1 => 1
     *        rightChild = 2.0+2 => 2
     * 
     *  => index(node) = 1
     *        leftChild  = 2.1+1 => 3
     *        rightChild = 2.1+2 => 4
     * 
     *  => Isme parent node k left child aage hai uske baad right child.
     *     And using this property we can implement the parent-child
     *     relationship in the form of array/arraylist.
     * 
     * Add/Insert in a tree:
     * => Agar humein koi element tree k andr insert krna hota tha to
     *    level wise jaa k last index m insert krna hota tha jisme 
     *    mujhe linear time lg skta tha i.e. O(n).
     * => But yha par arraylist k last position ko find krna sbse easy
     *    hai:
     *         arr.add(val);
     *    Ye by-default data ko last position pe add kr deta hai aur
     *    time O(1) lgta hai. And this is why hm apne code ko arraylist
     *    k form m visualize krte hai qki arraylist k andr hm ye 
     *    parent-child relationship ko replicate kr paate hai using the
     *    above property.
     * 
     * arr = [-1, 2, 3, 4, 5, 10]
     *         0  1  2  3  4   5
     * 
     * => arr[0] = -1 store kr dete hai jisse formula m chota sa change
     *    aa jaata hai:
     *    index(node) = i
     *       leftChild  = 2.i;
     *       rightChild = 2.i+1;
    */

    /**
     * Insert in Heap:
     * 1. Add at last index:
     * =>  insert(1)
     * 
     *                   [2]
     *                  /   \
     *               [3]     [4]
     *              /   \    
     *           [5]   [10] 
     * => Visualize this minheap in array form:
     *    [ 2, 3, 4, 5, 10 ]
     *      0  1  2  3   4
     * => Element ko hum humesa last position pe insert krte hai aur
     *    mere heap position m kn si position khali hai? [4] ka left
     *    child, means 1 ko hm directly last index pe insert kr denge.
     * 
     *    [ 2, 3, 4, 5, 10, 1 ]
     *      0  1  2  3   4  5
     * 
     *                   [2]
     *                  /   \
     *               [3]     [4]
     *              /   \    /
     *           [5]   [10][1]
     * 
     * 2. Fix the heap:
     * => [1] ko uske parent k saath i.e. [4], compare krnge
     * 
     * 
     * Q. How to find child from parent's idx?
     * => i
     *    left  = 2.i+1
     *    right = 2.i+2
     * 
     * Q. How to find parent's value from child's idx?
     * =>      child ---> parent
     *    idx: (x)       (x-1)/2
     * 
     * => idx of child(x) = idx of parent (x-1)/2
     *              idx-5 = (5-1)/2
     *                    = 4/2
     *                    = idx-2 i.e. value-4
     * => So, we can say parent of value-1 is value-4. To "1" khud ko
     *    "4" k saath compare krega ki kya "1" "4" se bda hai?
     *    No!, means wo "4" ka child nhi ho skta isliye swap ho jaega.
     * 
     * Note: if(childVal < parentVal)
     *          swap(child, par)
     *    
     *    [ 2, 3, 1, 5, 10, 4 ]
     *      0  1  2  3   4  5
     * 
     *                   [2]
     *                  /   \
     *               [3]     [1]
     *              /   \    /
     *           [5]   [10][4]
     * 
     * => Again compare "1" with its parent:
     * =>      child ---> parent
     *    idx: (x)       (x-1)/2
     * 
     * => idx of child(x) = idx of parent (x-1)/2
     *              idx-5 = (2-1)/2
     *                    = 0
     *                    = idx-0 i.e. value-1
     * 
     * if(childVal < parentVal)
     *       swap(child, par)
     * 
     *    [ 1, 3, 2, 5, 10, 4 ]
     *      0  1  2  3   4  5
     * 
     *                   [1]
     *                  /   \
     *               [3]     [2]
     *              /   \    /
     *           [5]   [10][4]
     * 
     * => Now our minHeap is fixed.
     * 
     * Final Logic:
     * => while(childVal < parentVal) {
     *       swap(child, par)
     *    }
     * 
    */

    /**
     * Peek from Heap:
     * Q. How to get minimum heap priority wise?
     * 
     *    [ 2, 3, 4, 5, 10, 1 ]
     *      0  1  2  3   4  5
     * 
     *                   [2]
     *                  /   \
     *               [3]     [4]
     *              /   \    /
     *           [5]   [10][1]
     * 
     * => Root of a tree is minimum, jo sbse upar hota hai.
     * => Heap m wo top par hota hai aur arraylist m starting index pe.
     * => peek() => arr.get(0)
    */

    /**
     * Remove/Delete from Heap:
     * => Delete is a 3 step process:
     *    (a) swap 1st & last node 
     *    (b) remove last idx: O(1)
     *           arr.remove(arr.size() - 1)
     *    (c) fix the heap
     * 
     * 1. Swap 1st & last node:
     *    [ 2, 3, 4, 5, 10, 6 ]
     *      0  1  2  3   4, 5
     * 
     *                   [2]
     *                  /   \
     *               [3]     [4]
     *              /   \    /
     *           [5]   [10] [6]
     * 
     * 
     *    [ 6, 3, 4, 5, 10, 2 ]
     *      0  1  2  3   4  5
     * 
     *                   [6]
     *                  /   \
     *               [3]     [4]
     *              /   \    /
     *           [5]   [10] [2]
     * 
     * 
     * 2. Remove the last idx:
     * => arr.remove(arr.size() - 1)
     * 
     *                   [2]
     *                  /   \
     *               [3]     [4]
     *              /   \   
     *           [5]   [10] 
     * 
     *    [ 6, 3, 4, 5, 10 ]
     *      0  1  2  3   4 
     * 
     * 3. Fix the heap:
     * => Parent element [6] is greater than leftChild[3] and righChild[4]
     * => Heap Property satisfy nhi hui, means humaara heap ek tarike se
     *    bigad gya hai jisko humein fix krna padega.
     * => To fix this heap we will use a special type of function called 
     *    "heapify". Iss function ko hum khud likhte hai but iska logic
     *    fix rehta hai. 
     * => heapify object k help se hm ek heap ko fix kr skte hai means wapas
     *    se uske original ya sahi form m laa skte hai.
     * 
     * Q. How does heapify work?
     *                    0
     *                   [5]
     *                1 /   \ 2
     *               [3]     [4]
     * => [5, 3, 4]
     *     0  1  2
     * => Suppose mere paas ye heap hai jisse humein fix krna hai.
     * => heapify call ho jaata hai humaare "root" k liye. To root k
     *    liye pehle uska leftChild nikaal lenge then rightChild:
     *    (a) leftChild  = 2.i+1 = 1
     *    (b) rightChild = 2.i+2 = 2
     * => Ab heapify "root" ko leftChild & rightChild se compare
     *    karta hai, means index pe jo v values hai unhein compare
     *    karnge aur unme se hm minimum nikaalnge:
     * 
     *    min = (i, 2.i+1, 2.i+2)
     * 
     * => So, root, leftChild & rightChild m se jo v minimum hoga wo
     *    mera min bn jaega aur usko hum banaenge apna parent. 
     *    (swap min with parent)
     * 
     *                    0
     *                   [3]
     *                1 /   \ 2
     *               [5]     [4]
     * => [3, 5, 4]
     *     0  1  2
     * 
     * Note: heapify is a recursive call jo baar baar call hoga, starting
     *       m root k liye then uske child, and use child k liye taaki
     *       upar se le k nich tk hm saare tree ko fix kr pae.
    */

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        /**
         * 1. add(): O(logn), 
         * => Because ek tree k andr 'n' nodes hai to logn levels honge
        */
        public void add(int data) {
            // add at last index
            arr.add(data);

            int childIdx = arr.size() - 1; // x is child index
            int parentIdx = (childIdx - 1)/2; // parent index

            // O(logn)
            while(arr.get(childIdx) < arr.get(parentIdx)) {
                // swap
                int temp = arr.get(childIdx);
                arr.set(childIdx, arr.get(parentIdx));
                arr.set(parentIdx, temp);

                childIdx = parentIdx;
                parentIdx = (childIdx - 1) / 2;
            }
        }

        /**
         * 2. peek(): O(1)
        */
        public int peek() {
            return arr.get(0);
        }


        /**
         * 3. remove(): O(logn)
        */
        public int remove() {
            int data = arr.get(0); // remove root data

            // step-1 : swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            // step-2: delete last
            arr.remove(arr.size()-1);

            // step-3: heapify
            heapify(0);
            return data;

        }

        /**
         * 3.1. heapify():
         * => fix the heap
        */
        private void heapify(int i) {
            int leftChild = 2*i+1;
            int rightChild = 2*i+2;
            int minIdx = i; // root is minVal of idx

            if(leftChild < arr.size() && arr.get(minIdx) > arr.get(leftChild)) {
                minIdx = leftChild;
            }

            if(rightChild < arr.size() && arr.get(minIdx) > arr.get(rightChild)) {
                minIdx = rightChild;
            }

            if(minIdx != i) {
                // swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx); // recursive call
            }
        }

        /**
         * 3.2. fn to check is heapify empty
        */
        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {

        /**
         * Custom Priority Queue:
        */
        Heap pq = new Heap();
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(5);

        /**
         * Heap Sort Algorithm: 
         * => Sorted in ascending order
         * => TC: O(n logn)
        */
        while(!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
