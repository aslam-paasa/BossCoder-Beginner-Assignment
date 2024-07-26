package _15_Hashing;

import java.util.HashMap;
import java.util.Set;

public class _03_FirstHashMap {
    public static void main(String[] args) {

        /**
         * 1. Create HashMap:
         * => (a) Key : String
         * => (b) Value : Integer
         * => Like any other data structure, HashMap is created using 'new' keyword.
         */
        HashMap<String, Integer> hm = new HashMap<>();

        /**
         * {} -> This is an empty hashmap looks like.
         * So, let's now try to insert some values into it and then try to display it.
        */
        System.out.println("Blank HashMap : " + hm);


        /**
         * 2. Put elements into HashMap:
         * => put(key, value) function can be used to put some values into HashMap.
         * => TC of put(): O(1)
         * 
         * => There are two cases when we are using the put(key, value) function in
         *    hashmap:
         *    (a) When the key is not present: add
         *     => If the key is not present in the HashMap, it will get inserted.
         * 
         *    (b) When the key is already present: update
         *     => If the key is already present, we cannot insert the same key again.
         *     => Cannot store duplicate keys.
         *     => Only the value of the existing key will get updated in the HashMap.
         * */ 

        hm.put("India", 1391);
        hm.put("China", 1398);
        hm.put("USA", 329);
        hm.put("Indonesia", 268);

        /**
         * Print all the elements inside the hashmap:
         * => {USA=329, China=1398, India=1391, Indonesia=268}
        */
        System.out.println(hm);


        /**
         * Update the value of existing element & print it:
        */
        hm.put("Indonesia", 270);
        System.out.println(hm);

/**
 * Note:
 * 1. We must observe that the HashMap has changed the order in which the elements occur.
 * 2. So, this is something that we cannot control in HashMap.
 * 3. We cannot control the order of occurrence of elements in a HashMap.
 * */ 

        
        /**
         * 3. Get a value in HashMap: O(1)
         * => The get(key) function is a hashmap is used to get the value corresponding to 
         *    a particular key in the HashMap.
         * => There can be 2 possible cases for this:
         *    (a) If the key exists:
         *     => If the key exists, then we will get the 'value' of that key using the get()
         *        function.
         *    (b) If the key doesn't exist:
         *     => If the key does not exist, then they get(key) function returns 'null'.
         * 
         * Note: "India" i.e. key already exist in the hashmap 'hm' with value = 1391.
         *       To humne "India" ki value get kar liya.
         * */ 
        System.out.println(hm.get("India"));
        System.out.println(hm.get("Utopia"));


        /**
         * We should get the value of a key only in the "Integer"
         * => Capital "Integer" datatype can store 'null'
         * => Wrapper class k objects m hm null daal sakte hai qki
         *    Wrapper class heap m store hote hai.
         * 
         * But we cannot store 'null' in variable of "int" datatype
         * because 'int' is a primitive datatype which is stored in "Stack"
         * and we cannot store 'null' in Stack.
         * => 'int' datatype cannot store null so we will get a nullPointerException.
         * */ 
        Integer x = hm.get("Utopia");
        System.out.println(x);

        // int y = hm.get("Utopia");
        // System.out.println(y);


        /**
         * 4. Contains.key() in HashMap:
         * => TC of contains.key() function is O(1).
         * => The contains.key() is boolean function.
         * 
         * => We pass a particular key-value as a parameter to this function. If the 
         *    hashmap contains keys, it returns true, else returns false.
         * */ 
        System.out.println(hm.containsKey("China"));
        System.out.println(hm.containsKey("Pakistan"));


        /**
         * 5. keySet in HashMap:
         * => We know that we have key-value pairs in HashMap.
         * => We can get only the keys in a hashmap by using the keySet() function.
         * => The keySet() function returns the set of all the keys in HashMap.
         * => We can store it in a "Set container"
         * => To get the set of keys, we can store it in a set container.
         * 
         * => We have stored all the keys in this set:
         *    [USA, China, India, Indonesia]
         * */ 
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        /**
         * 1. Keys ka order humesa unpredictable aur unchanged hota hai.
         * 2. Set ek aisa collection hota hai jisme humesa unique values
         *    hogi. Jaise HashMap m keys humesa unique hote hai.
        */


        /**
         * We have seen the following functions:
         * 1. hm.put("India", 240);
         * 2. hm.get("India");
         * 3. hm.containsKey("India");
         * 4. hm.keySet();
         * => All these functions are taking O(1) TC, and improve the performance
         *    of our code.
         * 
        */

    }
}
