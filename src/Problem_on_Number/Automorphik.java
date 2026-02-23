package Problem_on_Number;

import java.util.Scanner;

public class Automorphik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        Automorphik ob = new Automorphik();
        if (ob.isAutomorphic(n)) {
            System.out.println(n + " is an automorphic number");
        } else {
            System.out.println(n + " is not an automorphic number");
        }
    }

    public boolean isAutomorphic(int n) {
        int squared = n * n;
        String squaredString = String.valueOf(squared);
        String numberString = String.valueOf(n);
        return squaredString.endsWith(numberString);
    }

    public boolean isAutomorphic1(int N) {
        int sq = N * N;  // Calculate the square of the number

        while (N > 0) {
            // Check if last digit of N is equal to the last digit of its square
            if (N % 10 != sq % 10)
                return false;  // If digits don't match, return false

            // Reduce the number and its square
            N /= 10;
            sq /= 10;
        }

        return true;  // If all digits match, return true
    }
}