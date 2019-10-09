public class Loops {
    private static final int[] ints = {1, 0};

    // prints positive integers less than or equal to a integer
    private static void countToN(int n) {
        countToN(n, 1);
    }

    // recursive loop
    private static void countToN(int n, int i) {
        int temp;

        // check if n<i
        try {
            temp = 1 / ints[((n - i) >> 31) & 1];
        } catch (ArithmeticException e) {
            return;
        }

        // check if n=i
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
