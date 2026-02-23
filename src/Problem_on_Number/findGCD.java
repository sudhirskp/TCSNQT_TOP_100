package Problem_on_Number;

import java.util.Scanner;

public class findGCD {
    public static int gcd(int n1, int n2) {
        if (n1 == 0) {
            return n2;
        } else {
            return gcd(n2 % n1, n1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();
        System.out.println("The GCD of " + n1 + " and " + n2 + " is " + gcd(n1, n2));
    }
}

/*Euclidean Algorithm:

The Euclidean Algorithm is a method for finding the greatest common divisor (GCD)
of two numbers. It operates on the principle that the GCD of two numbers remains
the same even if the smaller number is subtracted from the larger number.

To find the GCD of n1 and n2 where n1 > n2:
1. Repeatedly subtract the smaller number from the larger number until one of them becomes 0.
2. Once one becomes 0, the other is the GCD of the original numbers.

Example:
n1 = 20, n2 = 15

gcd(20, 15) = gcd(20 - 15, 15) = gcd(5, 15)
gcd(5, 15)  = gcd(15 - 5, 5)  = gcd(10, 5)
gcd(10, 5)  = gcd(10 - 5, 5) = gcd(5, 5)
gcd(5, 5)   = gcd(5 - 5, 5)  = gcd(0, 5)

Hence, return 5 as the GCD.*/