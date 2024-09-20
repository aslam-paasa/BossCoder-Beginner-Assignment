package _22_Searching;

public class _11_LastOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 9};
        int target = 7;

        int start = 0;
        int end = arr.length - 1;

        int ans = -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                // ans store
                ans = mid;
                // right search 
                start = mid + 1;
            } else if(target < arr[mid]) {
                // left search
                end = mid - 1;
            }
            else if(target > arr[mid]) {
                // right search
                start = mid + 1; 
            } 
        }
        System.out.println("Last Occurrence of target-7 found at index: " + ans);
    }
}
