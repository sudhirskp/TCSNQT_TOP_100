package Problem_on_Number;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FIndAllPalindrom {

    boolean findPali(int n){
        int t = n;
        int num = 0;
        while(t>0){
            int rem = t%10;
            num = num *10+rem;
            t = t/10;
        }

        if(num==n) return true;
        return false;
    }
    public static void main(String[] args) {
        FIndAllPalindrom ob = new FIndAllPalindrom();
        List<Integer> res = new ArrayList<>();
        System.out.println("Enter the the range : ");

        Scanner sc = new Scanner(System.in);
        int st = sc.nextInt();
        int end = sc.nextInt();

        for(int i =st;i<=end;i++){
            if(ob.findPali(i)){
                res.add(i);
            }
        }
        System.out.println(res);
    }
}
