package _21_NumberSystemAndBitManipulation;

public class _12_GetIthBit {
    public static void main(String[] args) {
        
        /**
         * Get ith Bit:
         * => 1 0 0 0 1 0 0 1 1 0 0 
         * => Humein btana hai ki ith bit 0 h ya 1.
         * 
         * => 0 0 0 0 1 1 1 1
         * => If i=2, to humein harr jagha 0 chaiye aur sirf 'i' position pe 1 chaiye.
         * => So, this number is basically 1 << 2 (1 << i)
         * 
         * =>   0 0 0 0 1 1 1 1
         *    & 0 0 0 0 0 1 0 0
         *    +----------------+
         *      0 0 0 0 0 1 0 0 => ith bit = 1
         * */ 

        System.out.println(getIthBit(10, 2));
    }

    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;

        if((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
