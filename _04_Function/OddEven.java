package _04_Function;

public class OddEven {
    public static void main(String[] args) {
        
        /**
         * Q. Write a function of odd-even?
         * => 2 divisible numbers are even number.
         *    (a) user input: N
         *    (b) if(N % 2 == 0) {
         *           print "even"
         *        } else {
         *           print "odd"
         *        }
         * */ 
        
        int n = 10;
        boolean isEven = checkEven(n);

        if(isEven == true) {
            System.out.println(n + " is even number");
        } else {
            System.out.println(n + " is odd number");
        }
    }

    public static boolean checkEven(int n) {
        if(n % 2 == 0) {
            return true; // it's an even no
        } else {
            return false; // it's an odd number
        }
    }
}
