package _23_ArrayOneDimension;

public class _56_MoveNegativeToLeftSide {
    public static void main(String[] args) {
        /**
         * Move all the negative number to the left side of an array:
         * Input: [1, 2, -3, 4, -5, 6]
         * 
         * Note: Jb hm move krnge to humein order maintain krne ki koi jarurat nhi hai.
         * 
         * Approach:
         * 1. Sort the array (Naive Approach)
         * => TC: O(n logn)
         * 
         * 2. 2-Pointer Approach/Dutch National Flag Algorithm:
         * => Hum 2 pointer/indexes rkhngeL (a) low, (b) high
         * => low will maintain negative numbers & high will maintain
         *    positive numbers.
         * => Means hm kuch in-place shuffling type krnge aur humein
         *    humaari output mil jaegi.
         * 
         *  0  1   2  3   4  5
         * [1, 2, -3, 4, -5, 6]
         *  l                h
         * 
         * => Agar humaari 'low' ka number pehle se hi negative pda hai
         *    to humein kuch nhi krna aur pointer/index ko ++ kr dena hai.
         * 
         *    if(arr[low] < 0) {
         *       low++;
         *    }
         * 
         * => But high greater than 0 hai means high pe pehle se positive
         *    number pda hai to high++ kr dena hai.
         * 
         *    else if(arr[high] > 0){
         *       high--;
         *    }
         * 
         * => Aur agar aisa nhi hai, means high pe v kuch nhi hai aur low pe
         *    v kuch nhi hai to swap kr dena hai. Means left pe ek positive
         *    number pda hoga aur right pe ek negative number pda hoga to
         *    humein unko swap kr dena hai.
         * 
         *    else {
         *       swap(arr[low], arr[high)
         *    }
         * 
         * [1, 2, -3, 4, -5, 6]
         *  l                h
         * 
         * [1, 2, -3, 4, -5, 6]
         *  l             h
         * 
         * [-5, 2, -3, 4,  1, 6]
         *   l             h
         * 
         * [-5, 2, -3, 4, 1, 6]
         *      l         h
         * 
         * [-5, 2, -3, 4, 1, 6]
         *      l      h
         * [-5, 2, -3, 4, 1, 6]
         *      l   h
         * [-5, -3,  2, 4, 1, 6]
         *       l   h
         * [-5, 2, -3, 4, 1, 6]
         *          l
         *          h  => while(l < h) => Stop
         * 
         * TC: O(n)
         * SC: O(1) => Koi new extra space nhi liye
         * 
         * Note: Similar question, Sort 0's & 1's
         * */ 

        int[] arr = {1, 2, -3, 4, -5, 6};
        int n = arr.length;

        /**
         * Calling function:
        */
        moveAllNegativeToLeft(arr, n);

        /**
         * Printing the function:
         * */
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        
    }

    public static void moveAllNegativeToLeft(int[] arr, int n) {
        /**
         * Dutch National Flag Algorithm:
         * */
        int low = 0; 
        int high = arr.length - 1;

        while(low < high) {
            if(arr[low] < 0) {
                low++;
            } 
            else if(arr[high] > 0) {
                high--;
            }
            else {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp; 
            }
        }
    }
}
