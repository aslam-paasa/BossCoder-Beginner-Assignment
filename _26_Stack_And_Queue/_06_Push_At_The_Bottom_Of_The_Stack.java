package _26_Stack_And_Queue;

import java.util.Stack;

public class _06_Push_At_The_Bottom_Of_The_Stack {
    public static void main(String[] args) {
        /**
         * Q. Push at the Bottom of the Stack:
         * => Push humesa stack k top pe hota hai.
         * => But we have to push at the bottom of the stack, aur upar wala stack waise hi rhega
         * 
         * 
         * => Humaare paas elements ko bottom pe push krna tb aasan hoga jb element km honge:
         *    +     +
         *    |     |
         *    |  2  |
         *    |  1  |
         *    +-----+
         * => Agar hum 3,2,1 m se 3 ko bahar nikaal de to 4 ko bottom m push krna
         *    jyda aasan hota.
         * => Ab stack ko aur chota kr diya jae: 2,1 m se 2 nikaal de to push
         *    krna aur aasan ho jaata.
         * => 4 ko push krna aur aasan ho jaata jb 1 ko v nikaal dete. Ab 4 ko
         *    khali stack k andr push krna sbse aasan hai.
         * 
         *    +     +
         *    |     |
         *    |  4  |
         *    +-----+
         * 
         * => Ab main kaam hai baaki k saare elements ko usi order m daalna.
         * => Elements ko dobara daalne k liye dobara se push kr denge stack
         *    k andr jisko last m nikaala tha.
         *    +     +
         *    |     |
         *    |  1  |
         *    |  4  |
         *    +-----+
         * 
         *    +     +
         *    |     |
         *    |  1  |
         *    |  4  |
         *    +-----+
         * 
         *    +     +
         *    |     |
         *    |  2  |
         *    |  1  |
         *    |  4  |
         *    +-----+
         * 
         *    +     +
         *    |  3  |
         *    |  2  |
         *    |  1  |
         *    |  4  |
         *    +-----+
         * 
         * => Basically hum ek ek kr k elements ko bahar nikaal rhe hai fir ek
         *    ek kr k elements ko andr daal rhe hai. Iss tarike k jb v hum flow
         *    dekhte hai kisi v algorithm m to humein yaad aati hai "recursion".
         * => Recursion m yhi hoti hai ki jo chij pehle nikalti hai wo baad m
         *    dalti hai aur jo chij baad m nikalti hai wo pehle dalti hai.
         * 
         * TC: O(n)
         * */
        
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        // pushAtBottom
    }
}
