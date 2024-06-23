package _03_Loops;

public class _08_BreakTheLoopInBetween {
    public static void main(String[] args) {
        int x;

        for(x = 2; x <= 100; x+=2) {
            if(x == 54) {
                break; // break the current iteration
            }
            System.out.println(x); 
        }
    }
}

// Note: Suppose if we are looking for a value in a loop. If we found
//       the value, we can use 'break' to stop the iteration.