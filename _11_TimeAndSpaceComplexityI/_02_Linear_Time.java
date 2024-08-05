package _11_TimeAndSpaceComplexityI;

public class _02_Linear_Time {
/**
 * 2. Linear Time : O(n) 
 * => An algorithm is said to have linear time complexity when the running time
 *    increases linearly with the size of input.
 * => Agar input ka size badhega to time consumed v badhega.
 * 
 * => When the function involves checking the values in input data, such function
 *    has the time complexity of Order O(n).
 * => Input data ki har values par agar koi function chalta hau(kuch kaam agar
 *    input data ki har value par hota hai) to uss function ki time complexity
 *    Order of O(n) ho jaati hai.
 * 
 *    n1 = 2*n2 (n1 => agar n1 ki length ya size twice of the size of n2 ho)
 *    T(n1) = 2T(n2) (To time of execution of n1 will be twice the time taken in execution of n2)
 * 
 * Example : Linear Search => Find the element in an array.
 * 
 * public static int linearSearch(int[] arr, int x) {
 * 
 *     => time input (arr.length) ki length par depend krta hai
 *     for(int i = 0; i < arr.length; i++) {
 *         
 *        => Jitni baar ye comparison check lagega(input length), utni baar time
 *        => badla jaega, hum maante hai 1 baar comparison m "k" time lga 
 *       
 *        => Q) To Best Case kya hoga yha?
 *        => Jb pehla hi element x k equal mil jaega to hmein bas 1 comparison krna pdega.
 *
 *         +----------------------------+
 *         |    |    |    |    |    |   |
 *         +----------------------------+
 *           k    k    k    k    k   k    
 *      => <-------------nk-------------->
 *      => Worst case m to sbke saath hi compare krna pdega 
 *
 *      => Humein worsk case maanke hi T(n) nikaalne hota hai.
 *      => Worst case m hm maante hai ki wo element array mai hai hi nhi, to 
 *         humne "n" element se compare kiya, fir pta chlala ki wo element hai
 *         hi nhi (Ek baar compare krne m "k" time laga) To "n" element ko 
 *         compare krne mai :
 *           = k + k +..... k (n times k ko add kiya)
 *           = (k)(n)
 *           = nk 
 *      => t(n) directly proportional to "n" => Means agar array ki size 
 *         double ho gya to search krne m time v double lagega.
 *
 *       => agar arr[i] is equal to x, to index "i" ko return kar do
 *       if(arr[i] = x) {
 *           return i;
 *       }
 *   }
 *   return - 1; //mtlb mila hi nhi (Ye worst case hai)
 * }
 *
 * */ 
}
