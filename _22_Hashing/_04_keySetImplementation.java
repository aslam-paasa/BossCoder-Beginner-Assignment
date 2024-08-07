package _22_Hashing;

import java.util.HashMap;
import java.util.Set;

public class _04_keySetImplementation {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 1391);
        hm.put("China", 1398);
        hm.put("USA", 329);
        hm.put("Indonesia", 268);

        /**
         * keySet in HashMap:
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
        
        for(String key : keys) {
            Integer val = hm.get(key);
            System.out.println(key + " : " + val);
        }

        /**
         * 1. Keys ka order humesa unpredictable aur unchanged hota hai.
         * 2. Set ek aisa collection hota hai jisme humesa unique values
         *    hogi. Jaise HashMap m keys humesa unique hote hai.
         */

    }
}
