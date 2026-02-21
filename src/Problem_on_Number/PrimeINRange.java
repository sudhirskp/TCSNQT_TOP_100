package Problem_on_Number;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeINRange {

    boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        PrimeINRange ob = new PrimeINRange();
        List<Integer> res = new ArrayList<>();
        System.out.print("Enter the the range : ");

        Scanner sc = new Scanner(System.in);
        int st = sc.nextInt();
        int end = sc.nextInt();

        for (int i = st; i <= end; i++) {
            if (ob.isPrime(i)) {
                res.add(i);
            }
        }

        System.out.println(res);
    }
}