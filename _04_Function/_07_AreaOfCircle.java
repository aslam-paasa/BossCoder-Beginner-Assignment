package _04_Function;

public class _07_AreaOfCircle {

    public static float circle_area(int radius) {
        return (float) 3.14 * radius * radius;
    }

    public static void main(String[] args) {

        /**
         * Q. Function to display area of circle
         * => Formula: 3.14 * r * r
         */

        int radius = 5;
        System.out.println("Area of the Circle : " + circle_area(radius));
    }
}
