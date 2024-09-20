package _28_Hashing;

public class _98_HighestFrequencyCharacter {
    public static void main(String[] args) {
        /**
         * Q. Ek String given hogi, humein uss String m se "maximum occuring character"
         *    ko print krna hai. Means jo character sbse jyda occur karta hai String m
         *    humein wo character print krna hai.
         * 
         * => Hum ek frequency map banaenge jisme har character ki frequency store hogi.
         *    (a) Key: Character
         *    (b) Value: Frequency
         * => String: a b b c b a b c d d  a b b d  a b b b 
         *    +------------------------------+
         *    | a = 4                        |
         *    | b = 9                        |
         *    | c = 2                        |
         *    | d = 3                        |
         *    +------------------------------+
         * Note: "b" ki frequency sabse jyda hai to "b" is the Highest Frequency Character.
         * 
         * */ 


        /**
         * Example: abracadabara
         * => Humein ye String given hai, aur humein wo character print karna hai jiski frequency
         *    sabse jyda hai.
         * => The frequency of "a" is maximum. Hence, "a" is printed.
         * 
         * Steps:
         * 1. We will make a hashmap table(key-value) for this String.
         * 2. Hum String k har character par travel karenge aur uss character ki frequency badhate 
         *    chalenge.
         *    +------------------------------+
         *    | Char| Frequency              |
         *    +------------------------------+
         *    | a   =   2                    |
         *    | b   =   3                    |
         *    | c   =   6                    |
         *    | d   =   2                    |
         *    +------------------------------+
         * 3. Now we can clearly see the frequency of "c" is maximum. So, "c" is the highest frequency
         *    character.
         * 4. We iterate through every character of the String and then increase the count against
         *    that character.
         * 
         * */  
    }
}
