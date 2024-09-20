package _28_Hashing;

import java.util.HashMap;
import java.util.Set;

public class _02_HashMapIntro {
    /**
     * HashMap:
     * => Data are stored in tabular structure.
     * => Iske andr 2 chije hoti hai:
     *    (a) Key
     *    (b) Value
     * 1. Insert data : put()
     * 
     * */
    public static void main(String[] args) {
        HashMap<String, Integer> populationMap = new HashMap<>();

        /**
         * 1. Add Value: O(1)
         * => put() m agar key pehle se nhi hai to wo data add krega.
        */
        populationMap.put("India", 130);
        populationMap.put("China", 120);
        populationMap.put("Australia", 50);
        populationMap.put("Utopia", 0);

        System.out.println(populationMap);

        /**
         * 2. Update value: O(1)
         * => put() m agar data pehle se hai to wo update karega.
        */
        populationMap.put("Australia", 52);
        System.out.println(populationMap);

        /**
         * 3. Get Value: O(1)
         * => key pehle se hai to value dega.
         * => key pehle se nhi hai to null dega.
         * Note: Always use "Integer" instead of "int".
        */
        int indiaPopulation = populationMap.get("India");
        System.out.println(indiaPopulation);

        // int usaPopulation = populationMap.get("US");
        // System.out.println(usaPopulation); // null pointer exception

        /**
         *                 +----+
         * int i = 10; --->| 10 | (Stack)
         *                 +----+
         * 
         * Integer i = 10;
         * => Stack pe 'i' hota jo heap pe pade '10' k addr ko point kr
         *    rha hota.
         * +----+     +----+
         * | 4k |---->| 10 |
         * +----+     +----+
         *              4k
         * 
         * Note: 
         * (a) "int" is primitive integer.
         * (b) "Integer" is Class Integer. Aur iss wale Integer k andr
         *     hm null store kr skte hai. 
         * => Always use "Integer" in HashMap because "get()" ka behavior
         *    kehta hai ki chij mil gyi to de dega, lekin nhi mili to
         *    "null" dega.
         * */     
        
        Integer usaPopulation = populationMap.get("US");
        System.out.println(usaPopulation); // null

        /**
         * 4. containsKey(): O(1)
         * => We can check key existing hai ya nhi. [boolean]
        */
        populationMap.put("US", 40);
        System.out.println(populationMap.containsKey("US")); 

        /**
         * 5. remove():
         * => It is used to remove a key & value from the population map.
        */
        populationMap.remove("China");
        System.out.println(populationMap);

        /**
         * 6. Print all keys: keySet() [order is not fixed] => O(n)
         * => Set is collection of unique values.
         * => Set contains only unique item [no duplicate]
        */
        Set<String> keys = populationMap.keySet();
        for(String key: keys) {
            System.out.print(key + " : ");
            System.out.println(populationMap.get(key));
        }
    }
}
