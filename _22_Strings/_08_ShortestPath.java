package _22_Strings;

public class _08_ShortestPath {
    public static void main(String[] args) {
        
        /**
         * Q. Given a route containing 4 directions (E,W,N,S)
         *    Find the shortest path to reach destination.
         * => WNEENESENNN
         * 
         * Calculate Final Coordinates:
         * Start at (0, 0)
         *  W -> (-1, 0)
         *  N -> (-1, 1)
         *  E -> (0, 1)
         *  E -> (1, 1)
         *  N -> (1, 2)
         *  E -> (2, 2)
         *  S -> (2, 1)
         *  E -> (3, 1)
         *  N -> (3, 2)
         *  N -> (3, 3)
         *  N -> (3, 4)
         *  
         *                N
         *                |        + (3,4)
         *                |        |
         *                |        |
         *                |  +--+  |
         *                |  |  |  |
         *             +--|--+  +--+
         *             |  |
         *    W<-------+------------->E
         *                |
         *                |
         *                |
         *                |
         *                |
         *                S
         * 
         * => Shortest Path => Displacement Formula: 
         * => root[(x2-x1)^2 + (y1-y2)^2]
         * => root[(3-0)^2 + (4-0)^2]
         * => root[9+16]
         * => root[25]
         * => 5
         * 
         * Logic:
         * => x = 0, y = 0
         * => N: y = +1
         * => S: y = -1
         * => W: x = -1
         * => E: x = +1
         * 
         * TC: O(n)
         * */ 

        String path = "WNEENESENNN";
        String path01 = "NS";
        System.out.println(getShortestPath(path));
        System.out.println(getShortestPath(path01));
    }

    public static float getShortestPath(String path) {
        int x = 0; 
        int y = 0;

        for(int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);

            // South
            if(direction == 'S') {
                y--;
            }

            // North
            else if(direction == 'N'){
                y++;
            }

            // West
            else if(direction == 'W'){
                x--;
            }

            // East
            else {
                x++;
            }
        }
        int x2 = (x*x);
        int y2 = (y*y);

        return (float)Math.sqrt(x2 + y2);
    }
}
