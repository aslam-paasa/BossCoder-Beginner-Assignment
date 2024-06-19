package _03_Loops;

import java.util.Scanner;

/**
 * https://leetcode.com/problems/reverse-integer/submissions/1289198808/
*/

public class _39_ReverseNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // reverse the number - 1234 -> 4321
        int number = scn.nextInt();
        int reverse = 0;

        while (number > 0) {
            int remainder = number % 10;

            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println(reverse);
    }
}

/*Reverse things helps improve your problem-solving skills. It's a common task
  that helps you practice how to manipulate data in different ways. This
  foundational skill can be applied to more complex problems.
  
=> Reversing elements is often used in real-world applications, such as:
   (a) User Interfaces: When we are scrolling through a feed, the latest post 
       might be displayed first. To achieve this, the application might reverse
       the order of posts.
       
   (b) String Manipulation: For instance, checking if a word is palindrome (a word
       that reads the same backward as forward) involves reversing the string and
       comparing it to the original.
       
   (c) Data Processing: In certain algorithms, reversing data can be simplify the
       logic and make the process more efficient.
       
=> Algorithm Efficiency :
   Understanding how to reverse elements efficiently can help make algorithm faster
   and use less memory. Efficient algorithms are crucial for applications that need
   to handle large amounts of data quickly, like search engines or online stores.
   
=> Preparation for Complex tasks :
   Reversing elements is a stepping stone to learning more complex algorithms and
   data structures. Many advanced algorithms build on basic operations like 
   reversing elements. By mastering these basics, you create a strong foundation
   for understanding more complicated concepts.
   
=> Examples of where it is used:
   (a) Text Editing Software: undo & redo functions, the software might reverse the
       sequence of actions you've taken.
   (b) Games: Many games use data structures that require reversing elements to move 
       objects or characters around efficiently.
   (c) Communications: In network communications, data packets might be reversed 
       for encoding and decoding information.**/ 