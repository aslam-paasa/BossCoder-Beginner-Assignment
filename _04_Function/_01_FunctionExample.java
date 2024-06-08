package _04_Function;

public class _01_FunctionExample {

    // <return_type> <name_of_function>(parameters) {
    //      body of fn
    // }
    public static int f(int x, int y) {
        return x+2*y;
    }
    public static void main(String[] args) {
        System.out.println(f(4, 5));
    }
}

// 26:34