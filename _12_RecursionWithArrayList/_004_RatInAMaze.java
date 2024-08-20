package _12_RecursionWithArrayList;

public class _004_RatInAMaze {
    /**
     * Rat in a Maze:
     * => Count all the ways to reach the destination in a maze.
     * => Count is an example of enumeration backtracking.
     * 
     * => We have a 2D maze where 0 represents clear path(path which we
     *    can travel) and -1 represents blockage.
     * => Example: Maze
     *    S
     *    0   0   0   0
     *    0  -1   0   0
     *   -1   0   0   0
     *    0   0   0   0 <= D
     * 
     * 1. Source = starting point => maze[0][0]
     * 2. Destination = Exit Point => maze[n-1][n-1] => maze[3][3]
     * 
     * => Move directions to check for destination:
     * 
     *  1. Direction: "i" is contant, only "j" is moving.
     *    right  (0, 0) => (0, 1 )
     *            i  j      i j+1
     * 
     *    left   (1, 2) => (1, 1 )
     *            i  j      i j-1
     * 
     * 2. Direction: "i" is moving, "j" is constant
     *    bottom (1, 0) => (2, 0 )
     *            i  j     i+1 j
     * 
     *    top    (2, 2) => (1, 2 )
     *            i  j     i-1 j
     * 
     * We need to take care of 2 things:
     * 1. Increment the count if path is possible in bottom or right
     *    direction. [i, j+1] & [i+1, j]
     *     0    0    0    0
     *     0 -> 1 -> 2 -> 3
     * 
     * 2. Check for the blockage
     *    (a) maze[i][j] == -1 => blockage (we cannot move)
     *    (b) Base Case:
     *        (i) Return if source is blocked
     *            if(maze[0][0] == -1) { return }
     *        (ii) If destination is blocked, return 0.
     *            if(maze[n-1][n-1] == -1) { return 0 }
     * 
     * Steps:
     * 1. If current cell has a blockage then do not change.
     *    if(maze[i][j] == -1) { continue }
     * 2. If we can move to maze[i][j] from maze[i-1][j] then increment
     *    the count.
     *    if(maze[i-1][j] > 0) {
     *       maze[i][j] = maze[i][j] + maze[i-1][j]
     *    }
     * 3. If we can move to maze[i][j] from maze[i][j-1] then increment
     *    the count.
     *    if(maze[i][j-1] > 0) {
     *       maze[i][j] = maze[i][j] + maze[i][j-1]
     *    }
     * 
     *   
    */ 

    public static int countPaths(int[][] maze, int n) {

        /**
         * If source or destination are blocked then return 0
        */
        if(maze[0][0] == -1 || maze[n-1][n-1] == -1) {
            return 0;
        }

        /**
         * Initialize the topmost column
        */
        for(int i = 0; i < n; i++) {
            if(maze[i][0] == 0) {
                maze[i][0] = 1;
            } 
            
            /**
             * If there is blockage then break
             * */ 
            else {
                break;
            }
        }

        /**
         * Initialize the topmost row
         * => 0th row humari col ne check kr li isliye 1 se start kr rhe
        */
        for(int i = 1; i < n; i++) {
            if(maze[0][i] == 0) {
                maze[0][i] = 1;
            } 
            // if there is blockage then break
            else {
                break;
            }
        }

        // if maze[i][j] = -1 then ignore otherwise compute the value
        // of count recursively.
        for(int i = 1; i < n; i++) {
            for(int j = 1; j < n; j++) {
                // check for blockage
                if(maze[i][j] == -1) {
                    continue;
                }

                // if we can reach maze[i][j] from maze[i-1][j] then
                // increment the count.
                if(maze[i-1][j] > 0) {
                    maze[i][j] = maze[i][j] + maze[i-1][j];
                }

                // if we can reach maze[i][j] from maze[i][j-1] then increment the count
                if(maze[i][j-1] > 0) {
                    maze[i][j] = maze[i][j] + maze[i][j-1];
                }
            }
        }
        return maze[n-1][n-1];
    }
    public static void main(String[] args) {
        int[][] maze = {{0, 0, 0, 0}, 
                        {0, -1, 0, 0}, 
                        {-1, 0, 0, 0},
                        {0, 0, 0, 0}
                        };

        System.out.println("Counts : " + countPaths(maze, maze.length));
    }
}
