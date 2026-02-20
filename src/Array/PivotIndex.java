package Array;

public class PivotIndex {

    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int [] prefix = new int[n];
        int [] suffix = new int[n];
        prefix[0] = nums[0];

        for(int i = 1;i<n;i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        suffix[n-1] = nums[n-1];
        for(int i = n-2;i>=0;i--){
            suffix[i] = suffix[i+1] + nums[i];
        }

        for(int i =0;i<n;i++){
            if(prefix[i]==suffix[i]) return i;
        }
        return -1;
    }

    public int pivotIndex1(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += nums[i];
        }

        int leftSum = 0, rightSum = totalSum;


        for (int i = 0; i < n; i++) {
            rightSum -= nums[i];

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        PivotIndex ob = new PivotIndex();
        int [] arr = {1,2,3};
        System.out.println(ob.pivotIndex(arr));
    }
}

//leet 724 or Finding Equilibrium index in an array
