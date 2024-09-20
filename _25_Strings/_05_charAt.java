package _25_Strings;

public class _05_charAt {
    public static void main(String[] args) {
        String str = "hello world";

        /**
         * Retrieve the value/String:
         * 1. s1[0] = "hello"
         * 2. char ch = s[0]
         * => Aise kuch nhi hota hai data set change krne k liye
         * 
         * 3. char ch = s1.charAt(0);
         * => Agar 0th element ya character nikaalna hai to
         */
        char ch = str.charAt(0);
        System.out.println(ch);

        /**
         * String Concatenation:
         */
        String firstName = "Mohammad";
        String lastName = "Aslam";
        String fullName = firstName + " " + lastName;

        /**
         * Print specific element of the letter:
        */
        System.out.println("First word of Mohammad is : " + fullName.charAt(0));

        /**
         * Print all the elements of the letter:
        */
        for(int i = 0; i < fullName.length(); i++){
            System.out.print(fullName.charAt(i));
        }
    }
}
