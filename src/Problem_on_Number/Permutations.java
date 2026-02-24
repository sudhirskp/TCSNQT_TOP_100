package Problem_on_Number;

public class Permutations {

    public int permutation(int n, int r) {
        // Initialize result
        int ans = 1;

        // Multiply n * (n-1) * ... * (n-r+1)
        for (int i = n; i >= n - r + 1; i--) {
            ans *= i;
        }

        // Return result
        return ans;
    }

    int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }

    public int permutation1(int n, int r) {
        return fact(n)/fact(n-r);
    }

    public static void main(String[] args) {
        Permutations ob = new Permutations();
        System.out.println(ob.permutation1(5, 3));
        System.out.println(ob.permutation(5, 3));
    }
}
