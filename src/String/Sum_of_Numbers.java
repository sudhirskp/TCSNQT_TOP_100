package String;

public class Sum_of_Numbers {

    public int sumOfNumbers(String s) {
        int sum = 0;
        String temp = "";

        // Traverse each character
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                temp += c; // Append digit
            } else {
                if (!temp.equals("")) {
                    sum += Integer.parseInt(temp);
                    temp = ""; // Reset
                }
            }
        }

        // Add last number if any
        if (!temp.equals("")) {
            sum += Integer.parseInt(temp);
        }

        return sum;
    }

    public static void main(String[] args) {
        Sum_of_Numbers ob = new Sum_of_Numbers();
        System.out.println(ob.sumOfNumbers("1xyz23"));
    }
}
