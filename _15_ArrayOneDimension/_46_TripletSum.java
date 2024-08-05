package _15_ArrayOneDimension;

public class _46_TripletSum {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 30, 00, 40, 40, 60, 70 };
        int sum = 80;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == sum) {
                        System.out.println(arr[i] + "," + arr[j] + "," + arr[k]);
                    }
                }
            }
        }
    }
}