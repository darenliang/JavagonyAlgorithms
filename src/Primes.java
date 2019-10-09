public class Primes {
    private static final int[] ints = {1, 0};

    // returns whether an integer is a prime or not
    private static boolean isPrime(int n) {
        return isPrime(n, 2);
    }

    // recursive loop
    private static boolean isPrime(int n, int i) {
        int temp;

        // check if n<2
        try {
            temp = 1 / ints[((n - 2) >> 31) & 1];
        } catch (ArithmeticException e) {
            return false;
        }

        // check if n=2
        try {
            temp = 1 / (n - 2);
        } catch (ArithmeticException e) {
            return true;
        }

        // check if n is divisible by a number
        try {
            temp = 1 / (n % i);
        } catch (ArithmeticException e) {
            return false;
        }

        // check if divisor becomes to large
        try {
            temp = 1 / ints[((n - i * i) >> 31) & 1];
        } catch (ArithmeticException e) {
            return true;
        }

        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {
        System.out.println("2: " + isPrime(2));
        System.out.println("3: " + isPrime(3));
        System.out.println("91: " + isPrime(91));
        System.out.println("101: " + isPrime(101));
        System.out.println("1001: " + isPrime(1001));
    }
}
