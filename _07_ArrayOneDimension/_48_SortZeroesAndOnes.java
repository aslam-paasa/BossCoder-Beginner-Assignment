package _07_ArrayOneDimension;

public class _48_SortZeroesAndOnes {
    public static void main(String[] args) {
        /**
         * Sort 0's and 1's: 
         * => Input: [0, 1, 1, 0, 1, 0, 1, 0, 0]
         * => Output:[0, 0, 0, 0, 0, 1, 1, 1, 1]
         * 
         * Solve using Two Pointer Approach:
         *     i
         * => [0, 1, 1, 0, 1, 0, 1, 0, 0]
         *     s                       e
         * => Start pr 0 rkh dena aur end par 1 rkh dena.
         * => Ek aur pointer hai 'i' jispe 0 pda hua hai, to 0 mujhe start
         *    par rkhna tha:
         *    if(arr[i] == 0) {
         *       swap(arr[i], arr[start])
         *       i++;
         *       s++;
         *    }
         * => Ab 'i' k andr '1' pda hai, to hm bolnge, jisse '1' end m chla jaega:
         *    if(arr[i] == 1) {
         *       swap(arr[i], arr[end])
         *       i++;
         *       e--;
         *    }
         * => Note: Maine avi tk start ko aage nhi bdhaya, sirf i++ kiya hai.
         * */ 

        int[] arr = {0, 1, 0, 1, 1, 0, 1, 0, 1, 1};

        int start = 0;
        int end = arr.length-1;
        int i = 0;

        while(start <= end) {
            if(arr[i] == 0) {
                /**
                 * swap from left
                 * */ 
                int temp = arr[i];
                arr[i] = arr[start];
                arr[start] = temp;
                i++;
                start++;
            }
            else if(arr[i] == 1) {
                /**
                 * swap from right
                 * */ 
                int temp = arr[i];
                arr[i] = arr[end];
                arr[end] = temp;
                /**
                 * i++ nhi hoga qki start ith index pe '1' hai
                 * Jbtk arr[i] == 0 se swap nhi hoga tbtk i++ nhi hoga
                */
                end--;
            }
            else {
                i++;
            }
        }

        /**
         * Print the array:
         * */ 
        for(int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}