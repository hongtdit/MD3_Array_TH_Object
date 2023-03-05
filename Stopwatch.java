import java.util.Arrays;
import java.util.Random;

public class Stopwatch {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000);
        }

        System.out.println("Original array: " + Arrays.toString(arr));

        long startTime = System.nanoTime();
        SelectionSort.selectionSort(arr);
        long endTime = System.nanoTime();

        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Execution time: " + (endTime - startTime) + " nanoseconds");
    }


}
