package _12_RecursionWithArrayList;

public class _905_Concept_Of_Passing_Numbers {
    /**
     * Concept of Passing Numbers:
     * What will be the output?
     *    if(n == 0)  return;
     *    System.out.println(n);
     *    fun(n--);
     * 
     * => Infinite Recursion :  n-- vs --n is not similar.
     * => n-- will pass the value of n first and then subtract it.
     *    So, n will pass 5 first, and now trying to do (5-1) but n--
     *    will again pass 5, then it try to do (5-1) but n-- will again
     *    pass 5. So, it got stucked in a infinite loop.
     * => But --n will subtract the value first then pass.
     *    
     * */
    
    public static void main(String[] args) {
        fun(5);
    }

    public static void fun(int n) {
        if(n == 0) {
            return;
        }

        System.out.println(n);
        // fun(n--);
        fun(--n);
    }
}
