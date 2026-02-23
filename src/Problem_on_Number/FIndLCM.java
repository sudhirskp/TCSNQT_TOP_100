package Problem_on_Number;

public class FIndLCM {
    public static long findLCM(int n1, int n2) {
        long lcm = 1;
        for (long i = 1; i <= n1 * n2; i++) {
            if (i % n1 == 0 && i % n2 == 0) {
                lcm = i;
                break;
            }
        }
        return lcm;
    }

    public int gcd(int a, int b) {
        if (b == 0) {
            return a;  // Base case: if b is 0, return a
        }
        return gcd(b, a % b);  // Recursively call GCD with (b, a % b)
    }

    // Function to calculate LCM using the GCD
    public int calculateLCM(int a, int b) {
        int g = gcd(a, b);  // Calculate GCD of a and b
        return (a * b) / g;  // Calculate LCM using the formula LCM = (a * b) / GCD
    }

    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 10;
        System.out.println("LCM of " + num1 + " and " + num2 + " is " + findLCM(num1, num2));
    }
}