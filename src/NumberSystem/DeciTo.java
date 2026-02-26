package NumberSystem;

public class DeciTo {

    //using inbuilt function
    String deciToBn(int deci){
        String str = Integer.toString(deci,2);
        return str;
    }

    //using array
    public void toBinary(int n) {
        int[] binary = new int[32];  // Array to store binary digits
        int i = 0;

        // Extract binary digits (in reverse order)
        while (n > 0) {
            binary[i] = n % 2;
            i++;
            n /= 2;
        }

        // Print the binary number in correct order
        for (int ind = i - 1; ind >= 0; ind--) {
            System.out.print(binary[ind]);
        }
    }

    //using bit manipulation
    public void tobn(int n){

        boolean flag = false;
        for (int i = 32; i >= 0; i--) {
            // Shift n right by i bits and check the least significant bit
            if (((n >> i) & 1) == 1) {
                flag = true; // First '1' found
                System.out.print("1");
            } else {
                // Only print 0 if we've already found the first 1
                if (flag)
                    System.out.print("0");
            }
        }
        System.out.println();
    }

    //using inbuilt function
    public String toOctal(int n){
        String str = Integer.toString(n,8);
        return str;
    }

    //using StringBuilder
    public void toOctall(int n){
        if(n==0){
            System.out.println(0);
        }

        StringBuilder sb = new StringBuilder();
        while(n>0){
            sb.insert(0,n%8);
            n/=8;
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        DeciTo obj = new DeciTo();
        System.out.println(obj.deciToBn(18));
        obj.toBinary(18);
        System.out.println();
        obj.tobn(18);
        System.out.println(obj.toOctal(17));
        obj.toOctall(17);
    }
}