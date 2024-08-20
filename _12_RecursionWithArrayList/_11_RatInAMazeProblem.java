package _12_RecursionWithArrayList;

public class _11_RatInAMazeProblem {
    /**
     * You are given a starting position for a rat which is stuck in a
     * maze at an initial point (0,0) (the maze can be thought of as
     * a 2-dimensional plane). The maze would be given in  the form of
     * a square matrix of order 'N'*'N' where the cells with value 0
     * represent the maze's blocked locations while value 1 is the
     * open/available path that the rat can take to reach its destination.
     * The rat's destination is at ('N'-1, 'N'-1). Your task is to find 
     * all the possible paths that the rat can take to reach from source 
     * to destination in the maze. The possible directions that it can 
     * take to move in the maze are: 
     * (a) 'U'(up) i.e. (x, y-1), 
     * (b) 'D'(down) i.e. (x, y+1),
     * (c) 'L'(left) i.e. (x-1, y),
     * (d) 'R'(right) i.e. (x+1, y)
     * */ 

    /**
     * 1. Source: (0, 0)
     * 2. Destination: (n-1, n-1) i.e. (3, 3)
     * => Humein rat ko source to destination pahuchana hai, aur jitne
     *    v path exist krte ho unn sb ko print krna hai.
     * 
     * => 1 : Open Path
     * => 0 : Closed Path
     * 
     * Note: Path should be in lexographical order(alhpabetically sorted)
     * 
     *     0   1   2   3 
     *   +---+---+---+---+
     * 0 | 1 | 0 | 0 | 0 |
     *   +---+---+---+---+
     * 1 | 1 | 1 | 0 | 0 |
     *   +---+---+---+---+
     * 2 | 1 | 1 | 0 | 0 |
     *   +---+---+---+---+
     * 3 | 0 | 1 | 1 | 1 |
     *   +---+---+---+---+
    */

    /**
     * Q. Karna kaise hai?
     * => Similar to gold coin example, har path pe jaa k dekhnge.
     * */
    
    /**
     * Approach:
     * 1. arr:
     *     0   1   2   3 
     *   +---+---+---+---+
     * 0 | 1 | 0 | 0 | 0 |
     *   +---+---+---+---+
     * 1 | 1 | 1 | 0 | 0 |
     *   +---+---+---+---+
     * 2 | 1 | 1 | 0 | 0 |
     *   +---+---+---+---+
     * 3 | 0 | 1 | 1 | 1 |
     *   +---+---+---+---+
     * 
     * 2. Visited:
     *     0   1   2   3 
     *   +---+---+---+---+
     * 0 |   |   |   |   |
     *   +---+---+---+---+
     * 1 |   |   |   |   |
     *   +---+---+---+---+
     * 2 |   |   |   |   |
     *   +---+---+---+---+
     * 3 |   |   |   |   |
     *   +---+---+---+---+
     * 
     * => Humaare paas ek array "arr" hai aur ek "visited" array hai
     *    jo starting m sbme "0" mark hoga means koi v position starting
     *    mai visited nhi hongi.
     * => Humein start krna hai: (0, 0)
     *    Humari pehli function call f(0, 0) se jaegi.
     * => Aur jo answer create krna hai humein wo starting m "" empty string
     *    hogi: f(0, 0, "") 
     * => [U, L, D, R] => Lexographical Order m sort krna hai => [D, L, R, U]
     *    To phle hum check krnge:
     *    (a) D => Kya down jaana safe hai? 
     *          => (i) kya arr[new x][new y] == 1 hai?
     *          => (ii) visited[new x][new y] != 1
     *          => (iii) Jaha v jaa rhe hai wo matrix k andr hona chaiye
     *                   new x >= 0 and < n ho
     *                   new y >= 0 and < n ho
     *          => Agar ye 3 condition fulfill ho rhi hai to jaana safe hai
     *          => But (1,0) pe jaane se pehle visitied[0][0] = 1 (true)
     *             mark kr dena.
     *          => Ab hume chalein gye (1,0) pe aur yha pe "D" store kr diya
     *             f(1,0, "D") => (D, L, R, U)
     *             f(2,0, "DD") => (D, L, R, U)
     *             f(2,1, "DDR") => (D, L, R, U)
     *             f(3,1, "DDRD") => (D, L, R, U)
     *             f(3,2, "DDRDR") => (D, L, R, U)
     *             f(3,3, "DDRDRR") => (D, L, R, U) [return back]
     *             => Destination reached, store the answer: DDRDRR
     * 
     * Q. Why we have used visited array?
     * => (0,0) se hum down aae, fir humne bola upar check krte hai, fir
     *    upar se niche check krta hai. Upar niche krte krte infinite loop
     *    m fass jaate.
     * => Visited array use krne k hum mark kr lete hai ki already visitied.
    */

