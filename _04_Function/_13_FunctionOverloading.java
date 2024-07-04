package _04_Function;

public class _13_FunctionOverloading {
    public static void main(String[] args) {
        
        /**
         * Function Overloading:
         * => Multiple functions with the same name but different parameters.
         * 
         * Calculator:
         * => multiply(int a, int b)
         * => multiply(float a, float b)
         * => multiply(double a, double b)
         * 
         * Note: Function name same h qki inka kaam similar hai, but inke type of parameters
         *       alag hai.
         * */ 

        System.out.println(sum(3, 5));
        System.out.println(sum(4, 5, 6));

        System.out.println(add(3, 5));
        System.out.println(add(3.2f, 4.8f));
    }

        /**
         * +----------------------------------------+
         * | Function Overloading using Parameters: |
         * +----------------------------------------+
         * 
         * 1. f1: sum of 2 no.
         * 
         *    int sum(int a, int b) {
         *       return a + b;
         *    }
         * 
         * 2. f2: sum of 3 no.
         * 
         *    int sum(int a, int b, int c) {
         *       return a + b + c;
         *    }
         * 
         * 3. int sum(int a, int b);
         *    float sum(int a, int b);
         * => Error! Function Overloading sirf type of parameter ya no. of parmeters
         *    ko dekhta hai. Uska return type i.e. int/float se koi lena dena nhi hai.
         * => Agar return type (int/float) alag hai but parameter same hai, fir v Java 
         *    dono function ko same maanega aur error de dega.
        */

    // function to calculate sum of two nums
    public static int sum(int a, int b) {
        return a + b;
    }

    // function to calculate sum of three nums
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }


    /** +----------------------------------------+
     *  | Function Overloading using Data Types: |
     *  +----------------------------------------+
     * 1. f1: add 2 int val
     * 
     *    int sum(int a, int b) {
     *       return a + b;
     *    }
     * 
     * 2. f2: add 2 float val
     * 
     *    float sum(float a, float b) {
     *       return a + b;
     *    }
     * 
     * */ 

    // function to calculate int sum
    public static int add(int a, int b) {
        return a + b;
    }

    // function to calculate float sum
    public static float add(float a, float b) {
        return a + b;
    }

}
