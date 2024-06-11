package _04_Function;

public class _54_Pattern {
    public static void main(String[] args) {
        int weeks = 4, days = 7;

        for (int i = 1; i <= weeks; i++) {
            System.out.println("Week " + i);
            for (int j = 1; j <= days; j++) {
                System.out.print("Day" + j + " ");
            }
            System.out.println();
        }
    }
}
