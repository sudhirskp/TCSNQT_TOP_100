package Problem_on_Number;

import java.util.ArrayList;
import java.util.List;

public class GetPrimeFactors {

    public List<Integer> getPrimeFactors(int n) {
        List<Integer> primeFactors = new ArrayList<>();

        // Divide by 2 till odd
        if (n % 2 == 0) {
            primeFactors.add(2);
            while (n % 2 == 0)
                n /= 2;
        }

        // Check odd numbers from 3 to sqrt(n)
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                primeFactors.add(i);
                while (n % i == 0)
                    n /= i;
            }
        }

        // If remaining n is a prime number
        if (n > 1)
            primeFactors.add(n);

        return primeFactors;
    }


public static void main(String[] args) {
        GetPrimeFactors ob = new GetPrimeFactors();
        System.out.println(ob.getPrimeFactors(12));
    }
}
