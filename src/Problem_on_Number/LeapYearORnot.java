package Problem_on_Number;

public class LeapYearORnot {
    boolean isLeapYear(int n){
        if(n%400==0){
            return true;
        }
        else if(n%100==0){
            return false;
        }
        else if(n%4==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        LeapYearORnot ob = new LeapYearORnot();
        System.out.println(ob.isLeapYear(2024));
    }
}