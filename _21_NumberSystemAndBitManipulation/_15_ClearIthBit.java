package _21_NumberSystemAndBitManipulation;

public class _15_ClearIthBit {
    public static void main(String[] args) {
        /**
         * Clear ith bit:
         * => ith position pe jo v ho, humein usse clear krna hai
         * => It means humein usse 0 bnana hai.
         * 
         * 10 = 1 0 1 0
         *        |
         *        V
         *      1 0 0 0
         * 
         * => Iske liye humein aise bitmark use krni hai jo ith position ko affect kre.
         * => Left Shift (1 << i) => 0 0 1 0
         * => Aur iss left shift ko hum reverse kr denge.
         * 
         * 10 = 1 0 1 0
         *    => ~(1 << i) = ~(0 0 1 0)
         *                 =   1 1 0 1
         * 
         * =>   1 0 1 0
         *    & 1 1 0 1
         *    +--------+
         *      1 0 0 0 => 8
         * */ 

        System.out.println(clearIthBit(10, 1));
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }
}
