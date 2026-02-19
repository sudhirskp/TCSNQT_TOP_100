package Array;

import java.util.Arrays;

public class Rearrange {

    // Function to rearrange first half ascending and second half descending
    public static void rearrangeArray(int[] arr) {
        // Sort the array
        Arrays.sort(arr);

        int n = arr.length;
        // Reverse the second half
        for (int i = n / 2, j = n - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    // Separate main class
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 6, 3};

        rearrangeArray(arr);

        // Print rearranged array
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}