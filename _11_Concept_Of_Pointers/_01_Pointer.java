package _11_Concept_Of_Pointers;

public class _01_Pointer {
    public static void main(String[] args) {
        /**
         * Q. What is Pointer?
         * Q. Why do we need pointer?
         * 
         * Q. Kya ye line humein smjh m aati hai?
         * => int a = 5;
         * => Iss line se memory m ek integer block liya gya hai aur
         *    humne uss integer block ka naam 'a' de diya hai jiske
         *    andr value '5' store kr diya hai.
         * 
         * Q. Kya memory k block ko hm naam de skte hai?
         * => No!
         * 
         * Q. To memory k storage location ka pta kaise lgate hai?
         * => Address => Maine maan liye jaha humne value '5' rkhi hai
         *    uss container ka naam 'a' hai lekin hm kisi ko v bolnge
         *    container 'a' to kya wo pahuch jaega? No!
         * => Humein address btana pdega. So, it means memory m kisi v
         *    location ko hm address se identify kr skte hai.
         * => Ek data structure hota hai jiska naam hota hai 'Symbol
         *    Table' aur symbol table k andr mapping store hoti hai
         *    humare variable and memory address ki.
         * => int a = 5;
         * 
         * Symbol Table:
         * => a : 104   => 104[5]
         * => Humne 'a' print krne ko bola to Compiler ne Symbol Table
         *    check kiya aur 'a' ki mapping 104 se thi to 104 address k
         *    andr wale element ko print kr diya.
         * 
         * Q. How can we check ek particular variable kon se address pe pda hai?
         * => Using AddressOf Operator(&) => C++
         * 
         * int a = 5;
         * int b = 5;
         * 
         * cout << &a << endl; => 0x7fff7bfba879
         * cout << &b << endl; => 0x7fff7bfba874
         * 
         * => Different memory location in C/C++.
         * => But in Java we don't have direct access to memory addresses
         *    as we would in Low Level Languages like C or C++.
         * => Java abstract away the memory management details to focus on
         *    higher-level programming tasks. However, we can use a few 
         *    techinques to get an idea of where your objects are located
         *    in memory or work with references, though these are more about
         *    understanding the behavior rather than actually accessing memory
         *    addresses.
         *    
          * */ 

        int a = 5;
        System.out.println(a);
        System.out.println(System.identityHashCode(a)); // Hash code

        int b = 5;
        System.out.println(b);
        System.out.println(System.identityHashCode(b)); // Hash code

        /**
         * Hash Code are used to identify the objects.
         * => If we compare a == b, it will print true because both
         *    variables have the same value 5. 
         * => == Operator checks for value equality, not reference equality.
        */
        System.out.println(a == b); // true => Same value but not same address
        
    }
}
