package _24_NumberSystemAndBitManipulation;

public class _07_OctalBaseAddition {
    public static void main(String[] args) {
        int b = 8;
        int n1 = 257;
        int n2 = 62;

        int ans = 0, mult = 1, carry = 0;

        while(n1>0 || n2>0 || carry>0) {
            int d1 = n1%10;
            n1=n1/10;

            int d2 = n2%10;
            n2=n2/10;

            int sum = d1+d2+carry;
            int dig = sum%b;
            carry=sum/b;

            ans = ans+dig*mult;
            mult = mult*10;

        }
        System.out.println(ans);
    }
}
