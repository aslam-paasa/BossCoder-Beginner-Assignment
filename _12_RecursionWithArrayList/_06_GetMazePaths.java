package _12_RecursionWithArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class _06_GetMazePaths {
    /**
     * Get Maze paths:
     * +---+---+---+
     * | S |   |   |
     * +---+---+---+
     * |   |   |   |
     * +---+---+---+
     * |   |   |   |
     * +---+---+---+
     * => We start from [0,0] and we have to reach [2,2]. Hum ek baar
     *    m sirf ek step le skte hai, either horizontal or vertical.
     *    Step-1: [0,0] => 
     *            (a) Horizontal: [0,1] => how many possible paths to reach destination:
     *                                     (a) VVH
     *                                     (b) VHV
     *                                     (c) HVV
     *                => Agar humein [0,0] se raasta chaiye to sbske aage "H" lagega:
     *                                     (a) HVVH
     *                                     (b) HVHV
     *                                     (c) HHVV   
     *            (b) Vertical  : [1,0] => how many possible paths to reach destination:
     *                                     (a) VHH
     *                                     (b) HVH
     *                                     (c) HHV
     *                => Agar humein [0,0] se raasta chaiye to sbske aage "V" lagega:
     *                                     (a) VVVH
     *                                     (b) VVHV
     *                                     (c) VHVV 
     * 
     * Note: Always draw source-to-destination diagram for analysis.
     * 
     * */ 

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();

        /**
         * All the recursive function to get all possible paths from the 
         * top-left to the bottom-right:
         * 
        */
        ArrayList<String> paths = getMazePaths(1, 1, rows, cols);
        System.out.println(paths);;
    }

    // sr => source row
    // sc => source column
    // dr => destination row
    // dc => destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

        /** 
         * Base Case:
         * 1. If the current position is out of bounds (i.e., beyond the destination),
         *    return an empty list.
        */
        if(sr > dr || sc > dc) {
            ArrayList<String> baseResult = new ArrayList<>();
            return baseResult; 
        } 
        /**
         * 2.  If the current position is exactly the destination, return a list with 
         *     an empty string to indicate a valid path.
        */
        else if(sr == dr && sc == dc) {
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }

        /**
         * Recursive Relation:
         * 1. Create a list to store all possible paths from the current position
         * 2. Recursively get all paths from the next horizontal position (moving right).
         * 3. Recursively get all paths from the next vertical position (moving down)
        */
        ArrayList<String> myPaths = new ArrayList<>();
        ArrayList<String> myHorizontalPaths = getMazePaths(sr, sc+1, dr, dc);
        ArrayList<String> myVerticalPaths = getMazePaths(sr+1, sc, dr, dc);

        /**
         * For each path obtained by moving horizontally, add an 'h' at the start to 
         * indicate the horizontal move:
        */
        for(String myHPath : myHorizontalPaths) {
            myPaths.add("h" + myHPath);
        }

        /**
         * For each path obtained by moving vertically, add a 'v' at the start to 
         * indicate the vertical move
        */
        for(String myVPath : myVerticalPaths) {
            myPaths.add("v" + myVPath);
        }

        /**
         * Return the list of all possible paths from the current position
        */
        return myPaths;
    }
}
