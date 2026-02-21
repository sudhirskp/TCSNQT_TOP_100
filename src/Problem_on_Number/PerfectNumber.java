package Problem_on_Number;

import java.util.Scanner;

public class PerfectNumber {
    
    boolean isPerfect(int n){
        int sum = 0;
//        for(int i = 1;i<n;i++){
//            if(n%i==0){
//                sum = sum + i;
//            }
//        }

        for (int i = 1; i * i <= n; i++) {
            // If i is a divisor of n
            if (n % i == 0) {
                // If i is the square root of n or i is 1, add i to the sum
                if (i * i == n || i == 1)
                    sum = sum + i;
                else {
                    // Otherwise, add both i and n / i to the sum
                    sum = sum + i + n / i;
                }
            }
        }

        if(sum==n){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the the number : ");
        int n = sc.nextInt();
        PerfectNumber perf = new PerfectNumber();
        System.out.println(perf.isPerfect(n));
    }
}