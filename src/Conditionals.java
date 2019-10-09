public class Conditionals {
    private static final int[] ints = {1, 0};

    private static int max(int a, int b) {
        int temp;

        // check if a<b
        try {
            temp = 1 / ints[((a - b) >> 31) & 1];
        } catch (ArithmeticException e) {
            return b;
        }

        return a;
    }

    public static void main(String[] args) {
        System.out.println(max(3, 5));
    }
}