package _26_LinkedList;

public class _01_LinkedListIntro {
    public static void main(String[] args) {
        /**
         * LinkedList:
         * => A linked list is a linear and non-contiguous type of data structure,
         *    which contains node structure and each node contains elements.
         * => A data part that stores the value at that node and next part that 
         *    stores the link to the next node.
         * 
         * =>      Stack Memory
         *         +         +
         *         |         |
         *         |         |
         *         |         |       LinkedList Object: 3 properties (Heap Memory)
         *         |         |       +-----------+ 
         * List=>  |   10k   | ====> | head : 4k | => head node ka address
         *         +---------+       | tail : 8k | => tail node ka address
         *                       10k | size : 5  | => kitne node hai i.e size 
         *                           +-----------+
         * Note: 
         * (1) head se humein pta chlega ki LinkedList kaha se start hogi
         * (2) tail se humein pta chalega ki LinkedList kaha tk jaegi
         * (3) Node k andr 2 properties hai:
         *     (a) data
         *     (b) next
         * 
         *  data next
         * +-----------+
         * | 25 | link | => stores the address of next node
         * +-----------+
         * 
         * +---------+    +---------+    +---------+    +---------+    +-----------+    
         * | 10 | 5k |--->| 20 | 6k |--->| 30 | 7k |--->| 40 | 8k |--->| 50 | null |
         * +---------+    +---------+    +---------+    +---------+    +-----------+    
         *     4k             5k              6k            7k              8k
         * Note: Last wale node m "null" pda hai, means ye last node hai.
         * 
         * => Node:
         *         int data
         *         Node next
         * => node class k andr "int data" hai aur "node next" hai.
         * => Ek node apne se next node ko point krta hai.
         * */ 


        /**
         * +-------------+
         * | data |  ----|---> Pointer to next node(stores the address of next node)
         * +-------------+
         * 
         * 
         * 
         *  Head Pointer holds the address of the first node
         *    |
         *    V
         * +---------+    +---------+    +---------+    +-----------+
         * | 5  |    |--->| 7  |    |--->| 2  |    |--->| 15 | null |
         * +---------+    +---------+    +---------+    +-----------+ 
         *    |
         *    V
         *  First Pointer is also known as head node.   
         * */ 


        /**
         * NODE:
         * 1. The first pointer is also known as HEAD.
         * 2. HEAD is usually used to traverse through the linkedlist.
         * 3. The LinkedList can be visualized as a chain of nodes where every
         *    node points to the next node.
         * +-------------+   +-------------+   +-------------+   
         * | data | next |-->| data | next |-->| data | next |-->null
         * +-------------+   +-------------+   +-------------+   
         *  (head)
        */


        /**
         * Q. Why LinkedList?
         * => Imagine we are having 10 integers, humein 10 integers ko store krna hai
         *    ek saath aur ab 10 integers ko store krna hai ek data structure m 
         * 
         * => Suppose we declare an array:
         *    int[] arr = new int[10];
         *                        |
         *                        V
         *                        1. 10 integers in array
         *                        2. 10 integers each of 4 bytes
         *                        3. 40 bytes in the memory are needed
         * 
         * => But array is stored contiguously.
         * 
         * +---------------------+-------------------+
         * |    Stack            |      Heap         |
         * +---------------------+-------------------+
         * |                     |  Free    Free     |
         * | +        +          | +---------------+ |
         * | |        |          | | 20 |  | 20 |  | |=> Heap is filled at positions
         * | |        |          | +---------------+ |
         * | |        |          |     Filled  Filled|=> Ye h fregmented memory and linkedlist
         * | |        |<= arr    |                   |   can use it very well. 40 bytes continuously
         * +---------------------+-------------------+   free memory is not present here.
         * So, array of size 10 cannot be stored.
         * 
         * => Heap is filled at positions and, we just have 20 bytes free at some places.
         * => So, if we want to make an array, then it won't be possible to do so because
         *    memory space (40 bytes continuous) is not available in this heap. 
         * */ 

        /**
         * Q. How LinkedList is different from array?
         * +---------------------+----------------------------------------------------+
         * |    Stack            |      Heap                                          |
         * +---------------------+-------------------------connected------------------+
         * |                     |                     +-------------+                |
         * | +        +          | +-------------------|-------------|--------------+ |
         * | |        |          | |#####|+-----+   +--+--+|#####|+--V--+   +-----+ | |
         * | |        |          | |#####||  |  |-->|  |  ||#####||  |  |-->|  |  | | |=> These small square
         * | |        |          | |#####|+-----+   +-----+|#####|+-----+   +-----+ | |   with 2 compartments
         * | |   4k   |--------->| +--------4k--------------------------------------+ |   are called squares.
         * | +--------+          |                                                    |
         * +---------------------+----------------------------------------------------+
         * 
         * => Our list is "linked".
         * => Our memory is not contiguous.
         * => But still we are able to store the list because the list is linked(even in
         *    contiguous free memory).
         * => That's the reason why this list is called LinkedList.
         * */ 


        /** Node:
         * +----------+-----------+
         * | int data | Node next | => next ka type isliye Node h qki uss address par node ko 
         * +----------+-----------+    hi store krna hai
         * 
         * => These small squares with 2 compartments are called Node.
         *    So, basically there are 2 parts in a node:
         *    (a) Data
         *    (b) Address of next node
         * => Each node element stores the address of next element
         * => The Stack Memory stores the address of the first element/node of the LinkedList i.e. 4k.
         * => Hence, we conclude that a LinkedList is a non-continuous type of data structure.
         *    This means LinkedList utilizes space when there is fragmented memory.
         * */ 


        /**
         * Disadvantages of LinkedList over Arrays in terms of Memory:
         * 
         * +------+----------------------+
         * | Data | Address of next Node |
         * +-----------------------------+
         *    |        |
         *    V        V
         *   4 byte + 4 byte = 8 bytes
         * 
         * => Even though it is advantageous to use the LinkedList for space conservation in heap,
         *    (Hum fragmented/bikhra hua free space ko use kr paa rhe hai jo hum array ko use krke
         *     nhi kr skte hai)
         * => Now, we notice that since each node stores 2 values: 
         *    (a) data
         *    (b) address
         *    Therefore, each node requires 4bytes + 4 bytes = 8bytes of memory.
         * => The memory used in arrays for each element was only 4 bytes. Here, the space of LinkedList
         *    is noticed to be more.
         * */  
    }
}
