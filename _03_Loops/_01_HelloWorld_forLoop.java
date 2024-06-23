package _03_Loops;

/**
 * Loops: 
 * => Executes itself in a repeatitive fashion.
 * => Examples:
 *    (a) Clock
 *    (b) Music Player
 *    (c) Daily Routine
 *    (d) Alarm
 * 
 * Q. WAP to print "Hello World" 10 times.
 * 
 * Note: 
 * 1. "Initialization" happens only once at the start of the loop.
 * 2. "Condition" check takes place before each iteration.
 * 3. "Updation" happens after the end of each iteration.
 * 
 * Initialization:
 * (i) int x = 1
 * (ii) char a = '$'
 * (iii) String str = "Hello"
 * 
 * Boolean Condition:
 * (i) x <= 10
 * (ii) x >= 0
 * (iii) a == '$'
 * 
 * Updation:
 * (i) x = x + 1
 * (ii) x = x - 1
 * (iii) x = x * 5
*/

public class _01_HelloWorld_forLoop {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i = i+1) {
            System.out.println("Hello World " + i);
        }
    }
}

/**
 * 1. Initialization happens only once at the start of the loop.
 * 2. Condition check takes place before each iteration.
 * 3. Updation happens after the end of each iteration.*/ 