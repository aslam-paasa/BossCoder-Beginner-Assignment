package _08_String;

public class _18_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");

        char ch = sb.charAt(0);
        System.out.println(ch);

        sb.setCharAt(0, 'b'); // change
        System.out.println(sb);

        sb.deleteCharAt(0); // remove
        System.out.println(sb);

        sb.delete(0, 2); // remove multiple char
        System.out.println(sb); 

        sb.insert(0, 't'); // insert
        System.out.println(sb);

        String s = sb.toString(); // convert to string
        System.out.println(s);
    }
}
