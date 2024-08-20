/**
 * Backtracking:
 * => It is a technique for solving problems recursively by trying
 *    to build the solution incrementally, one piece at a time, removing
 *    those solution which fail to satisfy the constraints at any point
 *    of time.
 * 
 * => Types of Backtracking Problems:
 *    (a) Decision Problem
 *    (b) Optimization Problem
 *    (c) Enumeration Problem
 * 
 * 1. Decision Problem:
 * => In this we search for a feasible solution (possible solutions)
 *    and something that will work for us.
 * => Agar hum koi problem solve kr rhe hai ek decision le k to wo type
 *    ki problem "decision problem" m aati hai.
 * => For example, agar mai puchu waha ek shop hai ya nhi? To aapka 
 *    answer either yes or no hoga.
 * => Aur jb hum iss type k problem ko apne code m likhnge tb hm boolean
 *    use krnge which will return either true or false.
 * => Another example, puzzle k andr hm source se start krte hai to
 *    destination tk pahuch paenge yaa nhi.
 * 
 * 2. Optimization Problem:
 * => Isme hm aise solution ko dekh rhe hote hai jo humaare liye best
 *    hoga.
 * => So, in this we look for solution which will work best for us.
 * => For example, humein Home se shop tk jaana hai. Shop tk jaane
 *    k liye 2 raaste hai, first one is 1km and another one is 1.5km
 *    Which is the best route? 
 * => In this case, 1km is the optimal solution(best solution) because
 *    it takes lesser time.
 * 
 * 3. Enumeration Problem:
 * => Enumeration means collection.
 * => For example, home to shop jaane k multiple ways hai to hum isse
 *    keh skte hai: Multiple collection/ways to reach shop.
 * => Jb hum source to destination jaane k saare possible ways btate hai
 *    tb enumeration kaam m aata hai.
 * => Here we are targetting  to find all the feasible solutions.
 * .
 * */ 