package Problem_on_Number;

import static Problem_on_Number.findGCD.gcd;

public class AddTwoFractions {

    public void addFractions(int num1, int den1, int num2, int den2) {
        // Find LCM of both denominators
        int lcm = (den1 * den2) / gcd(den1, den2);

        // Convert both numerators to same denominator
        int newNum1 = num1 * (lcm / den1);
        int newNum2 = num2 * (lcm / den2);

        // Add the numerators
        int resultNum = newNum1 + newNum2;
        int resultDen = lcm;

        // Simplify the result by dividing by gcd
        int common = gcd(resultNum, resultDen);
        resultNum /= common;
        resultDen /= common;

        // Print the simplified result
        System.out.println(resultNum + "/" + resultDen);
    }

    public static void main(String[] args) {
        AddTwoFractions ob = new AddTwoFractions();
        ob.addFractions(3, 4, 1, 7);
    }
}
