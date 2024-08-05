package _15_ArrayOneDimension;

import java.util.Scanner;

public class _29_FirstAndLastIndex {
    // Ek array h jisme values repeat ho rhi hai
    // 10 20 20 30 30 30 30 40 40 40 40 50
    // 0  1  2  3  4  5  6  7  8  9  10 11
    // Ab jaise 40 humse maang liya to hm 40 ka 1st and last index dono denge ki pehle baar 40 kaha aaya tha aur aakhri baar 40 kaha aaya tha

    // Binary Search use kr k ye question ho jaata hai, sorted array hona chaiye
    // left           mid               right 
    // 10 20 20 30 30 30 30 40 40 40 40 50
    // 0  1  2  3  4  5  6  7  8  9  10 11

    // mid = (0+11)/2 = 5
    
    // left  mid      right
    // 30 40 40 40 40 50
    // 6  7  8  9  10 11

    // mid = (6 + 11)/2 = 8 i.e. 40

    // First index = 8
    // Qki ho skta h ki 40 ka first index yhi ho
    // Lekin iske baad left side move kre (qki data chota chaiye)

    // left right
    // 30   40
    // 6    7  
    // mid

    // mid = (6+6)/2 = 6 
    
    // left
    // right
    // mid
    // 40
    // 7

    // mid = (7 + 7)/2 => 7 i.e. 40
    // First index = 7 (updated)

    // Normal Search m -
    // Data bada hota h to right ko jaate h
    // Data chota hota h to left ko jaate h
    // Data equal hota h to last index ko set kr k right ko jaenge
    // d = li

    // left  mid      right
    // 30 40 40 40 40 50
    // 6  7  8  9  10 11

    // mid = (6+11)/ 2 = 8

    // Consider index-8 as Last Index
    // Aur fir right ko jao (left ko discard kr do)

    // left  mid   right
    // 40    40    50
    // 9     10    11

    // mid = (9+11)/2 = 10
    // Last Index = 10 i.e. 40 

    // left  right
    // 40    50
    // 10    11

    // mid = (10+11)/2 = 10 i.e. 40

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
    
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int data = scn.nextInt();

        // first index
        int left = 0;
        int right = arr.length - 1;
        int fi = -1;

        while(left <= right) {
            int mid = (left + right) / 2;

            if(data > arr[mid]) {
                left = mid + 1;
            } else if(data < arr[mid]) {
                right = mid - 1;
            } else {
                // fi m mid rkh lo lekin break mt kro qki ho skta h left m kuch mil jae
                // aur right ko discard kro
                fi = mid;
                right = mid - 1;
            }
        }
        System.out.println("First index : " + fi);

        left = 0;
        right = arr.length - 1;
        int li = -1;

        while(left <= right) {
            int mid = (left + right) / 2;

            if(data > arr[mid]) {
                left = mid + 1;
            } else if(data < arr[mid]) {
                right = mid - 1;
            } else {
                li = mid;
                left = mid + 1;
            }
        }
        System.out.println("Last Index : " + li);
    }
}

// Output :
// 12
// 10 20 20 30 30 30 30 40 40 40 40 40
// 40