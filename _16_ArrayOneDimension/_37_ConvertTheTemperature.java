package _16_ArrayOneDimension;

import java.util.ArrayList;

public class _37_ConvertTheTemperature {
    public static void main(String[] args) {

        /**
         * Formula:
         * 1. Kelvin = Celsius + 273.15
         * 2. Fahrenheit = Celsius * 1.80 + 32
         */

        double celsius = 25.0; // Example input
        ArrayList<Double> convertedTemperatures = convertTemperature(celsius);

        System.out.println("Kelvin: " + convertedTemperatures.get(0));
        System.out.println("Fahrenheit: " + convertedTemperatures.get(1));
    }

    public static ArrayList<Double> convertTemperature(double celsius) {
        ArrayList<Double> ans = new ArrayList<>();

        // Convert Celsius to Kelvin
        double kelvin = celsius + 273.15;
        ans.add(kelvin);

        // Convert Celsius to Fahrenheit
        double fahrenheit = celsius * 1.80 + 32.00;
        ans.add(fahrenheit);

        return ans;
    }

}
