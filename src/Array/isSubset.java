package Array;

import java.util.HashMap;
import java.util.Map;

public class isSubset {

    public boolean isSubset(int[] a, int[] b) {
        Map<Integer, Integer> freq = new HashMap<>();

        // Count frequencies in a[]
        for (int num : a) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Check each element in b[]
        for (int num : b) {
            if (!freq.containsKey(num) || freq.get(num) == 0) {
                return false; // element missing
            }
            freq.put(num, freq.get(num) - 1); // consume one occurrence
        }

        return true; // all elements matched
    }

    public static void main(String[] args) {
        isSubset ob = new isSubset();
        int arr [] = {1,2,2};
        int arr1 [] = {1,1};
        System.out.println(ob.isSubset(arr,arr1));
    }
}
