package _07_Array_I;

public class _22_Subarray {
    /**
     * Q. Print Subarrays: A continuous part of array
     * => [2,4,6,8,10]
     * 
     * Note: Har 'n' size k array k andr "n(n+1)/2" subarray hota hai.
     *       Aur ye kaafi similar h pair wale question se.
     * 
     * => Humein yha simply pehle ek number uthana hai, uske baad usse agla
     *    ek number uthana hai etc... fir uske baad unke bich k saare elements
     *    print kr do
     * => [2]
     * => [2,4]
     * => [2,4,6]
     * => [2,4,6,8]
     * => [2,4,6,8,10]
     * 
     * Logic:
     * => Nested Loops:
     * => start ---> for(int i=0 to n)    [Loop-1]
     * => end   ---> for(int j=i+1 to n)  [Loop-2]
     * => for(start to end)               [Loop-3]
     * 
     * Note: Pair wla strategy use krnge:
     * start = 2            [i]
     * end   = 4, 6, 8, 10  [j]
     * Print result         [k]
      */ 
    
    public static void main(String[] args) {

        int numbers[] = {2,4,6,8,10};
        printSubarrays(numbers);
    }

    public static void printSubarrays(int numbers[]) {

        for(int startIdx = 0; startIdx < numbers.length; startIdx++){
            for(int endIdx = startIdx; endIdx < numbers.length; endIdx++) {
                System.out.print(numbers[startIdx] + "\t");
            }
            System.out.println();
        }

        // for(int i = 0; i < numbers.length; i++) {
        //     for(int j = i; j < numbers.length; j++) {
        //         for(int k = i; k <= j; k++) {
        //             System.out.print(numbers[k] + "\t");
        //         }
        //         System.out.println();
        //     }
        // }
    }
}

/**
 * 2 => 5
 * 4 => 4
 * 6 => 3
 * 8 => 2
 * 10 => 1
 * 
 * Total Subarrays = n(n+1)/2
 *                 = 15
 *       5+4+3+2+1 = 15
*/