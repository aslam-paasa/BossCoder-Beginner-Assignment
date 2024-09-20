// https://leetcode.com/problems/rotate-array/description/
package _23_ArrayOneDimension;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _27_RotateArray {
    //  0 1 2 3 4 5 6
    // [1 2 3 4 5 6 7]
    //        | After rotating by k = 2
    //        V
    //  0 1 2 3 4 5 6
    // [6 7 1 2 3 4 5]

    // We will be given an input number "N" and we will have N numbers following it as the input.
    // We are also given as integer K. We have to rotate an array K values to the right if K is positive and K values to the left if K is negative.
    // If K = 0, do not rotate the array.
    // The meaning of rotation is something you need to figure out on your own from the example shown above.

    // Approach :
    //       0 1 2 3 4 
    // k=0  [1 2 3 4 5]

    //       0 1 2 3 4 
    // k=1  [5 1 2 3 4]

    //       0 1 2 3 4 
    // k=2  [4 5 1 2 3]

    //       0 1 2 3 4 
    // k=3  [3 4 5 1 2]

    //       0 1 2 3 4 
    // k=4  [2 3 4 5 1]

    //       0 1 2 3 4 
    // k=5  [1 2 3 4 5]

    // The first array is the original array which has not been rotated even once. Hence, k=0.
    // The second array has been rotated once and third array twice and so on.
    // Did you notice something strange? The first and the last array in the example loop the same. 
    // This is the thing that we wanted you to notice and meditate about.
    // The size of array is 5. So, it can be rotated only (5-1)=4 times.
    // On the fifth rotation, it turns back to the original array. So, can you guess what wull happen when we rotate this array the sixth time?
    // Yes, it will be the same as if we have rotated it for the first time.
    // Why is that so?
    // This is happening because 6 on dividing by 5 gives 1 as the remainder.
    // So, rotating 6 times is the same as rotating an array only 1 time.

    // What happens if we rotate this array 103 times?
    // You will calculate (103 % 5) which is 3 so rotating an array 3 times is the same.
    // We analyzed these rotations to understand that we can reduce the number of rotations to a great extent by taking (k % n) where k is the number of rotations given and n is the size of an array.
    
    // Now we have discussed the reduction in the number of rotations of the array when k>0 but we have not discussed what would happen if k is negative.
    //        0 1 2 3 4 
    // k=0   [1 2 3 4 5]

    //        0 1 2 3 4 
    // k=-3  [5 1 2 3 4]

    // In the above example, we have shown the rotation of the array by -3 rotations.
    // Does that look similar to you? Yes! the array that we get after 2 rotations. 
    // This means that whenever we get a negative rotation we will add our array's size to it and we will perform that many rotations.
    
    // But what about the negative rotations which are larger than the size of the array?
    // For example, if we are given to rotate an array by -103, how will we proceed to this?
    // We will firstly reduce the number of negative rotations by calculating (K % n) where k is the number of rotations given to us and "n" is the size of the array.
    // After that, we will add size of it and we will perform that many rotations.

    // k = -103
    // k = k % n => -103 % 5 => -3
    // Now k = K + n => -3 + 5 => 2
    
    //       0 1 2 3 4 
    // k=0  [1 2 3 4 5]
    //           |
    //           V
    //       0 1 2 3 4 
    // k=2  [4 5 1 2 3]

    // Now that we have talked about the reduction in the number of rotations we have to understand that
    // If the size of an array is "n" then, any guven value of "k" can be reduced to only 0 to n-1 rotations.

    // Now let's come to the main algorithm. We now know that we have to handle only a few cases but, how to rotate an array?
    // Reference : Reverse an Array

    // k = -103
    // k = k % n => -103 % 5 => -3
    // Now k = K + n => -3 + 5 => 2

    //       0 1 2 | 3 4 
    // k=0  [1 2 3 | 4 5]
    //      Reverse| Reverse
    //           |
    //           V
    //       0 1 2 3 4 
    // k=2  [3 2 1 5 4]
    //        Reverse

    //       0 1 2 3 4 
    //      [4 5 1 2 3]
    
    // We divided the array into two parts.
    // One is from (0 to n-k-1) where n is the size of the array and k is the number of reduced rotations.
    // Here k is not the number of reduced rotations.
    // Here k is not the original number of rotations given to us but the reduced number to which we have converted it using the method discussed above.
    // The second part of the array is from (n-k to n-1), n and k meaning same.
    // We reverse the first part and second part in place in the array separately and then we reverse the entire array to get our rotated array.
    // And this is the complete provideure for rotating an array.


    // Pseudo Code :
    // 1) Deciding K value : If the value of K is positive, K = K % N where N is the length of the input array.
    //    If the value of K is negative, K = K % N + N.

    // 2) Reverse Parts of Array : After we have calculated the value of K, reverse the first part of the array i.e. from 0 to N-K-1 and the second part from N-K to N-1 separately.

    // 3) Reverse the entire Array : Now, reverse the entire array i.e. from o to N-1. The array will be rotated according to the value of K.

    // Time Complexity :
    // O(n) 
    // This is because we have to traverse the array and its parts to reverse it.
    // So, the time complexity for reversing the array and its parts will be O(n) + O(n) + O(n) = O(n)

    // Space Complexity :
    // O(1) -> As we have not used any extra space
    
    // Method to display array elements
    public static void display(int[] a) {
      StringBuilder sb = new StringBuilder();
      for (int val : a) {
          sb.append(val).append(" ");
      }
      System.out.println(sb);
  }

    // 1) Method to reverse elements of an array from 'left' to 'right' index
    public static void reverse(int[] a, int left, int right) {
        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
    }

    // 2) Method to rotate array elements by 'k' positions
    public static void rotate(int[] a, int k) {
      k = k % a.length; // Reduce rotations if larger than array length
      if (k < 0) {
          k += a.length; // Convert negative rotations to positive
      }

      // This code works for k >= 0 and k < a.length
      // Reverse the first part of the array
      reverse(a, 0, a.length - k - 1);
      // Reverse the second part of the array
      reverse(a, a.length - k, a.length - 1);
      // Reverse the entire array
      reverse(a, 0, a.length - 1);
  }

    public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      // Input size of array
      int n = Integer.parseInt(br.readLine());
      int[] a = new int[n];

      // Input array elements
      for (int i = 0; i < n; i++) {
          a[i] = Integer.parseInt(br.readLine());
      }

      // Input number of rotations
      int k = Integer.parseInt(br.readLine());

      // Rotate the array
      rotate(a, k);

      // Display the rotated array
      display(a);
    }

}

// Output :
// 5
// 1
// 2
// 3
// 4
// 5
// 2