    // Directions to move in the maze
    private static final String[] directions = {"D", "L", "R", "U"};

    // Function to find all possible paths
    public static void findPaths(int[][] maze) {
        int n = maze.length;
        boolean[][] visited = new boolean[n][n];
        findPathsHelper(maze, 0, 0, visited, "");
    }

    // Recursive helper function
    private static void findPathsHelper(int[][] maze, int x, int y, boolean[][] visited, String path) {
        int n = maze.length;
        // Check if destination is reached
        if (x == n - 1 && y == n - 1) {
            System.out.println(path);
            return;
        }

        // Mark current position as visited
        visited[x][y] = true;

        // Explore all possible directions
        for (String direction : directions) {
            int newX = x;
            int newY = y;
            switch (direction) {
                case "D":
                    newX++;
                    break;
                case "L":
                    newY--;
                    break;
                case "R":
                    newY++;
                    break;
                case "U":
                    newX--;
                    break;
            }

            // Check if new position is safe
            if (isSafe(maze, newX, newY, visited)) {
                findPathsHelper(maze, newX, newY, visited, path + direction);
            }
        }

        // Unmark current position as visited (backtracking)
        visited[x][y] = false;
    }

    // Function to check if a position is safe
    private static boolean isSafe(int[][] maze, int x, int y, boolean[][] visited) {
        int n = maze.length;
        return (x >= 0 && x < n && y >= 0 && y < n && maze[x][y] == 1 && !visited[x][y]);
    }

    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };
        findPaths(maze);
    }
}

/**
 * Initial Maze:
 * => 1 0 0 0
 *    1 1 0 0
 *    1 1 0 0
 *    0 1 1 1
 * 
 * Visited Array:
 * => false false false false
 *    false false false false
 *    false false false false
 *    false false false false
 *    
 * Starting Position: (0, 0)
 * Path: ""
 * 
 * Recursive Calls:
 * 1. findPathsHelper(0, 0, "", "D")
 *    => Mark (0, 0) as visited
 *    => Explore directions
 *    => Call findPathsHelper(1, 0, "D", "D")
 * 
 * 2. findPathsHelper(1, 0, "D", "D")
 *    => Mark (1, 0) as visited
 *    => Explore directions
 *    => Call findPathsHelper(2, 0, "DD", "D")
 * 
 * 3. findPathsHelper(2, 0, "DD", "D")
 *    => Mark (2, 0) as visited
 *    => Explore directions
 *    => Call findPathsHelper(2, 1, "DDR", "R")
 * 
 * 4. findPathsHelper(2, 1, "DDR", "R")
 *    => Mark (2, 1) as visited
 *    => Explore directions
 *    => Call findPathsHelper(3, 1, "DDRR", "R")
 * 
 * 5. findPathsHelper(3, 1, "DDRR", "R")
 *    => Mark (3, 1) as visited
 *    => Explore directions
 *    => Call findPathsHelper(3, 2, "DDRRR", "R")
 * 
 * 6. findPathsHelper(3, 2, "DDRRR", "R")
 *    => Mark (3, 2) as visited
 *    => Explore directions
 *    => Call findPathsHelper(3, 3, "DDRRRR", "R")
 * 
 * 7. findPathsHelper(3, 3, "DDRRRR", "R")
 *    => Destination reached, print path: DDRRRRR
*/