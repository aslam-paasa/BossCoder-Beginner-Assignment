package _08_String;

public class _16_StringInterningAndImmutability {
/**
 * Q. What is Interning?
 * => String s1 = "hello";
 *    String s2 = "hello";
 *    String s3 = new String("hello");
 * 
 * +        +       +                 +
 * |        |       |  Intern Pool    |
 * |S4 = S1 |       |  +-----------+  |
 * |S3 -> 6k| 6k[5k]|  |           |  |
 * |S2 -> 4k|======>|  |[5k] hello |  |
 * |S1 -> 4K|======>|  +-----------+  |
 * +--------+ 4k[5k]+-----------------+
 *  Stack                  Heap
 * 
 * => s1 ne jb "hello" bnaya to wo 4k address pe heap k andr "Intern
 *    Pool" memory m store hua.
 * => s2 ne jb "hello" bnaya to wo pehle se pda tha to use new nhi
 *    bnaya, usne 4k pe hi point kr diya
 * => S3 ne jb "hello" bnaya to wo ek new object pe bnaya i.e. 5k,
 *    lekin wo v usi ko point kr rha tha.
 * => Isko bolte hai "Interning" means agar same content hai to alag
 *    alag String same jagha point kregi.
 * Note: S4 = S1 is not interning.
 * */ 

/**
 * Q. Why interning?
 * => To save space
 * => Strings are made immutable in some languages to optimize memory 
 *    utilization and improve the security.
*/

/**
 * Q. Implications:
 * => Means isse fark kya pdta hai:
 * (a) We cannot use "==", we have to use ".equals()".
 * (b) Strings Immutable ho gyi.
 * 
 * Note: 
 * 1. '==' : It is used to compare the addresses.
 * 2. 's1.equals(s2)' : It is used to compare the content.
 * 
 * i. s1 == s2 [true]
 *    4k == 4k [true]
 * ii. s1 == s3 [false]
 *     4k == 6k [false]
 * 
*/

    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "hello"; // interning
        String s3 = new String("hello"); // interning
        String s4 = s1; // ref copy

        /**
         * 1. '==' : It is used to compare the addresses(stack).
         * 2. 's1.equals(s2)' : It is used to compare address(stack)
         *     (if equals returns true, otherwise checks the content).
        */

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        
        /**
         * Compare:
         * 1. 4k == 4k 
        */

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        /**
         * Compare:
         * 1. 4k equals 6k [false] => If wrong, check char by char
         * 2. hello equals hello [true] => Content true
        */

/**
 * Q. What is immutable?
 * 
 * +              +       +                 +
 * |              |       |  Intern Pool    |
 * |              |6k[7k] |  +-----------+  |
 * |S  -> 6k      |======>|  |[7k] bye   |  |
 * |S  -> 4K      |======>|  |[5k] hello |  |
 * |              | 4k[5k]|  +-----------+  |
 * +--------------+       +-----------------+
 *  Stack                  Heap
 * 
 * => Jb humne s = bye likha to 4k pe change nhi aaya, ek new object bn
 *    gya i.e. 6k jo 7k pe point kr rha hai "bye" ko. Aur pointer 4k se
 *    se hatt kr 6k ki aur point krna start kr diya.
 * Note: References are mutable[4k] & [6k], 
 *       Instances are immutable[5k] & [7k].
 *       Humne bss kisi aur jagha point kr diya.
 * 
 * => Agar java humein instances change krna allow krta to hm jb s1
 *    pe jaa k changes krte "hello => bello", ye changes s2 m v ho
 *    jaata qki dono ki references same instance ko point kr rhi hai.
 *    Isliye java ne saare functions hata diye jisse hum iske instances
 *    ko change kr sake.
 * 
 * Q. Why s1 and s2 are ref are pointing at same instance?
 * => To save space. But jb s2 m changes krte hai to uska reference
 *    point dusre instance ko point krne lgti hai.
*/

/**
 * Q. Why immutable?
 * => Because of interning, many strings point at same instance.
 * => Changing one would change many.[To avoid that we are not allowed
 *    to change in the instance].
 * Note: Java ne jo raita failaya due to interning wo samet rha hai.
*/
    }
}
