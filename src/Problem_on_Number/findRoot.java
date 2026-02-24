package Problem_on_Number;

public class findRoot {

    public void Roots(int a, int b, int c) {
        // Calculate discriminant
        int d = b * b - 4 * a * c;

        // Calculate square root of absolute discriminant
        double sqrt_val = Math.sqrt(Math.abs(d));

        // Case when roots are real and different
        if (d > 0) {
            System.out.println("Roots are real and different");
            double root1 = (-b + sqrt_val) / (2.0 * a);
            double root2 = (-b - sqrt_val) / (2.0 * a);
            System.out.println(root1);
            System.out.println(root2);
        }

        // Case when roots are real and same
        else if (d == 0) {
            System.out.println("Roots are real and same");
            double root = (-b) / (2.0 * a);
            System.out.println(root);
            System.out.println(root);
        }

        // Case when roots are complex
        else {
            System.out.println("Roots are complex");
            double realPart = (-b) / (2.0 * a);
            System.out.println(realPart + " + i" + sqrt_val);
            System.out.println(realPart + " - i" + sqrt_val);
        }
    }

    public static void main(String[] args) {
        findRoot ob = new findRoot();
        ob.Roots(1, 1, 1);
    }
}
