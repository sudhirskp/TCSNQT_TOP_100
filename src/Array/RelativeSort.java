package Array;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class RelativeSort {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n  = arr1.length;
        int m = arr2.length;

        Map<Integer,Integer> map = new TreeMap<>();

        for(int i = 0;i<n;i++){
            map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
        }

        int ans [] = new int [n];
        int k = 0;
        for(int v : arr2){
            if(map.containsKey(v)){
                int fr = map.get(v);
                for(int i =0;i<fr;i++){
                    ans[k++] = v;
                }

                map.remove(v);
            }
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int val = entry.getKey();
            int fr = entry.getValue();
            for(int i = 0; i < fr; i++){
                ans[k++] = val;
            }
        }

        return ans;
    }

        //array[i]<1001 , failed for large size of array
        public int[] relativeSortArray1(int[] arr1, int[] arr2) {
            int[] count = new int[1001];
            for(int i : arr1) count[i]++;
            int n = 0 ;
            for(int i : arr2){
                while(count[i]-- > 0){
                    arr1[n++] = i;
                }
            }
            for(int j = 0 ; j < count.length ; j++){
                while(count[j]-- >0){
                    arr1[n++] = j;
                }
            }
            return arr1;
        }


    public static void main(String[] args) {
        RelativeSort obb = new RelativeSort();
        int [] arr1 = {28,6,22,8,44,17};
        int [] arr2 = {22,28,6,8};
        System.out.println(Arrays.toString(obb.relativeSortArray1(arr1,arr2)));
    }
}
