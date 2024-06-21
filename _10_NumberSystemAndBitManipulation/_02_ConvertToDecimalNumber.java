package _10_NumberSystemAndBitManipulation;

public class _02_ConvertToDecimalNumber {
    public static void main(String[] args) {

        /**
         * Q. How to convert everything into decimal number?
         * => Formula to convert Number System with base-X to Decimal Number System:
         * => (abcd)base-X = d.x^0 + c.x^1 + b.x^2 + a.x^3
         *     3210
         * 
         * Example:
         * => (545)base-10 = 6.10^0 + 4.10^1 + 5.10^2 = 546 (decimal-to-decimal)
         *     210
         * 
         * => (101)base-2 = 1.2^0 + 0.2^1 + 1.2^2 = 5 (binary-to-decimal)
         * 
         * => (236)base-8 => 6.8^0 + 3^8^1 + 2.8^2 = 158 (Octal-to-decimal)
         * 
         * => (1C2)base-16 => 2.16^0 + 12.16^1 + 1.16^2 = (hexadecimal-to-decimal)
         * 
         * Q. Why do we use different systems?
         * Q. Why does the machine use binary systems?
         * => We want to save space, we don't want this much amount of representatives.
         * => In decimal system, we have 10 representatives, which is good amount of representation.
         * => In binary system, since it's only 0's and 1's, considered as either switch "ON" or "OFF".
         *    So, it can be represented in a very less amount of money.
         * => For example, we want to just find the state of our office whether it is open or closed currently?
         *    So, we just need to use binary system, no need to use decimal system because there we will have 
         *    10 representatives.
         * => Find the status of Cab in OLA, UBER, etc.
         *    (a) TRIP_ASSIGNED -> 0
         *    (b) IN_PROGRESS   -> 1
         *    (c) COMPLETED     -> 2
         *    (d) CANCELLED     -> 3
         *    We can map these as different numbers and use it with number system with base-4. 
         */
    }
}
