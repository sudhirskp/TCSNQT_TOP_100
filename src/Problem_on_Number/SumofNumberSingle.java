package Problem_on_Number;

public class SumofNumberSingle {

    int sumOfNumberSingle(int num){
        String st = Integer.toString(num);
        int sum = 0;
        for(int i =0;i<st.length();i++){
            sum += st.charAt(i)-'0';
        }

        if(sum>=10){
            return sumOfNumberSingle(sum);
        }
        return sum;
    }

    public int addDigits(int num) {
        // If number is zero, digital root is zero
        if (num == 0)
            return 0;

        // Use digital root formula: 1 + (num - 1) % 9
        return 1 + (num - 1) % 9;
    }

    public static void main(String[] args) {
        SumofNumberSingle ob = new SumofNumberSingle();
        System.out.println(ob.sumOfNumberSingle(529));
        System.out.println(ob.addDigits(529));
    }
}
