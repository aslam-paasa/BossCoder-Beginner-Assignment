package _07_ArrayOneDimension;

import java.util.Scanner;

public class _10_BarChart {

    /**
     * Bar Chart:
     * => Input: 5
     * =>        3, 1, 0, 7, 5
     * 
     * => Fir jitne number h utne stars print krne h 
     * => For example, 3 h to 3 stars ki ek column print krni hai
     * => Ek base line lena h jiss row se sbke star start honge
     * => Spaces humein nhi dekh rhe h
     * 
     *     +-----------------------------------------------------+
     *     | -  -  *  -  -    -> 5th height                      |
     *     | -  -  *  -  -    -> 4th height                      |
     *     | *  -  *  -  -    -> 3rd height                      |
     *     | *  -  *  -  *    -> 2nd height                      |
     *     | *  *  *  -  *    -> 1st or Base Height : 3 1 5 0 2  |
     *     +-----------------------------------------------------+
     * 
     * => Aur inme se humein sbse ucchi building chaiye i.e. 5
     * => Hum isse height k tarah soch k dekhnge ki -
     *    5th height pe 1st building m "bricks" hogi ya "air"
     *    5th height pe 2nd building m "bricks" hogi ya "air"
     *    5th height pe 3rd building m "bricks" hogi ya "air"
     *    etc...
     * 
     * => Sbse pehle humne max nikaal liya ki maximum heigth kitni h
     * => Fir hm sbse high se start krnge
     * => To hum pehle 5th heigth k liye baat karenge then 4th, 3rd, 2nd, 1st
     * => 5th height k liye ko pehli building h, jiski height 3 h to 4th & 5th storey m to air hogi
     *     -  -  #  -  -    -> 5th height
     *     -  -  #  -  -    -> 4th height
     *     #  -  #  -  -    -> 3rd height
     *     #  -  #  -  #    -> 2nd height
     *     #  #  #  -  #    -> 1st height
     *     3  1  5  0  2    -> Base Height
     * => Note : Computer always print from left to right ( not from top to bottom)
    */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // Input: Total number of buildings

        int[] arr = new int[n]; // Declaring an array to store the heights of the buildings

        // Taking input of heights of the buildings into the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        // Finding the maximum height of the buildings
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Iterating from the maximum height to 1 to print the bar chart
        for (int height = max; height >= 1; height--) {
            // Iterating through each building
            for (int i = 0; i < arr.length; i++) {
                // If the height of the building is greater than or equal to the current height, print a brick
                if (arr[i] >= height) {
                    System.out.print("*\t");
                } else { // Otherwise, print air
                    System.out.print("\t");
                }
            }
            System.out.println(); // Moving to the next line after printing each floor
        }
    }
}
