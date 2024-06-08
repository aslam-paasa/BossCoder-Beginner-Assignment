package _01_FundamentalOfProgramming;

/** Sum of 'n' Natural Number: (Solve without loop)
 *  => n = 5 -> 1+2+3+4+5 = 15
 *  => n = 1000 -> 1+2+3+...+1000 
 * 
 * => This is nothing but AP, having common difference of '1'
 * => Formula-1 : Sn = n/2(a+l) where a = firstTerm, l = last term
 * => Formula-2 : Sn = n/2(2a+(n-1)d), where a = firstTerm, l = last, d = commom difference (diff b/w adjacent elements)
 * 
 * Note: When the difference between adjacent elements is same, then we call that sequence as Arithmetic Progression(AP).
 */
public class _10_NaturalNumber {
    public static void main(String[] args) {
        int n = 15;
        System.out.println((n*(n+1))/2); // 120
    }
}

// N = 5 -> 1+2+3+4+5 = 15
// N = 1000 -> 1+2+3+4+....+1000 = _
// 1M =  1M operations