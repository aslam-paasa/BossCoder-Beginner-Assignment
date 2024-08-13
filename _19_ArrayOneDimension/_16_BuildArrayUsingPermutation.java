package _18_ArrayOneDimension;

public class _16_BuildArrayUsingPermutation {
    public static void main(String[] args) {
        int[] nums = { 0, 2, 1, 5, 3, 4 };
        int n = nums.length;
        int[] ans = new int[n];

        for(int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
            System.out.print("For: " + i + "\n" + "Index: " + nums[i] + ", " + "Value: " + ans[i] + "\n");
            System.out.println();
        }
    }
}
