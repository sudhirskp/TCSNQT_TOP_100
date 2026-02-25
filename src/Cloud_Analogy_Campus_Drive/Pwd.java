package Cloud_Analogy_Campus_Drive;

public class Pwd {

    int armSum(int n){
        int sum = 0;
        int digiSum = 0;
        String str = Integer.toString(n);
        for(int v : str.toCharArray()){
            sum += Math.pow(v-'0', str.length());
            digiSum+=v-'0';
        }
        return sum == n ? digiSum : 0;
    }

    int pwSum(int st, int end){
       int sum = 0;
       for(int i = st; i <= end; i++){
           sum += armSum(i);
       }
       return sum;
    }

    public static void main(String[] args) {
        Pwd obj = new Pwd();
        System.out.println(obj.pwSum(1, 500));
    }
}