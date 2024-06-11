package _04_Function;

public class _56_CheckDivisibility {
    public static void main(String[] args) {
        int n[] = {100, 200, 300, 400, 500};

        // 100 and 150
        boolean flag = false;
        for(int i=0; i<4; i++) {
            if(n[i]%100 == 0 && n[i]%150 == 0) {
                flag = true;
            }
        }
        System.out.println(flag);
    }
}
