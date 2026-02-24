package Problem_on_Number;

public class Replace0with1 {

    int replace0with1(int num){
        String str = Integer.toString(num);
        str = str.replace('0', '1');
        return Integer.parseInt(str);
    }
    public static void main(String[] args) {
        Replace0with1 ob = new Replace0with1();
        System.out.println(ob.replace0with1(102003));
    }
}
