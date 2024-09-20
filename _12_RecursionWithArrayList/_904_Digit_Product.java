package _12_RecursionWithArrayList;

public class _904_Digit_Product {
    public static void main(String[] args) {
        int ans = prod(55);
        System.out.println(ans);
    }

    public static int prod(int n) {
        if(n%10 == n) {
            return n;
        }

        return(n%10) * prod(n/10);
    }
}
