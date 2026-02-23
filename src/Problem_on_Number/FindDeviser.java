package Problem_on_Number;

import java.util.ArrayList;
import java.util.List;

public class FindDeviser {

    public void findDivisors(int n) {
        // List to store divisors
        List<Integer> divisors = new ArrayList<>();

        // Loop from 1 to sqrt(n)
        for (int i = 1; i * i <= n; i++) {
            // If i divides n completely
            if (n % i == 0) {
                // Add i as a divisor
                divisors.add(i);
                // Add the paired divisor if different
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }

        // Print all divisors
        for (int d : divisors) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        FindDeviser ob = new FindDeviser();
        ob.findDivisors(6);
    }
}