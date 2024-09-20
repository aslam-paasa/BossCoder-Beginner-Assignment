package _19_LinkedList;
/**
 * Classes and Objects:
 * => 3 pillars of OOPS:
 *    (a) Encapsulation
 *    (b) Polymorphism
 *    (c) Inheritance
 * => Avi tk humne memory & variables dekha hai. Agar data hai to
 *    kuch stack m hai kuch heap. Agar array bnaya to elements heap m
 *    hai aur stack m sirf uska address hai. Aur variable like int hai
 *    to wo stack m pde hai.
 * => Functions[action] + variable[data]
 * => Encapsulation = Functions[activity] + variable[data]
 *    Encapsulation is putting functions & data together in one place.
*/ 
public class _02_ConceptOfClassAndObjects {

    /**
     * 1. Class bna rhe hai jisse bahut saare Person bnae jaa skte hai.
     * 2. Class is actually a memory jo avi tk occupy hui nhi hai.
     * 3. Person Class ko use kr k hm bahut saare "instance" bna skte hai
     *    
    */
    private static class Person {
        /**
         * Encapsulation = Functions[activity] + variable[data]
         */ 
        String name;
        int age;

        void sayHi() {
            if(this.age > 30) {
                System.out.println("Hello from " + this.name);
            } else {
                System.out.println("Hi from " + this.name);
            }
        }
    }

    public static void main(String[] args) {
        /**
         * Creating instance:
         * */
        Person p1;
        p1 = new Person();
        p1.age = 34;
        p1.name = "Sumeet";
        p1.sayHi();

        Person p2;
        p2 = new Person();
        p2.age = 25;
        p2.name = "Shashank";
        p2.sayHi();

        Person p3 = p2;
        p3.age = 22;
        p3.name = "Amit";
        p3.sayHi();

        p2.sayHi();
    }
}

/**
 * 1. Person p1;         2. p1 = new Person();
 *    +             +
 *    |             |    Object/Instance(4k)
 *    |             |    +-----------+
 *    |             |    | name = __ |
 *    |             |    | age  = 0  |
 * P1 |    null     |    +-----------+
 *    +-------------+
 * => This p1 is a reference which doesn't point to anything that is
 *    why it is pointing to null.
 * 
 * 1. Person p1;         2. p1 = new Person();
 *    +             +
 *    |             |    Object/Instance(4k)
 *    |             |    +-----------+
 *    |             |    | name = __ |
 *    |             |    | age  = 0  |
 * P1 |     4k      |===>+-----------+
 *    +-------------+  
 *     Reference ========> Instance  
 * 
 * => Reference/Pointing to an object(addr stored here) 
 * => Instance of a class(data stored here)
 * 
 * 
 * 3. p1.sayHi()
 * 
 *                   Stack               Heap
 *               +             +
 *               |             |    Object/Instance(4k)
 *               +-------------+    +-----------+
 * sayHi()[this] |     4k      |    | name = __ |
 *               +-------------+    | age  = 0  |
 *            P1 |     4k      |===>+-----------+
 *               +-------------+  
 *                Reference ========> Instance 
 * 
 * => sayHi() run hone pe main k upar m local area bna jaega aur usme
 *    ek parameter humaare bina paas kre paas ho jaega i.e."this" aur
 *    jisme "4k".
 * => Ab hum likhte hai "this.age > 30". To pehle ye 4k pe jaa k fir heap
 *    m jaega aur check krega "this.age = 34" i.e. > 30, to ye "if()"
 *    condition run krega.
 * => Output: Hello from Sumeet.
 * => Print krne k baad ye function wipe out ho jaega.
 * 
 * Note: We have learnt:
 * (a) Class
 * (b) Object
 * (c) Reference
 * (d) Instance
 * (e) this
 * (f) Data Members
 * (g) Methods
 * (h) new operator => used to create a new instance
*/

/**
 * Person p3 = p2;
 * p3.age = 22;
 * p3.name = "Amit";
 * p3.sayHi();
 *
 * p2.sayHi();
 *
 *                   Stack               Heap
 *               +             +
 *            p3 |     5k      |    Object/Instance(4k)
 *               +-------------+    +------------+
 *            p2 |     5k      |===>| name = Amit|
 *               +-------------+    | age  = 22  |
 *            P1 |     4k      |    +-----------+
 *               +-------------+  
 *                Reference ========> Instance 
 * 
 * => p3 & p2 points at the same object.
 * => Ab jb hum "p3.age = 22" karnge, to we have to realize that p3 & p2
 *    same hai, means ye changes p2 m v reflect hoga.
 * => Ab sayHi() function run krnge, aur to p3 & p2 dono "Hi Amit" print
 *    karega.
*/