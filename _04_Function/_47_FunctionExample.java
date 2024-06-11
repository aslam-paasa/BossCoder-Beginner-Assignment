package _04_Function;

public class _47_FunctionExample {

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

// Note: In static, no object is required, we use the variable or function.
// => If I am asking what is the number of tyres of car in a mass manufacturing
//    factory, we don't need to take a particular car to tell. Without any 
//    specific model of car we can tell how many tyres are in a car. Car tyres
//    are same for all models i.e. global, so we can store it in a variable,
//    an no need to create object.
// => But maximum speed of the car vary from model to model. For maximum speed,
//    we have to create car model object, and inside that object we can define
//    the car model details like maximum speed. So, maximum speed is non-static.
// Note: 'static' are the global details which are same for all cars like no of tyres.
//       where as objects are specific car model details like maximum speed of a 
//       particular model of car (non-static).

// => For "x+2*y", we don't need an object because the calculation is same for all, 
//    only values stored in variables (x & y) are changing.

// Note: Read Method Overloading & Method Overriding.