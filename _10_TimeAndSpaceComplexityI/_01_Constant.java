package _10_TimeAndSpaceComplexityI;

public class _01_Constant {
/**
 * 1. Time Complexity :
 * => Time Complexity of an algorithm is the representation of the amount of
 *    time required by the algorithm to execute to completion.
 * => Kisi v algorithm ki poori tarike se execute hone m jo v time chaiye hoga,
 *    aur iss time ko agar hum represent kre to usse time complexity kahenge
 *    uss algorithm ki.
 * => Time Complexity is denoted by t(N) (means time taken for input of size N).
 * => Agar humein kisi v algorithm ki effieciency check karna chahte hai (ki wo
 *    algorithm kitni efficient hai => efficient means kitni eligible hai ya kitni
 *    shamta hai uss algorithm ki). To kisi v algorithm ki effieciency determine
 *    krne k 2 important factors hote hai :
 *    (a) Time Factor : Time is calculated or measured by counting the number of
 *       operations such as comparison in sorting algorithm(for example, hum kitni
 *       baar do number se compare krnge)
 *    
 *    (b) Space Complexity : The space is calculated or measured by counting the 
 *        maximum memory space required by algorithm. 
 *     => Space Complexity of an algorithm represents the amount of memory space
 *        the algorithm needed in its life cycle.
 *
 *
 *  => Kisi v problem ko solve krne k humaare paas "n" solution hote skte hai.
 *    (Eg: Humein apne sb friends problem discuss kre to sb alag-alag solution
 *     bataenge, waise hi kisi v program ko solve krne k "n" no. of solution ho
 *     skte hai.)
 * 
 * => Example : Agar humein kisi v number ki square find krna hai :
 *    (a) Solution-1 : One solution can be running a loop for "n" times, 
 *        starting with the number n, and adding "n" to it.
 *
 *     int n = 5;
 *     for(int i = 1; i < n; i++) {
 *         n = n + 1;
 *     }
 *     return n; // n = 25 (Square)
 * 
 * => Humne yha "n" time loop run kiya to "n" times operation chale (addition) k,
 *    to "n" operation m jyda time consume hua.
 *
 * (b) Solution-2 :
 *  => Second solution can be, we can just use a methematical operator (*) multiply
 *     to find the square.
 *
 *     int n = 5;
 *     return n * n; // n = 25 (Square)
 * 
 * => Ye humne ek baar bas multiply operation kiya to yha 1 operation hua to
 *   bahut kam time lga.
 * 
 * 
 * 
 * 1. Solution-1 to find the sqaure :
 * 
 *     int n = 5;
 *     for(int i = 1; i < n; i++) {
 *         n = n + 1;
 *     }
 *     return n; // n = 25 (Square)
 * 
 * => Yha time "n" pe depend kr rha hai. Jitni "n" ki value hogi utni baar time
 *    badhega.
 * => "i < n", yha loop "n" no of times chalega
 * => "n=n+5" => Jasie jaise "n" ki value badhegi waise waise time v badhega to
 *    time complexity will be "n" atleast.
 * => Time Complexity hum estimate krte hai by calculating the no. of elementary
 *    steps performed by an algorithm to finish execution.
 * 
 * 
 * 
 * 2. Solution-2 to find the sqaure :
 * 
 *     int n = 5;
 *     return n * n;
 *
 * => Yha pe time complexity constant hogi qki yha time "n" ki value pe depend
 *   nhi krta ("n" ki value kuch v ho, time to ek operation ki liye hi lgega)
 * => Hum Time Complexity ko usually represent karte hai using Big Notation.
 *    (Big O matlab worst case m kitna time lagega)
 * 
 * 
 * Types of Notations for time complexity :
 * 1. Big Oh 
 * => denotes "fewer than or same as" <expression> iterations.
 * 
 * 2. Big Omega 
 * => denotes "more than or same as" <expression> iterations.
 * 
 * 3. Big Theta
 * => denotes "the same as" <expression> iterations.
 * 
 * 4. Little Oh 
 * => denotes "fewer than" <expression> iterations.
 *
 * 5. Little Omega :
 * => denotes "more than" <expression> iterations.
 *
 *
 *
 * There are different types of time complexities used :
 * 1. Constant time => O(1)
 * 2. Linear time => O(n)
 * 3. Logarithmic Time => O(log n)
 * 4. Quadratic time => O(n^2)
 * 5. Cubic time => O(n^3)
 * => and many more complex notations like :
 * 6. Exponential time
 * 7. Quasilinear time
 * 8. Factorial time etc...
 *
 *
 *
 * 1. Constant time : O(1) 
 * => An algorithm is said to have constant time of order O(1), when it is not
 *    dependent on the input size "n".
 * => Irrespective of the input size "n", the runtime will always be same.
 * => Time taken by algorithm, input size pe depend nhi krega, means chote input
 *    k liye jitna time lagega, same time bade input k liye lagega.(Input size
 *    chota ye bda krne se time consumed par koi fark nhi padega).
 * 
 * Example : Time consumed in doing (2*5) = Time consumed in doing (200 * 500)
 * => But how? Aisa isliye hai qki 2 aur 5 v integer hai aur 200, 500 v integer
 *    hai.
 * => Integer size in java = 3 bytes = 32 bits
 * => 2, 5, 200, 500, all are stored in 32 bits. So, jitna time 2 ko 5 se multiply
 *    krne m lagega, utna hi time 200 ko 500 se multiply krne m lagega qki CPU
 *    ko to dono case mai saare bits process krne hai.
 * 
 * Example : (2+5) ka time = (200+500) ka time
 * => 2 in binary form = 10
 * => 5 in binary form = 101
 * 
 * => 200 in binary form = 11001000
 * => 500 in binary form = 111110100
 * 
 * 2 =>    00000000000000000000000000000010    |
 * 5 => +  00000000000000000000000000000101    |
 *                                             | [Equal Time]
 * 200 =>    00000000000000000000000011001000  |
 * 500 => +  00000000000000000000000111110100  |
 * 
 * => In both cases, computer will have to process all 32 bits.
 * => To ab hm ye bol skte hau O(1) k operation wo operation hote hai jaha time
 *    taken by algorithm does not depend on size of input qki time to constant
 *    (same) fixed hi rahega har input size k liye.
 * 
 * 
 * Type : O(1)
 * 1. Initial Equation => T(n) = k (time taken for input of size n, and consider k = constant).
 * 2. Final Equation => T(n) = k 
 * 3. Examples :
 *     (a) + (Plus)
 *     (b) - (Minus)
 *     (c) * (Multiply)
 *     (d) / (Divide)
 *     (e) % (Modulus)
 *     (f) ^ (XOR)
 *     (g) / (Divide)
 *     (h) & (AND)
 *     (i) Array k andar kisi v position se "get" krna ya "set" krna (time constant).
 * 
 * => Array k andar kisi v position se "get" krna ya "set" krna (time constant).
 * => Take equal time {arr[5]=20, arr[500]=20}
 * 
 *      |    |
 *      |    |
 *      +----+   +-----------------------------+
 *      | 4k |   |    |    |    |    |    |    |
 *  Arr +----+   +-----------------------------+
 *                4k  4004 4008 4012.......
 *                ------>----->---->
 *            => Address m har element of array k liye 4 byte badhti jaati hai
 *               because 1 integer takes 4 bytes.
 * => Humein arr[5] par koi value daalne mai jitna time lagega utna hi time
 *   arr[500] par koi value daalne m lagega qki arr[5] ki value v ek address
 *    par hai aur arr[500] ki value v ek address par hai.
 * => CPU ko dono address par jaane m equal time lagega. So, we can say that
 *   time complexity is same/constant.
 *
*/
}
