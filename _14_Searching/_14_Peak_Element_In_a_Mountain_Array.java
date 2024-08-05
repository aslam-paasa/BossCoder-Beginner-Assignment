package _14_Searching;

public class _14_Peak_Element_In_a_Mountain_Array {
    public static void main(String[] args) {
        /**
         * Peak Element in a mountain array:
         * => Mere paas ek array hai jiske andr bahut saare elements hai:
         *    arr = [0, 10, 5, 2]
         *           0  1   2  3
         * => Agar isse plot kre to mountain k tarah plot ho rha hai.
         *    Mujhe find out krna hai isme peak element kn sa hai.
         * => Binary Search avi nhi lgega qki sorted nhi hai.
         * 
         * Approach-1: Linear Search
         * => Linear Search lga k max element find out kr le and TC: O(n).
         * 
         * Approach-2: Binary Search:
         * => Peak Element means koi element apne piche wale element se bda ho
         *    aur apne aage wale element se v bda ho.
         * => But pehle sorted honi chaiye.
         * => Hum notice krnge ki 0-10 tk sorted hai increasing order m, but 10-2
         *    tk sorted hai decreasing order mai. To inn dono lines k upar m
         *    kahi na kahi binary search apply kr skte hai.
         * 
         * => Pehle mid findout krte hai:
         *    start = 0
         *    end = 3
         *    mid = (0 + 3) / 2 => 1
         * 
         *           s  mid    e
         *    arr = [0, 10, 5, 2]
         *           0  1   2  3
         * 
         * => Mai aisi kn si condition lagau ki mujhe pta chle ki increasing
         *    order m khada hu ya decreasing order mai.
         *    (a) increasing order: arr[i] < arr[i+1]
         *    (b) decreasing order: arr[i] > arr[i+1]
         *    (c) Peak Element: arr[i-1] < arr[i] > arr[i+1]
         * 
         * Note: Agar mai kahi likhta hu ki arr[mid] > arr[mid+1]. Ye same 
         *       condition decreasing side ki hai. Aur isi condition k andr
         *       humaare peak element aa skta hai.
         * Note: Aur agar mai likhu arr[mid] < arr[mid+1], to ye increasing side
         *       ki line show kr rha hai. Iss condition k peak element nhi
         *       ho skta qki arr[mid] chota hai arr[mid+1] se. Aur peak element
         *       kisi chota nhi hota hai. To arr[mid] peak element ho hi nhi
         *       skta. So, arr[mid] is not a peak element.
         * => When arr[mid] is greater than arr[mid+1], that is peak element.
         * 
         * Do dry run:
         * 1. Iteration-1:
         *        s        e
         * arr = [0, 2, 1, 0]
         *        0  1  2  3
         * => start = 0
         * => end = 3
         * => mid = (0+3)/2 => 1
         * 
         * while(start < end) <= Agar aisa hai tabhi mai loop m jaunga
         * Otherwise, return start.
         * 
         * 2. Iteration-2:
         *        s        e
         * arr = [0, 2, 1, 0]
         *        0  1  2  3
         * => start = 
         * */ 

        int[] nums = {0, 2, 1, 0};
        int start = 0;
        int end = nums.length - 1;
        int mid = start + (end - start) / 2;

        while(start < end) {
            if(nums[mid] < nums[mid+1]) {
                // right search
                start = mid + 1;
            } else {
                end = mid;
                break;
            }
            mid = start + (end - start) / 2;
        }
        System.out.println(mid);
    }
}
