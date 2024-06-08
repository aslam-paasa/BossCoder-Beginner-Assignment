package _02_ConditionalStatements;

public class _16_TernaryOperator {
    public static void main(String[] args) {
        int grade = 10;

        // condition?<value1>:<value2>
        int x = (grade>8) ? 1 : 0;
        System.out.println(x);
    }
}
