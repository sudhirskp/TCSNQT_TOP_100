package Problem_on_Number;

import java.util.ArrayList;
import java.util.List;

public class ExpressAsSumOfPrimeNumber {

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

    boolean expressAsSumOfPrimeNumber(int num) {
        if (num <= 2 && isPrime(num)) {
            return true;
        } else if (num == 3 && isPrime(num)) {
            return true;
        } else if ((num % 2 == 0) || (num % 3 == 0)) {
            return false;
        } else {
            return isPrime(num) && isPrime(num - 2);
        }
    }

    public static void main(String[] args) {
        ExpressAsSumOfPrimeNumber ob = new ExpressAsSumOfPrimeNumber();
        System.out.println(ob.expressAsSumOfPrimeNumber(74));
    }
}