package _17_Greedy_Algorithm;

import java.util.ArrayList;

public class _02_Activity_Selection {
    public static void main(String[] args) {
        /**
         * Q. You are given 'n' activities with their start and end times.
         *    Select the maximum number of activities that can be performed
         *    by a single person, assuming that a person can only work on
         *    a single activity at a time. Activities are sorted according
         *    to end time.
         * => start = [10, 12, 20]
         * => end   = [20, 25, 30]
         * => ans = 2 (A0 & A2)
         * 
         * Note: Agar mujhe 10 activity ki list de di gyi aur jisme bta
         *       diya gya ki ye start time hai aur ye end time hai. Aur
         *       meri responsibility h ki jaa k unn maximum kaam ko khtm 
         *       krna. To iss problem m mujhe btana h ki max kitne kaam
         *       khtm ho skte hai. Remember: Ek aadmi ek baar m ek kaam kr
         *       skta hai.
         * 
         * 1. Activity-1: start - end => 10 - 20 
         * 2. Activity-2: start - end => 12 - 25 
         * 3. Activity-3: start - end => 20 - 30
         * => At max, a person can do max 2 activity => Activity-1&3
         * 
         * Approach:
         * => start = [1, 3, 0, 5, 8, 5]
         * => end   = [2, 4, 6, 7, 9, 9]
         * Note: Activity is sorted according to end time.
         * 
         * => Jitni jaldi m puraana kaam khtm kr pau, utni jldi new kaam
         *    milega. Yha se thodi thodi greedy approach dikh rhi. 
         * 
         * 1. A0 -> 1-2 (selected)
         * 2. A1 -> 3-4 (selected)
         * 3. A2 -> 0-6 (Rejected-Overlapping)
         * 4. A3 -> 5-7 (selected)
         * 5. A4 -> 8-9 (selected)
         * 6. A5 -> 5-9 (rejected-Overlapping)
         * => Ans = 4 (A0, A1, A3, A4)
         * 
         * 1. end time basis sorting
         * 2. Select A0 default (1st activity)
         * 3. Always select non-overlapping disjoint activity
         *    start time >= last chosen activity end time
         *    (means new activity ki start time old activity end hone k baad shuru honi chaiye)
         *    count++;
         * */ 

        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        // end time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st activity
        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];

        for(int i = 1; i < end.length; i++) {
            if(start[i] >= lastEnd) {
                // activity select
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println("Max activities = " + maxAct);
        for(int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}
