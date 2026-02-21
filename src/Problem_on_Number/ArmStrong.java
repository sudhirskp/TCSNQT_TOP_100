package Problem_on_Number;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the the number : ");
        int n = sc.nextInt();
        ArmStrong arm = new ArmStrong();
        System.out.println(arm.isArmStrong(n));
    }

    boolean isArmStrong(int n) {
        int sum = 0, temp = n, length = 0;
//        while (temp > 0) {
//            length++;
//            temp /= 10;
//        }
        String str = new String(""+n);
        length = str.length();
        //temp = n;
        while (temp > 0) {
            int rem = temp % 10;
            sum += (int) Math.pow(rem, length);
            temp /= 10;
        }
        return (sum == n) ? true : false;
    }
}