package _11_Maths;

public class _11_SumOfArrayIsZero {
    public static void main(String[] args) {
                /**
         * Q. Given a number N, create an array of size N, such that sum of array elements = 0
         *    All Elements should be unique.
         * 
         * => N = 4
         * => ans = [6, -9, 1, 2]
         * => Output: 0
         * 
         * => Approach:
         * => To make sure every time sum is 0, we have to make sure whenever we insert 1, we can balance it out by inserting -1.
         * => Like this we can keep on going.
         * => But if the size of array is odd then at the end, insert 0.
         * => Example: 1,-1,2,-2,3,-3,4,-4,5,-5,0 (All elements are unique)
         * 
         * Approach-2 => 
         * => If the size of array is 5, then add first 4 elements as: 1, 2, 3, 4.
         * => And the last number will be the sum of first 4 elements in negative => -10
         * */ 

    }
}
