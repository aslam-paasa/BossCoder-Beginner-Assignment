package _18_ArrayOneDimension;

import java.util.Scanner;

public class _30_BrokenEconomy {
    public static void main(String[] args) {
        // Ek Sorted array hai - [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
        //                        0   1   2   3   4   5   6   7   8   9
        // Humein krna kya h?

        // Agar mai aapko input du "77" aur puchu ki "77" ka "floor" kya h aur "ceil" kya h?
        // 77 ka floor h "70" aur ceil h "80"
        
        // Floor is the largest in smaller elements 
        // means 77 se jitne chote h array m usme se sbse bda kn sa h

        // ceil is smallest in greater
        // 77  se jitne bde h unme se sbse chota kn sa h 

        // Note : 105 ka floor 100 h but ceil nhi h
        // Note : 5 ka floor nhi h but ceil 10 h 

        // left             mid                 right
        // [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
        //  0   1   2   3   4   5   6   7   8   9

        // mid = (0+9)/2 => 4
        // Iss case m left ko discard qki wo 77 se chota tha
        // Aur left ko mid+1 pe rkha krte the

        // Ye sb jo chote hai, inn choto m sbse bda ye "50" h to ye ek potential floor ho skta hai
        // Floor = 50

        // Aur 5 & 9 k liye new mid nikaale i.e. 80
        // left     mid     right
        // [60, 70, 80, 90, 100]
        //  5   6   7   8   9

        // mid = (5+9)/2 = 7 i.e. 80

        // Ab 77 mera chota hai mid se, to right ko discard krnge
        // Kaise discard krnge? Right ko utha k mid-1 m rkh denge
        // left right
        // [60, 70]
        //  5   6  
        // Lekin ye sbhi bade the aur inn bade m "mid" sbse chota tha to kahi "80" ceil to nhi
        // Ceil => 80

        // mid = (5+6)/2 => 5
        // 77 is greather than 60 so left discard hoga
        // Lekin inn choto m 60 sbse bda tha to update the floor
        // Floor = 60

        // Aur ab left ko utha m mid+1 pe rkh denge
        // mid
        // left
        // right
        // [70] 
        //  6

        // mid = (6+6)/2 = 6
        // Aur left ko utha m mid+1 pe rkhnge to ye update hoga qki ye chota tha aur inn choto m ye sbse bda tha isliye update the floor
        // Floor = 70

        
        // Note : 77 se ye saare chote the aur inn choto m "70" sbse bda tha
        // Floor = 
       


        // Write your code here

        // Scanner object for input
        Scanner scn = new Scanner(System.in);
        
        // Input: Size of the array
        int n = scn.nextInt();

         // Input: Array elements
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        // Input: Number for which floor and ceil need to be found
        int data = scn.nextInt(); 

        // Variables to store floor and ceil
        int floor = -1; // the greatest among smaller numbers
        int ceil = -1; // The smallest among greater numbers

        // Binary search to find floor and ceil
        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {
            int mid = (left + right) / 2;

            if(data > arr[mid]) {
                // Update floor if data is greater than mid element
                left = mid + 1;
                // left to mid are all small and mid greatest of them
                floor = arr[mid];
            } else if(data < arr[mid]) {
                // Update ceil if data is smaller than mid element
                right = mid - 1;
                // mid to right are all greater and mid is the smallest of them
                ceil = arr[mid];
            } else {
                // If data is found, it is both floor and ceil
                floor = arr[mid];
                ceil = arr[mid];
                break;
            }
        }
        // Output floor and ceil
        System.out.println("Floor : " + floor);
        System.out.println("Ceil : " + ceil);
    }
}
