package Problem_on_Number;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        sc.close();
        if (isStrongNumber(n)) {
            System.out.println(n + " is a strong number");
        } else {
            System.out.println(n + " is not a strong number");
        }
    }

    public static boolean isStrongNumber(int n) {
        int num = n;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += factorial(digit);
            n = n / 10;
        }
        return (sum == num);
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}