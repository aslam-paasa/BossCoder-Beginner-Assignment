package _09_Recursion_Basic;

public class _01_Understand_StackTrace {
    /**
     * 1. Function jb chlta hai to Stack m GEC bn jaata hai.
     * 
    */
    public static void main(String[] args) {
        System.out.println("1");
        Fun();
        System.out.println("2");
    }

    /**
     * 2. But Function k andr jb Function call hota hai to GEC k upar
     *    ek LEC bn jaata hai. Aur jb LEC khtm ho jaata hai to ye
     *    erase ho jaata hai aur hum wapas niche wale GEC m aa jaate
     *    hai.
    */
    public static void Fun() {
        System.out.println("1.1");
        Gun();
        System.out.println("1.2");
    }

    /**
     * 3. LEC k upar LEC bnaega
    */
    public static void Gun() {
        System.out.println("1.1.1");
        System.out.println("1.1.2");
        System.out.println("1.1.3");
    }

    /**
     * Note: Yha pe main m se Fun() ko call kr rhe the aur Fun() m se
     *       Gun(). Agar koi function khud ko hi call krta hai to usse
     *       recursion bolte hai. 
     * => Recursion is function calling itself.
    */
}
