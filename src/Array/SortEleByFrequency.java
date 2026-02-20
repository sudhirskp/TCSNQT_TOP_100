package Array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class SortEleByFrequency {

    List<Integer> SortByfr(int [] arr){
        int n = arr.length;
        HashMap<Integer,Integer> fre = new HashMap<>();
        for(int i =0;i<n;i++){
            fre.put(arr[i],fre.getOrDefault(arr[i],0)+1);
        }

        List<Integer> keys = new ArrayList<>(fre.keySet());
        keys.sort((a,b)->{
            int cmp = Integer.compare(fre.get(b),fre.get(a));
            if(cmp!=0) return cmp;
            return Integer.compare(a,b);
        });

        List<Integer> ans = new ArrayList<>();
        for(int key : keys) {
            for (int i = 0; i < fre.get(key);i++) ans.add(key);
        }
        return ans;
    }
    public static void main(String[] args) {
        SortEleByFrequency ob = new SortEleByFrequency();
        int array[] = {1,2,3,2,4,3,1,2};
        System.out.println(ob.SortByfr(array));
    }
}

//Input: N = 8, array[] = {1,2,3,2,4,3,1,2}
//Output: 2 2 2 1 1 3 3 4
//Explanation: Since  2 is present 3 times in an array , so print it 3 times ,then print ‘1’ 2 times and then ‘3’ 2 times and 4 has least frequency, it will be printed at last.
//
//Input: N = 6, array[] = {-199,6,7,-199,3,5}
//Output: -199 -199 3 5 6 7
//Explanation: Since -199 is present 2 times so it will be printed at first , then 3 , 5 ,6 ,7 are present once in array , so print them in their sorted order.