package _26_Stack_And_Queue;

public class _01_Stack {
    public static void main(String[] args) {
        /**
         * Stack:
         * => Stack m koi object ka dher, ek k upar ek objects rakhi hoti hai
         *    usse english m stack kehte hai. Aur data structure wala stack
         *    usi english word se derived hai.
         * => Real Life Example:
         *    (a) Stack of Books (ek k upar ek kitaab)
         *    (b) Stack of Coins in Carrom
         *    (c) Stack of Stones (Pithou Game)
         *    (d) Stack of Rotis
         * 
         * Stack: LIFO(Last In First Out)
         * 1. Stack v ArrayList k tarah dynamic size ka hota hai means size
         *    ko hum kam ya jyda kar skte hai.
         * 2. Stack is disciplined & Queue is disciplined. 
         *    Means ek hi end se add aur ek hi end se remove kr skte hai, aur 
         *    ek hi end se get kar skte hai. That's why stack & queue are
         *    disciplined.
         * 3. Stack m:
         *    (a) push() - add wale function hote hai.
         *    (b) pop()  - remove wale function hote hai.
         *    (c) peak() - get wale function hote hai.
         * 
         *    => Representing stack vertically:
         *       +      +
         *       |  50  | => Push-50 : Last In First Out
         *       |  40  | => Push-40
         *       |  30  | => Push-30
         *       |  20  | => Push-20
         *       |  10  | => Push-10
         *       +------+
         * 
         *       +      +
         *       |  50  | => top -> Pointer always top of the stack pe rehta hai
         *       |  40  | 
         *       |  30  | 
         *       |  20  | 
         *       |  10  | 
         *       +------+
         * 
         * (a) peek(): 50 mil jaega because peak() function return the top of
         *     the stack(top).
         * (b) pop(): pop() se top of stack milta v hai aur stack se remove v
         *     ho jaata hai.
         *       +      +
         *       |  40  |  => Pop(50) : 50 removed
         *       |  30  | 
         *       |  20  | 
         *       |  10  | 
         *       +------+
         * (c) peak(): peak gives the top of the stack. (jhaakna)
         *     => Jb v hum upar se jhaak k dekhte h to humesa upar wala
         *        dikhta hai.
         *       +      +
         *       |  40  |  => peak() : 40 output
         *       |  30  | 
         *       |  20  | 
         *       |  10  | 
         *       +------+
         * => To usse hum ye dekh pae ki stack m element top par hi add
         *    ho skte hai aur top se hi remove aur top wala element hi
         *    hum get kr skte hai:
         * => So, push()
         *        pop()
         *        get()
         *        size()
         *    These are the most important functions of Stack.
         * 
         *       +      + 
         *       |  40  |  
         *       |  30  |  |  30  |  
         *       |  20  |  |  20  |  |  20  |
         *       |  10  |  |  10  |  |  10  |  |  10  | |      |
         *       +------+  +------+  +------+  +------+ +------+
         *       pop(40)    pop(30)   pop(20)   pop(10)   pop() => Error, Stack is empty
         * 
         * */ 

        /**
         * => A stack data structure is also dynamic, just like an arraylist but it
         *    follows LIFO principle i.e. Last In First Out Principle.
         * => The element that is inserted first comes out of it in the last.
         * => The elements are inserted and deleted from top only.
         * 
         *    |     40        40    ^
         *    V   +      +          | <--- Stack at the top
         *       |  30  |  |  30  |  
         *       |  20  |  |  20  |
         *       |  10  |  |  10  |
         *       +------+  +------+
         * => Insertion and Deletion, both occur at the top of the Stack.
         * 
         * Note: Stack m sabhi operations (push, pop, peak, size) O(1) hote hai.
         */ 
        
        /** => Array, ArrayList, LinkedList. Ye teeno data structures ko individually
         *    use kr k Stack bna skte hai.
         * => LinkedList ka use kr k jb hm stack bnate hai tb wo OYO, Amazon etc
         *    jaisi companies m puchi jaati hai.
         * 
         * Array:
         * 1. fixed size: 
         * => Stack k case m ye halki si negative case hai.
         * => Agar humein array ki help se ek stack implement krna hai to
         *    wo humesa fix size ka i.e. 'n' size ka stack hoga, means hm
         *    'n' se jyda data usme daal hi nhi skte.
         * => Array k andr normally elements ko daalte jaenge aur jo last
         *    position hogi usko hum apna top bnaenge.
         * => Array se Stack bnaenge to uske andr humesa check krna pdega ki
         *    kya stack humara full hai. Aur agar full hai to uske andr aur
         *    elements dal nhi skte, isliye array se stack bnana hm prefer
         *    nhi krte.
         * 
         * ArrayList:
         * 1. variable:
         * => ArrayList variable size ka hota hai to yha pe problem solve ho
         *    gyi.
         * => Ye array hi hota hai bss jaise hi array full ho jaata hai to
         *    aur array hum iske end m jod dete hai.
         * 
         * LinkedList:
         * 1. variable:
         * => LinkedList variable size ka hota hai to yha pe problem solve ho
         *    gyi.
         * => LinkedList m humaare kaafi saare nodes hote hai aur saare ek
         *    k baad ek, ek dusre ko point kr rhe hote hai, aur first element
         *    humaara head bn jaata hai.
         *    +-----------+
         *    | 1 | 2 | 3 |
         *    +-----------+
         *     Head
         * => Ye head humaara top hai linkedlist. Humein pta hai linkedlist
         *    m put(), push(), pop() etc sbko O(1) m krna pdta hai. Aur 
         *    LinkedList k andr sirf head aisa element hai jisse dekhne k liye
         *    humein O(1) ka operation lgana pdta hai. Aur yhi logic humein
         *    implement krna hai jb h MAANG Companies m hm baith rhe ho, aur
         *    linkedlist k help se humein Stack bnana hai. 
         * */ 
    }
}
