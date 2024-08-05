package _14_Searching;

public class _13_Missing_Element {
    public static void main(String[] args) {
        /**
         * Find the missing element:
         * => 1 to n tk numbers likh rhe the aur glti se bich m ek no. 
         *    miss ho gya. to humein wo number findout krna hai.
         * => arr = [1, 2, 3, 4, 6, 7, 8]
         *           0  1  2  3  4  5  6
         * => We can see one pattern:
         *    (a) idx-0 + 1 = element-1
         *    (b) idx-1 + 1 = element-2
         *    (c) idx-2 + 1 = element-3
         *    (d) idx-3 + 1 = element-4
         *    => Idx-0 to 3 tk sb sahi hai. 
         *    => But iske aage pattern break ho rha:
         *    (a) idx-4 + 1 = element-6
         *    (a) idx-5 + 1 = element-7
         *    (a) idx-6 + 1 = element-8
         * 
         *            1  1  1  2  1  1
         *   diff =  +--+--+--+--+--+--+
         * => arr = [1, 2, 3, 4, 6, 7, 8]
         *           0  1  2  3  4  5  6
         * 
         * => Issue is between idx-3&4.
         * 
         * 
         * Q. How can we do this using binary search?
         * => 
         * */ 
    }
}
