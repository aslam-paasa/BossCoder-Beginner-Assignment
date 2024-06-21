package _11_Maths;

public class _01_index {
    public static void main(String[] args) {
        
        /**
         * Q. Given an array of integers. Find the GCD of min and max elements?
         * => GCD -> Greatest Common Divisor
         * => GCD = HCF
         * 
         * => GCD(24, 30) -> Greatest Common Divisor which divides both
         * => 24 = 1, 2, 3, 4, 6, 8, 12, 24
         * => 30 = 1, 2, 3, 5, 6, 10, 15, 30
         * => Common Divisor = 1,2,3,6
         * => So, GCD is 6.
         * 
         * Note: We have already learned how to find max and min.
         * 
         * Approach:
         * => GCD(5, 20) = 5
         * => GDC(10, 10) = 10
         * => GCD(a, a) = a (Formula)
         * 
         * => GCD(10, 0) = 10 (Check recording)
         * => 0/1 = 0, 0/2 = 0, but x/0, y/0 = undefined
         * 
         * => GCD(10000, 80000) => Will take too much time
         * Q. How can we reduce the number to reduce the time?
         * => GCD(a, b) = k, a>b
         * Q. Can we say? 
         * => k/a and k/b
         * Q. Can we also say? 
         * => k/(a-b)
         * => a= k-x and b = k-y
         * => a-b = k(x-y)
         * => k/(a-b)
         * => k is able to divide: a, b, a-b
         * 
         * So, can we say:
         * => gcd(a, b) = gcd(b, a-b) = gcd(a, a-b) = k
         * 
         * gcd(24, 30) = 6
         * => 6/24 and 6/30
         * => 24 = 6.x and 30 = 6.y
         * => 30-24 = 6(x-y)
         * 
         * gcd(a, b) = gcd(b, a-b) = If value is not greater then we can swap the value.
         *   k       =     k
         * => Both are equal.
         * => gcd(24, 6) => First write the smaller value and then their difference.
         * => gdc(6, 18) => Minimum value and difference
         * => gcd(6, 12) => Minimum value and difference
         * => gcd(6, 6)  => Minimum value and difference
         * => ....
         * 
         * 
         * 
         * Q. Which two pair will give you the minimum?
         * => gdc(a, b) = gcd(b, a-b)
         *  
         * 
         * gcd(1000, 1) => Minimum and differences
         * gcd(1, 999)  => Minimum and differences
         * gcd(1, 998)  => Minimum and differences
         * .....
         * .....
         * 
         * => To much time taking, we need to improve on this.
         * 
         * gcd(10, 105) 
         * (10, 95)
         * (10, 85)
         * (10, 75)
         * ....
         * ....
         * (10, 5) => Now minimum element will change after 5
         * (5, 5)
         * 
         * gcd(10, 107)
         * (10, 97)
         * (10, 87)
         * ....
         * ....
         * (10, 7) => We can improve here
         * (7, 3) => Minimum and difference (min = 7, diff = 10-7 = 3)
         * (3, 4)
         * (3, 1)
         * (2, 1)
         * (1, 1)
         * 
         * 
         * gcd(10, 20287)
         * (10, 20277)
         * ...
         * ...
         * (10, 7)
         * 
         * gcd(26, 3)
         * (23, 3)
         * (20, 3)
         * (17, 3)
         * (14, 3)
         * (11, 3)
         * (8, 3)
         * (5, 3)
         * (2, 3)
         *=> We can say: gcd(26, 3) = gcd(3, 26%3)
         *
         * One more formula:
         * => gcd(a, b) = gcd(b, a%b) (TC: log(max(a, b))) 
         *
         * gcd(10, 107)
         * (10, 7)
         * (7, 3)
         * (3, 1)
         * (1, 0)
         * 
         * gcd
         * 
         * => Pattern: Repeated subtraction => 26 -3 -3 -3 -3....
        */
    }
}
