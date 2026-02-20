package Array;

public class MaxProductSubArray {
    // This class contains the function to find maximum product subarray
// using prefix and suffix traversal

        public int maxProductSubArray(int[] arr) {
            // Get the length of the array
            int n = arr.length;

            // Initialize prefix and suffix product
            int pre = 1, suff = 1;

            // Initialize answer with smalest integer
            int ans = Integer.MIN_VALUE;

            // Traverse from both left and right
            for (int i = 0; i < n; i++) {
                // Reset prefix if zero
                if (pre == 0) pre = 1;

                // Reset suffix if zero
                if (suff == 0) suff = 1;

                // Multiply prefix with current element from front
                pre *= arr[i];

                // Multiply suffix with current element from back
                suff *= arr[n - i - 1];

                // Update maximum value so far
                ans = Math.max(ans, Math.max(pre, suff));
            }

            // Return the final result
            return ans;
        }

    public int maxProduct(int[] nums) {
        int res = nums[0];
        int maxProd = nums[0];
        int minProd = nums[0];

        // Traverse from second element
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];

            // Swap if current is negative
            if (curr < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            // Update max and min product
            maxProd = Math.max(curr, maxProd * curr);
            minProd = Math.min(curr, minProd * curr);

            // Update result
            res = Math.max(res, maxProd);
        }

        return res;
    }

        public static void main(String[] args) {
            // Sample input
            int[] arr = {2, 3, -2, 4};

            // Create object of Solution
           MaxProductSubArray sol = new MaxProductSubArray();

            // Call the method and print the result
            System.out.println(sol.maxProductSubArray(arr));
            System.out.println(sol.maxProduct(arr));
        }
}
