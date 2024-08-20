package _12_RecursionWithArrayList;

public class _001_TilingProblem {
    /**
     * Q. Tiling Problem [Amazon]
     * => Humne ghr m dekha hoga chahe wo walls ho ya floor, uske upar
     *    hum tiles lagaate hai and max times ye rectangular shape m
     *    hoti hai. Agar isse hm horizontally lagaenge to iski ek alag
     *    dimension banegi aur vertically lagaate hai to alag dimension
     *    aati hai, aur usi k upar based humaari ye question hai.
     * 
     * Q. Given a board of size "2*n" and tile of size "2*1", count the
     *    number of ways to tile the given board.
     * soln: For placing a tile, we have 2 placements:
     *       (a) Horizontally 
     *           +---+---+
     *           |   |   | Size: 1*2
     *           +---+---+
     * 
     *       (b) Vertically:
     *           +---+
     *           |   |  Size: 2*1
     *           +---+
     *           |   |
     *           +---+
     * 
     * Case-1:
     * => n = 1
     * => Size of board = 2 * n
     *                  = 2 * 1
     *    +---+
     *    |   |
     *    +---+
     *    |   |
     *    +---+
     * => One time placed vertically.
     * => Total number of ways: 1
     * 
     * Case-2:
     * => n = 2
     * => Size of board = 2 * n
     *                  = 2 * 2
     *                  = 4
     * 
     *           +---+---+
     *           |   |   | 
     *           +   +   +
     *           |   |   | 
     *           +---+---+
     * => Both tiles vertically.
     * 
     *           +---+---+
     *           |       |  
     *           +---+---+
     *           |       | 
     *           +---+---+
     * => Both tiles horizontally.
     * => Total number of ways: 2
     * 
     * Case-3:
     * => n = 3
     * => Size of board = 2 * n
     *                  = 2 * 3
     *                  = 6
     * 
     *           +---+---+---+
     *           |   |   |   |
     *           +   +   +   +
     *           |   |   |   |
     *           +---+---+---+
     * => All tiles vertically.
     * 

     * 
     *           +---+---+---+
     *           |   |   |   |
     *           +   +---+---+
     *           |   |   |   |
     *           +---+---+---+
     * => One vertically, two horizontally
     * 
     *           +---+---+---+
     *           |   |   |   |
     *           +---+---+   +
     *           |   |   |   |
     *           +---+---+---+
     * => Two vertically, one horizontally
     * 
     *
     * Case-4:
     * => n = 4
     * => Size of board = 2 * 4
     *                  = 8
     * 
     *           +---+---+---+---+
     *           |   |   |   |   |
     *           +---+---+---+---+
     *           |   |   |   |   |
     *           +---+---+---+---+
     * => All vertically
     * 
     *           +---+---+---+---+
     *           |       |       |
     *           +---+---+---+---+
     *           |       |       |
     *           +---+---+---+---+
     * => All horizontally
     * 
     *           +---+---+---+---+
     *           |       |   |   |
     *           +---+---+   +   +
     *           |       |   |   |
     *           +---+---+---+---+
     * => Two horizontally, two vertically
     * 
     *           +---+---+---+---+
     *           |   |       |   |
     *           +   +---+---+   +
     *           |   |       |   |
     *           +---+---+---+---+
     * => One vertically, two horizontal, one vertical
     * 
     *           +---+---+---+---+
     *           |   |   |       |
     *           +   +   +---+---+
     *           |   |   |       |
     *           +---+---+---+---+
     * => Two vertically, two horizontally
     * => Total number of ways: 5
     * 
     *    n         Total no of ways
     *    1 <-----> 1  |
     *    2 <-----> 2  | => Base Case
     *    3 <-----> 3  |
     *    4         5
     *    5         8
     * 
     * Gateways(n) 
     * {
     *    1. Base Case
     *    2. Recursive Call
     * }
     * 
     * 1. Base Case:
     * => if(n == 1)
     *       return 1;
     * => if(n == 2)
     *       return 2;
     * => if(n == 3)
     *       return 3;
     * Let's combine these:
     * => if(n == 1 || n == 2 || n == 3)
     *       return n;
     * 
     *  OR,
     * 
     * if(n <= 3)
     * {
     *    return n;
     * }
     * 
     * 2. Recursive Call: Total ways <== Enumeration Problem
     * <---------------(n)----------------->
     * +---+---+---+---+---+---+---+---+---+
     * |   |   |                           |   2*n
     * |   |   |                           |
     * +---+---+---+---+---+---+---+---+---+
     *  1V <-----------(n-1)--------------->
     * 
     * => If we place one tile vertically then the problem reduces to
     *    n-1, so for thiswe will use getways(n-1).
     * 
     * <---------------(n)----------------->
     * +---+---+---+---+---+---+---+---+---+
     * |       |                           |   2*n
     * +-------+
     * |   |   |                           |
     * +---+---+---+---+---+---+---+---+---+
     *  1H <-----------(n-1)--------------->
     * => If we are placing one tile horizontally then we will have to 
     *    place second tile also horizontally.
     * 
     * <---------------(n)----------------->
     * +---+---+---+---+---+---+---+---+---+
     * |       |                           |   2*n
     * +-------+
     * |       |                           |
     * +---+---+---+---+---+---+---+---+---+
     *  2H <-----------(n-1)--------------->
     * => So the problem reduces to n-2, so we can call Getways(n-2).
     * 
     * Getways(n)
     * {
     *    if(n <= 3)
     *    {
     *       return n;
     *    }
     * 
     *    return Getways(n-1) + Getways(n-2);
     * }
     * 
     * */
    
    public static int getways(int n) {
        // base case
        if(n  <= 3) {
            return n;
        }

        // recursive call
        return getways(n-1) + getways(n-2);
    }

    public static void main(String[] args) {
        System.out.println("For n=1, total ways: " + getways(1));
        System.out.println("For n=2, total ways: " + getways(2));
        System.out.println("For n=3, total ways: " + getways(3));
        System.out.println("For n=4, total ways: " + getways(4));
        System.out.println("For n=5, total ways: " + getways(5));
    }
}


/**
 * Dry Run:
 * n = 4
 * 
 * getways(4)
 * => n = 4
 * => n <= 3
 * => 4 <= 3 [no]
 * => return gateways(n-1) + gateways(n-2)
 *    return gateways(3) + gateways(2)
 *             (3)       +    (2)
 * 
 *    (a) gateways(3):
 *        => n = 3
 *        => n <= 3
 *        => 3 <= 3 [yes]
 *        => return n => 3
 *    (b) gateways(2):
 *        => n = 2
 *        => 2 <= 3 [yes]
 *        => return n => 2
 * 
 * => gateways(4) = gatways(3) + gateways(2)
 *                = 3 + 2
 *                = 5
 *           
*/