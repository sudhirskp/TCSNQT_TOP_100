package Problem_on_Number;

public class abundant_number {
    boolean isAbundantNumber(int num){
        int sum = 0;
        for(int i =1;i*i<=num;i++){
            if(num%i==0){
                sum +=i;
                if(i!=num/i){
                    sum +=num/i;
                }
            }
        }
        return sum==num;
    }
    public static void main(String[] args) {
        abundant_number ob = new abundant_number();
        System.out.println(ob.isAbundantNumber(18));
    }
}
