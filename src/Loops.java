// implements basic loops
public class Loops {
    private static final int[] ints = {1, 0};
    private static int temp;

    // countToN counts to n
    private static void countToN(int n) {
        countToN(n, 1);
    }

    private static void countToN(int n, int i) {
        try {
            temp = 1 / ints[((n - i) >> 31) & 1];
        } catch (ArithmeticException e) {
            return;
        }
        try {
            temp = 1 / (n - i);
        } catch (ArithmeticException e) {
            System.out.println(n);
            return;
        }
        System.out.println(i);
        countToN(n, i + 1);
    }

    public static void main(String[] args) {
        countToN(10);
    }
}
