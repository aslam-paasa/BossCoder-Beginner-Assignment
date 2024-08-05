package _15_ArrayOneDimension;

import java.util.Scanner;

public class _22_DifferenceOfTwoArrays {
    // Difference of two arrays :
    // Isme btaya gya h ki "n2" array bda hai (badi value h)
    // n2 = [9 5 2 3 6]
    // "n1" value small m 
    // n1 = [ 9 1 7 8]
    // Humein n2 m se n1 minus krna h aur jo answer aaega wo n2 jitna bda hoga

    //                -1
    // n2 =  [9  5  2  3  6]
    // n1 = - [  9  1  7  8]
    // diff =[            8]

    // 6-8 = -2 => Positive hota to thk tha lekin negative h to usme 10 add kr do, aur 10 add krne k liye apne bagal wale pe -1 carry chadha do
    // Qki aage wale se jb 1 kam hota h tb humein 10 value milta hai
    // Now, 10-2 = 8

    //             -1 -1
    // n2 =  [9  5  2  3  6]
    // n1 = - [  9  1  7  8]
    // diff =[            8]

    // Ab carry phle settle kr lo -> 3 -1 => 2
    // Ab 2 m se 7 minus kro => -5
    // Fir carry chadha denge -1
    // Fir 10 - 5 => 5

    //             -1 -1
    // n2 =  [9  5  2  3  6]
    // n1 = - [  9  1  7  8]
    // diff =[         5  8]

    // Fir Carry ko phle hataenge -> 2 -1 => 1
    // Next wale digit m carry 0 rhega qki 0 is valid value
    // Fir 1 - 1 => 0

    //           0 -1 -1
    // n2 =  [9  5  2  3  6]
    // n1 = - [  9  1  7  8]
    // diff =[      0  5  8]

    // Fir carry hataenge -> 5 - 0 => 5
    // Fir 5 - 9 = -4
    // Bagal wale digit m -1 chadaenge aur 10 - 4 => 6

    //       -1  0 -1 -1
    // n2 =  [9  5  2  3  6]
    // n1 = - [  9  1  7  8]
    // diff =[   6  0  5  8]

    // Fir phle carry hataenge -> 9 -1 => 8
    // Digits khtm ho gyi to end ho jaega

    //       -1  0 -1 -1
    // n2 =  [9  5  2  3  6]
    // n1 = - [  9  1  7  8]
    // diff =[8  6  0  5  8]

    //       -1  0 -1 -1
    // n2 =  [9  5  2  3  6]
    // n1 = - [  9  1  7  8]
    // diff =[   6  0  5  8]

    // Lekin ek problem print krne m
    // 9 9 9 9 9
    // 9 9 8 5 4 
    //+---------+
    // 0 0 1 4 5
    // Staring k 2 zero print nhi krna hai
    // So, ek aur logic likhna hoga starting k zero skip krwane k

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Input size and elements of the first array
        int n1 = scn.nextInt();
        int[] one = new int[n1];
        for(int i = 0; i < n1; i++) {
            one[i] = scn.nextInt();
        }

        // Input size and elements of the second array
        int n2 = scn.nextInt();
        int[] two = new int[n2];
        for(int i = 0; i < n2; i++) {
            two[i] = scn.nextInt();
        }

        // Apni answer bdi array ko represent krta h
        // Length n2 array jitna bda hoga
        int[] diff = new int[n2];

        // Initialize indices for both arrays and result array, and carry
        int i = n1 - 1; // Index for the first array
        int j = n2 - 1; // Index for the second array
        int k = n2 - 1; // Index for the result array
        int c = 0;      // Carry

        // Calculate difference until the result array is filled
        while(k >= 0) {
            // Start with the current digit of the second array and add carry
            int d = two[j] + c;

            // Subtract the digit from the first array if available
            // Note : Ye tabhi tk krna jbtk "n1" greater than 0 ho
            if(i >= 0) {
                d = d - one[i];
            }

            // Handle negative result by adding 10 and setting carry to -1
            if(d < 0) {
                d += 10;
                c = -1;
            } else {
                // Set carry to 0 if the result is positive
                // d = d;
                c = 0;
            }

            // Store the result digit
            diff[k] = d;

            // Move to the next digits in both arrays and the result array
            i--;
            j--;
            k--;
        }

        // skipping intial zeroes
        // But agar saare zero honge to code fatt skta h
        // Isliye if index != 0 then break
        int idx = 0;
        for(idx = 0; idx < diff.length; idx++) {
            if(diff[idx] != 0) {
                break;
            }
        }
        // Print the difference array starting from the non-zero index 
        for(int p = idx; p < diff.length; p++) {
            System.out.print(diff[p] + " ");
        }
    }
}

// Output :
// 4
// 9 1 7 8 // 9954 (smaller)
// 5
// 9 5 2 3 6 // 99999 (bigger)


