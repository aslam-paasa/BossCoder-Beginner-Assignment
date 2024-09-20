package _28_Hashing;

public class _14_Heap {
    /**
     * Understanding Heap Properties
     * =============================
     * 
     * A Heap is a binary tree that satisfies two properties:
     * 
     * (a) Heap Order Property (HOP): Parent nodes have higher priority 
     *    than their child nodes.
     * 
     * (b) Complete Binary Tree (CBT): All levels are fully filled except 
     *    the last level, which is filled from left to right.
     * 
     * These properties enable efficient operations like add(), remove(), 
     * and peek() with time complexities of O(logn) and O(1) respectively.
     */ 

    /**
     * Heap Order Property (HOP)
     * -------------------------
     * 
     * HOP ensures that parent nodes have higher priority than their child 
     * nodes. This property is useful in scenarios like a student rank 
     * system, where the parent node represents a higher rank than its 
     * child nodes.
     * 
     * Example:
     *                 [10]
     *                /    \
     *            [20]      [30]
     *           /    \     /   \
     *       [40]    [50] [60]  [70]
     *      /    \
     *    [80]    [90]
     * 
     * In this example, the root node (10) has a higher priority than its 
     * child nodes (20 and 30), and so on.
     * 
     * HOP enables the root node to be the highest-priority element, 
     * making peek() operations O(1).
     */

    /**
     * What is Complete Binary Tree?
     * CBT is a property that ensures all levels of the binary tree are 
     * fully filled except the last level, which is filled from left to 
     * right. This property enables efficient add() and remove() 
     * operations with a time complexity of O(logn).
     * 
     * Step-1:
     *                 [10]
     *                /  
     *            [20]   
     * 
     * Step-2: 
     *                 [10]
     *                /    \
     *            [20]      [30]
     * 
     * Step-3:
     *                 [10]
     *                /    \
     *            [20]      [30]
     *           /    
     *       [40]    
     * 
     * 
     * Step-4:
     *                 [10]
     *                /    \
     *            [20]      [30]
     *           /    \ 
     *       [40]    [50] 
     * 
     * Step-5:
     *                 [10]
     *                /    \
     *            [20]      [30]
     *           /    \     /   
     *       [40]    [50] [60]
     * 
     * Step-6:
     *                 [10]
     *                /    \
     *            [20]      [30]
     *           /    \     /   \
     *       [40]    [50] [60]  [70]
     * 
     * => CBT k upar k level saare full hote hai and final level left to
     *    right hota hai.
     * => Aur CBT humein add() & remove() ki TC O(logn) krne m help krta
     *    hai.
     * => CBT ki help se hm ek tree ko array se represent kr skte hai. 
     *    Avi tk hm binary tree kaise bnate the? Node rkhte the, usme
     *    data and then left-right. But CBT property ki wajah se humko
     *    tree ko ArrayList se implement krne k sahuliyat milti hai aur
     *    ArrayList ki help k wajah se humara add() or remove() ki 
     *    TC O(logn) m ho jaata hai.
     * 
     *         0   1   2   3   4   5   6   7
     * arr = [10, 20, 30, 50, 60, 70, 80, 90] 
     *                 [10]
     *                /    \
     *            [20]      [30]
     *           /    \     /   \
     *       [40]    [50] [60]  [70]
     *      /    \
     *  [80]     [90]
     * => Top-to-bottom humara arraylist zig-zag way m move kr rha hai.
     * Note: An array can also be visualized and used to implement as a
     *       tree.
     * 
     * 1. peek() : O(1)
     * => Root: list.get(0)
     * 
     * Q. How to add()?
     * => Add to [90] k baad hi hoga.
     * => add() ka ek helper fn hota hai jisse hm kehte hai "upheapify"
     * => Ab add(5) dekhega ki kya mera parent mujhe choti priority
     *    rakhta hai, yes!. Rank-5 ki priority jyda high hai rank-60
     *    se. 
     * => Rank-5 & Rank-60 k bich m parent-child relationship hai to
     *    swap kr do:
     * 
     *                 [10]
     *                /    \
     *            [20]      [30]
     *           /    \     /   \
     *       [40]    [5] [60]  [70]
     *      /    \    / 
     *  [80]   [90] [50]
     * 
     * => Ab Rank 5 dekhega ki kya mera parent mujhse choti priority
     *    rakhta hai, swap kr do:
     * 
     *                 [ 5 ]            2^0
     *                /    \             +
     *            [10]      [30]        2^1
     *           /    \     /   \        +
     *       [40]    [20] [60]  [70]    2^2
     *      /    \    /                  +
     *  [80]   [90] [50]                2^h
     * 
     * => GP : hlogn
     * 
     *
     * => Ab Rank5 dekha ki kya mai rank-10 se better priority rkhta hu
     *    Yes!. Rank 10 niche aa jaega.
     * 
     * Q. Rank-5 kitna travel kiya?
     * => Tree k height k barabar and height ki TC O(logn) hoti hai.
     * => GP : hlogn
     * 
     * 
     * Remove():
     *                 [10]
     *                /    \
     *            [20]      [30]
     *           /    \     /   \
     *       [40]    [50] [60]  [70]
     *      /    \   /
     *  [80]   [90][100]
     * => ArrayList m [10] remove krnge to sb aage khisknge, jiski TC O(n)
     *    hoti hai.
     * => Another approach is swap first and last:
     * 
     *                 [100]
     *                /    \
     *            [20]      [30]
     *           /    \     /   \
     *       [40]    [50] [60]  [70]
     *      /    \   /
     *  [80]   [90][10]
     * => Ab arraylist m last k removal O(1) ka hota hai. Lekin ab
     *    priority queue kharab ho gyi hai. Iske liye ab hm ek activity
     *    krnge jisse bolte hai "downHeapify":
     * 
     * (a) In teeno m jo sbse chota hai wo upar chla jaega aur 100 niche.
     *                 [20]
     *                /    \
     *            [100]      [30]
     * 
     * (b) Ab 100, 40, 50 m sbse chota jo hai uske saath swap ho jaega.
     *                 [20]
     *                /    \
     *            [40]      [30]
     *           /    \     /   \
     *       [100]    [50] [60]  [70]
     * 
     * (c) 100, 80, 90 m jo sbse chota hoga uske saath swap ho jaega.
     *                 [20]
     *                /    \
     *            [40]      [30]
     *           /    \     /   \
     *       [80]    [50] [60]  [70]
     *      /    \   
     *  [100]   [90]
     * 
     * 
     * 1. 0 -> 1,      2
     *         0.2+1   0.2+2
     * 2. 1 -> 3,      4
     *         1.2+1   1.2+2
     * 3. 2 -> 5,      6
     *         2.2+1   2.2+2
     * 4. 3 -> 7,      8
     *         3.2+1   3.2+2
     * 
     * ParentIndex: (childIndex -1)/2
     * LeftIndex: 2*PI + 1
     * RightIndex: 2*PI + 2
     * 
     * => HOP is done
     * => CBT is done
    */

    /**
     * Operations
     * ==========
     * 
     * peek(): O(1)
     * 
     * add(): O(logn)
     * (a) list.add
     * (b) unheapify
     * 
     * remove(): O(logn)
     * (a) swap 1st and last
     * (b) remove last
     * (c) downheapify
     * 
     * These operations are enabled by the HOP and CBT properties of the 
     * Heap data structure.
     */
}
