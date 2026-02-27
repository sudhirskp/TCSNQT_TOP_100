package Sorting;

import java.util.Arrays;

public class BubbleSort {

    int [] Bubble(int [] arr){
        int n = arr.length;

        for(int i =0;i<n-1;i++){
            boolean flag = false;
            for(int j = i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        BubbleSort ob = new BubbleSort();
        int [] arr = {3,5,6,18,1,2,35};
        System.out.println(Arrays.toString(ob.Bubble(arr)));
    }
}
