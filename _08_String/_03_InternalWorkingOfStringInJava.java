package _08_String;

public class _03_InternalWorkingOfStringInJava {
    public static void main(String[] args) {
        
        /**
         * Internal Working of String:
         * => String str = "Hello";
         * => One we declare this, there would be a heap memory. Inside this heap memory, there
         *    is a pool known as String Constant Pool.
         * => All the String Literals are stored inside this pool. So, once we create "str = Hello".
         *    This str will start pointing to a literal, the value of which is equal to "Hello".
         * 
         * => String str2 = "World";
         * => Once we declare this, a search will be initiated to find if inside this "String Constant Pool"
         *    there is already a literal having the value "World" or not? 
         * => No!, So a new literal will be created having the value "World" and "str2" will be pointing to
         *    this new literal.
         * 
         * => String str3 = "Hello";
         * => Let's say "str3" is created, and this is also having the value "Hello". But this "Hello" is
         *    already present. And since this Hello is already present, no new Hello will be created.
         * => This str3 is going to point to the same "Hello".
         * 
         * Note: If Str1 is updated this Str3 become modified, that's why updation is not allowed in String.
         *       This also saved good amount of space/memory.
         * Example: If two people have same password then both variables are pointing to the same value.
         *          This saves a lot of space.
         * 
         * Q. Now Person P1 wants to change his password, how can he change his password to something else?
         * Q. Should we allow P1 to change his password?
         * => No!, but we have to allow this feature of changing password.
         * => For that, variable name will be the same, only we changing the literal where the variable is
         *    pointing. Either create new literal or point to some existing literal, but the current literal
         *    stored in String Constant Pool cannot be changed because some other Person is pointing to that
         *    password.
         * => But if there are any literal in String Constant Pool, no variable is pointing/using, these kind
         *    of thing are called as dangling pointers. (Unused memory pointer) 
         * => A garbage collector will come and find these kind of variables, delete is from memory and will
         *    go away. (GC removes unused memory)
         * 
         * 
         * Q. We don't want to create things in unified manner. How can we separate things out?
         *    Means everytime we create "abcd@123" password, it should be a new "abcd@123"?
         * => String str4 = new String("Hello"); => This will be created as an object, and this
         *    will not go inside the String Constant Pool. These will be created outside the 
         *    String Constant Pool but inside the Heap Memory.
         * => So, str4 is pointing to "Hello".
         * 
         * String str5 = new String("Hello");
         * => It is going to create new object and both these "Hello" have different addresses. 
         * => So, there will be no immutability.
        */

        System.out.println("Comparing Literal: ");
        String s1 = "Hello";
        String s2 = "Hello";

        /**
         * 1. '==' : It is used to compare the addresses.
         * 2. 's1.equals(s2)' : It is used to compare the content.
        */

        if(s1 == s2) {
            System.out.println("Literals are pointing to the same address");
        } else {
            System.out.println("Literals are pointing to different address");
        }


        System.out.println();


        System.out.println("Comparing Objects:");
        String s3 = new String("World");
        String s4 = new String("World");

        if(s3 == s4) {
            System.out.println("Objects are pointing to the same address");
        } else {
            System.out.println("Objects are pointing to different address");
        }


        /**
         * Q. Why String are immutable?
         * => Strings are made immutable in some languages to optimize memory utilization 
         *    and improve the security.
        */
    }
}
