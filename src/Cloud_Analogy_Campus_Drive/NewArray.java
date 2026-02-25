package Cloud_Analogy_Campus_Drive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewArray {

    int[] newArray(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();

        for (int num : arr1) {
            if (!contains(arr2, num)) {
                list.add(num);
            }
        }
        for (int num : arr2) {
            if (!contains(arr1, num)) {
                list.add(num);
            }
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    private boolean contains(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        NewArray ob = new NewArray();
        int[] arr1 = {2, 3, 4, 5, 6, 4};
        int[] arr2 = {1, 2, 3, 4, 5, 4};
        int[] arr = ob.newArray(arr1, arr2);
        System.out.println(Arrays.toString(arr));
    }
}