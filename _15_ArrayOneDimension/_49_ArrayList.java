package _15_ArrayOneDimension;

import java.util.ArrayList;

public class _49_ArrayList {
    public static void main(String[] args) {
        /**
         * ArrayList:
         * 1. Inbuilt data structure.
         * 2. Linear data structure: means data are stored in linear fashion.
         * 
         * Comparison between array and array list:
         * +--------------------------------+--------------------------------+
         * | Array                          | ArrayList                      |
         * +--------------------------------+--------------------------------+
         * | 1. Fixed Size                  | 1. Dynamix Size                |
         * | 2. Primitive DataType can be   | 2. Primitive DataTypes cannot  |
         * |    stored.                     |    be stored directly          |
         * +-----------------------------------------------------------------+
         * */ 

        /**
         * Java Collection Framework:
         * => ClassName objectName = new ClassName();
         * => <> : indicate data type
        */
        ArrayList<Integer> list = new ArrayList<>();


        /**
         * Operations:
         * 1. Add Element : O(1)
         * 2. Get Element : O(1)
         * 3. Remove Element : O(n)
         * 4. Set Element at Index : O(n)
         * 5. Contains Element : O(n)
        */


        /**
         * 1. Add Element:
         * */ 
        list.add(1); // O(1)
        list.add(2); // O(1)
        list.add(3); // O(1)
        list.add(4); // O(1)
        list.add(5); // O(1)
        System.out.println(list);


        /**
         * 2. Get Element:
        */
        int element = list.get(2); // O(1)
        System.out.println(element);


        /**
         * 3. Remove/Delete Element:
         * => Pehle jaa k dkhnge ki uss index pe stored element kya hai
         * => Fir uss element ko remove krna hai
         * => And at last, resizing hogi.
        */
        list.remove(2); // O(n)
        System.out.println(list);


        /**
         * 4. Set Element at index:
         * => Pehle uss index pe linearly jaenge
         * => Then uss index ki value change krnge
        */
        list.set(2, 10); // O(n)
        System.out.println(list);

        
        /**
         * 5. Contains Element:
         * => Ye check krta h ki koi v element mere array k andr exist
         *    krta hai ya nhi.
         * => If exist: true, else: false
        */
        System.out.println(list.contains(1));  // O(n)
        System.out.println(list.contains(11)); // O(n)

        /**
         * 6. Add elements at specific index:
        */
        list.add(1, 9); // O(n)
        System.out.println(list);


        /**
         * 7. list.get():
         * => Array ki value ko hum "arr[i]" se access krte the but
         *    ArrayList m hm [] => brackets nhi lagaate. List k liye
         *    hm sirf "get()" method ka use krte hai.
        */


        /**
         * 8. Size of ArrayList:
         * => Jaise array k andr humaare paas length hoti thi array ki
         *    "arr.length" jisko hm print krwa skte the. Similarly, 
         *    arraylist m humaare paas size function hota hai "arr.size()"
         *    jisse arraylist ka size humaare paas print ho k aa jaata hai.
        */
        System.out.println(list.size());


        /**
         * Print ArrayList:
        */
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }



    }
}
