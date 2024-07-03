package _11_Maths;

import java.util.Scanner;

public class KilometreToMiles {
    public static void main(String[] args) {
        /** 
         * Q. Find?
         * KM = 2 -> Miles
         * KM = 67.58km -> Miles
         * 
         * => 1KM = 0.621371 Miles
         * => KM = 67 * 0.621371 Miles
         * 
         * */
        
        Scanner scn = new Scanner(System.in);
        System.out.print("Tell me km: ");
        float km = scn.nextFloat();

        float miles = KMtoMiles(km);
        System.out.println(miles + " miles");

    }

    public static float KMtoMiles(float km) {
        float _1kmMile = (float)0.621371;
        float miles = km * _1kmMile;
        return miles;
    }
}
