package Problem_on_Number;

public class APseriesSum {

    float APseriesSum(int n, float a, float d){
        float f = (float) ((n/2.0)*(float)(2.0*a+(n-1)*d));
        return f;
    }
    public static void main(String[] args) {
        APseriesSum ob = new APseriesSum();
        System.out.println(ob.APseriesSum(5, 2, 3));
    }
}
