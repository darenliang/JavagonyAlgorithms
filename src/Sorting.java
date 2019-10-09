import java.util.Arrays;

public class Sorting {
    private static final int[] ints = {1, 0};
    private static int temp;

    private static int[] pass(int[] arr, int i) {
        try {
            temp = 1 / (i - arr.length + 1);
        } catch (ArithmeticException e) {
            return arr;
        }
        try {
            temp = 1 / ints[((arr[i + 1] - arr[i]) >> 31) & 1];
        } catch (ArithmeticException e) {
            int temp = arr[i + 1];
            arr[i + 1] = arr[i];
            arr[i] = temp;
        }
        return pass(arr, i + 1);
    }

    private static int[] bubbleSort(int[] arr) {
        try {
            temp = 1 / ints[((arr.length - 2) >> 31) & 1];
        } catch (ArithmeticException e) {
            return arr;
        }
        return bubbleSort(arr, 0);
    }

    private static int[] bubbleSort(int[] arr, int iter) {
        try {
            temp = 1 / (iter - arr.length + 1);
        } catch (ArithmeticException e) {
            return arr;
        }
        return bubbleSort(pass(arr, 0), iter + 1);
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 2, 1};
        int[] sorted = bubbleSort(arr);
        System.out.println(Arrays.toString(sorted));
    }
}
