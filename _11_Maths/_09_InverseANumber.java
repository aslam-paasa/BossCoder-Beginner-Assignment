package _11_Maths;

import java.util.Scanner;

public class _09_InverseANumber {
    public static void main(String[] args) {
        
        // Input : 426135
        // Agar 6 digit ka sawal milega i.e. 426135 to uske andr jo digits honge wo v 1-6 digits tk honge bhlae hi utli pulti ho
        // Koi v miss nhi hogi aur naa koi duplicate hogi
        // Input : 4 digit - to 1 se 4 tk k saare digit aaenge
        // Position : 1  2  3  4  5  6
        // Number   : 4  2  6  1  3  5


        // Position  : 6  5  4  3  2  1
        // Number    : 4  2  6  1  3  5
        // Inverse   : 4  1  6  2  5  3
        // Inverse k case m agar 6th position pe 4 h to 4th poisition pe 6 jaega (Inverse)
        // 5th position pe 2 h to 2nd position pe 2 jaega
        // 4th position pe 6 h to 6th position pe 4 jaega
        // 3rd position pe 1 h to 1st position pe 3 jaega
        // 2nd position pe 3 h to 3rd position pe 2 jaega
        // 1st position pe 5 h to 5th position pe 1 jaega

        // Ye asal m pta chlega kisko kn se position pe bhejna h  (Another way to understand) - 
        // 426135 = 4 x 10^5 + 2 x 10^4 + 6 x 10^3 + 1 x 10^2 + 3 x 10^1 + 4 x 10^0 
        // 416253 = 4 x 10^5 + 1 x 10^4 + 6 x 10^3 + 2 x 10^2 + 5 x 10^1 + 3 x 10^0
        
        // Number@Poisition :
        // 5@1 - 1@5 = 1 X 10^5
        // 3@2 - 2@3 = 1 X 10^3
        // 1@3 - 3@1 = 1 X 10^1
        // 6@4 - 4@6 = 1 X 10^6
        // 2@5 - 5@2 = 1 X 10^2
        // 4@6 - 6@4 = 1 X 10^4 

        // 10] 35214    Place (Jisko jaha bhjna h uss no. ka power-1)
        // 10] 3521|4   1 ko bhjo 4th position pe -> 1 X 10^3 = 1000
        // 10] 352|1    2 ko bhjo 1st position pe -> 2 X 10^0 = 2
        // 10] 35|2     3 ko bhjo 2nd position pe -> 3 X 10^1 = 30
        // 10] 3|5      4 ko bhjo 5th position pe -> 4 X 10^4 = 40000
        // 10] 0|3      5 ko bhjo 3rd position pe -> 5 X 10^2 = 500
        //                                                      41532

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int p = 1;
        int inv = 0;
        //jbtk number 0 se bda h tbtk remainder nikaalna h
        while(n > 0) {
            int r = n % 10;  // remainder
            int q = n / 10;  // quotient (no chota krne k liye)

            n = q;
            // r@p -> p@r -> p*pow(10, r-1) 
            // remainder mila tha pth position pe (r@p)
            // Humein p ko r pe bhjna h (p@r)
            // p(position) ko r(remainder) pe bhjne k liye p*pow(10, r-1) krna padega

            // Basically humein inverse ko 0 bna dena padega (int inv = 0)
            // Aur inverse ko badhaate jaenge
            // Math.pow decimal m jawab deta h to usko integer bnana pdega (int)Math.pow()
            inv = inv + p * (int)Math.pow(10, r-1);
            p++;
        }
        System.out.println(inv);
    }
}
