package _03_Loops;

public class _11_DoWhileLoop {
    public static void main(String[] args) {
        int x = 2;
        // Starts with do (no condition check) then move to while (condition check)
        do {
            System.out.println(x); // print 2,4,8,16,32,...
            x = x * 2; // x = 4, 8, 16,...
        } while (x <= 1000);
    }
}

// Where we use Do-while loop?
// => Press 1 for Credit Cards
// => Press 2 for Banking Statements
// => Press 3 for Debit Cards
// => ...
// => ...
// => Press 9 to talk to our executive
// => Press * to repeat the menu => But at first it reads all "press" commands.

// Read the menu:
// do {
//     read the menu
// } while(input == '*');