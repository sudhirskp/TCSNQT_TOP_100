package Problem_on_Number;

public class HarshadNumber {

    boolean isHarshadNumber(int num) {
        int n = num;
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return num % sum == 0;
    }
    public static void main(String[] args) {
        HarshadNumber ob = new HarshadNumber();
        System.out.println(ob.isHarshadNumber(378));
    }
}
