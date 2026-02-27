package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static int[] selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        SelectionSort ob = new SelectionSort();
        int[] arr = {5, 2, 8, 7, 1, 4};
        System.out.println(Arrays.toString(ob.selectionSort(arr)));
    }
}