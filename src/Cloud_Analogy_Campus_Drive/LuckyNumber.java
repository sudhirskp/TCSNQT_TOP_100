package Cloud_Analogy_Campus_Drive;

public class LuckyNumber {

    boolean isPrime(int n) {
        if (n <= 1) return false; // 0 and 1 are not prime
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; // found a divisor
            }
        }
        return true; // no divisors found
    }

    boolean Composite(int n){
        if(n==1){
            return false;
        }
        return !isPrime(n);
    }

    int luckyNumber(int st, int end){
        int prime = 0;
        int composite = 0;
        for(int i=0;i<=end;i++){
            if(isPrime(i)){
                prime+=i;
            }
            if(Composite(i)){
                composite+=i;
            }
        }
        return prime-composite;
    }
    public static void main(String[] args) {
        LuckyNumber obj = new LuckyNumber();
        System.out.println(obj.luckyNumber(1, 11));
    }
}
