package _16_ArrayOneDimension;

public class _12_InternalStaticArrayWorking {
    public static void main(String[] args) {
        
        /**
         *  Internal Static Array Working:
         * +-----------------------------+
         * arr = [2,    5,    1,    0,    9]
         * adr => 200   204   208   212   216 
         * 
         * => arr[idx] = Base Address + idx * size of datatype
         *    arr[4] = 200 + 4 * 4 (int size: 4 bytes)
         *           = 216 => 9
         * 
         * => For 4th idx we will go directly to 216 memory address: 9 is stored.
         * 
         * Note: 
         * => Compiler will not store all these addresses, it will only store the base address.
         * => Based on the Base Address + index, it calculates other addresses, whichever index we
         *    want to jump to.
         * => These are things which compiler do at the backend.
         * => Our job is only to provide the index.
         * => We learning it to understand how compiler is doing all these things in O(1).
         * 
         * 
         * Advantages of Array:
         * 1. Reduces Redundancy
         * 2. Random acces in O(1)
         * 
         * 
         * Disadvantages of Array:
         * 1. Fixed Size
         * 2. Only homogenous data (only same type of data)
         * 3. Fragmentation
         * 
         * [2GB, 3GB, 2GB, 1GB, 3GB]
         * => Total space available: 7GB
         * => Arrays are contiguous, we cannot break it in middle.
         * => So, even though we have 7GB space available, we cannot save even 4GB of data.
        */
    }
}
