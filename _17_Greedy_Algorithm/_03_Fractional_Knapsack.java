package _17_Greedy_Algorithm;

public class _03_Fractional_Knapsack {
    public static void main(String[] args) {
        /**
         * Knapsack 
         * => It means smal pouch ya choti se bori hoti hai jiske andr 
         *    hum bahut saara samaan daal skte hai. (bag)
         * => Two problem of Knapsack:
         *    (a) Fractional Knapsack => using Greedy
         *    (b) 0-1 Knapsack => using DP
         * 
         * Fractional Knapsack:
         * => Given the weights and values of N items, put these items in
         *    knapsack of capacity W to get the maximum total value in
         *    the knapsack.
         * => value = [60, 100, 120]
         * => weight = [10, 20, 30]
         * => W = 50 (knapsack capacity)
         * => ans = 240(total value)
         * 
         * Note: We can pick values in fraction also.
         * => 60[10] + 100[20] + 80[30] => 240
         * 
         * Approach:
         * 1. Weight should be minimum.
         *    Value should be maximum.
         *    => Ration = value / weight 
         *            (a) 60/10 = 6
         *            (b) 100/20 = 5
         *            (c) 120/30 = 4  
         *    => Jiska ration jyda hoga usko jyda pick krna chahenge.
         *    => Ek 2D array bna lenge jisme apna ration & original idx store
         *       kr lenge. Aur dono ka sort kr denge.
         * 2. Ratio: [6, 5, 4]
         * 3. (a) Capacity = 50
         *        Item-1: 10, value = 60
         *    (b) Capacity = 40
         *        Item-2: 20, value = 60 + 100
         *    (c) Capacity: 20
         *        Item-3: Ratio*capacity = 4 * 20 = 80, value = 60 + 100 + 80
         *                                                    = 240 (ans).
         * */ 
    }
}
