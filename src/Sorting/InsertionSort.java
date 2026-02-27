package Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static int[] insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    public static void main(String[] args) {
        InsertionSort ob = new InsertionSort();
        int[] arr = { 5, 2, 8, 7, 1, 4 };
        System.out.println(Arrays.toString(ob.insertionSort(arr)));
    }
}