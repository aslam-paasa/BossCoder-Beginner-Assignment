package _24_NumberSystemAndBitManipulation;

public class _16_UpdateIthBit {
    public static void main(String[] args) {
        /**
         * Update ith bit:
         * => Either val = 0 or 1 is provided.
         * => ith position is also provided.
         * 
         * => Humein btaya jaega ki ith position pe 0 daalna hai ya 1.
         * => Humein ye v btaya jaega ki ith bit ko "clear/set" krna hai.
         * */ 
    }

    public static int updateIthBit(int n, int i, int newBit) {
        if(newBit == 0) {
            return clearIthBit(n, i);
        } else {
            return setIthBit(n, i);
        }
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int setIthBit(int n, int k) {
        int mask = 1 << k;
        int ans = n | mask;
        return ans;
    }
}
