package _04_Function;

public class _02_TypesOfFunctions {
    public static void main(String[] args) {
        /**
         * Types of functions:
         * (a) In-built functions
         * (b) User defined function
        */

        // In-built function
        int a = 10, b = 20;
        int builtInFunction = Math.max(a, b); 
        System.out.println("Max of " + a + " & " + b + " is " + builtInFunction);

        System.out.println();

        // User defined function
        playGame();
    }

    // User defined function
    public static void playGame() {
        System.out.println("Think of a number b/w 1 to 10"); // x
        System.out.println("Multiply the number by 2"); // 2x
        System.out.println("Add 4"); // 2x+4
        System.out.println("Divide current number by 2"); // x+2
        System.out.println("Subtract this number by the number you thought of initially"); 
        System.out.println("THE NUMBER YOU ARE LEFT WITH IS 2.....");
    }
}

/**Examples of function:
 * 1. Maximize, Minimize and close button in a window.
 * 2. Set an alarm
*/ 