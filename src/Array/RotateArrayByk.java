package Array;

public class RotateArrayByk {

        // Function to reverse a section of the array
        void reverseSection(int[] arr, int start, int end) {
            // Swap elements until the section is reversed
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        // Function to left rotate array by d positions
        void leftRotate(int[] arr, int d) {
            int n = arr.length;
            // If d is greater than array size, take modulo
            d = d % n;
            if (d == 0) return;

            // Reverse first d elements
            reverseSection(arr, 0, d - 1);
            // Reverse remaining n-d elements
            reverseSection(arr, d, n - 1);
            // Reverse whole array
            reverseSection(arr, 0, n - 1);
        }

        // Function to right rotate array by d positions
        void rightRotate(int[] arr, int d) {
            int n = arr.length;
            // Right rotation by d is same as left rotation by n-d
            leftRotate(arr, n - (d % n));
        }
        public static void main(String[] args) {
            // Create object of Solution
            RotateArrayByk obj = new RotateArrayByk();

            // Example array
            int[] arr = {1, 2, 3, 4, 5};
            int k = 2;

            // Perform left rotation
            obj.leftRotate(arr, k);
            System.out.print("Left Rotation: ");
            for (int num : arr) System.out.print(num + " ");
            System.out.println();

            // Reset array
            arr = new int[]{1, 2, 3, 4, 5};

            // Perform right rotation
            obj.rightRotate(arr, k);
            System.out.print("Right Rotation: ");
            for (int num : arr) System.out.print(num + " ");
            System.out.println();
        }
}

//Input : N = 5, array[] = {1, 2, 3, 4, 5}, K = 2
//Output (Left Rotation) : {3, 4, 5, 1, 2}
//Explanation : After rotating left by 2, the first two elements move to the end.
//
//Input : N = 5, array[] = {1, 2, 3, 4, 5}, K = 2
//Output (Right Rotation) : {4, 5, 1, 2, 3}
//Explanation : After rotating right by 2, the last two elements move to the start.