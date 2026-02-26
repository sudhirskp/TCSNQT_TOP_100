package NumberSystem;

public class OctalTo {


    public int OctalToDeci(int n) {
        int decimal = 0;
        int power = 1;
        while (n > 0) {
            int digit = n % 10;
            decimal += digit * power;
            power *= 8;
            n /= 10;
        }
        return decimal;
    }


    public int octalToDecimal(int Octal) {
        // Initialize decimal result
        int Decimal = 0;
        // Position counter (power of 8)
        int i = 0;
        // Loop until all octal digits are processed
        while (Octal != 0) {
            // Get the last digit of octal number
            int rem = Octal % 10;
            // Add to decimal result after multiplying by 8^i
            Decimal += rem * Math.pow(8, i);
            // Increment position
            i++;
            // Remove the last digit from octal
            Octal /= 10;
        }
        // Return final decimal value
        return Decimal;
    }

    String OctalToBn(int n){
        int decimal = OctalToDeci(n);
        return Integer.toBinaryString(decimal);
    }

    public static void main(String[] args) {
        OctalTo obj = new OctalTo();
        System.out.println(obj.OctalToDeci(345)); //229
        System.out.println(obj.octalToDecimal(345)); //229
        System.out.println(obj.OctalToBn(345)); //11100101
    }
}
