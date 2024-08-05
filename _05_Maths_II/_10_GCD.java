package _05_Maths;

import java.util.Scanner;

public class _10_GCD {
    public static void main(String[] args) {

        /**
         * Q. Given an array of integers. Find the GCD of min and max elements?
         * => GCD/HCF -> Greatest Common Divisor
         * 
         * Q. How to find GCD of a number?
         * (1) GCD(24, 30)
         * => 24 = 1, 2, 3, 4, 6, 8, 12, 24
         * => 30 = 1, 2, 3, 5, 6, 10, 15, 30
         * => Common Divisor: 1, 2, 3, 6
         * => Greater Common Divisor: 6
         * 
         * Note: We have to prove formula in interview.
         * 
         * (2) GCD(5, 20)
         * => 5 = 1, 5
         * => 20 = 1, 2, 4, 5, 10, 20
         * => Common Divisor: 1, 5
         * => Greatest Common Divisor: 5
         * 
         * (3) GCD(10, 10)
         * => 10 = 1, 2, 5, 10
         * => 10 = 1, 2, 5, 10
         * => Greatest Common Divisor = 10
         * => So, based on this example, can we say:
         * Formula-1: GCD(a, a) = a
         * 
         * (4) GCD(10, 0)
         * => 10 = 1, 2, 5, 10
         * => 0 = 1
         * Note: x/0 => means 0 cannot divide anything, but everybody can divide 0
         * (0/1=>0, 0/2=>0, ...)
         * => GCD = 1, 2, 3, 4, 5, 6, ...... infinity (means 0 is divided by everybody,
         * but 0 cannot divide anybody)
         * => GCD = 10
         * => So, based on the example, we can say:
         * Formula-2: GCD(a, 0) = a
         * 
         */

        /**
         * Q. How to calculate bigger number?
         * => GCD(10000, 80000)
         * => Our objective is, somehow if we reduce these numbers then it will be
         * easier for us to calculate the answer.
         * 
         * Q. How to reduce these bigger numbers?
         * => Formula: GCD(a, b) = k, where a >= b
         * 
         * => Can we say :
         * (a) 'k' divides 'a' => k/a
         * (b) 'k' divides 'b' as well => k/b
         * (c) We can also say => k/(a-b)
         * 
         * Q. How can we say "k/(a-b)"? Show example.
         * => We can say : a = k.x, where x = some integer
         * => We can also say : b = k.y, where y = some integer
         * => We can also say : a-b = k(x-y) [subtracting both sides]
         * => So, for that: k/(a-b)
         * Note: a=(k.x), b=(k.y) => kx-ky => k(x-y) => (a-b)
         * 
         * Note: k = a, b, a-b
         * => We can say : GCD(a,b) = GCD(b,a-b) = GCD(a,a-b) = k ('k' is dividing all
         * these things, & all are less than 'a')
         * => And our objective was to minimize the value. (make a & b as small as
         * possible)
         * => For that, we will try to avoid 'a', then we will get : GCD(a,b) = GCD(b,
         * a-b) (means (a,b) is written as (b, a-b))
         * 
         * Formula: GCD(a,b) = GCD(b, a-b)
         * => We will be able to minimize the value, so we can find answers easily
         * 
         * Example: GCD(24, 30) = 6
         * => k/a and k/b
         * => 6/24 and 6/30
         * => 24 = 6.x and 30 = 6.y, where x=4, y=5
         * => 30-24 = 6(y-x)
         * => 30-24 = 6(5-4)
         * => 6 = 6
         * 
         * Note: At some point, we will reach a stage where both number get equal, for
         * that we have another formula:
         * => GCD(a,a) = a
         * => GCD(a, 0) = a
         * 
         */

        /**
         * Example of GCD: TC: O(n)
         * 1. GCD(30, 24), where a>= b (If a is not greater than swap the value)
         * => GCD(a, b) = GCD(b, a-b)
         * => (a) First write smaller number
         * (b) Second write the differences
         * => GCD(smallerNum, Differences)
         * => GCD(24, 6)
         * => GCD(6, 18)
         * => GCD(6, 12)
         * => GCD(6, 6) => Apply formula: GCD(a, a) = a i.e. 6
         * => 6 ans.
         * 
         * 2. GCD(1000, 1) => TC: O(N)
         * => (1, 999)
         * => (1, 998)
         * => ....
         * => ....
         * => (1, 1) => 1
         */

        /**
         * Q. How to reduce calculation?
         * (1) GCD(10, 105)
         * => (10, 95)
         * => (10, 85)
         * => ....
         * => ....
         * => (10, 5)
         * => (5, 5) => 5
         * 
         * 
         * (2) GCD(10, 107)
         * => (10, 97)
         * => (10, 87)
         * => ....
         * => ....
         * => (10, 7)
         * => (7, 3)
         * => (3, 4)
         * => (3, 1)
         * => (2, 1)
         * => (1, 1) => 1
         * 
         * (3) GCD(10, 20287)
         * => (10, 20277)
         * => ....
         * => ....
         * => (10, 7)
         * 
         * Q. Can we see any pattern here?
         * => Remainder of 'a' & 'b'
         * 
         * => gcd(26, 3)
         * (23, 3)
         * (20, 3)
         * (17, 3)
         * (14, 3)
         * (11, 3)
         * (8, 3)
         * (5, 3)
         * (2, 3)
         * => Pattern: Repeated subtraction => 26 -3 -3 -3 -3....
         * => We can say: gcd(26, 3) = gcd(3, 26%3)
         *
         * One more formula: (VVI)
         * => gcd(a, b) = gcd(b, a%b) (TC: log(max(a, b)))
         * 
         * Example:
         * => gcd(10, 107)
         * (10, 7)
         * (7, 3)
         * (3, 1)
         * (1, 0)
         * 
         * => GCD(18, 12)
         * (12, 6)
         * (6, 0)
         * 6
         * 
         * => gcd(10000, 200)
         * (200, 0)
         * 200
         * 
         * => gcd(1, 999)
         * (1, 0)
         * 1
         * 
         * => gcd(1076, 1078)
         * (1076, 2)
         * (2, 0)
         * 2
         */

        /**
         * Pseudo Code:
         * => while(b != 0) {
         * temp = b
         * b = a % b
         * a = temp
         * 
         * if(b > a) {
         * swap(a, b);
         * }
         * }
         * return a;
         */
        {
            Scanner scan = new Scanner(System.in);
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();

            // hume n1 aur n2 milgye hai
            int divisor = n1;
            int divident = n2;

            while (divident % divisor != 0) {
                int temp = divisor;
                int remainder = divident % divisor;
                divisor = remainder;
                divident = temp;
            }
            int gcd = divisor;
            // n1*n2=gcd*lcm
            int lcm = (n1 * n2) / gcd;

            System.out.println(gcd);
            System.out.println(lcm);
        }
    }
}
