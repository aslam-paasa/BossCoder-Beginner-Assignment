package _25_Hashing;

import java.util.ArrayList;

public class _16_HeapConstructor {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        /**
         * Custom Constructor jo humein saara data ek saath sort kr k dega
         * Issue: for-loop TC : O(n logn) kr de rha, but humein TC: O(n)
         *        m chaiye.
         * 
         * Q. How does downheapify reduce the time complexity?
         * => Jb hum repeatedly add() fn ko call krte hai to baar baar
         *    heapify operation hota hai, jo ki O(logn) TC leta hai,
         *    isliye agar hum "n" elements ko add krte hai, to total
         *    time complexity O(n logn) ho jaata hai.
         * => Lekin agar hum sbse pehle saare elements ko array m daal
         *    dete hai, phir non-leaf node se start krke downheapify 
         *    operation krte hai to har node ko sirf ek baar visit krna
         *    pdta hai, isse TC O(n) ho jaata hai.
         * => Downheapify ka kaam hai, root node se start krke, har node
         *    ko apne child nodes k saath compare karna, aur agar zaroorat
         *    ho to swap krna, isse heap property maintain rehti hai.
         * => Toh, downheapify se hm time complexity ko kam kar skte hai
         *    kyuki hum har node ko sirf ek baar visit krte hai, aur har
         *    operation constant time me hota hai.
        */
        public Heap(int[] inputArr) {

            /**
             * TC: O(n logn)
            */
            // for(int num : inputArr) {
            //     add(num); // custom fn
            // }

            /**
             * Change it to add all values in O(n) instead ofO(n logn)
            */
            for(int num : inputArr) {
                add(num); // add all elements to the array
            }

            /**
             * Start from the last non-leaf node and perform downheapify
            */
            for (int i = arr.size() / 2 - 1; i >= 0; i--) {
                downheapify(i);
            }

        } 

        /**
         * 1. add(): O(logn), 
         * => Because ek tree k andr 'n' nodes hai to logn levels honge
        */
        public void add(int data) {
            // add at last index
            arr.add(data);
            upheapify(arr.size() - 1);
        }

        /**
         * 1.1 upheapify:
        */
        public void upheapify(int i) {
            int childIdx = arr.size() - 1; // x is child index
            int parentIdx = (childIdx - 1)/2; // parent index

            // O(logn)
            while(arr.get(childIdx) < arr.get(parentIdx)) {
                // swap
                int temp = arr.get(childIdx);
                arr.set(childIdx, arr.get(parentIdx));
                arr.set(parentIdx, temp);

                childIdx = parentIdx;
                parentIdx = (childIdx - 1) / 2;
            }
        }

        /**
         * 2. peek(): O(1)
        */
        public int peek() {
            return arr.get(0);
        }


        /**
         * 3. remove(): O(logn)
        */
        public int remove() {
            int data = arr.get(0); // remove root data

            // step-1 : swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            // step-2: delete last
            arr.remove(arr.size()-1);

            // step-3: heapify
            downheapify(0);
            return data;

        }

        /**
         * 3.1. downheapify():
         * => fix the heap
        */
        private void downheapify(int i) {
            int leftChild = 2*i+1;
            int rightChild = 2*i+2;
            int minIdx = i; // root is minVal of idx

            if(leftChild < arr.size() && arr.get(minIdx) > arr.get(leftChild)) {
                minIdx = leftChild;
            }

            if(rightChild < arr.size() && arr.get(minIdx) > arr.get(rightChild)) {
                minIdx = rightChild;
            }

            if(minIdx != i) {
                // swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                downheapify(minIdx); // recursive call
            }
        }

        /**
         * 3.2. fn to check is heapify empty
        */
        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }
    public static void main(String[] args) {
        /**
         * Heap Sort: O(n logn)
         * Hum ek constructor bnana chahte hai jisme ye array pass 
         * kr de, to saara data ek saath mil jaega.
        */
        int[] inputArr = {5, 15, 2, 22, 37, 92, 81, 47};

        Heap pq = new Heap(inputArr);
        
        while(!pq.isEmpty()) {
            System.out.print(pq.peek() + " ");
            pq.remove();
        }
    }
}
