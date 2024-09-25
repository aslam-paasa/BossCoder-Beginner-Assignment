package _15_Sorting;

public class _26_Sort_Dates {
    /**
     * Dates are given in DDMMYY format, sort them:
     * 12041996
     * 20101996
     * 05061997
     * 12041989
     * 11081987
     * 
     * 
     * Constraints:
     * 1. 1 <= N <= 10000
     * 2. All dates are between year 0 to 2500
     *    a. DD - 1 to 31
     *    b. MM - 1-12
     *    c. YY - 0-2500
     * 
     * Q. How to find date?
     * => 12041996 / 1000000 % 100 => 12
     * 
     * Q. How to find month?
     * => 12041996 / 10000 % 100 => 04
     * 
     * Q. How to find year?
     * => 12041996 / 1 % 10000 => 1996
    */
}
