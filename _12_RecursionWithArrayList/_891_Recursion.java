package _12_RecursionWithArrayList;

public class _891_Recursion {
    /**
     * Q. What is happening over here?
     * => A function is calling another function.
     * => When message4() was called, printing done, function over, it
     *    will come out of it. When it comes out to message3(), this
     *    message3() is also over, and it will come out to message2().
     *    When message2() was finished, it will come out to message1().
     *    Message1() is finsihed, so it will be come out to main(), and
     *    main() fn is executed, so program will be terminated.
    */
    public static void main(String[] args) {
        message1();
    } 

    public static void message1() {
        System.out.println("Hello World!");
        message2();
    }

    public static void message2() {
        System.out.println("Hello World!");
        message3();
    }

    public static void message3() {
        System.out.println("Hello World!");
        message4();
    }

    public static void message4() {
        System.out.println("Hello World!");
    }
}
