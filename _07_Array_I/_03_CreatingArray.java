package _07_Array_I;

public class _03_CreatingArray {
    public static void main(String[] args) {

        // Creating array:
        // => <datatype> <name>[] = new <datatype>[<size>]
        int rollNo[] = new int[5];
        rollNo[0] = 6;
        rollNo[1] = 12;
        rollNo[2] = 20;
        rollNo[3] = 100;
        rollNo[4] = 90;

        // Updating element of an array
        rollNo[2] = 1000;

        // print all the elements of the array
        for(int i = 0; i<5; i++) {
            System.out.println("Index " + i + " is : " + rollNo[i]);
        }

    }
}
