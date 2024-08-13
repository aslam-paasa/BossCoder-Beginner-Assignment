package _08_String;

public class _17_StringBuilder {
    /**
     * Interview Question:
     * TC: O(n^2) = around 700 ms
     * => Ye loop n^2 hai.
     * 
     * => Starting m string = "" => blank tha, fir usme humne 'i=0' add
     *    kiya. To String ne new space mai "0" bnaya, fir humne loop
     *    chalaya, reference pointer fir se new instance pointer pe 
     *    point krne lga jaha pe puraane instance ko copy kr k ek new
     *    instance k saath store hua i.e. "01" etc...   
     *    1 operation: 0
     *    2 operation: 01
     *    3 operation: 012
     *    4 operation: 0123
     *    ....
     *    ....
     *    100000 operation: XXXXXX
     * => For n=100000, 
     *    => n(n+1)/2
     *    => 10^10 operations
     * 
     * Note: String pe loop lga k agar humne kvi modify kiya to wo kvi
     *       time limit pe nhi chalne wala.
     * 
     * Solution: StringBuilder
     * => StringBuilder ek mutable String hoti hai. Means ye humaare 
     *    loop me 'n' time limit m chl jaega
     * TC: O(n)
    */
    public static void main(String[] args) {
        String s = "";

        long start = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++) {
            s = s + 1; // 755 ms
        }
        long end = System.currentTimeMillis();

        long duration = end - start;
        System.out.println(duration);


        StringBuilder sb = new StringBuilder();
        
        long startSB = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++) {
            sb.append(i); // 4 ms
        }
        long endSB = System.currentTimeMillis();

        long durationSB = endSB - startSB;
        System.out.println(durationSB);
    }
}
