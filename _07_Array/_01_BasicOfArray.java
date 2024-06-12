package _07_Array;

public class _01_BasicOfArray {
    public static void main(String[] args) {
        /**
         * Storing names of students:
         * 1. String name1 = "Spiderman"
         * 2. String name2 = "Superman"
         * 3. String name3 = "Batman"
         * .....
         * .....
         * 99. String name99 = "He-Man"
         * 
         * Q. Check if there is a student with name "Rahul"?
         * if(name1 == "Rahul" || name2 == "Rahul" || .... || name99 == "Rahul") {
         * return true;
         * } else {
         * return false;
         * }
         */

        /**
         * Array is a collection of homogenous(same data type) elements
         * => names = {"Batman", "Spiderman", "Superman", .... }
         * => rollNo = {17, 50, 3, ... }
         */

        // 1. Creating new array:
        // => <data_type <name_of_array> [<size>] = {elements}

        int rollNo[] = { 4, 50, 6, 12, 10 };

        /**
         * 4  - 0th element
         * 50 - 1st element
         * 6  - 2nd element
         * 12 - 3rd element
         * 10 - 4th element
        */

        // 2. Fetch by index - <name_of_arr>[<index>]
        System.out.println(rollNo[2]); // 6
        System.out.println(rollNo[3]); // 12

        // 3. Update by index - <name_of_arr>[<index>] = <val>;
        rollNo[2] = 60;
        System.out.println(rollNo[2]);

        /**
         * 4  - 0th element
         * 50 - 1st element
         * 60 - 2nd element
         * 12 - 3rd element
         * 10 - 4th element
        */


    }
}
